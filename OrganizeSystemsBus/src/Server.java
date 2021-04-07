import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Server {

	private int status = -1;
	private Object botHelpTransfer;
	
	public Server() {

	}
	
	public void StartServer() {
		status = 1;
	}
	
	public void AddDataToXMLBranch(ArrayList<Branch> branches) throws Exception {

		//CHECK STATUS OF SERVER
		if(status != 1) {
			System.out.println("Server not up, yet!");
			return;
		}
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse("xmlFiles/branchesData.xml");
	    Element root = document.getDocumentElement();

	    for (Branch branch : branches) {
	    	//BRANCH ELEMENT
	    	Element newBranch = document.createElement("branch");

	    	Element id = document.createElement("id");
	    	id.appendChild(document.createTextNode(Integer.toString(branch.getId())));
	    	newBranch.appendChild(id);

	        Element location = document.createElement("location");
	        location.appendChild(document.createTextNode(branch.getLocation()));
	        newBranch.appendChild(location);
	        
	        Element numOfEmployees = document.createElement("numOfEmployees");
	        numOfEmployees.appendChild(document.createTextNode(Integer.toString(branch.getNumOfEmployees())));
	    	newBranch.appendChild(numOfEmployees);
	    	
	    	Element maxPeople = document.createElement("maxPeople");
	    	maxPeople.appendChild(document.createTextNode(Integer.toString(branch.getMaxPeople())));
	    	newBranch.appendChild(maxPeople);
	    	
	        root.appendChild(newBranch);
	    }

	    DOMSource source = new DOMSource(document);
	    
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File("xmlFiles/helperXSLT.xslt")));
	    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    StreamResult result = new StreamResult("xmlFiles/branchesData.xml");
	    transformer.transform(source, result);
	}
	
	public Object GetXMLData(File file, Object obj) throws Exception {
		 
		//CHECK STATUS OF SERVER
		if(status != 1) {
			System.out.println("Server not up, yet!");
			return obj;
		}
		
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();  
		Document document = documentBuilder.parse(file);
		System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
		
		return obj;
	}
	
	public int CheckGetXMLDataWithInput(File file, DataParser dP) throws Exception {
		
		int output = -1;
		String tag = "";
		
		//CHECK STATUS OF SERVER
		if(status != 1) {
			System.out.println("Server not up, yet!");
			return output;
		}
		
		
		User user = new User();
		Branch branch = new Branch();
		
		//IF WE WANT TO CHECK THE DATA ABOUT "USER"
		if(dP.getUser().getClass().equals(user.getClass())) {
			user = dP.getUser();
			tag = "user";
			System.out.println("User Check");
			
		}//IF WE WANT TO CHECK THE DATA ABOUT "BRANCH"
		else if(dP.getUser().getClass().equals(branch.getClass())) {
			branch = dP.getBranch();
			tag = "branch";
			System.out.println("Branch Check");
		}
		
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();  
		Document document = documentBuilder.parse(file);
		System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
		
		if(document.hasChildNodes()) {
			NodeList nodeList = document.getElementsByTagName(tag);
			output = XMLToJAVA(nodeList, dP);
		}
		
		return output;
	}
	
	//RECURSIVE FUNCTION
	private int XMLToJAVA(NodeList nodeList, DataParser dP) {
		
		//IT IS USING ONLY ONE, EVERYTIME THE FUNCTION IS BEING CALLED
		User userXML = new User();
		Branch branchXML = new Branch();
		
		for(int count = 0; count < nodeList.getLength(); count++) {
			Node elemNode = nodeList.item(count);
			if(elemNode.getNodeType() == Node.ELEMENT_NODE) {
				//IF "USER" PARSED IN
				//TO SEARCH A SPECIFIC USER
				if(dP.getUser().getClass().equals(userXML.getClass())) {
					Element element = (Element) elemNode;
					userXML = userXML.FinalizeXMLDataToUser(element);
					if(userXML.getUsername().equals(dP.getUser().getUsername())) {
						System.out.println("FOUND USERNAME : " + dP.getUser().getUsername());
						if(userXML.getPassword().equals(dP.getUser().getPassword())) {
							System.out.println("MATCHING PASWORD");
							if(userXML.getRole().equals("employee")) {
								return 1;
							}
							else if(userXML.getRole().equals("admin")){
								return 1000;
							}
							else {
								return -1;
							}
						}
						else {
							System.out.println("PASSWORD DENIED");
							return 0;
						}
					}
					else {
						System.out.println("USER DID NOT FOUND!");
						return 0;
					}
				}
				//IF "BRANCH" PARSED IN
				//TO SEARCH BETWEEN THE BRANCHES
				if(dP.getUser().getClass().equals(branchXML.getClass())) {
					Element element = (Element) elemNode;
					branchXML = branchXML.FinalizeXMLDataToBranch(element);
					if(branchXML.getId() == dP.getBranch().getId()) {
						System.out.println("FOUND ID : " + dP.getBranch().getId());
						return 1;
					}
					else {
						System.out.println("BRANCH DID NOT FOUND!");
						return 0;
					}
				}
			}
		}
		
		return -1;
	}
}

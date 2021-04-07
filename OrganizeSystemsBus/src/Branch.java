import java.util.ArrayList;

import org.w3c.dom.Element;

public class Branch {

	private int id;
	private String location;
	private int numOfEmployees;
	private int maxPeople;
	private int curPeople;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	
	public Branch() {
		
	}
	
	public Branch(int id, String location, int numOfEmployees, int maxPeople) {
		this.id = id;
		this.location = location;
		this.numOfEmployees = numOfEmployees;
		this.maxPeople = maxPeople;
	}

	public int getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public int getMaxPeople() {
		return maxPeople;
	}
	
	public Branch FinalizeXMLDataToBranch(Element element) {

		ArrayList<String> attributes = new ArrayList<String>();
		attributes = GetAttributes(attributes);
		
		ArrayList<String> varValues = new ArrayList<String>();
		
		for(int i = 0; i < attributes.size(); i++) {
			String infoAttr = element.getElementsByTagName(attributes.get(i)).item(0).getTextContent();
			System.out.println("--BRANCH " + attributes.get(i) + "  :  " + infoAttr);
			varValues.add(infoAttr);
		}
		
		Branch branchXML = new Branch(Integer.parseInt(varValues.get(0)), varValues.get(1), Integer.parseInt(varValues.get(2)), Integer.parseInt(varValues.get(3)));
		
		return branchXML;
	}

	private ArrayList<String> GetAttributes(ArrayList<String> attributes) {
		
		java.lang.reflect.Field[] fld = User.class.getDeclaredFields();
        for (int i = 0; i < fld.length; i++) {
        	attributes.add(fld[i].getName());
        }
        
        return attributes;
	}
}

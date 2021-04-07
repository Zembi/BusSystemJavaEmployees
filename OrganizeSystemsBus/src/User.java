import java.util.ArrayList;

import org.w3c.dom.Element;

public class User {

	private String username;
	private String name;
	private String password;
	private String role;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String name, String password, String role) {
		this.username = username;
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRights(String role) {
		this.role = role;
	}
	
	public User FinalizeXMLDataToUser(Element element) {

		ArrayList<String> attributes = new ArrayList<String>();
		attributes = GetAttributes(attributes);
		
		ArrayList<String> varValues = new ArrayList<String>();
		
		for(int i = 0; i < attributes.size(); i++) {
			String infoAttr = element.getElementsByTagName(attributes.get(i)).item(0).getTextContent();
			System.out.println("--USER " + attributes.get(i) + "  :  " + infoAttr);
			varValues.add(infoAttr);
		}
		
		User userXML = new User(varValues.get(0), varValues.get(1), varValues.get(2), varValues.get(3));
		
		return userXML;
	}

	private ArrayList<String> GetAttributes(ArrayList<String> attributes) {
		
		java.lang.reflect.Field[] fld = User.class.getDeclaredFields();
        for (int i = 0; i < fld.length; i++) {
        	attributes.add(fld[i].getName());
        }
        
        return attributes;
	}
}
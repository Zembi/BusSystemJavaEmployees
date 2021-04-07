
public class DataParser {

	private User user = new User();
	private Admin admin = new Admin();
	private Employee employee = new Employee();
	private Branch branch = new Branch();
	
	//PARSER FOR USERS
	public DataParser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
	
	//PARSER FOR BRANCH
	public DataParser(Branch branch) {
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}
}

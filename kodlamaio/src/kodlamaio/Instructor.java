package kodlamaio;

public class Instructor extends User{

	private String lastName;
	private String branch;
	
	public Instructor() {}

	public Instructor(int id, int userId,String name,String email, String lastName, String branch) {
		super(id,userId,name,email);
		this.branch=branch;
		this.lastName=lastName;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}

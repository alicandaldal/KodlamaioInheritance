package kodlamaio;

public class Student extends User{


	private String lastName;
	
	public Student() {}

	public Student(int id, int userId,String name,String email, String lastName) {
		super(id,userId,name,email);
		
		this.lastName=lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

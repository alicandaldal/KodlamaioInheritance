package kodlamaio;

public class User {

	private int id;
	private int userId;
	private String name;
	private String email;
	
	public User() {}

	public User(int id, int userId,String name,String email) {
		
		super();
		this.id = id;
		this.userId=userId;
		this.name=name;
		this.email = email;
		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	

	
}

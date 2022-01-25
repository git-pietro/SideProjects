package Things;

public class UserData {
	
	private String username;
	private String pass;
	
	ObjectOne objectone;
	
	UserData(){}
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public UserData(String username, String pass, ObjectOne objectone) {
		super();
		this.username = username;
		this.pass = pass;
		this.objectone = objectone;
		
		
	}
	
	
	
	

}

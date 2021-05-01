
public class user {

	private String email;
	private int identityNumber;
	private String firstname;
	private String lastname;
	private  int id;
	private  int password;
	
	public user(String email, int identityNumber, String firstname, String lastname, int id, int password) {
		super();
		this.email = email;
		this.identityNumber = identityNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
}

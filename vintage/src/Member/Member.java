package Member;

public class Member {

	private String name;
	private String id;
	private String password;
	private String callNumber;
	
	
	public Member(String name, String id, String password, String callNumber) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.callNumber = callNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCallNumber() {
		return callNumber;
	}


	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	
	
	
}

package Manager;

public class Manager {

	private String name;
	private String id;
	private String password;
	private String CallNumber;
	
	/* 생성자 메서드 */
	public Manager(String name, String id, String password, String callNumber) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		CallNumber = callNumber;
	}

	/* getter, setter */
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
		return CallNumber;
	}

	public void setCallNumber(String callNumber) {
		CallNumber = callNumber;
	}
	
	
	
}

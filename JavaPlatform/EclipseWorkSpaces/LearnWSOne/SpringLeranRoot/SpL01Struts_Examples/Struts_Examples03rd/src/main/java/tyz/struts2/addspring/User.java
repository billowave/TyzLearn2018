package tyz.struts2.addspring;

public class User {

	private String firstName;
	private String lastName;

	public String execute() {
		System.out.println("struts2 + spring User execute");
		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

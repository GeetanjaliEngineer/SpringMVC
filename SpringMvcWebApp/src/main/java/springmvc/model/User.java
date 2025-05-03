package springmvc.model;

public class User {
	private String email;
	private String userName;
	private String Password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", password=" + Password + "]";
	}

}

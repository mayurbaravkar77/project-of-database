package in.blog.pojo;

public class user {
	private String emailid;
	private String password;
	
	
	public user() {
		super();
	}
	
	
	public user(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "user [emailid=" + emailid + ", password=" + password + "]";
	}
	
	
}

package in.blod.dao;

public interface logindao {

	boolean isCustomer(String emailid,String password);
	boolean forgetpassword(String emailid,String password);
	
}

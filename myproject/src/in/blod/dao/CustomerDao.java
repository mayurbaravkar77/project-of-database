package in.blod.dao;
import java.util.List;

import in.blog.pojo.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer custobj);
	boolean updateCustomer(Customer custobj);
	boolean deleteCustomer(int custid);
	List<Customer> customerList();
	Customer searchCustomerById(int custid);
	Customer searCustomerByEmail(String custemail);
	
	
	

}

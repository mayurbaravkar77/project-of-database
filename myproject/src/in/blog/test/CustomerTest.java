package in.blog.test;

import java.util.List;
import java.util.Scanner;

import in.blod.dao.CustomerDaoImpl;
import in.blog.pojo.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int custid;
		 String custname;
		 String custemail;
		 String custcontact;
		 String custpassword;
		int choice;
		boolean ans;
		Customer cust=null;
		CustomerDaoImpl cdao=new CustomerDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("===============Customer Operations==============");
		System.out.println("1.add customer");
		System.out.println("2.update customer");
		System.out.println("3.delete customer");
		System.out.println("4.customer list");
		System.out.println("5.Search cstomer by id");
		System.out.println("6.search customer by email");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("===========Customer Adding process");
			System.out.println("enter customer name:");
			custname=sc.next();
			System.out.println("enter customer email:");
			custemail=sc.next();
			System.out.println("enter customer contact:");
			custcontact=sc.next();
			System.out.println("enter customer password:");
			custpassword=sc.next();
			cust=new Customer(custname, custemail, custcontact, custpassword);
			ans=cdao.addCustomer(cust);
			if(ans)
				System.out.println("Customer Added");
			else
				System.out.println("customer not added");
			break;
		
		case 2:
			System.out.println("===========Customer Adding process");
			System.out.println("enter customer name:");
			custname=sc.next();
			System.out.println("enter customer email:");
			custemail=sc.next();
			System.out.println("enter customer contact:");
			custcontact=sc.next();
			System.out.println("enter customer password:");
			custpassword=sc.next();
			System.out.println("enter customer id:");
			custid=sc.nextInt();
			cust=new Customer(custid,custname, custemail, custcontact, custpassword);
			ans=cdao.updateCustomer(cust);
			if(ans)
				System.out.println("Customer updated");
			else
				System.out.println("customer not updated");
			break;
		
		case 3:
			System.out.println("===========Customer deleting process");
			System.out.println("enter id");
			custid=sc.nextInt();
		//	cust=new Customer(custid);
			ans=cdao.deleteCustomer(custid);
			//Customer c5=cdao.searchCustomerById(custid);
			if(ans) {
				System.out.println("data deleted");
			}
			else {
				System.out.println("data note deleted");
			}
		break;
		case 4:
			System.out.println("===============Customer List==============");
		List<Customer>clist=cdao.customerList();
		if(!clist.isEmpty()) {
			for(Customer c4:clist) {
				System.out.println(c4);
			}
		}
		else {
			System.out.println("customer list is empty");
		}
		break;
		
		case 5:
			System.out.println("search customer by id");
			System.out.println("enter id");
			custid=sc.nextInt();
			Customer c=cdao.searchCustomerById(custid);
			if(c!=null) {
				System.out.println(c);
			}
			else {
				System.out.println("customer not found");
			}
		break;
		
	
		case 6:
			System.out.println("search customer by email");
			System.out.println("enter email");
			custemail=sc.next();
			Customer c1=cdao.searCustomerByEmail(custemail);
			if(c1!=null) {
				System.out.println(c1);
			}
			else {
				System.out.println("customer not found");
			}
		break;
			
		
		}
	}

}

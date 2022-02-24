package in.blod.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import in.blog.pojo.Customer;
import in.blog.utility.*;
public class CustomerDaoImpl implements CustomerDao {

	String query=null;
	Connection conn=DBConnection.getConnet();
	PreparedStatement ps=null;
	ResultSet rs=null;
	private int custobj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub    com.mysql.jdbc.Driver.class com.mysql.cj.jdbc.Driver.class

	}

	@Override
	public boolean addCustomer(Customer custobj) {
		// TODO Auto-generated method stub
		try {
			
			 query="insert into customer(custname,custemail,custcontact,custpassword)values(?,?,?,?)";
			 ps=conn.prepareStatement(query);
			ps.setString(1, custobj.getCustname());
			ps.setString(2, custobj.getCustemail());
			ps.setString(3, custobj.getCustcontact());
			ps.setString(4, custobj.getCustpassword());
			System.out.println(ps);//query
			int result=ps.executeUpdate();
			if(result>0)
				return true;
		} catch ( Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer custobj) {
		// TODO Auto-generated method stub
		try {
			query="update customer set custname=?,custemail=?,custcontact=?,custpassword=? where custid=?";
           ps=conn.prepareStatement(query);
           ps.setString(1, custobj.getCustname());
			ps.setString(2, custobj.getCustemail());
			ps.setString(3, custobj.getCustcontact());
			ps.setString(4, custobj.getCustpassword());
			ps.setInt(5,custobj.getCustid());
            int result=ps.executeUpdate();
            if(result>0)
            	return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		try {
			query="DELETE FROM customer WHERE custid = ?";
           ps=conn.prepareStatement(query);
           ps.setInt(1, custid);
           int result=ps.executeUpdate();
            if(result>0) 
                return true;   
            }
		catch(Exception e) {
			e.printStackTrace();
		}
	return false;
	}

	@Override
	public List<Customer> customerList() {
		// TODO Auto-generated method stub
		try {
			ArrayList<Customer>customerlist=new ArrayList<Customer>();
			query="select * from customer";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				Customer c=new Customer();
				c.setCustid(rs.getInt(1));
				c.setCustname(rs.getString(2));
				c.setCustemail(rs.getString(3));
				c.setCustcontact(rs.getString(4));
				c.setCustpassword(rs.getString(5));
				customerlist.add(c);
			}
			return customerlist;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer searchCustomerById(int custid) {
		// TODO Auto-generated method stub
		
			ArrayList<Customer>customerlist=new ArrayList<Customer>();
			try {
			query="select * from customer where custid=?";
			ps=conn.prepareStatement(query);
			ps.setInt(1, custid);
			rs=ps.executeQuery();
			while(rs.next()) {
				Customer c=new Customer();
				c.setCustid(rs.getInt(1));
				c.setCustname(rs.getString(2));
				c.setCustemail(rs.getString(3));
				c.setCustcontact(rs.getString(4));
				c.setCustpassword(rs.getString(5));
			return c;
			}}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		
	}

	@Override
	public Customer searCustomerByEmail(String custemail) {
		// TODO Auto-generated method stub
		ArrayList<Customer>customerlist=new ArrayList<Customer>();
		try {
		query="select * from customer where custemail=?";
		ps=conn.prepareStatement(query);
		ps.setString(1, custemail);
		rs=ps.executeQuery();
		while(rs.next()) {
			Customer c1=new Customer();
			c1.setCustid(rs.getInt(1));
			c1.setCustname(rs.getString(2));
			c1.setCustemail(rs.getString(3));
			c1.setCustcontact(rs.getString(4));
			c1.setCustpassword(rs.getString(5));
		return c1;
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

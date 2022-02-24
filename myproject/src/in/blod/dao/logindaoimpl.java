package in.blod.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.blog.utility.DBConnection;

public class logindaoimpl implements logindao {
	Connection conn=DBConnection.getConnet();
	PreparedStatement ps=null;
	ResultSet rs=null;
	int i;
	String query=null;
	
	@Override
	public boolean isCustomer(String emailid,String password) {
		try {
			query="select * from user where useremail=? and userpass";
			ps=conn.prepareStatement(query);
			ps.setString(1, emailid);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	




@Override
public boolean forgetpassword(String emailid,String password) {
	try {
		query="update user set userpass=? where useremail=?";
		ps.getConnection().prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, emailid);
		i=ps.executeUpdate();
		if(i>0)
		{
			return true;
		}
				
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
}


}
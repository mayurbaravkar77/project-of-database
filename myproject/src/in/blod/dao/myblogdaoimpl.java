package in.blod.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import in.blog.pojo.myblog;
import in.blog.utility.DBConnection;

public class myblogdaoimpl implements myblogdao{
	String query=null;
	Connection conn=DBConnection.getConnet();
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub    com.mysql.jdbc.Driver.class com.mysql.cj.jdbc.Driver.class

	}
	
	public boolean insert(myblog blogobj) {
		
		try {
			
			 query="insert into myblog(blogtitle,blogcontent,blogdate,customeremail)values(?,?,?,?)";
			 ps=conn.prepareStatement(query);
			ps.setString(1, blogobj.getBlogtitle());
			ps.setString(2, blogobj.getBlogcontent());
			ps.setString(3, blogobj.getBlogdate());
			ps.setString(4, blogobj.getCustomeremail());
			System.out.println(ps);//query
			int result=ps.executeUpdate();
			if(result>0)
				return true;
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean update(myblog blogobj) {
		
		try {
			query="update myblog set blogtitle=?,blogcontent=?,blogdate=?,customeremail=? where blogid=?";
           ps=conn.prepareStatement(query);
           ps.setString(1, blogobj.getBlogtitle());
			ps.setString(2, blogobj.getBlogcontent());
			ps.setString(3, blogobj.getBlogdate());
			ps.setString(4, blogobj.getCustomeremail());
			ps.setInt(5,blogobj.getBlogid());
            int result=ps.executeUpdate();
            if(result>0)
            	return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(int blogid) {
		try {
			query="DELETE FROM myblog WHERE blogid = ?";
           ps=conn.prepareStatement(query);
           ps.setInt(1, blogid);
           int result=ps.executeUpdate();
            if(result>0) 
                return true;   
            }
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<myblog> myblogList(){
		try {
			ArrayList<myblog>customerlist=new ArrayList<myblog>();
			query="select * from myblog";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				myblog c=new myblog();
				c.setBlogid(rs.getInt(1));
				c.setBlogtitle(rs.getString(2));
				c.setBlogcontent(rs.getString(3));
				c.setBlogdate(rs.getString(4));
				c.setCustomeremail(rs.getString(5));
				customerlist.add(c);
			}
			return customerlist;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public myblog searchblogById(int blogid) {
		ArrayList<myblog>mybloglist=new ArrayList<myblog>();
		try {
		query="select * from myblog where blogid=?";
		ps=conn.prepareStatement(query);
		ps.setInt(1, blogid);
		rs=ps.executeQuery();
		while(rs.next()) {
			myblog c=new myblog();
			c.setBlogid(rs.getInt(1));
			c.setBlogtitle(rs.getString(2));
			c.setBlogcontent(rs.getString(3));
			c.setBlogdate(rs.getString(4));
			c.setCustomeremail(rs.getString(5));
		return c;
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public myblog searchblogByEmail(String customeremail) {
		ArrayList<myblog>mybloglist=new ArrayList<myblog>();
		try {
		query="select * from myblog where customeremail=?";
		ps=conn.prepareStatement(query);
		ps.setString(1, customeremail);
		rs=ps.executeQuery();
		while(rs.next()) {
			myblog c=new myblog();
			c.setBlogid(rs.getInt(1));
			c.setBlogtitle(rs.getString(2));
			c.setBlogcontent(rs.getString(3));
			c.setBlogdate(rs.getString(4));
			c.setCustomeremail(rs.getString(5));
		return c;
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

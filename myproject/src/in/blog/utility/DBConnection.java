package in.blog.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection conn=null;
	public static Connection getConnet() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur16","root","mayur@123");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

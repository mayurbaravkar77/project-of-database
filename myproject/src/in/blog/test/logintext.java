package in.blog.test;

import java.util.Scanner;

import in.blod.dao.logindaoimpl;
import in.blog.pojo.user;

public class logintext {
	public static void main(String[] args) {
		String emailid;
		String password;
		int choice;
		boolean ans;
		user u=null;
		logindaoimpl ldao=new logindaoimpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("--Welcome to the login page----");
		System.out.println("1.Login");
		System.out.println("2.Forget password");
		System.out.println("Enter choice");
		 choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("---Login process---");
			System.out.println("Enter emailid");
			emailid=sc.next();
			System.out.println("Enter password");
			password=sc.next();
			ans=ldao.isCustomer(emailid,password);
			if(ans)
			{
				System.out.println("welcome user");
			}
			else
			{
				System.out.println("Invalid user");
			}
			break;
			
		case 2:
			System.out.println("---Forget password process---");
			System.out.println("Enter emailid");
			emailid=sc.next();
			System.out.println("Enter password");
			password=sc.next();
			ans=ldao.forgetpassword(emailid,password);
			if(ans)
			{
				System.out.println("change password");
			}
			else
			{
				System.out.println("unable to change password");
			}
			break;
		}
	}
}

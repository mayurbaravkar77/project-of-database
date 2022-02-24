package in.blog.test;

import java.util.List;
import java.util.Scanner;

import in.blod.dao.myblogdaoimpl;
import in.blog.pojo.myblog;

public class myblogtest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int blogid;
		 String blogtitle;
		 String blogcontent;
		 String blogdate;
		 String customeremail;
		int choice;
		boolean ans;
		myblog blog=null;
		myblogdaoimpl blog1=new myblogdaoimpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("===============myblog Operations==============");
		System.out.println("1.Add_blog");
		System.out.println("2.Update_blog");
		System.out.println("3.Delete_blog");
		System.out.println("4.Show_blog");
		System.out.println("5.Search_blog_by_id");
		System.out.println("6.search_blog_by_email");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("===========blog Adding process");
			System.out.println("enter blog id:");
			blogid=sc.nextInt();
			System.out.println("enter blog title:");
			blogtitle=sc.next();
			System.out.println("enter blog content:");
			blogcontent=sc.next();
			System.out.println("enter blog date:");
			blogdate=sc.next();
			System.out.println("enter blog customeremail:");
			customeremail=sc.next();
			blog=new myblog(blogtitle, blogcontent, blogdate, customeremail);
			ans=blog1.insert(blog);
			if(ans)
				System.out.println("blog Added");
			else
				System.out.println("blog not added");
			break;
		
		case 2:
			System.out.println("===========blog updating process");
			System.out.println("enter blog title:");
			blogtitle=sc.next();
			System.out.println("enter blog content:");
			blogcontent=sc.next();
			System.out.println("enter blog date:");
			blogdate=sc.next();
			System.out.println("enter blog customeremail:");
			customeremail=sc.next();
			System.out.println("enter blog id:");
			blogid=sc.nextInt();
			blog=new myblog(blogid,blogtitle, blogcontent, blogdate, customeremail);
			ans=blog1.update(blog);
			if(ans)
				System.out.println("blog updated");
			else
				System.out.println("blog not updated");
			break;
		
		case 3:
			System.out.println("===========blog deleting process");
			System.out.println("enter id");
			blogid=sc.nextInt();
		
			ans=blog1.delete(blogid);
			
			if(ans) {
				System.out.println("data deleted");
			}
			else {
				System.out.println("data note deleted");
			}
		break;
		case 4:
			System.out.println("===============blog List==============");
		List<myblog>blist=blog1.myblogList();
		if(!blist.isEmpty()) {
			for(myblog c4:blist) {
				System.out.println(c4);
			}
		}
		else {
			System.out.println("blog list is empty");
		}
		break;
		
		case 5:
			System.out.println("search blog by id");
			System.out.println("enter id");
			blogid=sc.nextInt();
			myblog c=blog1.searchblogById(blogid);
			if(c!=null) {
				System.out.println(c);
			}
			else {
				System.out.println("blog not found");
			}
		break;
		
	
		case 6:
			System.out.println("search blog by email");
			System.out.println("enter email");
			customeremail=sc.next();
			myblog c1=blog1.searchblogByEmail(customeremail);
			if(c1!=null) {
				System.out.println(c1);
			}
			else {
				System.out.println("blog not found");
			}
		break;
}
		}
	}

package in.blog.pojo;

public class myblog {
	private int blogid;
	private String blogtitle;
	private String blogcontent;
	private String blogdate;
	private String customeremail;
	
	
	public myblog() {
		super();
	}


	public myblog(String blogtitle, String blogcontent, String blogdate, String customeremail) {
		super();
		this.blogtitle = blogtitle;
		this.blogcontent = blogcontent;
		this.blogdate = blogdate;
		this.customeremail = customeremail;
	}


	public myblog(int blogid, String blogtitle, String blogcontent, String blogdate, String customeremail) {
		super();
		this.blogid = blogid;
		this.blogtitle = blogtitle;
		this.blogcontent = blogcontent;
		this.blogdate = blogdate;
		this.customeremail = customeremail;
	}


	public int getBlogid() {
		return blogid;
	}


	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}


	public String getBlogtitle() {
		return blogtitle;
	}


	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}


	public String getBlogcontent() {
		return blogcontent;
	}


	public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	}


	public String getBlogdate() {
		return blogdate;
	}


	public void setBlogdate(String blogdate) {
		this.blogdate = blogdate;
	}


	public String getCustomeremail() {
		return customeremail;
	}


	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}


	@Override
	public String toString() {
		return "myblog [blogid=" + blogid + ", blogtitle=" + blogtitle + ", blogcontent=" + blogcontent + ", blogdate="
				+ blogdate + ", customeremail=" + customeremail + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

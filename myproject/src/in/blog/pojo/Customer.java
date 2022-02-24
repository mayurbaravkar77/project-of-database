package in.blog.pojo;

public class Customer {
	
		private int custid;
		private String custname;
		private String custemail;
		private String custcontact;
		private String custpassword;
		

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	//without id (used to store the data of customer)
		public Customer(String custname, String custemail, String custcontact, String custpassword) {
			super();
			this.custname = custname;
			this.custemail = custemail;
			this.custcontact = custcontact;
			this.custpassword = custpassword;
		}
		// constructor with all fields
		public Customer(int custid, String custname, String custemail, String custcontact, String custpassword) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custemail = custemail;
		this.custcontact = custcontact;
		this.custpassword = custpassword;
	}


		public int getCustid() {
			return custid;
		}


		public void setCustid(int custid) {
			this.custid = custid;
		}


		public String getCustname() {
			return custname;
		}


		public void setCustname(String custname) {
			this.custname = custname;
		}


		public String getCustemail() {
			return custemail;
		}


		public void setCustemail(String custemail) {
			this.custemail = custemail;
		}


		public String getCustcontact() {
			return custcontact;
		}


		public void setCustcontact(String custcontact) {
			this.custcontact = custcontact;
		}


		public String getCustpassword() {
			return custpassword;
		}


		public void setCustpassword(String custpassword) {
			this.custpassword = custpassword;
		}
		


		@Override
		public String toString() {
			return "Customer [custid=" + custid + ", custname=" + custname + ", custemail=" + custemail + ", custcontact="
					+ custcontact + ", custpassword=" + custpassword + "]";
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}



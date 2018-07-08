import java.util.*; 
import java.io.IOException;
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import javax.servlet.GenericServlet; 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException;
import javax.servlet.ServletRequest; 
import javax.servlet.ServletResponse; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 
@WebServlet("/NewVendor") 
public class NewVendor extends HttpServlet 
{  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {   
	try {   
		boolean flag=false;   
		Connection con=null;  
		PreparedStatement smt=null;
		Statement smt1=null;
		ResultSet rs;   
		response.setContentType("text/html");   
		PrintWriter pw = response.getWriter();   
		HttpSession session=request.getSession();   
		//String Vendorcode = request.getParameter("vendor_code");  
		String Vendorname = request.getParameter("txt_uname");   
		String Address = request.getParameter("txt_address");
		String Gst=request.getParameter("txt_gstnumber");
		String ContactPerson = request.getParameter("txt_contactperson");
		String Designation = request.getParameter("txt_designation");
		String phone =request.getParameter("txt_phonenumber");   
		String email = request.getParameter("txt_emailid"); 
		System.out.println("Hii");
		//System.out.println(Vendorcode);
		//Step 1: Load the driver    
		Class.forName("com.mysql.jdbc.Driver");    
		//Step 2: Connection to the database  
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Erp","root","Rams3098!");    
		//Step 3 : Create a Prepared Statement     
		
		String numbers=null;
		String s=null;
		String s2=null;
		String s3=null;
		char c=Vendorname.charAt(0);
		if(c=='A'||c=='a')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'A%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="A-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************B************************************/
		if(c=='B'||c=='b')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'B%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="B-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************C************************************/
		if(c=='C'||c=='c')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'C%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="C-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************D************************************/
		if(c=='D'||c=='d')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'D%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="D-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************E************************************/
		if(c=='E'||c=='e')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'E%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="E-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************F************************************/
		if(c=='F'||c=='f')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'F%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="F-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************G************************************/
		if(c=='G'||c=='g')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'G%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="G-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************H************************************/
		if(c=='H'||c=='h')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'H%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="H-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************I************************************/
		if(c=='I'||c=='i')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'I%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="I-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************J************************************/
		if(c=='J'||c=='j')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'J%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="J-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************K************************************/
		if(c=='K'||c=='k')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'K%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="K-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************L************************************/
		if(c=='L'||c=='l')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'L%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="L-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************M************************************/
		if(c=='M'||c=='m')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'M%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="M-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************N************************************/
		if(c=='N'||c=='n')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'N%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="N-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************O************************************/
		if(c=='O'||c=='o')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'O%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="O-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************P************************************/
		if(c=='P'||c=='p')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'P%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="P-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************Q************************************/
		if(c=='Q'||c=='q')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'Q%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="Q-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************R************************************/
		if(c=='R'||c=='r')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'R%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="R-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************S************************************/
		if(c=='S'||c=='s')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'S%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="S-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************T************************************/
		if(c=='T'||c=='t')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'T%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="T-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************U************************************/
		if(c=='U'||c=='u')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'U%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="U-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************V************************************/
		if(c=='V'||c=='v')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'V%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="V-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************W************************************/
		if(c=='W'||c=='w')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'W%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="W-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************X************************************/
		if(c=='X'||c=='x')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'X%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="X-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************Y************************************/
		if(c=='Y'||c=='y')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'Y%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="Y-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		/******************************Z************************************/
		if(c=='Z'||c=='z')
		{
			smt1=con.createStatement();
				rs=smt1.executeQuery("select Vendorcode from Vendors where Vendorcode like 'Z%' ");
			if (!rs.isBeforeFirst() && rs.getRow() == 0) {    
				    s2="Z-1"; 
				} 
				else
				{
						if(rs.next()) {
							System.out.println(rs.getString(1));
							s=rs.getString(1);
							numbers=s.replaceAll("[^0-9]", "");
							 int count= Integer.parseInt(numbers);
							 count++;
							 s3=Integer.toString(count);
							  s2=s.charAt(0)+"-"+s3;
							
						}
				} 
		}
		smt = con.prepareStatement("insert into Vendors values(?,?,?,?,?,?,?,?);");    
		smt.setString(1, s2);       
		smt.setString(2, Vendorname);
		smt.setString(3, Address);  
		smt.setString(4, Gst); 
		smt.setString(5, ContactPerson);
		smt.setString(6, Designation); 
		smt.setString(7, phone);  
		smt.setString(8, email);      
		//Step 4 : Execute the Query    
		int i=smt.executeUpdate();    
		RequestDispatcher rd;    
		if(i!=0) 
		{    
			     
				//pw.println("<h1>Registration Successfull. Welcome "+Username+" </h1>");     
				//pw.println("<a href='login.html'>Login</a>");     
				rd=request.getRequestDispatcher("Vendordetails.jsp");     
				try {      rd.forward(request, response);     
				} 
				catch (ServletException e) 
				{      // TODO Auto-generated catch block      
					e.printStackTrace(); 
		                                                  
		 
		    	}     
		}    
		else    
		{    
		 pw.println("<h1>Invalid User</h1>");    
		}    
			con.close(); 
		
		
	} 
	catch (Exception e) 
	{    
			e.printStackTrace();   
	}   
		         
} 
	 
}
		
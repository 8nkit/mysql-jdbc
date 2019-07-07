package mysqlwork;
import java.sql.*;
import java.io.*;
public class mysqlwrk2 {
public static void main(String args[]) throws Exception {
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/";
	String db = "jdbc_example";
	String driver = "com.mysql.cj.jdbc.Driver";
	try {
	Class.forName(driver);
	con = DriverManager.getConnection(url + db, "root", "1729");
	try {
	Statement st=con.createStatement();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter table name ");
	String tname=br.readLine();
	String sql="create table"+tname+"(eno int,ename varchar(20),esal number)";
	st.executeUpdate(sql);
	System.out.println("table created successfully");
	
	} catch (SQLException s) {
		System.out.println("SQL statement is not executed! Error is: " + s.getMessage());
	}
	}
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	finally {
		con.close();
	}
}
}

package mysqlwork;
import java.sql.*;
import java.io.*;
public class mysqlwrk3 {
public static void main(String[] args)throws Exception {
	System.out.println("Inserting values in Mysql database table!");
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
		while(true) {
			
			System.out.print("Employee Number ");
			int eno=Integer.parseInt(br.readLine());
			System.out.print("Employee Name ");
			String ename=br.readLine();
			System.out.print("Employee Salary ");
			int esal=Integer.parseInt(br.readLine());
			st.executeUpdate("insert into edad values ("+eno+",'"+ename+"',"+esal+")");
			System.out.println("Employee inserted successfully");
			System.out.println("One more Employee [Yes/No]? : ");
			String option=br.readLine();
			if(option.contentEquals("No"))
			{
				break;
			}
		}
		con.close();
	
	} catch (SQLException s) {
		System.out.println("SQL statement is not executed! Error is: " + s.getMessage());
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
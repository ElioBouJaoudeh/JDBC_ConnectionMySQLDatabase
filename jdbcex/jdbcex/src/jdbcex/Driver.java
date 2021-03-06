 package jdbcex;
 
 import java.sql.*;

public class Driver {
	public static void main(String[] args) {
		try {
			// 1) Get a connection to database
			Connection myConn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			// 2) Create a statement
			Statement myStatement = myConn.createStatement();
			
			// 3) Execute SQL Query
			ResultSet myResult = myStatement.executeQuery("select * from employees");
			
			//4) Process the result set
			while (myResult.next()) {
				System.out.println(myResult.getString("first_name")+" "+myResult.getString("last_name"));
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
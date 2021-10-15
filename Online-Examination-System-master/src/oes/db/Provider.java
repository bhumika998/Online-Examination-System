package oes.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {
	
	public static Connection getOracleConnection()
	{
		Connection con = null;
		try
		{ 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
		//	Class.forName("oracle.jdbc.OracleDriver");
			
		
	      //      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MusicVideoDB","legendary");
	         con = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;" +
			"database=OnlineExam_Sample1;" + "user=sa;" + "password=root123;" );
			 
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sa","vikas12345"); //system,iit
					
		}
		catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
}
	
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static Connection getConect(){
		String url="jdbc:mysql://localhost:3306/Company";
		String user="root";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("SUCCESS");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No Connection");
			e.printStackTrace();
		}
		return conn;
	}

}

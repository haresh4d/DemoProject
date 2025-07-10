package com.demoproject;
import java.sql.*;

public class MoviesOperations {
	
	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/moviesdb";
		String username = "root";
		String password = "gecr@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
	public static int addMovie(String title, String director, int releaseYear, String category) throws Exception {
		
		Connection con = getConnection();
		
		return 1;
	}

}

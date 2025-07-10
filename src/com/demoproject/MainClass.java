package com.demoproject;

import java.sql.*;

public class MainClass {

	public static void main(String[] args) {
		
			String url = "jdbc:mysql://localhost:3306/moviesdb";
			String username = "root";
			String password = "gecr@123";
			String director = "Director 5";
			int releaseYear = 2021;
			String category = "Category 5";
			String title = "Title 5";
		
			try
			{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			//Statement st = con.createStatement();
			
			//int result = st.executeUpdate("insert into movies(title, director, releaseYear, category) values ('" + title + "','" + director + "'," + releaseYear + ",'"+ category + "')");
			//ResultSet rs = st.executeQuery("select * from movies where director='" + director + "'");
			
			PreparedStatement pst = con.prepareStatement("insert into movies (title, director, releaseYear, category) values(?, ?, ?, ?)");
			pst.setString(1, title);
			pst.setString(2, director);
			pst.setInt(3, releaseYear);
			pst.setString(4, category);
			
			
			int result = pst.executeUpdate();
			
			System.out.println(result + " records inserted");
			
			pst.setString(1, "Title 6");
			pst.setString(2, "Director 6");
			pst.setInt(3, 2024);
			pst.setString(4, "Category 6");
			
			 result = pst.executeUpdate();
			 System.out.println(result + " records inserted");
			
			
//			while(rs.next()) {
//				System.out.println("ID : " + rs.getInt(1));
//				System.out.println("Title : " + rs.getString(2));
//				System.out.println("Director : " + rs.getString(3));
//				System.out.println("Release Year : " + rs.getInt(4));
//				System.out.println("Category : " + rs.getString(5));
//				System.out.println("**************************************");
//			}
			
			}
			catch(Exception e) {
				System.out.print(e.getMessage());
			}

	}

}

package com.demoproject;

import java.sql.*;
import java.util.ArrayList;

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
		PreparedStatement pst = con
				.prepareStatement("insert into movies (title, director, releaseYear, category) values(?, ?, ?, ?)");
		pst.setString(1, title);
		pst.setString(2, director);
		pst.setInt(3, releaseYear);
		pst.setString(4, category);

		int result = pst.executeUpdate();

		return result;
	}

	public static Movie getMovie(int id) throws Exception {

		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from movies where id=?");
		pst.setInt(1, id);

		ResultSet rs = pst.executeQuery();
		Movie m = null;

		if (rs.next()) {
			m = new Movie();
			m.setId(rs.getInt("id"));
			m.setTitle(rs.getString("title"));
			m.setDirector(rs.getString("director"));
			m.setReleaseYear(rs.getInt("releaseYear"));
			m.setCategory(rs.getString("category"));

		}

		return m;
	}
	
	
	
	public static ArrayList<Movie> getMovies() throws Exception{
		
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from movies");

		ResultSet rs = pst.executeQuery();
		ArrayList<Movie> movies = new ArrayList<Movie>();

		while (rs.next()) {
			Movie m = new Movie();
			m.setId(rs.getInt("id"));
			m.setTitle(rs.getString("title"));
			m.setDirector(rs.getString("director"));
			m.setReleaseYear(rs.getInt("releaseYear"));
			m.setCategory(rs.getString("category"));
			movies.add(m);

		}

		return movies;
		
	}

	public static int deleteMovie(int id) throws Exception{
		
		Connection con = getConnection();
		PreparedStatement pst = con
				.prepareStatement("delete from movies where id=?");
		pst.setInt(1, id);

		int result = pst.executeUpdate();

		return result;
				
	}
	
	
	public static int updateMovie(int id, String title, String director, int releaseYear, String category) throws Exception {

		Connection con = getConnection();
		PreparedStatement pst = con
				.prepareStatement("update movies set title=?, director=?, releaseYear=?, category=? where id=?");
		
		pst.setString(1, title);
		pst.setString(2, director);
		pst.setInt(3, releaseYear);
		pst.setString(4, category);
		pst.setInt(5, id);

		int result = pst.executeUpdate();

		return result;
	}
	
}

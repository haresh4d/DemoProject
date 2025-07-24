package com.demoproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TypesOfResultSets {
	
	public static void main(String[] args) {
		
		try {
			
			Connection con = MoviesOperations.getConnection();
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = st.executeQuery("select * from movies");
			
			while(rs.next()) {
				if(rs.getInt("id") == 5) {
					rs.updateString(2, "Title 500");
					rs.updateRow();
				}
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

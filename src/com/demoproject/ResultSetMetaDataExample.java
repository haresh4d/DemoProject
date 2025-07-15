package com.demoproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {

		try {

			Connection con = MoviesOperations.getConnection();

			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = st.executeQuery("select * from movies");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Number of Columns: " + rsmd.getColumnCount());
			System.out.println("2nd Column Lable  : " + rsmd.getColumnLabel(2));
			System.out.println("3rd Column DataTyle  : " + rsmd.getColumnTypeName(3));
			System.out.println("3rd Column Table Name  : " + rsmd.getTableName(3));
			
			
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

package com.demoproject;

import java.sql.*;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		
//			try
//			{
//					
//				Movie m = MoviesOperations.getMovie(8);
//				if(m==null) {
//					System.out.println("No Such Movie");
//				}
//				else {
//					System.out.println("Movie Found with following details:");
//					System.out.println("Title : " +  m.getTitle());
//					System.out.println("Director : " +  m.getDirector());
//					System.out.println("Category : " +  m.getCategory());
//					System.out.println("ReleaseYear : " +  m.getReleaseYear());
//				}
//			}
		
//			try {
//				
//					ArrayList<Movie> movies = MoviesOperations.getMovies();
//					for(int i=0; i<movies.size(); i++) {
//						System.out.println("Title : " +  movies.get(i).getTitle());
//						System.out.println("Director : " +  movies.get(i).getDirector());
//						System.out.println("Category : " +  movies.get(i).getCategory());
//						System.out.println("ReleaseYear : " +  movies.get(i).getReleaseYear());
//						System.out.println("**************************************");
//						
//					}
//			}
		
//			try {
//				
//					int result = MoviesOperations.deleteMovie(7);
//					if(result >= 1) {
//						System.out.println(result + " movies deleted");
//					}
//					else {
//						System.out.println("No Movies deleted");
//					}
//			}
		
			try {
				
				Movie m = MoviesOperations.getMovie(1);
				int result =MoviesOperations.updateMovie(m.getId(), "Title 100", m.getDirector(), m.getReleaseYear(), m.getCategory());
				
				if(result >= 1) {
					System.out.println(result + " movies updated");
				}
				else {
					System.out.println("No Movies updated");
				}
				
			}
			catch(Exception e) {
				System.out.print(e.getMessage());
			}

	}

}

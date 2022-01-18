package com.marticus.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorsSelectJdbc {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "SELECT * FROM doctors";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			
			while (result.next()){
				Integer doc_id = result.getInt(1);
				String doc_name = result.getString("doc_name");
				String doc_type = result.getString("doc_type");
//				String email = result.getString("email");
				
				String output = "User #%d: %s - %s - %s";
				System.out.println(String.format(output, ++count, doc_id, doc_name, doc_type));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}

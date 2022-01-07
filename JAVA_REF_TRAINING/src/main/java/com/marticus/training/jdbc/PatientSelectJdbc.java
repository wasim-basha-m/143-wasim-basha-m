package com.marticus.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientSelectJdbc {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "SELECT * FROM patients";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			
			while (result.next()){
				Integer pt_id = result.getInt(1);
				String pt_name = result.getString("pt_name");
				String pt_type = result.getString("pt_type");
				
				String output = "patients #%d: %d - %s - %s";
				System.out.println(String.format(output, ++count, pt_id, pt_name, pt_type));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}

}

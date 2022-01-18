package com.marticus.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HospitaInsertlJdbc {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "INSERT INTO Hospital (hp_pt_id, hp_doc_name, hp_bed_no) VALUES (?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "906");
			statement.setString(2, "thufi");
			statement.setString(3, "505");
			
			int rowsInserted = statement.executeUpdate();
				System.out.println("A new user was inserted successfully!");
			}

			
		 catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}

}

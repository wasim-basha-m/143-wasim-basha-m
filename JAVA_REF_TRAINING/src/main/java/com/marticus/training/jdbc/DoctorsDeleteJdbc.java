package com.marticus.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorsDeleteJdbc {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "DELETE FROM Doctors WHERE doc_id=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 101);
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}

}

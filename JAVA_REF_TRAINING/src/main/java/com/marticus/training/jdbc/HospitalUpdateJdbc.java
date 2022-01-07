package com.marticus.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HospitalUpdateJdbc {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "UPDATE patients SET pt_name=?, pt_type=? WHERE pt_id=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "ABCD");
			statement.setString(2, "OUT patinet");
			statement.setInt(3, 904);
			
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}

package com.cg.demo.postgre;

import java.sql.*;

public class App2 {

	public static void main(String args[]) throws SQLException {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "admin");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM players");
		while (rs.next()) {
			
			int jerseyNo = rs.getInt("jerseyNo");
			String playerName = rs.getString("playerName");
			float Salary = rs.getFloat("Salary");
			int DeptNo = rs.getInt("DeptNo");
			System.out.println("jerseyNo = " + jerseyNo);
			System.out.println("NAME = " + playerName);
			System.out.println("SALARY = " + Salary);
			System.out.println("Dept = " + DeptNo);
		}
	}
}

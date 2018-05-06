package com.jm2007.learn.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2007.learn.jdbc.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		try {
			// get connection
			Connection con = DatabaseUtility.getCon();

			// create prepared statement
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2007_USER VALUES(?, ?)");

			// execute the query(yes, set the values first into ? marks)
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getName());
			int numberOfRecordsInserted = pstmt.executeUpdate();

			// process the result
			if (numberOfRecordsInserted > 0) {
				System.out.println("User inserted successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUser(int id) {
		User user = null;
		try {
			// get connection
			Connection con = DatabaseUtility.getCon();
			// create statement
			Statement stmt = con.createStatement();
			// execute the query
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2007_USER WHERE ID = " + id);

			// process the result
			if (rs.next()) {
				System.out.println("User found");
				int userId = rs.getInt(1);
				String nm = rs.getString(2);
				user = new User(userId, nm);
			} else {
				System.out.println("User not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String getUserName(int id) {
		String userName = null;
		try {
			// get connection
			Connection con = DatabaseUtility.getCon();
			// create statement
			Statement stmt = con.createStatement();
			// execute the query
			ResultSet rs = stmt.executeQuery("SELECT NAME FROM JM2007_USER WHERE ID = " + id);

			// process the result
			if (rs.next()) {
				System.out.println("User found");
				userName = rs.getString(1);
			} else {
				System.out.println("User not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userName;
	}

}

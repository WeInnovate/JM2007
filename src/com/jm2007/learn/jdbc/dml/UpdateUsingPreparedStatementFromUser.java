package com.jm2007.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatementFromUser {

	public static void main(String[] args) {
		try {
			// 1. Create the database connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2007_USER SET NAME = ? WHERE ID = ?;");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter the new name: ");
				String name = scan.nextLine();
				
				System.out.print("Enter user ID: ");
				int id = Integer.parseInt(scan.nextLine());

				// 3. Execute the statement/command
				pstmt.setString(1,name);
				pstmt.setInt(2, id);
				int i = pstmt.executeUpdate();
				if (i > 0) {
					System.out.println(i + " Record updated successfully.");
				}
				
				System.out.print("Do you want to continue(Y/N)? ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

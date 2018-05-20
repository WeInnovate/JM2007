package com.jm2007.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jm2007.learn.jdbc.dao.DatabaseUtility;

public class MyDatabaseMetaData {

	public static void main(String[] args) {
		try (Connection con = DatabaseUtility.getCon()) {

			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Product Version: " + dbmd.getDatabaseProductVersion());
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("User Name: " + dbmd.getUserName());
			System.out.println("URL: " + dbmd.getURL());

			ResultSet rs = dbmd.getTables(null, null, "JM2007_%", null);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

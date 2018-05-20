package com.jm2007.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2007.learn.jdbc.dao.DatabaseUtility;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try (Connection con = DatabaseUtility.getCon(); Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2007_USER");

			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Table Name: "+rsmd.getTableName(1));

			int columnCount = rsmd.getColumnCount();
			System.out.println("Column count: "+columnCount);
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i));
				System.out.print("(");
				System.out.print(rsmd.getColumnTypeName(i));
				System.out.print(")");
				System.out.print("    ");
			}

			while (rs.next()) {
				System.out.println("");
				System.out.print(rs.getInt(1));
				System.out.print("                 ");
				System.out.print(rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.jm2007.learn.jdbc.img;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2007.learn.jdbc.dao.DatabaseUtility;

public class SaveImage {

	public static void main(String[] args) {
		try (Connection con = DatabaseUtility.getCon();
				PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2007_MY_PROFILE VALUES (?, ?)")) {

			FileInputStream fin = new FileInputStream("img//atul.png");

			pstmt.setString(1, "Atul");
			pstmt.setBinaryStream(2, fin, fin.available());

			pstmt.executeUpdate();

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}

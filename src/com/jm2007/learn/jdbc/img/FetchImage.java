package com.jm2007.learn.jdbc.img;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2007.learn.jdbc.dao.DatabaseUtility;

public class FetchImage {

	public static void main(String[] args) {
		try (Connection con = DatabaseUtility.getCon(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT IMG FROM JM2007_MY_PROFILE WHERE NAME = 'Atul'");

			rs.next();

			Blob b = rs.getBlob(1);
			byte[] img = b.getBytes(1, (int) b.length());

			FileOutputStream fos = new FileOutputStream("img//output.png");

			fos.write(img);
			fos.close();

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}

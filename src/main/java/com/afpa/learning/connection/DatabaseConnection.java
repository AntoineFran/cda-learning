package com.afpa.learning.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DatabaseConnection implements AutoCloseable{
	private static Connection connection = null;

	private DatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties appProps = new Properties();
			appProps.load(DatabaseConnection.class.getResourceAsStream("/db.properties"));
			connection = DriverManager.getConnection(
					appProps.getProperty("url"), 
					appProps.getProperty("user"),
					appProps.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connection == null) {
			new DatabaseConnection();
		}
		return connection;
	}

	@Override
	public void close() throws Exception {
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Thanks!");
			} catch (SQLException ignore) {
				ignore.printStackTrace();
			}
		}
	}
}

package com.afpa.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import com.afpa.learning.connection.DatabaseConnection;


public class ConnectionTest {

	private Connection connection;
	
    @Test
    public void database_connection_null_test() {
    	connection = null;
    	assertEquals(null, connection);
    }
    
    @Test
    public void database_connection_not_null_test() {
    	connection = DatabaseConnection.getConnection();
    	assertNotEquals(null, connection);
    }
    
}

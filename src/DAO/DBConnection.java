package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//singleton pattern
public class DBConnection {
	private static Connection conn = null;
	
	public static Connection getConnection() {
        Properties props = new Properties();
        FileInputStream fis = null;
        if(conn==null) {
	        try {
	            fis = new FileInputStream("db.properties");
	            props.load(fis);
	            
	            // load the Driver Class
	            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
	 
	            // create the connection now
	            conn = DriverManager.getConnection(props.getProperty("DB_URL"),
	                    props.getProperty("DB_USERNAME"),
	                    props.getProperty("DB_PASSWORD"));
	        } catch (IOException | ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
        }
        return conn;
    }
}
package Main;

import java.sql.*;

public class Databases {
    
    public static Boolean admin = false;
    
    public static Connection connection;
    public static PreparedStatement statement;
    public static ResultSet resultSet;
    
    public static final String URL = System.getenv("DB_URL");
    public static final String USER = System.getenv("DB_USER");
    public static final String PASSWORD = System.getenv("DB_PASSWORD");
}
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Databases {
    
    public static Connection connection;
    public static PreparedStatement statement;
    public static ResultSet resultSet;
    
    public static final String URL = "jdbc:derby://localhost:1527/InventorySystem";
    public static final String USER = "administrator";
    public static final String PASSWORD = "123";
}

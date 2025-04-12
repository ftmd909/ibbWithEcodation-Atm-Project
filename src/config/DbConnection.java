package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DB_URL = "jdbc:h2:./data/atmdb";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static Connection connect() {
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // JDBC connection details
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/pp1_1_3";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PASSWORD = "506162Mal1127)";


    // Get JDBC Connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Close JDBC Connection
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



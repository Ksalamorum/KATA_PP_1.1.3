package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost/mydbtest";
    private static final String DB_USERNAME = "rooting";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        //connection.setAutoCommit(false);
        return connection;
    }
}

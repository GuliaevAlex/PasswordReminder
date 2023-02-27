package dao;

import java.sql.*;

public class DBManagement {


    private static final String className = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String userName = "postgres";
    private static final String passwordDB = "postgres";

    public static Connection connect() throws SQLException {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection(url, userName, passwordDB);
    }
}

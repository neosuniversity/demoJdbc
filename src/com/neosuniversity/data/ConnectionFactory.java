package com.neosuniversity.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new DAOException(e);
        }

    }

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "discom");
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return connection;
    }
}

package com.yani.designpatterns.creational.singleton;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    // using volatile to ensure thread safety
    private static volatile DbSingleton instance;
    private static volatile Connection conn;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (conn != null) {
            throw new RuntimeException("Use getConnection() method to create");
        }

        if (instance != null) {
            // thread safe
            // blocks object creation with reflection
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            // thread safe
            synchronized (DbSingleton.class) {
                // Lazy loaded
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingleton.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
}

package com.yani.designpatterns.structural.facade;

import com.yani.designpatterns.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton instance;
    Connection connection;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
        connection = instance.getConnection();
    }

    public int createTable() {
        int count = 0;

        try (Statement statement = connection.createStatement()) {
            count = statement.executeUpdate(
            "CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))"
            );

            System.out.println("Table created...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return count;
    }

    public int insertIntoTable() {
        int count = 0;

        try (Statement statement = connection.createStatement()) {
            count = statement.executeUpdate(
            "INSERT INTO Address (ID, StreetName, City)" +
                "VALUES (1, '1234 Some street', 'Layton')"
            );

            System.out.println("Record inserted...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");
            System.out.println("Records retrieved...");

            while(resultSet.next()) {
                addresses.add(
                    new Address(
                        resultSet.getString(1), // id
                        resultSet.getString(2), // street
                        resultSet.getString(3)  // city
                    )
                );
            }

            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return addresses;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

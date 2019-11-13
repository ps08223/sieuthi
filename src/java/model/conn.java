/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KietLPT
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class conn {
    public Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Nhom7_DuAn1", "sa", "123");
            return connection;
        } catch (Exception e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }
}

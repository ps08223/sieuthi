/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JDBCHelper {
    final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=Nhom7_DuAn1";
    static String user = "sa";
    static String password = "123";
    static Connection con = null;
            
    static PreparedStatement pstm = null;
    static ResultSet rs = null;
    
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement prepareStatement(String sql, Object...args) {
        try {    
            con = DriverManager.getConnection(url, user, password);
            if (sql.trim().startsWith("{")) {
                pstm = con.prepareCall(sql);
            } else {
                pstm = con.prepareStatement(sql);
            }
            
            for (int i = 0; i < args.length; i++) {
                pstm.setObject(i+1, args[i]);
            }
            
            return pstm;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void executeUpdate(String sql, Object...args) {
        try (PreparedStatement pstmt = prepareStatement(sql, args)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
        }
    }
    
    public static ResultSet executeQuery(String sql, Object...args) throws SQLException {
       try {
           pstm = prepareStatement(sql, args);
           return pstm.executeQuery();
       } catch (SQLException e) {
           throw new RuntimeException();
       }
    }
}

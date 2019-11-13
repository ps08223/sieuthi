/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KietLPT
 */
public class Products {
    conn cn=new conn();
    public Products() {}
    public void delete(String ID){
        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
//            Connection con = DriverManager.getConnection(url, "sa", "");
            
            String sql = "delete from Product where productID=?";
            PreparedStatement stm = cn.connect().prepareStatement(sql);
            stm.setString(1, ID);
            stm.executeUpdate();
            stm.close();
            cn.connect().close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void insert(String ID, String categoryID, String name, String numeraire, int price, String picURL){
        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
//            Connection con = DriverManager.getConnection(url, "sa", "");
            String sql = "insert into Product values(?,?,?,?,?,?)";
            PreparedStatement stm = cn.connect().prepareStatement(sql);
            stm.setString(1, ID);
            stm.setString(2, categoryID);
            stm.setString(3, name);
            stm.setString(4, numeraire);
            stm.setInt(5, price);
            stm.setString(6, picURL);
            stm.executeUpdate();
            stm.close();
            cn.connect().close();
            }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(String ID, String categoryID, String name, String numeraire, int price,String picURL){
        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
//            Connection con = DriverManager.getConnection(url, "sa", "");
            String sql = "update Product set categoryID=?, Name=?, Numeraire=?, Price=?,samplePic=? where productID=?";
            PreparedStatement stm =cn.connect().prepareStatement(sql);
            stm.setString(1, categoryID);
            stm.setString(2, name);
            stm.setString(3, numeraire);
            stm.setInt(4, price);
            stm.setString(5, picURL);
            stm.setString(6, ID);
            stm.executeUpdate();
            stm.close();
            cn.connect().close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Product> showProduct(String category){
        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
//            Connection con = DriverManager.getConnection(url, "sa", "");
            String sql = "select * from SanPham";
            if(category.length() > 0){
                sql += " where MaDanhMuc = '"+category+"'";
            }
            Statement stm = cn.connect().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Product> list = new ArrayList<Product>();
            while(rs.next()){
                String ID = rs.getString("MaSanPham");
                String categoryID = rs.getString("MaDanhMuc");
                String pname = rs.getString("TenSanPham");
                int TonKho = rs.getInt("TonKho");
                int price = rs.getInt("Gia");
                String picURL = rs.getString("HinhAnh");
                Product sp = new Product(ID, categoryID, pname, TonKho, price, picURL);
                list.add(sp);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

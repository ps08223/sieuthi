/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.JDBCHelper;
import java.util.List;
import Entities.BangLuong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BangLuongDAO {
    String sql;
    public void Insert(int MaNV, int Luong) {
        sql = "Insert Into BangLuong(MaNhanVien, Luong) Values (?, ?)";
        JDBCHelper.executeUpdate(sql, MaNV, Luong);
    }
    
    public void Update(int MaBL, int MaNV, int Luong) {
        sql = "Update BangLuong Set MaNhanVien = ?, Luong = ? Where MaBangLuong = ?";
        JDBCHelper.executeUpdate(sql, MaNV, Luong, MaBL);
    }
    
    public List<BangLuong> Select() {
        sql = "Select * From BangLuong";
        return Select(sql);
    }
    
    public List<BangLuong> Select(String sql, Object...args) {
        List<BangLuong> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                BangLuong bl = new BangLuong();
                bl.setMaBL(rs.getInt(1));
                bl.setMaNV(rs.getInt(2));
                bl.setLuong(rs.getInt(3));
                bl.setNgayTra(rs.getString(4));
                list.add(bl);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
}

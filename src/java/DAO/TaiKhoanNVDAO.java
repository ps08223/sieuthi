/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entities.TaiKhoanNV;

/**
 *
 * @author Admin
 */
public class TaiKhoanNVDAO {
    public List<TaiKhoanNV> Select() {
        String sql = "Select TaiKhoan, MatKhau, VaiTro From NhanVien";
        return Select(sql);
    }
    
    public List<TaiKhoanNV> Select(String sql, Object...args) {
        List<TaiKhoanNV> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                TaiKhoanNV tk = new TaiKhoanNV();
                tk.setTaiKhoan(rs.getString(1));
                tk.setMatKhau(rs.getString(2));
                tk.setVaiTro(rs.getInt(3)==1);
                list.add(tk);
            }
            
            return list;
        } catch (SQLException e) {
            
        }
        
        return null;
    }
    
    public int MaNhanVien(String TaiKhoan) {
        String sql = "Select MaNhanVien From NhanVien Where TaiKhoan = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, TaiKhoan)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.NhanVien;
import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {
    String sql;
    public void Insert(String TaiKhoan, String Ten, int GioiTinh, int Tuoi, String Mail, int VaiTro) {
        sql = "Insert Into NhanVien Values "
                + "(?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, TaiKhoan, "123", Ten, GioiTinh, Tuoi, Mail, VaiTro);
    }
    
    public void Update(String Ten, int GioiTinh, int Tuoi, String Mail, int VaiTro, int MaNV) {
        sql = "Update NhanVien Set Ten = ?, GioiTinh = ?, Tuoi = ?, Email = ?, VaiTro = ? Where MaNhanVien = ?";
        JDBCHelper.executeUpdate(sql, Ten, GioiTinh, Tuoi, Mail, VaiTro, MaNV);
    }
    
    public List<NhanVien> Select() {
        sql = "Select * From NhanVien";
        return Select(sql);
    }
    
    public List<NhanVien> Select(String sql, Object...args) {
        List<NhanVien> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getInt(1));
                nv.setTaiKhoan(rs.getString(2));
                nv.setTen(rs.getString(4));
                nv.setGioiTinh(rs.getInt(5) == 1?"Nam":"Nữ");
                nv.setTuoi((rs.getInt(6)));
                nv.setEmail((rs.getString(7)));
                nv.setVaiTro(rs.getInt(8));
                list.add(nv);
            } 
        } catch (Exception e) {
            
        }
        
        return list;
    }
}

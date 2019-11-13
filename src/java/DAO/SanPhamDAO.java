/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entities.SanPham;

/**
 *
 * @author Admin
 */
public class SanPhamDAO {
    public void Insert(int MaDM, String TenSP, int Gia, int TonKho) {
        String sql = "Insert Into SanPham(MaDanhMuc, TenSanPham, Gia, TonKho)"
                    + " Values(?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, MaDM, TenSP, Gia, TonKho);
    }
    
    public void Update(int MaSP, int MaDM, String TenSP, int Gia, int TonKho) {
        String sql = "Update SanPham Set MaDanhMuc=?, TenSanPham=?, Gia=?, TonKho=? "
                + "Where MaSanPham=?";
        JDBCHelper.executeUpdate(sql, MaDM, TenSP, Gia, TonKho, MaSP);
    }
    
    public void Delete(int MaSP) {
        String sql = "Delete From SanPham Where MaSP=?";
        JDBCHelper.executeUpdate(sql, MaSP);
    }
    
    public List<SanPham> Select() {
        String sql = "Select * From SanPham";
        return Select(sql);
    }
    
    public List<SanPham> Select(String sql, Object...args) {  
        List<SanPham> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)){       
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt(1));
                sp.setMaDM(rs.getInt(2));
                sp.setTen(rs.getString(3));
                sp.setGia(rs.getInt(4));
                sp.setTonKho(rs.getInt(5));
                sp.setHinhAnh(rs.getString(6));
                list.add(sp);
            }
            
            rs.close();
        } catch (Exception ex) {
        }
        
        return list;
    }
    
    public int MaSanPham(String TenSP) {
        String sql = "Select MaSanPham From SanPham Where TenSanPham = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, TenSP)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    }
    
    public int TonKho(int MaSP) {
        String sql = "Select TonKho From SanPham Where MaSanPham = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaSP)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    }
//    
//    public String[] TenSanPham() {
//        String sql = "Select TenSanPham From SanPham";
//        String[] names = new String[10];
//        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
//            int i = 0;
//            while (rs.next()) {
//                names[i] = rs.getString(1);
//                i++;
//            }
//        } catch (Exception e) {
//            
//        }
//        
//        return names;
//    }
}

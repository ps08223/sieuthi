/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.PhieuNhap;
import Entities.PhieuNhapCT;
import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuNhapDAO {
    String sql;
    public void PNUpdate(int MaNV, int MaPN) {
        sql = "Update PhieuNhap Set MaNhanVien = ? Where MaPhieuNhap = ?";
        JDBCHelper.executeUpdate(sql, MaNV, MaPN);
    }
    
    public void PNInsert(int MaNV) {
        sql = "Insert Into PhieuNhap(MaNhanVien) Values (?)";
        JDBCHelper.executeUpdate(sql, MaNV);
    }
    
    public void PNCTInsert(int MaPN, int MaSP, int SoLuong, int ChietKhau) {
        sql = "Insert Into PhieuNhapChiTiet(MaPhieuNhap, MaSanPham, SoLuong, ChietKhau) Values (?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, MaPN, MaSP, SoLuong, ChietKhau);
    }
    
    public void PNCTDelete(int MaPN) {
        sql = "Delete PhieuNhapChiTiet Where MaPhieuNhap = ?";
        JDBCHelper.executeUpdate(sql, MaPN);
    }
    
    public List<PhieuNhap> Select() {
        sql = "Select * From PhieuNhap";
        return Select(sql);
    }
    
    public List<PhieuNhap> Select(String sql, Object...args) {
        List<PhieuNhap> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                PhieuNhap pn = new PhieuNhap();
                pn.setMaPN(rs.getInt(1));
                pn.setNgayNhap(rs.getString(2));
                pn.setMaNV(rs.getInt(3));
                list.add(pn);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<PhieuNhapCT> PNCTSelect() {
        sql = "Select * From PhieuNhapChiTiet";
        return PNCTSelect(sql);
    }
    
    public List<PhieuNhapCT> PNCTSelect(String sql, Object...args) {
        List<PhieuNhapCT> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                PhieuNhapCT ct = new PhieuNhapCT();
                ct.setMaPNCT(rs.getInt(1));
                ct.setMaPN(rs.getInt(2));
                ct.setMaSP(rs.getInt(3));
                ct.setSoLuong(rs.getInt(4));
                ct.setChietKhau(rs.getInt(5));
                list.add(ct);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public int TongPhieuNhap(int MaPN) {
        sql = "Select Sum((Gia-(Gia*ChietKhau/100))*SoLuong) From PhieuNhapChiTiet ct Join SanPham sp On ct.MaSanPham = sp.MaSanPham Where MaPhieuNhap = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaPN)) {
            while (rs.next()) { 
                return rs.getInt(1);
            } 
        } catch (Exception e) {
            
        }
        
        return 0;
    }
    
    public int MaPNMoiNhat() {
        sql = "Select Top 1 MaPhieuNhap From PhieuNhap Order By MaPhieuNhap DESC";
        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    } 
}

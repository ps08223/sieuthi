/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.List;
import Entities.KhachHang;
import Entities.TaiKhoanKH;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    String sql;
    
    public void Insert() {
        sql = "Insert Into KhachHang(ThanhVien) Values (0)";
        JDBCHelper.executeUpdate(sql);
    }
    
    public void ThemMoiKhachHang(String TenKH, int GioiTinh, String Email, String SoDT, int ThanhVien) {
        sql = "Insert Into KhachHang(TenKhachHang, GioiTinh, Email, SoDT, ThanhVien) Values "
                + "(?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, TenKH, GioiTinh, Email, SoDT, ThanhVien);
    }
    
    public void CapNhatKhachHang(String TenKH, int GioiTinh, String Email, String SoDT, int ThanhVien, int MaKH) {
        sql = "Update KhachHang Set TenKhachHang = ?, GioiTinh = ?, Email = ?, SoDT = ?, ThanhVien = ? "
                + "Where MaKhachHang = ?";
        JDBCHelper.executeUpdate(sql, TenKH, GioiTinh, Email, SoDT, ThanhVien, MaKH);
    }
    
    public List<KhachHang> Select() {
        sql = "Select * From KhachHang";
        return Select(sql);
    }
    
    public List<KhachHang> Select(String sql, Object...args) {
        List<KhachHang> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                if (rs.getInt(10) == 0) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getInt(1));
                    kh.setThanhVien(false);
                    list.add(kh);
                } else {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getInt(1));
                    kh.setTenKH((rs.getString(4)));
                    kh.setGioiTinh(rs.getInt(5) == 1?"Nam":"Nữ");
                    kh.setTuoi(rs.getString(6));
                    kh.setMail(rs.getString(7));
                    kh.setSoDT(rs.getString(8));
                    kh.setDiaChi(rs.getString(9));
                    kh.setThanhVien(true);
                    list.add(kh);
                }
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public int KHMoiNhat() {
        sql = "Select Top 1 MaKhachHang From KhachHang Order By MaKhachHang DESC";
        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    }
    
    public List<TaiKhoanKH> TKKH() {
        sql = "Select MaKhachHang, TaiKhoan, MatKhau From KhachHang";
        return TKKH(sql);
    }
    
    public List<TaiKhoanKH> TKKH(String sql, Object...args) {
        List<TaiKhoanKH> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                TaiKhoanKH tkkh = new TaiKhoanKH();
                tkkh.MaKH = rs.getInt(1);
                tkkh.setTaiKhoan(rs.getString(2));
                tkkh.setMatKhau(rs.getString(3));
                list.add(tkkh);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public String TenKH(int MaKH) {
        sql = "Select TenKhachHang From KhachHang Where MaKhachHang = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaKH)) {
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            
        }
        
        return "";
    }
    
//    public List<KhachHang> TimKiem(String a) {
//        sql = "Select "
//    }
}

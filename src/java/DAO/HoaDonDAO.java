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
import Entities.HoaDon;
import Entities.HoaDonCT;

/**
 *
 * @author Admin
 */
public class HoaDonDAO {
    String sql;
    public void Insert(int HDMaNV, int HDMaKH, int HDCachThuc, int TrangThai) {
        sql = "Insert Into HoaDon(MaKhachHang, MaNhanVien, CachThuc, TrangThai)"
                + " Values(?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, HDMaKH, HDMaNV, HDCachThuc, TrangThai);
        
    }
    
    public void HDCTInsert(int HDCTMaHD, int HDCTMaSP, int HDCTSoLuong, int HDCTGiamGia) {
        sql = "Insert Into HoaDonChiTiet(MaHoaDon, MaSanPham, SoLuong, GiamGia) "
                + "Values (?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, HDCTMaHD, HDCTMaSP, HDCTSoLuong, HDCTGiamGia);
        sql = "Update SanPham Set TonKho = TonKho - " + HDCTSoLuong + " Where MaSanPham = ?";
        JDBCHelper.executeUpdate(sql, HDCTMaSP);
    }
    
    public void HDCTOInsert(int HDCTMaHD, int HDCTMaSP, int HDCTSoLuong, int HDCTGiamGia) {
        sql = "Insert Into HoaDonChiTiet(MaHoaDon, MaSanPham, SoLuong, GiamGia) "
                + "Values (?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, HDCTMaHD, HDCTMaSP, HDCTSoLuong, HDCTGiamGia);
    }
    
    public void Update(int HDMaKH, int HDMaNV, int TrangThai, int HDMaHD) {
        sql = "Update HoaDon Set MaKhachHang=?, MaNhanVien=?, TrangThai=? "
                    + "Where MaHoaDon=?";
        JDBCHelper.executeUpdate(sql, HDMaKH, HDMaNV, TrangThai, HDMaHD);
    }
    
    public void Delete(int MaHoaDon, int MaHoaDonCT) {
        sql = "Delete From HoaDonChiTiet Where MaHoaDon=?";
        JDBCHelper.executeUpdate(sql, MaHoaDonCT);
        sql = "Delete From HoaDon Where MaHoaDon=?";
        JDBCHelper.executeUpdate(sql, MaHoaDon);
    }
    
    public void DeleteHDCT(int MaHD) {
        sql = "Delete From HoaDonChiTiet Where MaHoaDon=?";
        JDBCHelper.executeUpdate(sql, MaHD);
    }
    
    public List<HoaDon> HDSelect() {
        sql = "Select * From HoaDon";
        return HDSelect(sql);
    }
    
    public List<HoaDon> HDSelect(String sql, Object...args) {  
        List<HoaDon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)){       
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt(1));
                hd.setMaKH(rs.getInt(2));
                hd.setMaNV(rs.getInt(3));
                hd.setNgayThanhToan(rs.getString(4));
                hd.setCachThuc(rs.getInt(6)==1);
                hd.setTrangThai((rs.getInt(7)==1));
                list.add(hd);
            }
            
            rs.close();
        } catch (Exception ex) {
        }
        
        return list;
    }
    
    public List<HoaDonCT> HDCTSelect() {
        sql = "Select * From HoaDonChiTiet";
        return HDCTSelect(sql);
    }
    
    public List<HoaDonCT> HDCTSelect(String sql, Object...args) {
        List<HoaDonCT> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.executeQuery(sql, args)) {
            while (rs.next()) {
                HoaDonCT hdct = new HoaDonCT();
                hdct.setMaHDCT(rs.getInt(1));
                hdct.setMaHD(rs.getInt(2));
                hdct.setMaSP(rs.getInt(3));
                hdct.setSoLuong(rs.getInt(4));
                hdct.setGiamGia(rs.getInt(5));
                list.add(hdct);
            }
        } catch (Exception e) {
        }
        
        return list;
    }
    
    public int TongHoaDon(int MaHD) {
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong) as Tong From SanPham sp join HoaDonChiTiet hdct On sp.MaSanPham = hdct.MaSanPham Where MaHoaDon = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaHD)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return 0;
    }
    
    public String TenSanPham(int MaSP) {
        sql = "Select TenSanPham From SanPham Where MaSanPham = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaSP)) {
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public int GiaSanPham(int MaSP) {
        sql = "Select Gia From SanPham Where MaSanPham = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaSP)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return 0;
    }
    
    public int SoLuong(int MaHD, int MaSP) {
        sql = "Select SoLuong From HoaDonChiTiet Where MaHoaDon = ? And MaSanPham = ?";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, MaHD, MaSP)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return 0;
    }
    
    public int MaHDMoiNhat() {
        sql = "Select Top 1 MaHoaDon From HoaDon Order By MaHoaDon DESC";
        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            
        }
        
        return 0;
    }    
}

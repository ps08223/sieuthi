/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entities.DoanhSoSanPham;
import Entities.DoanhThu;
import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    String sql;
    public List<DoanhThu> Select() {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setNgay(rs.getString(2));
                dt.setTongDoanhThu((rs.getInt(1)));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> Ngay(String ngay) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Day(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, ngay)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> Thang(String thang) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Month(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, thang)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> Nam(String nam) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Year(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, nam)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> NgayThang(String ngay, String thang) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Day(NgayThanhToan) = ? And Month(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, ngay, thang)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> NgayNam(String ngay, String nam) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Day(NgayThanhToan) = ? And Year(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, ngay, nam)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> ThangNam(String thang, String nam) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Month(NgayThanhToan) = ? And Year(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, thang, nam)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhThu> NgayThangNam(String ngay, String thang, String nam) {
        List<DoanhThu> list = new ArrayList<>();
        sql = "Select Sum((Gia-(Gia*GiamGia/100))*SoLuong), hd.NgayThanhToan "
                + "From HoaDonChiTiet ct Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham "
                + "Where Day(NgayThanhToan) = ? And Month(NgayThanhToan) = ? And Year(NgayThanhToan) = ? "
                + "Group By hd.NgayThanhToan";
        try (ResultSet rs = JDBCHelper.executeQuery(sql, ngay, thang, nam)) {
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setTongDoanhThu(rs.getInt(1));
                dt.setNgay(rs.getString(2));
                list.add(dt);
            }
        } catch (Exception e) {
            
        }
        
        return list;
    }
    
    public List<DoanhSoSanPham> DoanhSoSP() {
        List<DoanhSoSanPham> list = new ArrayList<>();
        sql = "Select ct.MaSanPham, sp.TenSanPham, dm.TenDanhMuc, Sum(SoLuong) as Tong "
                + "From HoaDonChiTiet ct Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham Join DanhMuc dm "
                + "On sp.MaDanhMuc = dm.MaDanhMuc "
                + "Group By ct.MaSanPham, sp.TenSanPham, dm.TenDanhMuc "
                + "Order By Tong DESC";
                
        try (ResultSet rs = JDBCHelper.executeQuery(sql)) {
            while (rs.next()) {
                DoanhSoSanPham ds = new DoanhSoSanPham();
                ds.setLuongBan(rs.getInt(4));
                ds.setMaSP(rs.getInt(1));
                ds.setTenDM(rs.getString(3));
                ds.setTenSP(rs.getString(2));
                list.add(ds);
            }
        } catch (Exception e) {
            
        }
        
        return list;    
    }
    
    public List<DoanhSoSanPham> DoanhSoSP(String n1, String n2) {
        List<DoanhSoSanPham> list = new ArrayList<>();
        sql = "Select ct.MaSanPham, sp.TenSanPham, dm.TenDanhMuc, Sum(SoLuong) as Tong "
                + "From HoaDonChiTiet ct Join SanPham sp "
                + "On ct.MaSanPham = sp.MaSanPham Join DanhMuc dm "
                + "On sp.MaDanhMuc = dm.MaDanhMuc Join HoaDon hd "
                + "On hd.MaHoaDon = ct.MaHoaDon "
                + "Where hd.NgayThanhToan >= ? And hd.NgayThanhToan <= ? "
                + "Group By ct.MaSanPham, sp.TenSanPham, dm.TenDanhMuc "
                + "Order By Tong DESC";

        try (ResultSet rs = JDBCHelper.executeQuery(sql, n1, n2)) {
            while (rs.next()) {
                DoanhSoSanPham ds = new DoanhSoSanPham();
                ds.setLuongBan(rs.getInt(4));
                ds.setMaSP(rs.getInt(1));
                ds.setTenDM(rs.getString(3));
                ds.setTenSP(rs.getString(2));
                list.add(ds);
            }
        } catch (Exception e) {

        }

        return list;
    }
}

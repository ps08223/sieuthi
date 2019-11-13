/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Admin
 */
public class HoaDon {
    public int MaHD;
    public int MaKH;
    public int MaNV;
    public String NgayThanhToan;
    public boolean CachThuc;
    public boolean TrangThai;

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public void setCachThuc(boolean CachThuc) {
        this.CachThuc = CachThuc;
    }  

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
}

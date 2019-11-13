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
public class KhachHang {
    public int MaKH;
    public String TenKH = "Chưa Cập Nhật";
    public String GioiTinh = "Chưa Cập Nhật";
    public String Tuoi = "Chưa Cập Nhật";
    public String Mail = "Chưa Cập Nhật";
    public String SoDT = "Chưa Cập Nhật";
    public String DiaChi = "Chưa Cập Nhật";
    public boolean ThanhVien;

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setThanhVien(boolean ThanhVien) {
        this.ThanhVien = ThanhVien;
    }
}

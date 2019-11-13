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
public class NhanVien {
    public int MaNV;
    public String TaiKhoan;
    public String Ten;
    public String GioiTinh;
    public int Tuoi;
    public String Email;
    public int VaiTro;

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setVaiTro(int VaiTro) {
        this.VaiTro = VaiTro;
    }
    
    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }
}

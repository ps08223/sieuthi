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
public class TaiKhoanKH {
    public int MaKH;
    public String TaiKhoan;
    public String MatKhau;

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }
}

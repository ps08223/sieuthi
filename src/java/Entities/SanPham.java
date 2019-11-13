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
public class SanPham {
    public int MaSP;
    public int MaDM;
    public String Ten;
    public int Gia;
    public int TonKho;
    public String HinhAnh;

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public void setMaDM(int MaDM) {
        this.MaDM = MaDM;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setTonKho(int TonKho) {
        this.TonKho = TonKho;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
}

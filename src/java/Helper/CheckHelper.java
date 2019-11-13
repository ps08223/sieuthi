/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class CheckHelper {
    public static boolean Chuoi(String s, int i, String TenChuoi, JFrame j) {
        if (s.isEmpty()) {
            DialogHelper.alert(j, "Không được để trống " + TenChuoi + "!");
            return false;
        } else {
            if (s.length() > 50) {
                DialogHelper.alert(j, TenChuoi + " không được nhập quá " + i + " kí tự!");
                return false;
            } else {
                return true;
            }
        }
    }
    
    public static boolean So(String s, String TenChuoi, JFrame j) {
        if (s.isEmpty()) {
            DialogHelper.alert(j, "Không được để trống " + TenChuoi);
            return false;
        } else {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                DialogHelper.alert(j, "Xin nhập " + TenChuoi + " kiểu số!");
                return false;
            }
        }
    }
    
    public static boolean SoLonHon(String s, String TenChuoi, int i, JFrame j) {
        if (So(s, TenChuoi, j)) {
            if (Integer.parseInt(s) > i) {
                return true;
            } else {
                DialogHelper.alert(j, "Xin nhập " + TenChuoi + " lớn hơn " + i + "!");
                return false;
            }
        } else {
            return false;
        }
    }
    
    public static boolean SoLonHonHoacBang(String s, String TenChuoi, int i, JFrame j) {
        if (So(s, TenChuoi, j)) {
            if (Integer.parseInt(s) >= i) {
                return true;
            } else {
                DialogHelper.alert(j, "Xin nhập " + TenChuoi + " lớn hơn hoặc bằng " + i + "!");
                return false;
            }
        } else {
            return false;
        }
    }
    
    public static boolean KhoangSo(String s, String TenChuoi, int i1, int i2, JFrame j) {
        if (So(s, TenChuoi, j)) {
            if (Integer.parseInt(s) >= i1 && Integer.parseInt(s) <= i2) {
                return true;
            } else {
                DialogHelper.alert(j, "Xin nhập số trong khoảng " + i1 + " và " + i2 + "!");
                return false;
            }
        } else {
            return false;
        }
    }
    
    public static boolean ChuoiSo(String s, int i, String TenChuoi, JFrame j) {
        if (s.length() > i) {
            DialogHelper.alert(j, TenChuoi + " không được nhập quá " + i + " kí tự!");
            return false;
        } else {
            return So(s, TenChuoi, j);
        }
    }
    
    public static boolean Email(String s, JFrame j) {
        String pattern1 = "\\w+@\\w+\\.\\w{1,3}\\.\\w{1,3}";
        String pattern2 = "\\w+@\\w+\\.\\w{1,3}";
        if (!(s.matches(pattern1) 
                || s.matches(pattern2))) {
            DialogHelper.alert(j, "Xin nhập email theo mẫu (example@fpt.edu.vn hoặc example@gmail.com)!");
            return false;
        } else {
            return true;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entities.TKHoatDong;

/**
 *
 * @author minhchau
 */
public class QuanLy2 extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public QuanLy2() {
        initComponents();
        init();
        
       
        
    }
    void init()
    {
         setTitle("PHẦN MỀM QUẢN LÝ SIÊU THỊ̣");
         setVisible(true);
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnhethong = new javax.swing.JMenu();
        mnidangxuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnthongke = new javax.swing.JMenu();
        mniHKngay = new javax.swing.JMenuItem();
        mniHKthang = new javax.swing.JMenuItem();
        mniHKnam = new javax.swing.JMenuItem();
        mnkhachhang = new javax.swing.JMenu();
        mnkho = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnnhanvien = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu8.setText("jMenu8");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        mnhethong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        mnhethong.setText("Hệ Thống");

        mnidangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnidangxuat.setText("Đăng Xuất");
        mnidangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangxuatActionPerformed(evt);
            }
        });
        mnhethong.add(mnidangxuat);
        mnhethong.add(jSeparator1);
        mnhethong.add(jSeparator2);

        jMenuBar1.add(mnhethong);

        mnthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        mnthongke.setText("Thống Kê");

        mniHKngay.setText("Doanh Thu Ngày");
        mniHKngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHKngayActionPerformed(evt);
            }
        });
        mnthongke.add(mniHKngay);

        mniHKthang.setText("Thống Kê Doanh Số Sản Phẩm");
        mniHKthang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHKthangActionPerformed(evt);
            }
        });
        mnthongke.add(mniHKthang);

        mniHKnam.setText("Thống Kê Khách Hàng");
        mniHKnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHKnamActionPerformed(evt);
            }
        });
        mnthongke.add(mniHKnam);

        jMenuBar1.add(mnthongke);

        mnkhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Boy.png"))); // NOI18N
        mnkhachhang.setText("Khách Hàng");
        mnkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnkhachhangMouseClicked(evt);
            }
        });
        mnkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnkhachhangActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnkhachhang);

        mnkho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Brick house.png"))); // NOI18N
        mnkho.setText("Kho");
        mnkho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnkhoMouseClicked(evt);
            }
        });
        mnkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnkhoActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Quản Lý Phiếu Nhập");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnkho.add(jMenuItem4);

        jMenuItem5.setText("Quản Lý Tồn Kho");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnkho.add(jMenuItem5);

        jMenuBar1.add(mnkho);

        mnnhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users.png"))); // NOI18N
        mnnhanvien.setText("Nhân Viên");
        mnnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnnhanvienMouseClicked(evt);
            }
        });
        mnnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnnhanvienActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Bảng Lương");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnnhanvien.add(jMenuItem2);

        jMenuItem3.setText("Danh Sách Nhân Viên");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnnhanvien.add(jMenuItem3);

        jMenuBar1.add(mnnhanvien);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        jMenu3.setText("Hóa Đơn");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        jMenu4.setText("Sản Phẩm");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniHKnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHKnamActionPerformed
        this.dispose();
        ThongKeKhachHang tkkh = new ThongKeKhachHang();
        tkkh.pack();
        tkkh.setVisible(true);
    }//GEN-LAST:event_mniHKnamActionPerformed

    private void mniHKthangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHKthangActionPerformed
        this.dispose();
        XepHang xh = new XepHang();
        xh.pack();
        xh.setVisible(true);
    }//GEN-LAST:event_mniHKthangActionPerformed

    private void mnidangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangxuatActionPerformed
        TKHoatDong.setTaiKhoan("");
        TKHoatDong.setVaiTro("");
        this.dispose();
        DangNhap dn = new DangNhap();
        dn.pack();
        dn.setVisible(true);
    }//GEN-LAST:event_mnidangxuatActionPerformed

    private void mniHKngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHKngayActionPerformed
        this.dispose();
        DoanhThuNgay dtn = new DoanhThuNgay();
        dtn.pack();
        dtn.setVisible(true);
    }//GEN-LAST:event_mniHKngayActionPerformed

    private void mnnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnnhanvienActionPerformed
        
    }//GEN-LAST:event_mnnhanvienActionPerformed

    private void mnkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnkhachhangActionPerformed
        this.dispose();
        KhachHangFrame khf = new KhachHangFrame();
        khf.pack();
        khf.setVisible(true);
    }//GEN-LAST:event_mnkhachhangActionPerformed

    private void mnkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnkhoActionPerformed
        
    }//GEN-LAST:event_mnkhoActionPerformed

    private void mnkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnkhachhangMouseClicked
        this.dispose();
        KhachHangFrame khf = new KhachHangFrame();
        khf.pack();
        khf.setVisible(true);
    }//GEN-LAST:event_mnkhachhangMouseClicked

    private void mnkhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnkhoMouseClicked
        
    }//GEN-LAST:event_mnkhoMouseClicked

    private void mnnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnnhanvienMouseClicked
        
    }//GEN-LAST:event_mnnhanvienMouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        this.dispose();
        HoaDonFrame hd = new HoaDonFrame();
        hd.pack();
        hd.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        TonKho tkh = new TonKho();
        tkh.pack();
        tkh.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        PhieuNhapFrame pnf = new PhieuNhapFrame();
        pnf.pack();
        pnf.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        BangLuongFrame blf = new BangLuongFrame();
        blf.pack();
        blf.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        NhanVienFrame nvf = new NhanVienFrame();
        nvf.pack();
        nvf.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.dispose();
        SanPhamFrame spf = new SanPhamFrame();
        spf.pack();
        spf.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLy2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy2().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JMenu mnhethong;
    private javax.swing.JMenuItem mniHKnam;
    private javax.swing.JMenuItem mniHKngay;
    private javax.swing.JMenuItem mniHKthang;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenu mnkhachhang;
    private javax.swing.JMenu mnkho;
    private javax.swing.JMenu mnnhanvien;
    private javax.swing.JMenu mnthongke;
    // End of variables declaration//GEN-END:variables
}

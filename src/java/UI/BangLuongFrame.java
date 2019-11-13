/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import Entities.BangLuong;
import DAO.BangLuongDAO;
import DAO.KhachHangDAO;
import Entities.KhachHang;
import Entities.TKHoatDong;
import Helper.CheckHelper;
import Helper.DialogHelper;
import java.text.DecimalFormat;
import java.util.Vector;

/**
 *
 * @author minhchau
 */
public class BangLuongFrame extends javax.swing.JFrame {
    List<BangLuong> blList;
    public BangLuongFrame() {
        initComponents();
        init();
        
    }
    void init()
    {
         setTitle("Quản Lý Bảng Lương");
         this.pack();
         setLocationRelativeTo(null);
         
         ShowDanhSach();
         ShowThongTin(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEdit = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnBLNew = new javax.swing.JButton();
        btnBLAdd = new javax.swing.JButton();
        btnBLUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblBLMaNV = new javax.swing.JLabel();
        lblBLMaBL = new javax.swing.JLabel();
        lblBLTienLuong = new javax.swing.JLabel();
        txtBLMaBL = new javax.swing.JTextField();
        txtBLMaNV = new javax.swing.JTextField();
        txtBLTienLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBLDanhSach = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtBLTimKiem = new javax.swing.JTextField();
        btnBLTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel3.setkGradientFocus(600);
        kGradientPanel3.setkStartColor(new java.awt.Color(153, 0, 153));

        btnBLNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loop (1).png"))); // NOI18N
        btnBLNew.setText("New");
        btnBLNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLNewActionPerformed(evt);
            }
        });

        btnBLAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnBLAdd.setText("Add");
        btnBLAdd.setEnabled(false);
        btnBLAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLAddActionPerformed(evt);
            }
        });

        btnBLUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnBLUpdate.setText("Update");
        btnBLUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLUpdateActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblBLMaNV.setText("Mã Nhân Viên");

        lblBLMaBL.setText("Mã Bảng Lương");

        lblBLTienLuong.setText("Tiền Lương");

        txtBLMaBL.setEditable(false);
        txtBLMaBL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtBLMaBL.setEnabled(false);

        txtBLMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtBLTienLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtBLTienLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBLTienLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBLMaBL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBLMaNV)
                            .addComponent(txtBLTienLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBLMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBLTienLuong)
                            .addComponent(txtBLMaBL, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(lblBLMaBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBLMaBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBLMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBLMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBLTienLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBLTienLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        tblBLDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Bảng Lương", "Mã Nhân Viên", "Lương", "Ngày Trả"
            }
        ));
        tblBLDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBLDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBLDanhSach);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DANH SÁCH BẢNG LƯƠNG");

        btnBLTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Start-Menu-Search-icon.png"))); // NOI18N
        btnBLTimKiem.setText("Tìm Kiếm");
        btnBLTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addComponent(btnBLNew, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnBLAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtBLTimKiem))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBLUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBLTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBLTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBLTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBLNew, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBLAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBLUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBLAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLAddActionPerformed
        if (KiemTraThemMoi()) {
            BangLuongDAO blDAO = new BangLuongDAO();
            blDAO.Insert(Integer.parseInt(txtBLMaNV.getText()), Integer.parseInt(txtBLTienLuong.getText()));
            DialogHelper.alert(this, "Thêm mới thành công!");
            ShowDanhSach();
            ShowThongTin(tblBLDanhSach.getRowCount() - 1);
        }
    }//GEN-LAST:event_btnBLAddActionPerformed

    private void btnBLUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLUpdateActionPerformed
        if (KiemTraThemMoi()) {
            BangLuongDAO blDAO = new BangLuongDAO();
            int MaBL = Integer.parseInt(tblBLDanhSach.getValueAt(tblBLDanhSach.getSelectedRow(), 0).toString());
            blDAO.Update(MaBL, Integer.parseInt(txtBLMaNV.getText()), Integer.parseInt(txtBLTienLuong.getText()));
            DialogHelper.alert(this, "Cập nhật thành công!");
            ShowDanhSach();
            ShowThongTin(0);
        }
    }//GEN-LAST:event_btnBLUpdateActionPerformed

    private void btnBLNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLNewActionPerformed
        XoaTrang();
        btnBLAdd.setEnabled(true);
        btnBLUpdate.setEnabled(false);
    }//GEN-LAST:event_btnBLNewActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btnBLTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLTimKiemActionPerformed
        String sql = "Select * From BangLuong Where MaBangLuong Like ? Or MaNhanVien Like ?";
        String a = txtBLTimKiem.getText().trim();
        
        BangLuongDAO blDAO = new BangLuongDAO();
        List<BangLuong> tlist = blDAO.Select(sql, "%" + a + "%", "%" + a +"%");
        if (tlist.size() > 0) {
            DialogHelper.alert(this, "Tìm thành công!");
            DanhSach(tlist);
            ShowThongTin(0);
        } else {
            DialogHelper.alert(this, "Không tìm thấy khách hàng với mã bảng lương hoặc mã nhân viên tương ứng)!");
        }
    }//GEN-LAST:event_btnBLTimKiemActionPerformed

    private void txtBLTienLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBLTienLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBLTienLuongActionPerformed

    private void tblBLDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBLDanhSachMouseClicked
        int i = tblBLDanhSach.getSelectedRow();
        ShowThongTin(i);
    }//GEN-LAST:event_tblBLDanhSachMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (TKHoatDong.VaiTro.equals("1")) {
            this.dispose();
            QuanLy2 ql2 = new QuanLy2();
            ql2.pack();
            ql2.setVisible(true);
        } else {
            this.dispose();
            QuanLy1 ql1 = new QuanLy1();
            ql1.pack();
            ql1.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(BangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BangLuongFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBLAdd;
    private javax.swing.JButton btnBLNew;
    private javax.swing.JButton btnBLTimKiem;
    private javax.swing.JButton btnBLUpdate;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblBLMaBL;
    private javax.swing.JLabel lblBLMaNV;
    private javax.swing.JLabel lblBLTienLuong;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JTable tblBLDanhSach;
    private javax.swing.JTextField txtBLMaBL;
    private javax.swing.JTextField txtBLMaNV;
    private javax.swing.JTextField txtBLTienLuong;
    private javax.swing.JTextField txtBLTimKiem;
    // End of variables declaration//GEN-END:variables
    public void ShowDanhSach() {
        BangLuongDAO blDAO = new BangLuongDAO();
        blList = blDAO.Select();
        
        DanhSach(blList);
    }
    
    public void DanhSach(List<BangLuong> list) {
        DefaultTableModel model = (DefaultTableModel) tblBLDanhSach.getModel();
        model.setRowCount(0);
        
        for (BangLuong bl: list) {
            Vector vector = new Vector();
            vector.add(bl.MaBL);
            vector.add(bl.MaNV);
            DecimalFormat format = new DecimalFormat("###,###");
            String s = format.format(bl.Luong);
            vector.add(s + "VNĐ");
            vector.add(bl.NgayTra);
            model.addRow(vector);
        }
    }
    
    public void ShowThongTin(int i) {
        btnBLUpdate.setEnabled(true);
        btnBLAdd.setEnabled(false);
        tblBLDanhSach.setRowSelectionInterval(i, i);
        for (BangLuong bl: blList) {
            if (tblBLDanhSach.getValueAt(i, 0).toString().equals(Integer.toString(bl.MaBL))) {
                txtBLMaBL.setText(Integer.toString(bl.MaBL));
                txtBLMaNV.setText(Integer.toString(bl.MaNV));
                DecimalFormat format = new DecimalFormat("###,###");
                String s = format.format(bl.Luong);
                txtBLTienLuong.setText(s + "VNĐ");
            }
        }
    }
    
    public void XoaTrang() {
        txtBLMaBL.setText("");
        txtBLMaNV.setText("");
        txtBLTienLuong.setText("");
        int i = tblBLDanhSach.getSelectedRow();
        tblBLDanhSach.removeRowSelectionInterval(i, i);
    }
    
    public boolean KiemTraThemMoi() {
        if (CheckHelper.So(txtBLMaNV.getText(), "Mã nhân viên", this)) {
            return CheckHelper.So(txtBLTienLuong.getText(), "Tiền lương", this);
        } else {
            return false;
        }
    }
}
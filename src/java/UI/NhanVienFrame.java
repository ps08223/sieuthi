/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.NhanVienDAO;
import Entities.NhanVien;
import Entities.TKHoatDong;
import Helper.CheckHelper;
import Helper.DialogHelper;
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author khang
 */
public class NhanVienFrame extends javax.swing.JFrame {
    List<NhanVien> nvList;
    public NhanVienFrame() {
        initComponents();
        init();

    }

    void init() {
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setVisible(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNVMaNV = new javax.swing.JTextField();
        txtNVMail = new javax.swing.JTextField();
        rdoNVTP = new javax.swing.JRadioButton();
        rdoNVNV = new javax.swing.JRadioButton();
        lblNVMaNV = new javax.swing.JLabel();
        lblNVHoTen = new javax.swing.JLabel();
        lblNVGioiTinh = new javax.swing.JLabel();
        lblNVVaiTro = new javax.swing.JLabel();
        lblNVMail = new javax.swing.JLabel();
        rdoNVNam = new javax.swing.JRadioButton();
        rdoNVNu = new javax.swing.JRadioButton();
        lblNVTaiKhoan = new javax.swing.JLabel();
        txtNVHoTen = new javax.swing.JTextField();
        txtNVTaiKhoan = new javax.swing.JTextField();
        lblNVTuoi = new javax.swing.JLabel();
        txtNVTuoi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNVDanhSach = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtNVTimKiem = new javax.swing.JTextField();
        btnNVThemMoi = new javax.swing.JButton();
        btnNVCapNhat = new javax.swing.JButton();
        btnNVTimKiem = new javax.swing.JButton();
        btnNVTaoMoi = new javax.swing.JButton();

        buttonGroup1.add(rdoNVTP);
        buttonGroup1.add(rdoNVNV);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNVMaNV.setEditable(false);
        txtNVMaNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNVMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(77, 77, 255)));
        txtNVMaNV.setEnabled(false);
        txtNVMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVMaNVActionPerformed(evt);
            }
        });

        txtNVMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(77, 77, 255)));
        txtNVMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVMailActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNVTP);
        rdoNVTP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNVTP.setSelected(true);
        rdoNVTP.setText("Trưởng phòng");

        buttonGroup1.add(rdoNVNV);
        rdoNVNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNVNV.setText("Nhân viên");

        lblNVMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVMaNV.setForeground(new java.awt.Color(66, 134, 244));
        lblNVMaNV.setText("Mã nhân viên");

        lblNVHoTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVHoTen.setForeground(new java.awt.Color(66, 134, 244));
        lblNVHoTen.setText("Họ và tên");

        lblNVGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVGioiTinh.setForeground(new java.awt.Color(66, 134, 244));
        lblNVGioiTinh.setText("Giới tính");

        lblNVVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVVaiTro.setForeground(new java.awt.Color(66, 134, 244));
        lblNVVaiTro.setText("Vai trò");

        lblNVMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVMail.setForeground(new java.awt.Color(66, 134, 244));
        lblNVMail.setText("Email");

        buttonGroup2.add(rdoNVNam);
        rdoNVNam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoNVNam.setText("Nam");

        buttonGroup2.add(rdoNVNu);
        rdoNVNu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoNVNu.setText("Nữ");

        lblNVTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVTaiKhoan.setForeground(new java.awt.Color(66, 134, 244));
        lblNVTaiKhoan.setText("Tài Khoản");

        txtNVHoTen.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNVHoTen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(77, 77, 255)));
        txtNVHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVHoTenActionPerformed(evt);
            }
        });

        txtNVTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNVTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(77, 77, 255)));
        txtNVTaiKhoan.setEnabled(false);
        txtNVTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVTaiKhoanActionPerformed(evt);
            }
        });

        lblNVTuoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNVTuoi.setForeground(new java.awt.Color(66, 134, 244));
        lblNVTuoi.setText("Tuổi");

        txtNVTuoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNVTuoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(77, 77, 255)));
        txtNVTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVTuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNVTaiKhoan)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNVNam)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNVNu)
                        .addGap(18, 18, 18)
                        .addComponent(txtNVTuoi))
                    .addComponent(lblNVMaNV)
                    .addComponent(lblNVMail)
                    .addComponent(lblNVHoTen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNVGioiTinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lblNVTuoi)
                        .addGap(79, 79, 79))
                    .addComponent(lblNVVaiTro)
                    .addComponent(txtNVMaNV)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNVTP)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNVNV))
                    .addComponent(txtNVMail)
                    .addComponent(txtNVHoTen)
                    .addComponent(txtNVTaiKhoan))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNVMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNVMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNVHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNVHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNVGioiTinh)
                    .addComponent(lblNVTuoi))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNVTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNVNam)
                            .addComponent(rdoNVNu))))
                .addGap(18, 18, 18)
                .addComponent(lblNVMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNVMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNVVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNVTP)
                    .addComponent(rdoNVNV))
                .addGap(12, 12, 12)
                .addComponent(lblNVTaiKhoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNVTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblNVDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ và Tên", "Giới Tính", "Email", "Vai Trò"
            }
        ));
        tblNVDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVDanhSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNVDanhSach);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DANH SÁCH NHÂN VIÊN");

        btnNVThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnNVThemMoi.setText("Thêm Mới");
        btnNVThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVThemMoiActionPerformed(evt);
            }
        });

        btnNVCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnNVCapNhat.setText("Cập Nhật");
        btnNVCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVCapNhatActionPerformed(evt);
            }
        });

        btnNVTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Start-Menu-Search-icon.png"))); // NOI18N
        btnNVTimKiem.setText("Tìm Kiếm");
        btnNVTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVTimKiemActionPerformed(evt);
            }
        });

        btnNVTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loop (1).png"))); // NOI18N
        btnNVTaoMoi.setText("Tạo Mới");
        btnNVTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVTaoMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtNVTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNVTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnNVTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNVThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnNVCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNVTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNVTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNVCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNVTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNVThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNVMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVMailActionPerformed

    private void txtNVMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVMaNVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnNVThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVThemMoiActionPerformed
        if (KiemTraThemMoi()) {
            NhanVienDAO nvDAO = new NhanVienDAO();
            int GioiTinh, VaiTro;
            if (rdoNVNam.isSelected()) {
                GioiTinh = 1;
            } else {
                GioiTinh = 0;
            }
            if (rdoNVTP.isSelected()) {
                VaiTro = 1;
            } else {
                VaiTro = 0;
            }
            
            nvDAO.Insert(txtNVTaiKhoan.getText(), 
                    txtNVHoTen.getText(), 
                    GioiTinh, 
                    Integer.parseInt(txtNVTuoi.getText()), 
                    txtNVMail.getText(), 
                    VaiTro);
            DialogHelper.alert(this, "Thêm mới thành công!");
            btnNVThemMoi.setEnabled(false);
            ShowDanhSach();
            ShowThongTin(nvList.size()-1);
        }
    }//GEN-LAST:event_btnNVThemMoiActionPerformed

    private void btnNVCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVCapNhatActionPerformed
        if (KiemTraCapNhat()) {
            NhanVienDAO nvDAO = new NhanVienDAO();
            int GioiTinh, VaiTro;
            if (rdoNVNam.isSelected()) {
                GioiTinh = 1;
            } else {
                GioiTinh = 0;
            }
            if (rdoNVTP.isSelected()) {
                VaiTro = 1;
            } else {
                VaiTro = 0;
            }
            
            nvDAO.Update(txtNVHoTen.getText(), 
                    GioiTinh, 
                    Integer.parseInt(txtNVTuoi.getText()), 
                    txtNVMail.getText(), 
                    VaiTro, 
                    Integer.parseInt(txtNVMaNV.getText()));
            DialogHelper.alert(this, "Cập nhật thành công!");
            ShowDanhSach();
            ShowThongTin(0);
        }
    }//GEN-LAST:event_btnNVCapNhatActionPerformed

    private void btnNVTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVTimKiemActionPerformed
        String sql = "Select * From NhanVien Where MaNhanVien Like ? Or Ten Like ? Or Email Like ?";
        String a = txtNVTimKiem.getText().trim();
        
        NhanVienDAO nvDAO = new NhanVienDAO();
        List<NhanVien> tlist = nvDAO.Select(sql, "%" + a + "%", "%" + a + "%", "%" + a + "%");
        if (tlist.size() > 0) {
            DialogHelper.alert(this, "Tìm thành công!");
            DanhSach(tlist);
            ShowThongTin(0);
        } else {
            DialogHelper.alert(this, "Không tìm thấy nhân viên với thông tin tương ứng (mã khách hàng, tên, email)!");
        }
    }//GEN-LAST:event_btnNVTimKiemActionPerformed

    private void btnNVTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVTaoMoiActionPerformed
        XoaTrang();
        txtNVTaiKhoan.setEnabled(true);
        btnNVCapNhat.setEnabled(false);
        btnNVThemMoi.setEnabled(true);
    }//GEN-LAST:event_btnNVTaoMoiActionPerformed

    private void txtNVHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVHoTenActionPerformed

    private void txtNVTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVTaiKhoanActionPerformed

    private void txtNVTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVTuoiActionPerformed

    private void tblNVDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVDanhSachMouseClicked
        int i = tblNVDanhSach.getSelectedRow();
        btnNVThemMoi.setEnabled(false); 
        ShowThongTin(i);
    }//GEN-LAST:event_tblNVDanhSachMouseClicked

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
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NhanVienFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNVCapNhat;
    private javax.swing.JButton btnNVTaoMoi;
    private javax.swing.JButton btnNVThemMoi;
    private javax.swing.JButton btnNVTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblNVGioiTinh;
    private javax.swing.JLabel lblNVHoTen;
    private javax.swing.JLabel lblNVMaNV;
    private javax.swing.JLabel lblNVMail;
    private javax.swing.JLabel lblNVTaiKhoan;
    private javax.swing.JLabel lblNVTuoi;
    private javax.swing.JLabel lblNVVaiTro;
    private javax.swing.JRadioButton rdoNVNV;
    private javax.swing.JRadioButton rdoNVNam;
    private javax.swing.JRadioButton rdoNVNu;
    private javax.swing.JRadioButton rdoNVTP;
    private javax.swing.JTable tblNVDanhSach;
    private javax.swing.JTextField txtNVHoTen;
    private javax.swing.JTextField txtNVMaNV;
    private javax.swing.JTextField txtNVMail;
    private javax.swing.JTextField txtNVTaiKhoan;
    private javax.swing.JTextField txtNVTimKiem;
    private javax.swing.JTextField txtNVTuoi;
    // End of variables declaration//GEN-END:variables
    public void ShowDanhSach() {
        NhanVienDAO nvDAO = new NhanVienDAO();
        nvList = nvDAO.Select();
        
        DanhSach(nvList);
    }
    
    public void DanhSach(List<NhanVien> list) {
        DefaultTableModel model = (DefaultTableModel) tblNVDanhSach.getModel();
        model.setRowCount(0);
        
        for (NhanVien nv: list) {
            Vector vector = new Vector();
            vector.add(nv.MaNV);
            vector.add(nv.Ten);
            vector.add(nv.GioiTinh);
            vector.add(nv.Email);
            vector.add(nv.VaiTro == 1?"Trưởng Phòng":"Nhân Viên");
            model.addRow(vector);
        }
    }
    
    public void ShowThongTin(int i) {
        txtNVTaiKhoan.setEnabled(false);
        btnNVCapNhat.setEnabled(true);
        btnNVThemMoi.setEnabled(false);
        tblNVDanhSach.setRowSelectionInterval(i, i);
        for (NhanVien nv: nvList) {
            if (tblNVDanhSach.getValueAt(i, 0).toString().equals(Integer.toString(nv.MaNV))) {
                txtNVMaNV.setText(Integer.toString(nv.MaNV));
                txtNVHoTen.setText(nv.Ten);
                txtNVTuoi.setText(Integer.toString(nv.Tuoi));
                txtNVMail.setText(nv.Email);
                txtNVTaiKhoan.setText(nv.TaiKhoan);
                if (nv.GioiTinh.equals("Nam")) {
                    rdoNVNam.setSelected(true);
                } else if (nv.GioiTinh.equals("Nữ")) {
                    rdoNVNu.setSelected(true);
                } else {
                    buttonGroup1.clearSelection();
                }
                if (nv.VaiTro == 1) {
                    rdoNVTP.setSelected(true);
                } else {
                    rdoNVNV.setSelected(true);
                }
            }
        }
    }
    
    public void XoaTrang() {
        int i = tblNVDanhSach.getSelectedRow();
        tblNVDanhSach.removeRowSelectionInterval(i, i);
        txtNVHoTen.setText("");
        txtNVMaNV.setText("");
        txtNVMail.setText("");
        txtNVTaiKhoan.setText("");
        txtNVTimKiem.setText("");
        txtNVTuoi.setText("");
        rdoNVNam.setSelected(true);
        rdoNVNV.setSelected(true);
    }
    
    public void XoaMauNen() {
        txtNVHoTen.setBackground(Color.white);
        txtNVMail.setBackground(Color.white);
        txtNVTaiKhoan.setBackground(Color.white);
        txtNVTuoi.setBackground(Color.white);
    }
    
    public boolean KiemTraCapNhat() {
        if (CheckHelper.Chuoi(txtNVHoTen.getText(), WIDTH, "Họ tên", this)) {
            XoaMauNen();
            if (!rdoNVNam.isSelected() && !rdoNVNu.isSelected()) {
                DialogHelper.alert(this, "Xin chọn giới tính!");
                return false;
            } else {
                XoaMauNen();
                if (CheckHelper.Chuoi(txtNVMail.getText(), 255, "Email", this)) {
                    if (CheckHelper.Email(txtNVMail.getText(), this)) {
                        XoaMauNen();
                        if (!rdoNVTP.isSelected() && !rdoNVNV.isSelected()) {
                            DialogHelper.alert(this, "Xin chọn vai trò!");
                            return false;
                        } else {
                            if (CheckHelper.SoLonHon(txtNVTuoi.getText(), "Tuổi", 15, this)) {
                                XoaMauNen();
                                return true;
                            } else {
                                txtNVTuoi.setBackground(Color.yellow);
                                return false;
                            }
                        }
                    } else {
                        txtNVMail.setBackground(Color.yellow);
                        return false;
                    }
                }  else {
                    txtNVMail.setBackground(Color.yellow);
                    return false;
                }
            }
        } else {
            txtNVHoTen.setBackground(Color.yellow);
            return false;
        }
    }
    
    public boolean KiemTraThemMoi() {
        if (KiemTraCapNhat()) {
            if (CheckHelper.Chuoi(txtNVTaiKhoan.getText(), 20, "Tài khoản", this)) {
                XoaMauNen();
                return true;
            } else {
                txtNVTaiKhoan.setBackground(Color.yellow);
                return false;
            }
        } else {
            return false;
        }
    }
}

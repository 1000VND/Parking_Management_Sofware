package Application_New;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormAdminNhanVien extends javax.swing.JPanel {

    public FormAdminNhanVien() {
        initComponents();
        setSize(1000, 505);
        showTable();
        loadTabel();
        txtPass.setPreferredSize(new Dimension(211, 30));
    }

    public AccountDTO themAccount() {
        AccountDTO ac = new AccountDTO();
        ac.setTaiKhoan(txtTaikhoan.getText());
        ac.setSdt(txtSdt.getText());
        ac.setTenNguoidung(txtTen.getText());
        ac.setMatKhau(txtPass.getText());
        return ac;
    }

    private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"STT", "Tên Nhân Viên", "SDT", "Tài Khoản", "Mật khẩu"});
        TableNhanVien.setModel(tblModel);
    }

    public void loadTabel() {
        ArrayList<AccountDTO> list = DangNhapDAO.tableAcc();
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        Object[] row = new Object[5];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getTenNguoidung();
            row[2] = list.get(i).getSdt();
            row[3] = list.get(i).getTaiKhoan();
            row[4] = list.get(i).getMatKhau();
            tblModel.addRow(row);
        }
        TableNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableNhanVien.getSelectedRow() >= 0) {
                    txtTaikhoan.setEditable(false);
                    txtTen.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 1));
                    txtSdt.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 2));
                    txtTaikhoan.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 3));
                    txtPass.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 4));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableNhanVien = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnThemTK = new javax.swing.JButton();
        btnXoaTK = new javax.swing.JButton();
        btnSuaTK = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtTimkiem = new swing.SearchText();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 505));

        TableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Nhân Viên", "SDT", "Tài Khoản", "Mật Khẩu"
            }
        ));
        jScrollPane1.setViewportView(TableNhanVien);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên Nhân Viên :");

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Số Điện Thoại :");

        txtSdt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tài Khoản :");

        txtTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Mật Khẩu :");

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnThemTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThemTK.setForeground(new java.awt.Color(88, 103, 229));
        btnThemTK.setText("Thêm");
        btnThemTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnThemTK.setBorderPainted(false);
        btnThemTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemTK.setFocusPainted(false);
        btnThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTKActionPerformed(evt);
            }
        });

        btnXoaTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoaTK.setForeground(new java.awt.Color(255, 0, 0));
        btnXoaTK.setText("Xóa");
        btnXoaTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnXoaTK.setBorderPainted(false);
        btnXoaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTK.setFocusPainted(false);
        btnXoaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTKActionPerformed(evt);
            }
        });

        btnSuaTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSuaTK.setForeground(new java.awt.Color(88, 103, 229));
        btnSuaTK.setText("Sửa");
        btnSuaTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSuaTK.setBorderPainted(false);
        btnSuaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaTK.setFocusPainted(false);
        btnSuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTKActionPerformed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(88, 103, 229));
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(88, 103, 229));
        jButton1.setText("Làm Mới");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-search-35.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimkiem))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPass)
                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTKActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
            String checkacc = txtTaikhoan.getText();
            if (txtTaikhoan.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản!");
            } else if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhân viên!");
            } else if (txtSdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            } else if (txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(checkacc);
                if (tk != null) {
                    JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
                    txtTaikhoan.setText("");
                } else {
                    AccountDTO ac = themAccount();
                    if (dn.ThemTk(ac) > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công!");
                        txtTaikhoan.setText("");
                        txtTen.setText("");
                        txtSdt.setText("");
                        txtPass.setText("");
                        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                            tblModel.removeRow(i);
                        }
                        loadTabel();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm tài khoản thất bại!");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemTKActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        Object[] row = new Object[5];
        String checkAcc = txtTimkiem.getText();
        DangNhapDAO dn = new DangNhapDAO();
        if (txtTimkiem.getText().contains("Nhập tài khoản...") == true) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản cần tìm");
        } else if (txtTimkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản cần tìm");
            txtTimkiem.setText("Nhập tài khoản...");
            txtTimkiem.setForeground(new Color(153, 153, 153));
        } else {
            AccountDTO ac = dn.CheckUser(txtTimkiem.getText());
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            if (ac != null) {
                row[1] = ac.getTenNguoidung();
                row[2] = ac.getSdt();
                row[3] = ac.getTaiKhoan();
                row[4] = ac.getMatKhau();
                tblModel.addRow(row);
                TableNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (TableNhanVien.getSelectedRow() >= 0) {
                            txtTaikhoan.setEditable(false);
                            txtTen.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 1));
                            txtSdt.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 2));
                            txtTaikhoan.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 3));
                            txtPass.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 4));
                        }
                    }
                });
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản");
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
                loadTabel();
            }
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        
    }//GEN-LAST:event_txtSdtActionPerformed

    private void btnSuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTKActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
            if (txtTaikhoan.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtSdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                String taikhoan = txtTaikhoan.getText();
                String tennv = txtTen.getText();
                String sdt = txtSdt.getText();
                String matkhau = txtPass.getText();
                if (dn.updateAcc(taikhoan, tennv, sdt, matkhau) > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                    txtTaikhoan.setText("");
                    txtTen.setText("");
                    txtSdt.setText("");
                    txtPass.setText("");
                    for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                        tblModel.removeRow(i);
                    }
                    loadTabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaTKActionPerformed

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtTaikhoan.setText("");
        txtTen.setText("");
        txtSdt.setText("");
        txtPass.setText("");
        txtTaikhoan.setEditable(true);
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        loadTabel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnXoaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTKActionPerformed
        // TODO add your handling code here:
        try {

            if (txtTaikhoan.getText().contains("admin") == true) {
                JOptionPane.showMessageDialog(this, "Không thể xóa được tài khoản của admin!");
                txtTaikhoan.setText("");
                txtTen.setText("");
                txtSdt.setText("");
                txtPass.setText("");
                loadTabel();
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                int ac = dn.deleteAcc(txtTaikhoan.getText());
                if (ac != 0) {
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công.");
                    txtTaikhoan.setText("");
                    txtTen.setText("");
                    txtSdt.setText("");
                    txtPass.setText("");
                    loadTabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thất bại!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaTKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableNhanVien;
    private javax.swing.JButton btnSuaTK;
    private javax.swing.JButton btnThemTK;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoaTK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTen;
    private swing.SearchText txtTimkiem;
    // End of variables declaration//GEN-END:variables
}

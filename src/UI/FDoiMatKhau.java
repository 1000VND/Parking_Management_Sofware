package UI;

import DAO.DangNhapDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class FDoiMatKhau extends javax.swing.JFrame {

    public FDoiMatKhau() {
        initComponents();
        setSize(1600, 900);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
    }
    
    public FDoiMatKhau(String user) {
        initComponents();
        setSize(1600, 900);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        this.txtTaikhoan.setText(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTaikhoan = new javax.swing.JTextField();
        btnTroLai = new javax.swing.JButton();
        btnDoi = new javax.swing.JButton();
        txtXacnhan = new javax.swing.JTextField();
        txtMatkhaucu = new javax.swing.JTextField();
        txtMatkhaumoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTaikhoan = new javax.swing.JLabel();
        lbMatkhaucu = new javax.swing.JLabel();
        lbMatkhaumoi = new javax.swing.JLabel();
        lbXacnhan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(426, 900));

        txtTaikhoan.setEditable(false);
        txtTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTaikhoan.setName("txtTK"); // NOI18N
        txtTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaikhoanMouseClicked(evt);
            }
        });
        txtTaikhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaikhoanKeyPressed(evt);
            }
        });

        btnTroLai.setBackground(new java.awt.Color(102, 102, 255));
        btnTroLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTroLai.setText("Trở Lại");
        btnTroLai.setBorder(null);
        btnTroLai.setBorderPainted(false);
        btnTroLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTroLai.setFocusable(false);
        btnTroLai.setName("btnTroLai"); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        btnDoi.setBackground(new java.awt.Color(102, 102, 255));
        btnDoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDoi.setText("Đổi");
        btnDoi.setBorder(null);
        btnDoi.setBorderPainted(false);
        btnDoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoi.setFocusable(false);
        btnDoi.setName("btnDoi"); // NOI18N
        btnDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiActionPerformed(evt);
            }
        });

        txtXacnhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXacnhan.setName("txtXacNhanMK"); // NOI18N
        txtXacnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtXacnhanMouseClicked(evt);
            }
        });
        txtXacnhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtXacnhanKeyPressed(evt);
            }
        });

        txtMatkhaucu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMatkhaucu.setName("txtMKcu"); // NOI18N
        txtMatkhaucu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatkhaucuMouseClicked(evt);
            }
        });
        txtMatkhaucu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatkhaucuKeyPressed(evt);
            }
        });

        txtMatkhaumoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMatkhaumoi.setName("txtMKmoi"); // NOI18N
        txtMatkhaumoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatkhaumoiMouseClicked(evt);
            }
        });
        txtMatkhaumoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatkhaumoiKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Xác Nhận Mật Khẩu");
        jLabel5.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mật Khẩu Mới");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mật Khẩu Cũ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tài Khoản");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMatkhaumoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMatkhaumoi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatkhaucu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTaikhoan)
                    .addComponent(txtXacnhan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMatkhaucu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbXacnhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbMatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbMatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/NUCE1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiActionPerformed
        try {
            String pw = txtMatkhaumoi.getText();
            String cpw = txtXacnhan.getText();
            String taikhoan = txtTaikhoan.getText();
            String mkold = txtMatkhaucu.getText();
            if (txtTaikhoan.getText().equals("")) {
                lbTaikhoan.setText("*Chưa nhập tài khoản.");
                lbTaikhoan.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
            }
            if (txtMatkhaucu.getText().equals("")) {
                lbMatkhaucu.setText("*Chưa nhập mật khẩu cũ.");
                lbMatkhaucu.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtMatkhaucu.setBorder(RedLine);
            }
            if (txtMatkhaumoi.getText().equals("")) {
                lbMatkhaumoi.setText("*Chưa nhập mật khẩu mới.");
                lbMatkhaumoi.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtMatkhaumoi.setBorder(RedLine);
            }
            if (txtXacnhan.getText().equals("")) {
                lbXacnhan.setText("*Chưa xác nhận mật khẩu.");
                lbXacnhan.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtXacnhan.setBorder(RedLine);
            }
            if (!txtTaikhoan.getText().equals("") && !txtMatkhaucu.getText().equals("") && !txtMatkhaumoi.getText().equals("") && !txtXacnhan.getText().equals("")) {
                if (pw.equals(cpw)) {
                    if (txtTaikhoan.getText().equals("admin")) {
                        JOptionPane.showMessageDialog(this, "Không thể đổi mật khẩu của admin");
                        txtMatkhaumoi.setText("");
                        txtXacnhan.setText("");
                        txtMatkhaucu.setText("");
                    } else {
                        DangNhapDAO dn = new DangNhapDAO();
                        int doimaykhau = dn.DoiMK(taikhoan, pw, mkold);
                        if (doimaykhau > 0) {
                            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                            txtMatkhaumoi.setText("");
                            txtXacnhan.setText("");
                            txtMatkhaucu.setText("");
                        } else {
                            lbMatkhaucu.setText("*Mật khẩu cũ không đúng.");
                            lbMatkhaucu.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtMatkhaucu.setBorder(RedLine);
                            txtMatkhaucu.setText("");
                        }
                    }
                } else {
                    lbXacnhan.setText("*Xác nhận mật khẩu sai.");
                    lbXacnhan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtXacnhan.setBorder(RedLine);
                    txtMatkhaucu.setText("");
                    txtMatkhaumoi.setText("");
                    txtXacnhan.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDoiActionPerformed

    private void txtTaikhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaikhoanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pw = txtMatkhaumoi.getText();
                String cpw = txtXacnhan.getText();
                String taikhoan = txtTaikhoan.getText();
                String mkold = txtMatkhaucu.getText();
                if (txtTaikhoan.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                }
                if (txtMatkhaucu.getText().equals("")) {
                    lbMatkhaucu.setText("*Chưa nhập mật khẩu cũ.");
                    lbMatkhaucu.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaucu.setBorder(RedLine);
                }
                if (txtMatkhaumoi.getText().equals("")) {
                    lbMatkhaumoi.setText("*Chưa nhập mật khẩu mới.");
                    lbMatkhaumoi.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaumoi.setBorder(RedLine);
                }
                if (txtXacnhan.getText().equals("")) {
                    lbXacnhan.setText("*Chưa xác nhận mật khẩu.");
                    lbXacnhan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtXacnhan.setBorder(RedLine);
                }
                if (!txtTaikhoan.getText().equals("") && !txtMatkhaucu.getText().equals("") && !txtMatkhaumoi.getText().equals("") && !txtXacnhan.getText().equals("")) {
                    if (pw.equals(cpw)) {
                        if (txtTaikhoan.getText().equals("admin")) {
                            JOptionPane.showMessageDialog(this, "Không thể đổi mật khẩu của admin");
                            txtMatkhaumoi.setText("");
                            txtXacnhan.setText("");
                            txtMatkhaucu.setText("");
                        } else {
                            DangNhapDAO dn = new DangNhapDAO();
                            int doimaykhau = dn.DoiMK(taikhoan, pw, mkold);
                            if (doimaykhau > 0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                                txtMatkhaumoi.setText("");
                                txtXacnhan.setText("");
                                txtMatkhaucu.setText("");
                            } else {
                                lbMatkhaucu.setText("*Mật khẩu cũ không đúng.");
                                lbMatkhaucu.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtMatkhaucu.setBorder(RedLine);
                                txtMatkhaucu.setText("");
                            }
                        }
                    } else {
                        lbXacnhan.setText("*Xác nhận mật khẩu sai.");
                        lbXacnhan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtXacnhan.setBorder(RedLine);
                        txtMatkhaucu.setText("");
                        txtMatkhaumoi.setText("");
                        txtXacnhan.setText("");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtTaikhoanKeyPressed

    private void txtMatkhaucuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatkhaucuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pw = txtMatkhaumoi.getText();
                String cpw = txtXacnhan.getText();
                String taikhoan = txtTaikhoan.getText();
                String mkold = txtMatkhaucu.getText();
                if (txtTaikhoan.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                }
                if (txtMatkhaucu.getText().equals("")) {
                    lbMatkhaucu.setText("*Chưa nhập mật khẩu cũ.");
                    lbMatkhaucu.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaucu.setBorder(RedLine);
                }
                if (txtMatkhaumoi.getText().equals("")) {
                    lbMatkhaumoi.setText("*Chưa nhập mật khẩu mới.");
                    lbMatkhaumoi.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaumoi.setBorder(RedLine);
                }
                if (txtXacnhan.getText().equals("")) {
                    lbXacnhan.setText("*Chưa xác nhận mật khẩu.");
                    lbXacnhan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtXacnhan.setBorder(RedLine);
                }
                if (!txtTaikhoan.getText().equals("") && !txtMatkhaucu.getText().equals("") && !txtMatkhaumoi.getText().equals("") && !txtXacnhan.getText().equals("")) {
                    if (pw.equals(cpw)) {
                        if (txtTaikhoan.getText().equals("admin")) {
                            JOptionPane.showMessageDialog(this, "Không thể đổi mật khẩu của admin");
                            txtTaikhoan.setText("");
                            txtMatkhaumoi.setText("");
                            txtXacnhan.setText("");
                            txtMatkhaucu.setText("");
                        } else {
                            DangNhapDAO dn = new DangNhapDAO();
                            int doimaykhau = dn.DoiMK(taikhoan, pw, mkold);
                            if (doimaykhau > 0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                                txtMatkhaumoi.setText("");
                                txtXacnhan.setText("");
                                txtMatkhaucu.setText("");
                            } else {
                                lbMatkhaucu.setText("*Mật khẩu cũ không đúng.");
                                lbMatkhaucu.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtMatkhaucu.setBorder(RedLine);
                                txtMatkhaucu.setText("");
                            }
                        }
                    } else {
                        lbXacnhan.setText("*Xác nhận mật khẩu sai.");
                        lbXacnhan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtXacnhan.setBorder(RedLine);
                        txtMatkhaucu.setText("");
                        txtMatkhaumoi.setText("");
                        txtXacnhan.setText("");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtMatkhaucuKeyPressed

    private void txtMatkhaumoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatkhaumoiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pw = txtMatkhaumoi.getText();
                String cpw = txtXacnhan.getText();
                String taikhoan = txtTaikhoan.getText();
                String mkold = txtMatkhaucu.getText();
                if (txtTaikhoan.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                }
                if (txtMatkhaucu.getText().equals("")) {
                    lbMatkhaucu.setText("*Chưa nhập mật khẩu cũ.");
                    lbMatkhaucu.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaucu.setBorder(RedLine);
                }
                if (txtMatkhaumoi.getText().equals("")) {
                    lbMatkhaumoi.setText("*Chưa nhập mật khẩu mới.");
                    lbMatkhaumoi.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaumoi.setBorder(RedLine);
                }
                if (txtXacnhan.getText().equals("")) {
                    lbXacnhan.setText("*Chưa xác nhận mật khẩu.");
                    lbXacnhan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtXacnhan.setBorder(RedLine);
                }
                if (!txtTaikhoan.getText().equals("") && !txtMatkhaucu.getText().equals("") && !txtMatkhaumoi.getText().equals("") && !txtXacnhan.getText().equals("")) {
                    if (pw.equals(cpw)) {
                        if (txtTaikhoan.getText().equals("admin")) {
                            JOptionPane.showMessageDialog(this, "Không thể đổi mật khẩu của admin");
                            txtTaikhoan.setText("");
                            txtMatkhaumoi.setText("");
                            txtXacnhan.setText("");
                            txtMatkhaucu.setText("");
                        } else {
                            DangNhapDAO dn = new DangNhapDAO();
                            int doimaykhau = dn.DoiMK(taikhoan, pw, mkold);
                            if (doimaykhau > 0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                                txtMatkhaumoi.setText("");
                                txtXacnhan.setText("");
                                txtMatkhaucu.setText("");
                            } else {
                                lbMatkhaucu.setText("*Mật khẩu cũ không đúng.");
                                lbMatkhaucu.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtMatkhaucu.setBorder(RedLine);
                                txtMatkhaucu.setText("");
                            }
                        }
                    } else {
                        lbXacnhan.setText("*Xác nhận mật khẩu sai.");
                        lbXacnhan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtXacnhan.setBorder(RedLine);
                        txtMatkhaucu.setText("");
                        txtMatkhaumoi.setText("");
                        txtXacnhan.setText("");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtMatkhaumoiKeyPressed

    private void txtXacnhanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXacnhanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pw = txtMatkhaumoi.getText();
                String cpw = txtXacnhan.getText();
                String taikhoan = txtTaikhoan.getText();
                String mkold = txtMatkhaucu.getText();
                if (txtTaikhoan.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                }
                if (txtMatkhaucu.getText().equals("")) {
                    lbMatkhaucu.setText("*Chưa nhập mật khẩu cũ.");
                    lbMatkhaucu.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaucu.setBorder(RedLine);
                }
                if (txtMatkhaumoi.getText().equals("")) {
                    lbMatkhaumoi.setText("*Chưa nhập mật khẩu mới.");
                    lbMatkhaumoi.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtMatkhaumoi.setBorder(RedLine);
                }
                if (txtXacnhan.getText().equals("")) {
                    lbXacnhan.setText("*Chưa xác nhận mật khẩu.");
                    lbXacnhan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtXacnhan.setBorder(RedLine);
                }
                if (!txtTaikhoan.getText().equals("") && !txtMatkhaucu.getText().equals("") && !txtMatkhaumoi.getText().equals("") && !txtXacnhan.getText().equals("")) {
                    if (pw.equals(cpw)) {
                        if (txtTaikhoan.getText().equals("admin")) {
                            JOptionPane.showMessageDialog(this, "Không thể đổi mật khẩu của admin");
                            txtTaikhoan.setText("");
                            txtMatkhaumoi.setText("");
                            txtXacnhan.setText("");
                            txtMatkhaucu.setText("");
                        } else {
                            DangNhapDAO dn = new DangNhapDAO();
                            int doimaykhau = dn.DoiMK(taikhoan, pw, mkold);
                            if (doimaykhau > 0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                                txtMatkhaumoi.setText("");
                                txtXacnhan.setText("");
                                txtMatkhaucu.setText("");
                            } else {
                                lbMatkhaucu.setText("*Mật khẩu cũ không đúng.");
                                lbMatkhaucu.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtMatkhaucu.setBorder(RedLine);
                                txtMatkhaucu.setText("");
                            }
                        }
                    } else {
                        lbXacnhan.setText("*Xác nhận mật khẩu sai.");
                        lbXacnhan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtXacnhan.setBorder(RedLine);
                        txtMatkhaucu.setText("");
                        txtMatkhaumoi.setText("");
                        txtXacnhan.setText("");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtXacnhanKeyPressed

    private void txtTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaikhoanMouseClicked
        lbTaikhoan.setText("");
        txtTaikhoan.setBorder(null);
    }//GEN-LAST:event_txtTaikhoanMouseClicked

    private void txtMatkhaucuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatkhaucuMouseClicked
        lbMatkhaucu.setText("");
        txtMatkhaucu.setBorder(null);
    }//GEN-LAST:event_txtMatkhaucuMouseClicked

    private void txtMatkhaumoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatkhaumoiMouseClicked
        lbMatkhaumoi.setText("");
        txtMatkhaumoi.setBorder(null);
    }//GEN-LAST:event_txtMatkhaumoiMouseClicked

    private void txtXacnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXacnhanMouseClicked
        lbXacnhan.setText("");
        txtXacnhan.setBorder(null);
    }//GEN-LAST:event_txtXacnhanMouseClicked

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
            java.util.logging.Logger.getLogger(FDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoi;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMatkhaucu;
    private javax.swing.JLabel lbMatkhaumoi;
    private javax.swing.JLabel lbTaikhoan;
    private javax.swing.JLabel lbXacnhan;
    private javax.swing.JTextField txtMatkhaucu;
    private javax.swing.JTextField txtMatkhaumoi;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtXacnhan;
    // End of variables declaration//GEN-END:variables
}

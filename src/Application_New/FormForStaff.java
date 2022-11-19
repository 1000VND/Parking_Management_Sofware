package Application_New;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import UI.FDoiMatKhau;
import UI.FLogin;
import UI.PFDKiVeThang;
import UI.PFNhanXe;
import UI.PFThongTinThem;
import UI.PFTraCuuBaiXe;
import UI.PFTraXe;
import java.awt.Color;

public class FormForStaff extends javax.swing.JFrame {

    private PFNhanXe PFNhanXeTab;
    private PFTraXe PFTraXeTab;
    private PFDKiVeThang PFDKiVeThangTab;
    private PFTraCuuBaiXe PFTraCuuBaiXeTab;    
    private PFTraCuuBaiXe PFBienBanTab;
    private PFThongTinThem PFInfor;

    public FormForStaff(String user) {
        initComponents();
        setSize(1600, 900);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        xinchao(user);

    }

    private void xinchao(String user) {
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            txtChaomung.setText("Chào mừng nhân viên " + ac.getTenNguoidung());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btnThongTin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNhapXe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnXuatXe = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDangKyVeThang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThongTinBaiXe = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBienBan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JLabel();
        txtChaomung = new javax.swing.JLabel();
        TabMainBoard = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1600, 900));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setPreferredSize(new java.awt.Dimension(331, 900));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThongTin.setBackground(new java.awt.Color(54, 33, 89));
        btnThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongTinMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-information-35.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THÔNG TIN ỨNG DỤNG");

        javax.swing.GroupLayout btnThongTinLayout = new javax.swing.GroupLayout(btnThongTin);
        btnThongTin.setLayout(btnThongTinLayout);
        btnThongTinLayout.setHorizontalGroup(
            btnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongTinLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        btnThongTinLayout.setVerticalGroup(
            btnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 330, -1));

        btnNhapXe.setBackground(new java.awt.Color(54, 33, 89));
        btnNhapXe.setToolTipText("Nhập xe (Alt+1)");
        btnNhapXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhapXeMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-plus-math-35.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NHẬP XE");

        javax.swing.GroupLayout btnNhapXeLayout = new javax.swing.GroupLayout(btnNhapXe);
        btnNhapXe.setLayout(btnNhapXeLayout);
        btnNhapXeLayout.setHorizontalGroup(
            btnNhapXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNhapXeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        btnNhapXeLayout.setVerticalGroup(
            btnNhapXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNhapXeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnNhapXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnNhapXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        btnXuatXe.setBackground(new java.awt.Color(54, 33, 89));
        btnXuatXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatXeMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-reply-arrow-35.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("XUẤT XE");

        javax.swing.GroupLayout btnXuatXeLayout = new javax.swing.GroupLayout(btnXuatXe);
        btnXuatXe.setLayout(btnXuatXeLayout);
        btnXuatXeLayout.setHorizontalGroup(
            btnXuatXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatXeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        btnXuatXeLayout.setVerticalGroup(
            btnXuatXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatXeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnXuatXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnXuatXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        btnDangKyVeThang.setBackground(new java.awt.Color(54, 33, 89));
        btnDangKyVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangKyVeThangMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-add-user-35.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ĐĂNG KÝ VÉ THÁNG");

        javax.swing.GroupLayout btnDangKyVeThangLayout = new javax.swing.GroupLayout(btnDangKyVeThang);
        btnDangKyVeThang.setLayout(btnDangKyVeThangLayout);
        btnDangKyVeThangLayout.setHorizontalGroup(
            btnDangKyVeThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangKyVeThangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        btnDangKyVeThangLayout.setVerticalGroup(
            btnDangKyVeThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangKyVeThangLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnDangKyVeThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnDangKyVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 330, -1));

        btnThongTinBaiXe.setBackground(new java.awt.Color(54, 33, 89));
        btnThongTinBaiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongTinBaiXeMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-list-view-35.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("THÔNG TIN BÃI XE");

        javax.swing.GroupLayout btnThongTinBaiXeLayout = new javax.swing.GroupLayout(btnThongTinBaiXe);
        btnThongTinBaiXe.setLayout(btnThongTinBaiXeLayout);
        btnThongTinBaiXeLayout.setHorizontalGroup(
            btnThongTinBaiXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongTinBaiXeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        btnThongTinBaiXeLayout.setVerticalGroup(
            btnThongTinBaiXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongTinBaiXeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnThongTinBaiXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnThongTinBaiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 330, -1));

        btnBienBan.setBackground(new java.awt.Color(54, 33, 89));
        btnBienBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBienBanMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-edit-graph-report-35.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BIÊN BẢN");

        javax.swing.GroupLayout btnBienBanLayout = new javax.swing.GroupLayout(btnBienBan);
        btnBienBan.setLayout(btnBienBanLayout);
        btnBienBanLayout.setHorizontalGroup(
            btnBienBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBienBanLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        btnBienBanLayout.setVerticalGroup(
            btnBienBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBienBanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnBienBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btnBienBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 330, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-basement-100.png"))); // NOI18N
        sidepane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 100));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PHẦN MỀM QUẢN LÝ BÃI GỬI XE");
        jLabel14.setToolTipText("PHẦN MỀM QUẢN LÝ BÃI GỬI XE");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setText("Thoát");
        btnLogout.setToolTipText("Thoát");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDoiMatKhau.setText(" Đổi mật khẩu");
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
        });

        txtChaomung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChaomung.setForeground(new java.awt.Color(255, 255, 255));
        txtChaomung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtChaomung.setText("Chào mừng_______đến với");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(txtChaomung, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoiMatKhau)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChaomung))
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 1270, 140));
        bg.add(TabMainBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 1230, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        new FLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked
        new FDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

    private void btnNhapXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapXeMouseClicked
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhập Xe", null, PFNhanXeTab, "Nhập Xe");
            btnNhapXe.setBackground(new Color(85, 65, 118));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
        if (PFNhanXeTab == null) {
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhập Xe", null, PFNhanXeTab, "Nhập Xe");
            btnNhapXe.setBackground(new Color(85, 65, 118));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_btnNhapXeMouseClicked

    private void btnXuatXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatXeMouseClicked
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Xuất Xe", null, PFTraXeTab, "Xuất Xe");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(85, 65, 118));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
        if (PFTraXeTab == null) {
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Xuất Xe", null, PFTraXeTab, "Xuất Xe");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(85, 65, 118));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_btnXuatXeMouseClicked

    private void btnDangKyVeThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyVeThangMouseClicked
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Thàng", null, PFDKiVeThangTab, "Đăng Kí Vé Thàng");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(85, 65, 118));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
        if (PFDKiVeThangTab == null) {
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Thàng", null, PFDKiVeThangTab, "Đăng Kí Vé Thàng");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(85, 65, 118));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_btnDangKyVeThangMouseClicked

    private void btnThongTinBaiXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinBaiXeMouseClicked
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(85, 65, 118));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
        if (PFTraCuuBaiXeTab == null) {
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(85, 65, 118));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_btnThongTinBaiXeMouseClicked

    private void btnThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinMouseClicked
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(85, 65, 118));
        }
        if (PFInfor == null) {
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
            btnNhapXe.setBackground(new Color(54, 33, 89));
            btnXuatXe.setBackground(new Color(54, 33, 89));
            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
            btnBienBan.setBackground(new Color(54, 33, 89));
            btnThongTin.setBackground(new Color(85, 65, 118));
        }
    }//GEN-LAST:event_btnThongTinMouseClicked

    private void btnBienBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienBanMouseClicked
//        if (TabMainBoard.getSelectedIndex() == 0) {
//            TabMainBoard.remove(0);
//            PFBienBanTab = new PFThongTinThem();
//            TabMainBoard.addTab("Biên Bản", null, PFBienBanTab, "Biên Bản");
//            btnNhapXe.setBackground(new Color(54, 33, 89));
//            btnXuatXe.setBackground(new Color(54, 33, 89));
//            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
//            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
//            btnBienBan.setBackground(new Color(85, 65, 118));
//            btnThongTin.setBackground(new Color(54, 33, 89));
//        }
//        if (PFInfor == null) {
//            PFInfor = new PFThongTinThem();
//            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
//            btnNhapXe.setBackground(new Color(54, 33, 89));
//            btnXuatXe.setBackground(new Color(54, 33, 89));
//            btnDangKyVeThang.setBackground(new Color(54, 33, 89));
//            btnThongTinBaiXe.setBackground(new Color(54, 33, 89));
//            btnBienBan.setBackground(new Color(85, 65, 118));
//            btnThongTin.setBackground(new Color(54, 33, 89));
//        }
    }//GEN-LAST:event_btnBienBanMouseClicked

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnBienBan;
    private javax.swing.JPanel btnDangKyVeThang;
    private javax.swing.JLabel btnDoiMatKhau;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JPanel btnNhapXe;
    private javax.swing.JPanel btnThongTin;
    private javax.swing.JPanel btnThongTinBaiXe;
    private javax.swing.JPanel btnXuatXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel sidepane;
    private javax.swing.JLabel txtChaomung;
    // End of variables declaration//GEN-END:variables
}

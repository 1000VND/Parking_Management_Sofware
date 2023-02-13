package Application_New;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import event.EventMenuSelected;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class TrangChu extends javax.swing.JFrame {

    private FormNhapXe home;
    private FormDangKiVeThang veThang;
    private FormBienBan bienBan;
    private FormThongTinBaiXe thongTinBaiXe;
    private String dataFromChangePass;
    private String dataUser;

    public TrangChu() {
        initComponents();
    }

    public TrangChu(String user) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        home = new FormNhapXe();
        veThang = new FormDangKiVeThang();
        bienBan = new FormBienBan(this.getTenNhanVien(user));
        thongTinBaiXe =  new FormThongTinBaiXe();
        menu.initMoving(TrangChu.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 1) {
                    setForm(home);
                } else if (index == 3) {
                    setForm(veThang);
                } else if (index == 4) {
                    setForm(thongTinBaiXe);
                } else if (index == 5) {
                    setForm(bienBan);
                } else if (index == 6) {
                    new FormLogin().setVisible(true);
                    dispose();
                } else if (index == 7) {
                    int exit = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát ứng dụng không", "Thông báo!", JOptionPane.YES_NO_OPTION);
                    if (exit != JOptionPane.YES_OPTION) {
                    } else {
                        System.exit(0);
                    }
                }
            }
        });
        setForm(home);
        xinchao(user);
        this.dataFromChangePass = user;
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void xinchao(String user) {
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            txtChaomung.setText("Chào mừng nhân viên " + ac.getTenNguoidung());
        }
    }

    private String getTenNhanVien(String user) {
        String name = null;
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            name = ac.getTenNguoidung();
        }
        return name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        menu = new Component.Menu();
        mainPanel = new javax.swing.JPanel();
        pFNhanXe1 = new Application_New.FormNhapXe();
        txtChaomung = new javax.swing.JLabel();
        txtDoiMatKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(226, 230, 236));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(pFNhanXe1, java.awt.BorderLayout.CENTER);

        txtChaomung.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtChaomung.setText("Chào mừng nhân viên Lê Quang Hưng");

        txtDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDoiMatKhau.setForeground(new java.awt.Color(88, 103, 229));
        txtDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDoiMatKhau.setText("Đổi mật khẩu");
        txtDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDoiMatKhauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(txtChaomung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChaomung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDoiMatKhauMouseClicked
        new FormDoiMatKhau(this.dataFromChangePass).setVisible(true);
    }//GEN-LAST:event_txtDoiMatKhauMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private Component.Menu menu;
    private Application_New.FormNhapXe pFNhanXe1;
    private swing.PanelBorder panelBorder1;
    private javax.swing.JLabel txtChaomung;
    private javax.swing.JLabel txtDoiMatKhau;
    // End of variables declaration//GEN-END:variables
}

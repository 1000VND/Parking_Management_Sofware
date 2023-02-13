package Application_New;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import UI.FThongKeLuotGuiXe;
import event.EventMenuSelected;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TrangChuChoAdmin extends javax.swing.JFrame {

    private FormAdminNhanVien nhanVienForm;
    private FormAdminLuotGuiXe luotGuiXe;
    private FormAdminLuotDKVeThang luotDKVeThang;
    private FormAdminBienBan bienBan;

    public TrangChuChoAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        nhanVienForm = new FormAdminNhanVien();
        luotGuiXe = new FormAdminLuotGuiXe();
        luotDKVeThang = new FormAdminLuotDKVeThang();
        bienBan = new FormAdminBienBan();
        menu.initMoving(TrangChuChoAdmin.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(nhanVienForm);
                } else if (index == 1) {
                    setForm(luotGuiXe);
                } else if (index == 2) {
                    setForm(luotDKVeThang);
                } else if (index == 3) {
                    setForm(bienBan);
                } else if (index == 4) {
                    new FormLogin().setVisible(true);
                    dispose();
                } else if (index == 5) {
                    int exit = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát ứng dụng không", "Thông báo!", JOptionPane.YES_NO_OPTION);
                    if (exit != JOptionPane.YES_OPTION) {
                    } else {
                        System.exit(0);
                    }
                }
            }
        });
        setForm(nhanVienForm);
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        mainPanel = new javax.swing.JPanel();
        formAdminNhanVien1 = new Application_New.FormAdminNhanVien();
        menu = new Component.MenuChoAdmin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(226, 230, 236));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(formAdminNhanVien1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAdminNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdminNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdminNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdminNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdminNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Application_New.FormAdminNhanVien formAdminNhanVien1;
    private javax.swing.JPanel mainPanel;
    private Component.MenuChoAdmin menu;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}

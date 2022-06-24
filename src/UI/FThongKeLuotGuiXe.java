/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.ThongKeDAO;
import DAO.TongXeDAO;
import DTO.TongXeDTO;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FThongKeLuotGuiXe extends javax.swing.JFrame {

    DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form FThongKeVeThang
     */
    public FThongKeLuotGuiXe() {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        showTable();
        loadCountAll();
        loadAll();
        loadMoneyAll();
    }

    private void showTable() {
        tblModel.setColumnIdentifiers(new String[]{"Biển Số Xe", "Loại Xe", "Loại Vé", "Mã Vé", "Màu Xe", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận", "Ngày Trả", "Giờ Trả", "Số Tiền"});
        TableLuotGuiXe.setModel(tblModel);
    }

    private void loadCountTimeAll() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        lbCount.setText(tk.loadCountTimeAll(TuNgay, DenNgay));
    }

    private void loadCountTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        lbCount.setText(tk.loadCountTime(cbxLoaixe.getSelectedItem().toString(), TuNgay, DenNgay));
    }

    private void loadCountAll() {
        ThongKeDAO tk = new ThongKeDAO();
        lbCount.setText(tk.loadCountAll());
    }

    private void loadMoneyAll() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(Integer.toString(tk.loadMoneyAll()));
    }

    private void loadMoneyTimeAll() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(Integer.toString(tk.loadMoneyTimeAll(TuNgay, DenNgay)));
    }

    private void loadMoneyTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(Integer.toString(tk.loadMoneyTime(cbxLoaixe.getSelectedItem().toString(), TuNgay, DenNgay)));
    }

    private void find(String Loaixe, String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCar(Loaixe, TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableLuotGuiXe.getModel();
        Object[] row = new Object[12];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBienSo();
            row[1] = list.get(i).getLoaiXe();
            row[2] = list.get(i).getLoaiVe();
            row[3] = list.get(i).getMaVe();
            row[4] = list.get(i).getMauXe();
            row[5] = list.get(i).getKhuVuc();
            row[6] = list.get(i).getViTri();
            row[7] = list.get(i).getNgayGui();
            row[8] = list.get(i).getGioGui();
            row[9] = list.get(i).getNgayTra();
            row[10] = list.get(i).getGioTra();
            row[11] = list.get(i).getGiaTien();
            tblModel.addRow(row);
        }
    }

    private void findAll(String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableLuotGuiXe.getModel();
        Object[] row = new Object[12];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBienSo();
            row[1] = list.get(i).getLoaiXe();
            row[2] = list.get(i).getLoaiVe();
            row[3] = list.get(i).getMaVe();
            row[4] = list.get(i).getMauXe();
            row[5] = list.get(i).getKhuVuc();
            row[6] = list.get(i).getViTri();
            row[7] = list.get(i).getNgayGui();
            row[8] = list.get(i).getGioGui();
            row[9] = list.get(i).getNgayTra();
            row[10] = list.get(i).getGioTra();
            row[11] = list.get(i).getGiaTien();
            tblModel.addRow(row);
        }
    }

    private void loadAll() {
        ArrayList<TongXeDTO> list = ThongKeDAO.loadTableAll();
        DefaultTableModel tblModel = (DefaultTableModel) TableLuotGuiXe.getModel();
        Object[] row = new Object[12];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBienSo();
            row[1] = list.get(i).getLoaiXe();
            row[2] = list.get(i).getLoaiVe();
            row[3] = list.get(i).getMaVe();
            row[4] = list.get(i).getMauXe();
            row[5] = list.get(i).getKhuVuc();
            row[6] = list.get(i).getViTri();
            row[7] = list.get(i).getNgayGui();
            row[8] = list.get(i).getGioGui();
            row[9] = list.get(i).getNgayTra();
            row[10] = list.get(i).getGioTra();
            row[11] = list.get(i).getGiaTien();
            tblModel.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLuotGuiXe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tuNgay = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        denNgay = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        cbxLoaixe = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();
        lbCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLammoi = new javax.swing.JButton();
        txtTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống Kê Lượt Gửi Xe");

        TableLuotGuiXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Biển Số Xe", "Loại Xe", "Loại Vé", "Vé Xe", "Màu Xe", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận", "Ngày Trả", "Giờ Trả", "Tiền"
            }
        ));
        jScrollPane1.setViewportView(TableLuotGuiXe);
        if (TableLuotGuiXe.getColumnModel().getColumnCount() > 0) {
            TableLuotGuiXe.getColumnModel().getColumn(0).setPreferredWidth(150);
            TableLuotGuiXe.getColumnModel().getColumn(0).setMaxWidth(150);
            TableLuotGuiXe.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableLuotGuiXe.getColumnModel().getColumn(1).setMaxWidth(100);
            TableLuotGuiXe.getColumnModel().getColumn(3).setPreferredWidth(80);
            TableLuotGuiXe.getColumnModel().getColumn(3).setMaxWidth(80);
            TableLuotGuiXe.getColumnModel().getColumn(4).setPreferredWidth(120);
            TableLuotGuiXe.getColumnModel().getColumn(4).setMaxWidth(120);
            TableLuotGuiXe.getColumnModel().getColumn(5).setPreferredWidth(80);
            TableLuotGuiXe.getColumnModel().getColumn(5).setMaxWidth(80);
            TableLuotGuiXe.getColumnModel().getColumn(6).setPreferredWidth(80);
            TableLuotGuiXe.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ngày :");

        tuNgay.setDateFormatString("yyyy-MM-dd");
        tuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Đến ngày :");

        denNgay.setDateFormatString("yyyy-MM-dd");
        denNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Tra cứu");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbxLoaixe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLoaixe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng xe", "Xe máy", "Ô tô" }));
        cbxLoaixe.setBorder(null);
        cbxLoaixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaixeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnQuayLai.setBackground(new java.awt.Color(204, 204, 204));
        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.setBorderPainted(false);
        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.setFocusPainted(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        lbCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tổng số lượt :");

        btnLammoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        txtTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTien.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tổng Tiền :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("VND");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Lượt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnQuayLai)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai)))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnLammoi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
        if (tuNgay.getDate() == null && denNgay.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian");
        } else if (tuNgay.getDate() == null && denNgay.getDate() != null) {

            JOptionPane.showMessageDialog(this, "Chưa nhập ngày bắt đầu");
        } else if (tuNgay.getDate() != null && denNgay.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Chưa nhập ngày kết thúc");
        } else {
              String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
            if (cbxLoaixe.getSelectedItem().toString().equals("Tổng xe")) {
                findAll(TuNgay, DenNgay);
                loadCountTimeAll();
                loadMoneyTimeAll();
            } else {
                find(cbxLoaixe.getSelectedItem().toString(), TuNgay, DenNgay);
                loadCountTime();
                loadMoneyTime();
            }

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        tuNgay.setDate(null);
        denNgay.setDate(null);
        loadMoneyAll();
        loadCountAll();
        loadAll();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void cbxLoaixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaixeActionPerformed

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
            java.util.logging.Logger.getLogger(FThongKeLuotGuiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FThongKeLuotGuiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FThongKeLuotGuiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FThongKeLuotGuiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FThongKeLuotGuiXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableLuotGuiXe;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxLoaixe;
    private com.toedter.calendar.JDateChooser denNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCount;
    private com.toedter.calendar.JDateChooser tuNgay;
    private javax.swing.JTextField txtTien;
    // End of variables declaration//GEN-END:variables
}

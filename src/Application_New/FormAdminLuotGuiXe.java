package Application_New;

import DAO.ThongKeDAO;
import DTO.TongXeDTO;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdminLuotGuiXe extends javax.swing.JPanel {

    DefaultTableModel tblModel = new DefaultTableModel();
    DecimalFormat decimalFormat = new DecimalFormat("###,###,###");

    public FormAdminLuotGuiXe() {
        initComponents();
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
        lbCount.setText(tk.loadCountTimeAll(TuNgay, DenNgay) + " Lượt");
    }

    private void loadCountTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        lbCount.setText(tk.loadCountTime(cbxLoaixe.getSelectedItem().toString(), TuNgay, DenNgay) + " Lượt");
    }

    private void loadCountAll() {
        ThongKeDAO tk = new ThongKeDAO();
        lbCount.setText(tk.loadCountAll() + " Lượt");
    }

    private void loadMoneyAll() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(decimalFormat.format(tk.loadMoneyAll()) + " VNĐ");
    }

    private void loadMoneyTimeAll() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(decimalFormat.format(tk.loadMoneyTimeAll(TuNgay, DenNgay)) + " VNĐ");
    }

    private void loadMoneyTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTien.setText(decimalFormat.format(tk.loadMoneyTime(cbxLoaixe.getSelectedItem().toString(), TuNgay, DenNgay)) + " VNĐ");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableLuotGuiXe = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCount = new javax.swing.JLabel();
        cbxLoaixe = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tuNgay = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        denNgay = new com.toedter.calendar.JDateChooser();
        btnLammoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        TableLuotGuiXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableLuotGuiXe);

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(88, 103, 229));
        btnSearch.setText("Tra cứu");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tổng Tiền :");

        txtTien.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tổng số lượt :");

        lbCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(txtTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cbxLoaixe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLoaixe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng xe", "Xe máy", "Ô tô" }));
        cbxLoaixe.setBorder(null);
        cbxLoaixe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaixeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ngày");

        tuNgay.setBackground(new java.awt.Color(255, 255, 255));
        tuNgay.setDateFormatString("yyyy-MM-dd");
        tuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Đến ngày");

        denNgay.setBackground(new java.awt.Color(255, 255, 255));
        denNgay.setDateFormatString("yyyy-MM-dd");
        denNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnLammoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLammoi.setForeground(new java.awt.Color(88, 103, 229));
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addGap(36, 36, 36))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLammoi)
                        .addComponent(btnSearch)))
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void cbxLoaixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaixeActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        tuNgay.setDate(null);
        denNgay.setDate(null);
        loadMoneyAll();
        loadCountAll();
        loadAll();
    }//GEN-LAST:event_btnLammoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableLuotGuiXe;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxLoaixe;
    private com.toedter.calendar.JDateChooser denNgay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCount;
    private com.toedter.calendar.JDateChooser tuNgay;
    private javax.swing.JLabel txtTien;
    // End of variables declaration//GEN-END:variables
}

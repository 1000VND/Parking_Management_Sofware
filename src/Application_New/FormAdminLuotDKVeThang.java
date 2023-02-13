package Application_New;

import DAO.ThongKeDAO;
import DTO.TongDKVeThangDTO;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdminLuotDKVeThang extends javax.swing.JPanel {

    DefaultTableModel tblModel = new DefaultTableModel();
    DecimalFormat decimalFormat = new DecimalFormat("###,###,###");

    public FormAdminLuotDKVeThang() {
        initComponents();
        showTable();
        loadAll();
        loadCountAll();
        loadTien();
    }

    private void showTable() {
        tblModel.setColumnIdentifiers(new String[]{"STT", "Mã Vé", "Tên Khách", "SDT", "Biển Số", "Loại Xe", "Màu Xe", "Ngày Đăng Ký", "Tiền"});
        jTable1.setModel(tblModel);
    }

    private void loadAll() {
        ArrayList<TongDKVeThangDTO> list = ThongKeDAO.loadTableVethang();
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getMaVethang();
            row[2] = list.get(i).getTenKhach();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getBienSo();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getMauXe();
            row[7] = list.get(i).getNgayDk();
            row[8] = list.get(i).getSoTien();
            tblModel.addRow(row);
        }
    }

    private void find(String TuNgay, String DenNgay) {
        ArrayList<TongDKVeThangDTO> list = ThongKeDAO.findDKYVETHANG(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getMaVethang();
            row[2] = list.get(i).getTenKhach();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getBienSo();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getMauXe();
            row[7] = list.get(i).getNgayDk();
            row[8] = list.get(i).getSoTien();
            tblModel.addRow(row);
        }
    }

    private void loadCountTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTongVT.setText(" " + tk.loadCountTime2(TuNgay, DenNgay) + " Lượt");
    }

    private void loadCountAll() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTongVT.setText(" " + tk.loadCountAll2() + " Lượt");
    }

    private void loadTien() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTongTien.setText(" " + decimalFormat.format(tk.loadTien()) + " VNĐ");
    }

    private void loadTienTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTongTien.setText(" " + decimalFormat.format(tk.loadTienTime(TuNgay, DenNgay)) + " VNĐ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tuNgay = new com.toedter.calendar.JDateChooser();
        denNgay = new com.toedter.calendar.JDateChooser();
        btnTracuu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTongVT = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLammoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        tuNgay.setBackground(new java.awt.Color(255, 255, 255));
        tuNgay.setDateFormatString("yyyy-MM-dd");
        tuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        denNgay.setBackground(new java.awt.Color(255, 255, 255));
        denNgay.setDateFormatString("yyyy-MM-dd");
        denNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnTracuu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTracuu.setForeground(new java.awt.Color(88, 103, 229));
        btnTracuu.setText("Tra Cứu");
        btnTracuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracuuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tổng Tiền :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Số lượt đăng kí trong tháng :");

        txtTongVT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(txtTongVT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTongVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Đến ngày");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ngày");

        btnLammoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLammoi.setForeground(new java.awt.Color(88, 103, 229));
        btnLammoi.setText("Làm mới");
        btnLammoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLammoi)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(denNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tuNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(btnTracuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLammoi)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTracuuActionPerformed
        if (tuNgay.getDate() == null && denNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian!");
        } else if (tuNgay.getDate() == null && denNgay.getDate() != null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian bắt đầu!");
        } else if (tuNgay.getDate() != null && denNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian kết thúc!");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TuNgay = sdf.format(tuNgay.getDate());
            String DenNgay = sdf.format(denNgay.getDate());
            find(TuNgay, DenNgay);
            loadCountTime();
            loadTienTime();
        }
    }//GEN-LAST:event_btnTracuuActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        tuNgay.setDate(null);
        denNgay.setDate(null);
        loadCountAll();
        loadTien();
        loadAll();
    }//GEN-LAST:event_btnLammoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnTracuu;
    private com.toedter.calendar.JDateChooser denNgay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser tuNgay;
    private javax.swing.JLabel txtTongTien;
    private javax.swing.JLabel txtTongVT;
    // End of variables declaration//GEN-END:variables
}

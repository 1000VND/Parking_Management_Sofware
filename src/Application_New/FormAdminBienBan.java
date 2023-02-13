package Application_New;

import DAO.BienBanDAO;
import DTO.BienBanDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdminBienBan extends javax.swing.JPanel {

    public FormAdminBienBan() {
        initComponents();
        showTable();
        loadTableAll();
        loadTong();
    }
    
    private void showTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"STT", "Biển số", "Tên khách hàng", "Điện thoại", "Mã vé", "Loại Xe", "Loại vé", "Ngày lập"});
        TableBienBan.setModel(tblModel);
    }
    
    private void loadTong() {
        BienBanDAO tk = new BienBanDAO();
        txtTong.setText("Tổng số biên bản: " + tk.countTabel() + " biên bản");
    }
    
    private void loadCountTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        BienBanDAO tk = new BienBanDAO();
        txtTong.setText("Tổng số biên bản: " + tk.countTabel1(TuNgay, DenNgay) + " Lượt");
    }
    
    private void loadTableAll(){
        ArrayList<BienBanDTO> list = BienBanDAO.loadTableAll();
        DefaultTableModel tblModel = (DefaultTableModel) TableBienBan.getModel();
        Object[] row = new Object[8];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getTenKhachHang();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getMaVe();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getLoaiVe();
            row[7] = list.get(i).getNgayLap();
            tblModel.addRow(row);
        }
    }
    
    private void loadTable(String TuNgay, String DenNgay) {
        ArrayList<BienBanDTO> list = BienBanDAO.findByDay(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableBienBan.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getTenKhachHang();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getMaVe();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getLoaiVe();
            row[7] = list.get(i).getNgayLap();
            tblModel.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableBienBan = new javax.swing.JTable();
        txtTong = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tuNgay = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        denNgay = new com.toedter.calendar.JDateChooser();
        btnLammoi = new javax.swing.JButton();
        btnTracuu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        TableBienBan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableBienBan);

        txtTong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTong.setText("Tổng số biên bản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Đến ngày");

        tuNgay.setBackground(new java.awt.Color(255, 255, 255));
        tuNgay.setDateFormatString("yyyy-MM-dd");
        tuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ngày");

        denNgay.setBackground(new java.awt.Color(255, 255, 255));
        denNgay.setDateFormatString("yyyy-MM-dd");
        denNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnLammoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLammoi.setForeground(new java.awt.Color(88, 103, 229));
        btnLammoi.setText("Làm mới");
        btnLammoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        btnTracuu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTracuu.setForeground(new java.awt.Color(88, 103, 229));
        btnTracuu.setText("Tra Cứu");
        btnTracuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        tuNgay.setDate(null);
        denNgay.setDate(null);
        loadTableAll();
    }//GEN-LAST:event_btnLammoiActionPerformed

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
            loadTable(TuNgay, DenNgay);
            loadCountTime();
        }
    }//GEN-LAST:event_btnTracuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBienBan;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnTracuu;
    private com.toedter.calendar.JDateChooser denNgay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tuNgay;
    private javax.swing.JLabel txtTong;
    // End of variables declaration//GEN-END:variables
}

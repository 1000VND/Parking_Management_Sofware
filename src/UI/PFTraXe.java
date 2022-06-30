/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import DAO.TraXeDAO;
import DTO.NhapXeDTO;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class PFTraXe extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    public PFTraXe() {
        initComponents();
        setSize(1040,545);
              showTable();
        loadTabel();
    }
private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Vé", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"});
        TableTTXe.setModel(tblModel);
    }

    public void loadTabel() {
        ArrayList<NhapXeDTO> list = TraXeDAO.veXe();
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getLoaiXe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getMauXe();
            row[3] = list.get(i).getMaVe();
            row[4] = list.get(i).getKhuVuc();
            row[5] = list.get(i).getViTri();
            row[6] = list.get(i).getNgayGui();
            row[7] = list.get(i).getGioGui();
            tblModel.addRow(row);
        }
        TableTTXe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableTTXe.getSelectedRow() >= 0) {
                    txtLoaiXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 0) + "");
                    txtBienSo.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 1) + "");
                    txtMauXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 2) + "");
                    txtMaVe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 3) + "");
                    txtKhuVuc.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 4) + "");
                    txtViTri.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 5) + "");
                    txtNgayNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 6) + "");
                    txtGioNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 7) + "");
                }
            }
        });
    }

    public void search(String str) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) TableTTXe.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
        TableTTXe.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTTXe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cbxTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnInHoaDon = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnLamMoi = new javax.swing.JButton();
        txtBienSo = new javax.swing.JTextField();
        txtMauXe = new javax.swing.JTextField();
        txtLoaiXe = new javax.swing.JTextField();
        txtMaVe = new javax.swing.JTextField();
        txtNgayNhan = new javax.swing.JTextField();
        txtViTri = new javax.swing.JTextField();
        txtKhuVuc = new javax.swing.JTextField();
        txtGioNhan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        TableTTXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Vé", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"
            }
        ));
        jScrollPane1.setViewportView(TableTTXe);
        if (TableTTXe.getColumnModel().getColumnCount() > 0) {
            TableTTXe.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableTTXe.getColumnModel().getColumn(0).setMaxWidth(100);
            TableTTXe.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableTTXe.getColumnModel().getColumn(1).setMaxWidth(150);
            TableTTXe.getColumnModel().getColumn(2).setPreferredWidth(120);
            TableTTXe.getColumnModel().getColumn(2).setMaxWidth(120);
            TableTTXe.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableTTXe.getColumnModel().getColumn(3).setMaxWidth(100);
            TableTTXe.getColumnModel().getColumn(4).setPreferredWidth(80);
            TableTTXe.getColumnModel().getColumn(4).setMaxWidth(80);
            TableTTXe.getColumnModel().getColumn(5).setPreferredWidth(80);
            TableTTXe.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tìm Kiếm Thông Tin :");

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setName("txtTimKiem"); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        cbxTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTimKiem.setBorder(null);
        cbxTimKiem.setFocusable(false);
        cbxTimKiem.setName("cbxTImKiemItem"); // NOI18N
        cbxTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(102, 102, 255));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.setBorder(null);
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setFocusPainted(false);
        btnTimKiem.setName("btnTimKiem"); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Loại Xe :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biển Số Xe :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Màu Xe :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Mã Vé :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Khu Vực :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Vị Trí :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Ngày Nhận :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Giờ Nhận :");

        btnInHoaDon.setBackground(new java.awt.Color(102, 102, 255));
        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.setBorder(null);
        btnInHoaDon.setBorderPainted(false);
        btnInHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInHoaDon.setFocusPainted(false);
        btnInHoaDon.setName("btnInHoaDon"); // NOI18N
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnLamMoi.setBackground(new java.awt.Color(102, 102, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setBorder(null);
        btnLamMoi.setBorderPainted(false);
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoi.setFocusPainted(false);
        btnLamMoi.setName("btnLamMoi"); // NOI18N
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtBienSo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBienSo.setName("txtBienSo"); // NOI18N

        txtMauXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMauXe.setName("txtMauXe"); // NOI18N
        txtMauXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauXeActionPerformed(evt);
            }
        });

        txtLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLoaiXe.setName("txtLoaiXe"); // NOI18N
        txtLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiXeActionPerformed(evt);
            }
        });

        txtMaVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaVe.setName("txtMaVe"); // NOI18N
        txtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVeActionPerformed(evt);
            }
        });

        txtNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayNhan.setName("txtNgayNhan"); // NOI18N
        txtNgayNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayNhanActionPerformed(evt);
            }
        });

        txtViTri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtViTri.setName("txtViTri"); // NOI18N
        txtViTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViTriActionPerformed(evt);
            }
        });

        txtKhuVuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKhuVuc.setName("txtKhuVuc"); // NOI18N
        txtKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhuVucActionPerformed(evt);
            }
        });

        txtGioNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGioNhan.setName("txtGioNhan"); // NOI18N
        txtGioNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioNhanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Trả Xe");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)
                                .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5)
                                .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGioNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void cbxTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[8];
        if (cbxTimKiem.getSelectedItem().toString().equals("Theo biển số")) {
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            TraXeDAO tx = new TraXeDAO();
            NhapXeDTO nx = tx.findXebyBienso(txtTimKiem.getText());
            if (nx != null) {
                for (int i = 0; i < 1; i++) {
                    row[0] = nx.getLoaiXe();
                    row[1] = nx.getBienSo();
                    row[2] = nx.getMauXe();
                    row[3] = nx.getMaVe();
                    row[4] = nx.getKhuVuc();
                    row[5] = nx.getViTri();
                    row[6] = nx.getNgayGui();
                    row[7] = nx.getGioGui();
                    tblModel.addRow(row);
                }
                TableTTXe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (TableTTXe.getSelectedRow() >= 0) {
                            txtLoaiXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 0) + "");
                            txtBienSo.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 1) + "");
                            txtMauXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 2) + "");
                            txtMaVe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 3) + "");
                            txtKhuVuc.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 4) + "");
                            txtViTri.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 5) + "");
                            txtNgayNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 6) + "");
                            txtGioNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 7) + "");
                        }
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy xe có biển số " + txtTimKiem.getText() + " \nVui lòng nhập lại biển số");
                loadTabel();
                txtTimKiem.setText("");
            }
        } else {
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            TraXeDAO tx = new TraXeDAO();
            NhapXeDTO nx = tx.findXebyMave(txtTimKiem.getText());
            if (nx != null) {
                for (int i = 0; i < 1; i++) {
                    row[0] = nx.getLoaiXe();
                    row[1] = nx.getBienSo();
                    row[2] = nx.getMauXe();
                    row[3] = nx.getMaVe();
                    row[4] = nx.getKhuVuc();
                    row[5] = nx.getViTri();
                    row[6] = nx.getNgayGui();
                    row[7] = nx.getGioGui();
                    tblModel.addRow(row);
                }
                TableTTXe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (TableTTXe.getSelectedRow() >= 0) {
                            txtLoaiXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 0) + "");
                            txtBienSo.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 1) + "");
                            txtMauXe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 2) + "");
                            txtMaVe.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 3) + "");
                            txtKhuVuc.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 4) + "");
                            txtViTri.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 5) + "");
                            txtNgayNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 6) + "");
                            txtGioNhan.setText(TableTTXe.getValueAt(TableTTXe.getSelectedRow(), 7) + "");
                        }
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy vé xe " + txtTimKiem.getText() + " \nVui lòng nhập mã vé");
                loadTabel();
                txtTimKiem.setText("");
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtMauXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauXeActionPerformed

    private void txtLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiXeActionPerformed

    private void txtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVeActionPerformed

    private void txtNgayNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayNhanActionPerformed

    private void txtViTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViTriActionPerformed

    private void txtKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhuVucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhuVucActionPerformed

    private void txtGioNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioNhanActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        ArrayList<NhapXeDTO> list = TraXeDAO.veXe();
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[8];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        txtBienSo.setText("");
        txtGioNhan.setText("");
        txtKhuVuc.setText("");
        txtLoaiXe.setText("");
        txtMaVe.setText("");
        txtMauXe.setText("");
        txtNgayNhan.setText("");
        txtViTri.setText("");
        txtTimKiem.setText("");
        loadTabel();
    }//GEN-LAST:event_btnLamMoiActionPerformed
 private void cbxTimKiemItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        cbxTimKiem = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbxTimKiem.getSelectedItem().equals("Theo biển số")) {

            }
        }
    }
    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
//       new FHoaDon().setVisible(true);
    String vexe = txtMaVe.getText();
        FHoaDon hd = new FHoaDon(vexe);
        hd.setVisible(true);
    }//GEN-LAST:event_btnInHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTTXe;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbxTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtGioNhan;
    private javax.swing.JTextField txtKhuVuc;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtMauXe;
    private javax.swing.JTextField txtNgayNhan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables
}

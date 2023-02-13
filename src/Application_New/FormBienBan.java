package Application_New;

import DAO.BienBanDAO;
import DAO.DangKyVeThangDAO;
import DAO.TongXeDAO;
import DAO.TraXeDAO;
import DTO.BienBanDTO;
import DTO.DKVeThangDTO;
import DTO.NhapXeDTO;
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FormBienBan extends javax.swing.JPanel {

    private String tenNhanVien;

    public FormBienBan(String tenNV) {
        initComponents();
        showTable();
        loadTabel();
        this.tenNhanVien = tenNV;
    }

    private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"STT", "Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Vé", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"});
        TableBienBan.setModel(tblModel);
        TableBienBan.setRowHeight(15);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 9; i++) {
            TableBienBan.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public void loadTabel() {
        DefaultTableModel tblModel = (DefaultTableModel) TableBienBan.getModel();
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        ArrayList<NhapXeDTO> list = TraXeDAO.veXe();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
            row[1] = list.get(i).getLoaiXe();
            row[2] = list.get(i).getBienSo();
            row[3] = list.get(i).getMauXe();
            row[4] = list.get(i).getMaVe();
            row[5] = list.get(i).getKhuVuc();
            row[6] = list.get(i).getViTri();
            row[7] = list.get(i).getNgayGui();
            row[8] = list.get(i).getGioGui();
            tblModel.addRow(row);
        }
        TableBienBan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableBienBan.getSelectedRow() >= 0) {
                    String a = (String) TableBienBan.getValueAt(TableBienBan.getSelectedRow(), 4);
                    if (a.contains("VT")) {
                        DangKyVeThangDAO func = new DangKyVeThangDAO();
                        DKVeThangDTO getData = func.getDataToBienBan(a);
                        if (getData != null) {
                            txtTenKhachHang.setText(getData.getTenKhach());
                            txtDienThoai.setText(getData.getSdt());
                        }
                        txtLoaiVe.setText("Vé Tháng");
                    } else {
                        txtTenKhachHang.setText("");
                        txtDienThoai.setText("");
                        txtLoaiVe.setText("Vé Ngày");
                    }
                    txtLoaiXe.setText((String) TableBienBan.getValueAt(TableBienBan.getSelectedRow(), 1));
                    txtBienSo.setText((String) TableBienBan.getValueAt(TableBienBan.getSelectedRow(), 2));
                    txtMaVe.setText((String) TableBienBan.getValueAt(TableBienBan.getSelectedRow(), 4));

                }
            }
        });
    }

    public void search(String str) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) TableBienBan.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
        TableBienBan.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public BienBanDTO getData() {
        BienBanDTO ac = new BienBanDTO();
        ac.setMaVe(txtMaVe.getText());
        ac.setTenKhachHang(txtTenKhachHang.getText());
        ac.setSdt(txtDienThoai.getText());
        ac.setBienSo(txtBienSo.getText());
        ac.setLoaiXe(txtLoaiXe.getText());
        ac.setLoaiVe(txtLoaiVe.getText());
        ac.setNgayLap(LocalDate.now());
        return ac;
    }
    
    private void emtpyText(){
        txtTimKiem.setText("");
        txtTenKhachHang.setText("");
        txtDienThoai.setText("");
        txtLoaiVe.setText("");
        txtMaVe.setText("");
        txtBienSo.setText("");
        txtLoaiXe.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtLoaiVe = new javax.swing.JTextField();
        txtMaVe = new javax.swing.JTextField();
        btnXuat = new javax.swing.JButton();
        txtBienSo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLoaiXe = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBienBan = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTimKiem = new swing.SearchText();
        btnLamMoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên khách hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Số điện thoại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Loại vé");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Mã vé");

        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });

        txtLoaiVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiVeActionPerformed(evt);
            }
        });

        txtMaVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVeActionPerformed(evt);
            }
        });

        btnXuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXuat.setForeground(new java.awt.Color(88, 103, 229));
        btnXuat.setText("Xuất biên bản");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        txtBienSo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Biển số xe");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Loại xe");

        txtLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiXeActionPerformed(evt);
            }
        });

        txtDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDienThoaiActionPerformed(evt);
            }
        });

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

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(88, 103, 229));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-search-35.png"))); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(88, 103, 229));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDienThoai)
                    .addComponent(txtLoaiVe)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaVe)
                                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaVe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtLoaiVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiVeActionPerformed

    private void txtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVeActionPerformed

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        if (txtBienSo.getText().isBlank()
                || txtDienThoai.getText().isBlank()
                || txtLoaiVe.getText().isBlank()
                || txtMaVe.getText().isBlank()
                || txtLoaiXe.getText().isBlank()
                || txtTenKhachHang.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin!");
        } else {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("dd");
            SimpleDateFormat s1 = new SimpleDateFormat("MM");
            SimpleDateFormat s2 = new SimpleDateFormat("yyyy");
            String path = "D:\\";
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path + "" + "BienBan.pdf"));
                doc.open();

                Font fontNomal = new Font(FontFamily.TIMES_ROMAN, 18, Font.NORMAL, BaseColor.BLACK);
                Font fontBold = new Font(FontFamily.TIMES_ROMAN, 23, Font.BOLD, BaseColor.BLACK);
                Font fontBold1 = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
                Font fontItalic = new Font(FontFamily.TIMES_ROMAN, 18, Font.ITALIC, BaseColor.BLACK);
                Paragraph paragraph = new Paragraph("CONG HOA XA HOI CHU NGHIA VIET NAM\n", fontBold);
                paragraph.setAlignment(Element.ALIGN_CENTER);
                doc.add(paragraph);

                Paragraph paragraph1 = new Paragraph("Doc lap – Tu do – Hanh phuc\n", fontBold);
                paragraph1.setAlignment(Element.ALIGN_CENTER);
                doc.add(paragraph1);

                Paragraph paragraph2 = new Paragraph("————o0o———\n\n", fontBold);
                paragraph2.setAlignment(Element.ALIGN_CENTER);
                doc.add(paragraph2);

                Paragraph paragraph3 = new Paragraph("Ha Noi, ngay " + s.format(d).toString() + " thang " + s1.format(d).toString() + " nam " + s2.format(d).toString() + "\n\n", fontNomal);
                paragraph3.setAlignment(Element.ALIGN_RIGHT);
                doc.add(paragraph3);

                Paragraph paragraph4 = new Paragraph("BIEN BAN MAT VE XE\n\n", fontBold);
                paragraph4.setAlignment(Element.ALIGN_CENTER);
                doc.add(paragraph4);

                Paragraph paragraph5 = new Paragraph("Chung toi gom:\n", fontBold1);
                paragraph5.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph5);

                Paragraph paragraph6 = new Paragraph("Ong (ba): " + this.tenNhanVien + " Chuc vu: Nhan vien.\n\n", fontNomal);
                paragraph6.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph6);

                Paragraph paragraph7 = new Paragraph("Cung tien hanh lap bien ban ve viec mat ve xe doi voi nguoi su dung xe:\n", fontBold1);
                paragraph7.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph7);

                Paragraph paragraph8 = new Paragraph("Ong (ba): " + txtTenKhachHang.getText() + ".\n", fontNomal);
                paragraph8.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph8);

                Paragraph paragraph9 = new Paragraph("Dien thoai: " + txtDienThoai.getText() + ".\n\n", fontNomal);
                paragraph9.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph9);

                Paragraph paragraph10 = new Paragraph("Noi dung:\n", fontBold1);
                paragraph10.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph10);

                Paragraph paragraph11 = new Paragraph("1. Ma the bi mat: " + txtMaVe.getText() + ".\n", fontNomal);
                paragraph11.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph11);

                Paragraph paragraph16 = new Paragraph("2. Loai the: " + txtLoaiVe.getText() + ".\n", fontNomal);
                paragraph16.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph16);

                Paragraph paragraph14 = new Paragraph("3. Bien so: " + txtBienSo.getText() + ".\n", fontNomal);
                paragraph14.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph14);

                Paragraph paragraph15 = new Paragraph("4. Loai xe: " + txtLoaiXe.getText() + ".\n\n", fontNomal);
                paragraph15.setAlignment(Element.ALIGN_LEFT);
                doc.add(paragraph15);

                Paragraph paragraph12 = new Paragraph("NGUOI LAM MAT VE XE\n", fontBold1);
                paragraph12.setAlignment(Element.ALIGN_RIGHT);
                doc.add(paragraph12);

                Paragraph paragraph13 = new Paragraph("(Ki va ghi ro ho ten)\n", fontItalic);
                paragraph13.setAlignment(Element.ALIGN_RIGHT);
                doc.add(paragraph13);

                BienBanDTO data = getData();
                BienBanDAO b = new BienBanDAO();

                TongXeDAO txa = new TongXeDAO();
                String bienSo = txtBienSo.getText();
                if (txa.xoaXekhoibai(bienSo) > 0) {
                    b.addBienBan(data);
                }
                emtpyText();
                loadTabel();
                JOptionPane.showMessageDialog(this, "Xuất file thành công");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            doc.close();
        }
    }//GEN-LAST:event_btnXuatActionPerformed

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void txtLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiXeActionPerformed

    private void txtDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDienThoaiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        emtpyText();
        loadTabel();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) TableBienBan.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        TraXeDAO tx = new TraXeDAO();
        NhapXeDTO nx = tx.findXebyBienso(txtTimKiem.getText());
        if (nx != null) {
            for (int i = 0; i < 1; i++) {
                row[0] = 1;
                row[1] = nx.getLoaiXe();
                row[2] = nx.getBienSo();
                row[3] = nx.getMauXe();
                row[4] = nx.getMaVe();
                row[5] = nx.getKhuVuc();
                row[6] = nx.getViTri();
                row[7] = nx.getNgayGui();
                row[8] = nx.getGioGui();
                tblModel.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy xe có biển số " + txtTimKiem.getText() + " \nVui lòng nhập lại biển số");
            loadTabel();
            txtTimKiem.setText("");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBienBan;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtLoaiVe;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtTenKhachHang;
    private swing.SearchText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

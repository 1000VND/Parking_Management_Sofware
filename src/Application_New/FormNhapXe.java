package Application_New;

import Component.Header;
import DAO.NhapXeDAO;
import DAO.TraXeDAO;
import DTO.NhapXeDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FormNhapXe extends javax.swing.JPanel {

    private String vexe;
    private FormHoaDonXuat hd;

    public FormNhapXe() {
        initComponents();
        autoDate();
        autoTime();
        loadChonVe();
        loadLoaiXe();
        showTable();
        loadTabel();
        loadMave(cbxLoaive.getSelectedItem().toString());
        loadcbxKhuVuc(cbxLoaiXe.getSelectedItem().toString(), cbxLoaive.getSelectedItem().toString());
        loadcbxViTri(cbxLoaive.getSelectedItem().toString());
    }
    
    private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"STT", "Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Vé", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"});
        TableTTXe.setModel(tblModel);
        TableTTXe.setRowHeight(15);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 9; i++) {
            TableTTXe.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public void loadTabel() {
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
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
    }

    public void search(String str) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) TableTTXe.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
        TableTTXe.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    private void autoDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        txtNgaynhan.setText(s.format(d));
    }

    private void autoTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                txtGionhan.setText(s.format(d));
            }
        }).start();
    }

    private void loadChonVe() {
        ArrayList<String> list = NhapXeDAO.LoadComboBoxChonVe();
        cbxLoaive.removeAllItems();
        for (String item : list) {
            cbxLoaive.addItem(item.toString());
        }
    }

    private void loadMave(String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadComboBoxMaVe(loaive);
        cbxMave.removeAllItems();
        for (String item : list) {
            cbxMave.addItem(item.toString());
        }
    }

    private void loadLoaiXe() {
        ArrayList<String> list = NhapXeDAO.LoadcbxLoaiXe();
        cbxLoaiXe.removeAllItems();
        for (String item : list) {
            cbxLoaiXe.addItem(item.toString());
        }
    }

    private void loadcbxKhuVuc(String loaixe, String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadcbxKhuVuc(loaixe, loaive);
        cbxKhuVuc.removeAllItems();
        for (String item : list) {
            cbxKhuVuc.addItem(item.toString());
        }
    }

    private void loadcbxViTri(String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadcbxViTri(loaive);
        cbxViTri.removeAllItems();
        for (String item : list) {
            cbxViTri.addItem(item.toString());
        }
    }

    public NhapXeDTO addXe() {
        NhapXeDTO themxe = new NhapXeDTO();
        themxe.setBienSo(txtBienso.getText());
        themxe.setLoaiXe(cbxLoaiXe.getSelectedItem().toString());
        themxe.setLoaiVe(cbxLoaive.getSelectedItem().toString());
        themxe.setMaVe(cbxMave.getSelectedItem().toString());
        themxe.setMauXe(txtMauxe.getText());
        themxe.setKhuVuc(cbxKhuVuc.getSelectedItem().toString());
        if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
            themxe.setViTri("");
        } else {
            themxe.setViTri(cbxViTri.getSelectedItem().toString());
        }
        themxe.setNgayGui(LocalDate.parse(txtNgaynhan.getText()));
        themxe.setGioGui(txtGionhan.getText());
        return themxe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxLoaive = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxMave = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBienso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMauxe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxLoaiXe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxKhuVuc = new javax.swing.JComboBox<>();
        cbxViTri = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNgaynhan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGionhan = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        cbxTimKiem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTTXe = new javax.swing.JTable();
        btnInHoaDon = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTimKiem = new swing.SearchText();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(988, 489));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(988, 489));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Loại Vé : ");

        cbxLoaive.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxLoaive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoaive.setBorder(null);
        cbxLoaive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaive.setFocusable(false);
        cbxLoaive.setName("cbxLoaive"); // NOI18N
        cbxLoaive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiveItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mã Vé : ");

        cbxMave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxMave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMave.setBorder(null);
        cbxMave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMave.setFocusable(false);
        cbxMave.setName("cbxMave"); // NOI18N
        cbxMave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMaveItemStateChanged(evt);
            }
        });
        cbxMave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biển Số Xe :");

        txtBienso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBienso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBienso.setName("txtBienso"); // NOI18N
        txtBienso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBiensoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Màu Xe :");

        txtMauxe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMauxe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMauxe.setName("txtMauxe"); // NOI18N
        txtMauxe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMauxeKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Loại Xe :");

        cbxLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoaiXe.setBorder(null);
        cbxLoaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaiXe.setFocusable(false);
        cbxLoaiXe.setName("cbxLoaiXe"); // NOI18N
        cbxLoaiXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiXeItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Khu Vực :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Vị Trí :");
        jLabel7.setToolTipText("");

        cbxKhuVuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxKhuVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxKhuVuc.setBorder(null);
        cbxKhuVuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxKhuVuc.setFocusable(false);
        cbxKhuVuc.setName("cbxKhuVuc"); // NOI18N

        cbxViTri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxViTri.setBorder(null);
        cbxViTri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxViTri.setFocusable(false);
        cbxViTri.setName("cbxViTri"); // NOI18N
        cbxViTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxViTriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Ngày Nhận :");

        txtNgaynhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaynhan.setName("txtNgaynhan"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Giờ Nhận :");

        txtGionhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGionhan.setName("txtGionhan"); // NOI18N

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(88, 103, 229));
        btnXacNhan.setText("Nhập xe");
        btnXacNhan.setBorder(null);
        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.setName("btnXacNhan"); // NOI18N
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(88, 103, 229));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        cbxTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo biển số", "Theo mã vé" }));

        TableTTXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(TableTTXe);

        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInHoaDon.setForeground(new java.awt.Color(116, 167, 69));
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.setBorder(null);
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(88, 103, 229));
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application_New/IconImage/icons8-search-35.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(8, 8, 8)
                                        .addComponent(cbxLoaive, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbxMave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMauxe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBienso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGionhan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTimKiem)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cbxLoaive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6)
                            .addComponent(cbxKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbxMave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMauxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBienso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cbxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtGionhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoaiXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiXeItemStateChanged
        cbxLoaiXe = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String loaixe = cbxLoaiXe.getSelectedItem().toString();
            String loaive = cbxLoaive.getSelectedItem().toString();
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Ngày")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    loadcbxKhuVuc("Ô tô", loaive);
                    loadcbxViTri(loaive);
                    cbxViTri.setEnabled(true);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    loadcbxKhuVuc("Xe máy", loaive);
                    cbxViTri.setEnabled(false);
                    cbxViTri.removeAllItems();
                }
            } else if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    loadcbxKhuVuc("Ô tô", loaive);
                    loadcbxViTri(loaive);
                    cbxViTri.setEnabled(true);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    loadcbxKhuVuc("Xe máy", loaive);
                    cbxViTri.setEnabled(false);
                    cbxViTri.removeAllItems();
                }
            }
        }
    }//GEN-LAST:event_cbxLoaiXeItemStateChanged

    private void cbxLoaiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiveItemStateChanged
        cbxLoaive = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String loaixe = cbxLoaiXe.getSelectedItem().toString();
            String loaive = cbxLoaive.getSelectedItem().toString();
            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Ngày")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    cbxLoaiXe.setEnabled(true);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(true);
                    txtMauxe.setEnabled(true);
                    txtBienso.setText("");
                    txtMauxe.setText("");
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadMave(loaive);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    cbxLoaiXe.setEnabled(true);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(true);
                    txtMauxe.setEnabled(true);
                    txtBienso.setText("");
                    txtMauxe.setText("");
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadcbxViTri(loaive);
                    loadMave(loaive);
                }
            } else if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    cbxLoaiXe.setEnabled(false);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(false);
                    txtMauxe.setEnabled(false);
                    txtBienso.setDisabledTextColor(Color.black);
                    txtMauxe.setDisabledTextColor(Color.black);
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadMave(loaive);
                    loadcbxKhuVuc(loaixe, loaive);
                    loadcbxViTri(loaive);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    cbxLoaiXe.setEnabled(false);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(false);
                    txtMauxe.setEnabled(false);
                    txtBienso.setDisabledTextColor(Color.black);
                    txtMauxe.setDisabledTextColor(Color.black);
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadMave(loaive);
                }
            }
        }
    }//GEN-LAST:event_cbxLoaiveItemStateChanged

    private void cbxMaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMaveItemStateChanged
        cbxMave = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                String loaive = cbxLoaive.getSelectedItem().toString();
                String loaixe = cbxLoaiXe.getSelectedItem().toString();
                String mave = cbxMave.getSelectedItem().toString();
                NhapXeDAO nxa = new NhapXeDAO();
                NhapXeDTO nxt = nxa.load2Text(mave);
                if (nxt != null) {
                    txtBienso.setText(nxt.getBienSo());
                    txtMauxe.setText(nxt.getMauXe());
                    cbxLoaiXe.setSelectedItem(nxt.getLoaiXe());
                    if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                        loadcbxViTri(loaive);
                    }
                }
            }
        }
    }//GEN-LAST:event_cbxMaveItemStateChanged

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        try {
            if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                if (txtBienso.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                } else {
                    String checkBienso = txtBienso.getText();
                    String loaive = cbxLoaive.getSelectedItem().toString();
                    String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                    String loaixe = cbxLoaiXe.getSelectedItem().toString();
                    NhapXeDAO nx = new NhapXeDAO();
                    NhapXeDTO checkxe = nx.checkBien(checkBienso);
                    if (checkxe != null) {
                        JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                        txtBienso.setText("");
                    } else {
                        NhapXeDTO themxe = addXe();
                        if (nx.ThemXe(themxe) > 0) {
                            JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                            loadMave(checkBienso);
                            loadLoaiXe();
                            loadChonVe();
                            loadcbxKhuVuc(loaixe, loaive);
                            loadcbxViTri(loaive);
                            txtBienso.setText("");
                            txtMauxe.setText("");
                            loadTabel();
                        } else {
                            JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                        }
                    }
                }
            } else {
                if (txtBienso.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                } else {
                    String checkBienso = txtBienso.getText();
                    NhapXeDAO nx = new NhapXeDAO();
                    NhapXeDTO checkxe = nx.checkBien(checkBienso);
                    if (checkxe != null) {
                        JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                        txtBienso.setText("");
                    } else {
                        NhapXeDTO themxe = addXe();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        if (nx.ThemXe(themxe) > 0) {
                            JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                            loadMave(checkBienso);
                            loadLoaiXe();
                            loadChonVe();
                            loadcbxKhuVuc(loaixe, loaive);
                            loadcbxViTri(loaive);
                            txtBienso.setText("");
                            txtMauxe.setText("");
                            loadTabel();
                        } else {
                            JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtBiensoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBiensoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();
                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                } else {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            String loaive = cbxLoaive.getSelectedItem().toString();
                            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                            String loaixe = cbxLoaiXe.getSelectedItem().toString();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();
                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtBiensoKeyPressed

    private void txtMauxeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMauxeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                } else {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            String loaive = cbxLoaive.getSelectedItem().toString();
                            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                            String loaixe = cbxLoaiXe.getSelectedItem().toString();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtMauxeKeyPressed

    private void cbxMaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtTimKiem.setText("");
        loadTabel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[9];
        if (cbxTimKiem.getSelectedItem().toString().equals("Theo biển số")) {
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
        } else {
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            TraXeDAO tx = new TraXeDAO();
            NhapXeDTO nx = tx.findXebyMave(txtTimKiem.getText());
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
                JOptionPane.showMessageDialog(this, "Không tìm thấy vé xe " + txtTimKiem.getText() + " \nVui lòng nhập mã vé");
                loadTabel();
                txtTimKiem.setText("");
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        int index = TableTTXe.getSelectedRow();
        if (index >= 0) {
            vexe = (String) TableTTXe.getValueAt(index, 4).toString();
            hd = new FormHoaDonXuat(vexe);
            hd.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn bản ghi nào");
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void cbxViTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxViTriActionPerformed
    }//GEN-LAST:event_cbxViTriActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTTXe;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbxKhuVuc;
    private javax.swing.JComboBox<String> cbxLoaiXe;
    private javax.swing.JComboBox<String> cbxLoaive;
    private javax.swing.JComboBox<String> cbxMave;
    private javax.swing.JComboBox<String> cbxTimKiem;
    private javax.swing.JComboBox<String> cbxViTri;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtBienso;
    private javax.swing.JTextField txtGionhan;
    private javax.swing.JTextField txtMauxe;
    private javax.swing.JTextField txtNgaynhan;
    private swing.SearchText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

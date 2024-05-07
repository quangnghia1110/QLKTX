/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import Dao.DutyScheduleDAO;
import View.Admin.FormThemLichTruc;
import javax.swing.*;
import java.awt.event.*;
import Database.DatabaseHelpper;
import Model.DutySchedule;
import View.Notification.ConfirmAcceptRegisterRoom;
import View.Notification.SuccessfulExportAndImport;
import java.awt.Color;
import java.util.Date;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author levan
 */
public class LichTruc extends javax.swing.JPanel {

    /**
     * Creates new form LichTruc2
     */
    public LichTruc() {
        initComponents();
        initComponents();
        loadData();
        fitContentOfTable(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannel_LichTruc = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelRound13 = new Handle.PanelRound();
        panelRound14 = new Handle.PanelRound();
        panelRound15 = new Handle.PanelRound();
        panelRound16 = new Handle.PanelRound();
        btnTaoLichTruc = new javax.swing.JLabel();
        panelRound10 = new Handle.PanelRound();
        panelRound2 = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        panelRound6 = new Handle.PanelRound();
        btnSuaLichTruc = new javax.swing.JLabel();
        panelRound12 = new Handle.PanelRound();
        panelRound4 = new Handle.PanelRound();
        panelRound9 = new Handle.PanelRound();
        panelRound7 = new Handle.PanelRound();
        btnXoaLichTruc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRound5 = new Handle.PanelRound();
        panelRound1 = new Handle.PanelRound();
        btnTimKiem = new javax.swing.JLabel();
        panelRound17 = new Handle.PanelRound();
        maLichTruc = new javax.swing.JTextField();

        pannel_LichTruc.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        panelRound13.setBackground(new java.awt.Color(17, 144, 119));
        panelRound13.setRoundBottomLeft(20);
        panelRound13.setRoundBottomRight(20);
        panelRound13.setRoundTopLeft(20);
        panelRound13.setRoundTopRight(20);
        panelRound13.setLayout(new java.awt.CardLayout(5, 5));

        panelRound14.setBackground(new java.awt.Color(35, 45, 63));
        panelRound14.setRoundBottomLeft(20);
        panelRound14.setRoundBottomRight(20);
        panelRound14.setRoundTopLeft(20);
        panelRound14.setRoundTopRight(20);
        panelRound14.setLayout(new java.awt.CardLayout());

        panelRound15.setBackground(new java.awt.Color(255, 255, 255));
        panelRound15.setRoundBottomLeft(10);
        panelRound15.setRoundBottomRight(10);
        panelRound15.setRoundTopLeft(10);
        panelRound15.setRoundTopRight(10);
        panelRound15.setLayout(new java.awt.CardLayout(5, 5));

        panelRound16.setBackground(new java.awt.Color(17, 144, 119));
        panelRound16.setRoundBottomLeft(10);
        panelRound16.setRoundBottomRight(10);
        panelRound16.setRoundTopLeft(10);
        panelRound16.setRoundTopRight(10);

        btnTaoLichTruc.setBackground(new java.awt.Color(17, 144, 119));
        btnTaoLichTruc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaoLichTruc.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoLichTruc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTaoLichTruc.setText("Tạo");
        btnTaoLichTruc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaoLichTruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoLichTrucMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound16Layout = new javax.swing.GroupLayout(panelRound16);
        panelRound16.setLayout(panelRound16Layout);
        panelRound16Layout.setHorizontalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTaoLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound16Layout.setVerticalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTaoLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound15.add(panelRound16, "card2");

        panelRound14.add(panelRound15, "card2");

        panelRound13.add(panelRound14, "card2");

        jPanel4.add(panelRound13);

        panelRound10.setBackground(new java.awt.Color(17, 144, 119));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(20);
        panelRound10.setRoundTopRight(20);
        panelRound10.setLayout(new java.awt.CardLayout(5, 5));

        panelRound2.setBackground(new java.awt.Color(35, 45, 63));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new java.awt.CardLayout());

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomLeft(10);
        panelRound8.setRoundBottomRight(10);
        panelRound8.setRoundTopLeft(10);
        panelRound8.setRoundTopRight(10);
        panelRound8.setLayout(new java.awt.CardLayout(5, 5));

        panelRound6.setBackground(new java.awt.Color(17, 144, 119));
        panelRound6.setRoundBottomLeft(10);
        panelRound6.setRoundBottomRight(10);
        panelRound6.setRoundTopLeft(10);
        panelRound6.setRoundTopRight(10);

        btnSuaLichTruc.setBackground(new java.awt.Color(17, 144, 119));
        btnSuaLichTruc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaLichTruc.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaLichTruc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSuaLichTruc.setText("Sửa");
        btnSuaLichTruc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaLichTruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaLichTrucMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSuaLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSuaLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound8.add(panelRound6, "card2");

        panelRound2.add(panelRound8, "card2");

        panelRound10.add(panelRound2, "card2");

        jPanel4.add(panelRound10);

        panelRound12.setBackground(new java.awt.Color(17, 144, 119));
        panelRound12.setRoundBottomLeft(20);
        panelRound12.setRoundBottomRight(20);
        panelRound12.setRoundTopLeft(20);
        panelRound12.setRoundTopRight(20);
        panelRound12.setLayout(new java.awt.CardLayout(5, 5));

        panelRound4.setBackground(new java.awt.Color(35, 45, 63));
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(new java.awt.CardLayout());

        panelRound9.setBackground(new java.awt.Color(255, 255, 255));
        panelRound9.setRoundBottomLeft(10);
        panelRound9.setRoundBottomRight(10);
        panelRound9.setRoundTopLeft(10);
        panelRound9.setRoundTopRight(10);
        panelRound9.setLayout(new java.awt.CardLayout(5, 5));

        panelRound7.setBackground(new java.awt.Color(17, 144, 119));
        panelRound7.setRoundBottomLeft(10);
        panelRound7.setRoundBottomRight(10);
        panelRound7.setRoundTopLeft(10);
        panelRound7.setRoundTopRight(10);

        btnXoaLichTruc.setBackground(new java.awt.Color(17, 144, 119));
        btnXoaLichTruc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaLichTruc.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLichTruc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnXoaLichTruc.setText("Xóa");
        btnXoaLichTruc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaLichTruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaLichTrucMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnXoaLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnXoaLichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound9.add(panelRound7, "card2");

        panelRound4.add(panelRound9, "card2");

        panelRound12.add(panelRound4, "card2");

        jPanel4.add(panelRound12);

        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trực", "Mã sinh viên trực", "Ngày trực", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAlignmentY(0.0F);
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(17, 144, 119));
        table.setShowGrid(true);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(17, 144, 119));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LỊCH TRỰC");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 144, 119)));
        jLabel1.setPreferredSize(new java.awt.Dimension(315, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 5));

        panelRound5.setBackground(new java.awt.Color(17, 144, 119));
        panelRound5.setPreferredSize(new java.awt.Dimension(250, 50));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new java.awt.CardLayout(5, 5));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new java.awt.BorderLayout());

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/findingIcon.png"))); // NOI18N
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        panelRound1.add(btnTimKiem, java.awt.BorderLayout.LINE_START);

        panelRound17.setBackground(new java.awt.Color(255, 255, 255));
        panelRound17.setPreferredSize(new java.awt.Dimension(53, 35));
        panelRound17.setRoundBottomLeft(40);
        panelRound17.setRoundBottomRight(40);
        panelRound17.setRoundTopLeft(40);
        panelRound17.setRoundTopRight(40);

        javax.swing.GroupLayout panelRound17Layout = new javax.swing.GroupLayout(panelRound17);
        panelRound17.setLayout(panelRound17Layout);
        panelRound17Layout.setHorizontalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        panelRound17Layout.setVerticalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelRound1.add(panelRound17, java.awt.BorderLayout.LINE_END);

        maLichTruc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        maLichTruc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maLichTruc.setBorder(null);
        maLichTruc.setPreferredSize(new java.awt.Dimension(175, 20));
        maLichTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maLichTrucActionPerformed(evt);
            }
        });
        panelRound1.add(maLichTruc, java.awt.BorderLayout.CENTER);

        panelRound5.add(panelRound1, "card2");

        jPanel3.add(panelRound5);

        javax.swing.GroupLayout pannel_LichTrucLayout = new javax.swing.GroupLayout(pannel_LichTruc);
        pannel_LichTruc.setLayout(pannel_LichTrucLayout);
        pannel_LichTrucLayout.setHorizontalGroup(
            pannel_LichTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_LichTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannel_LichTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pannel_LichTrucLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
                .addContainerGap())
        );
        pannel_LichTrucLayout.setVerticalGroup(
            pannel_LichTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_LichTrucLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pannel_LichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pannel_LichTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maLichTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maLichTrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maLichTrucActionPerformed

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        String maLichTrucText = maLichTruc.getText().trim();

        if (!maLichTrucText.isEmpty()) { // Kiểm tra xem có nhập mã lịch trực hay không
            try {
                int maLichTruc = Integer.parseInt(maLichTrucText);
                DutyScheduleDAO dutyScheduleDAO = new DutyScheduleDAO();
                List<DutySchedule> schedules = dutyScheduleDAO.filterByScheduleId(maLichTruc);
                if (!schedules.isEmpty()) {
                    // Hiển thị kết quả tìm kiếm trên bảng
                    displayScheduleTable(schedules);
                } else {
                    // Hiển thị thông báo nếu không tìm thấy kết quả
                    SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Không tìm thấy lịch trực với mã " + maLichTruc);
                    showDialog.setVisible(true);
                }
            } catch (NumberFormatException e) {
                // Xử lý nếu không nhập mã lịch trực hợp lệ
                SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Mã lịch trực phải là một số nguyên.");
                showDialog.setVisible(true);
            }
        } else {
            // Hiển thị thông báo nếu không nhập mã lịch trực
            loadData();
//            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Vui lòng nhập mã lịch trực!");
//            showDialog.setVisible(true);
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnXoaLichTrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaLichTrucMouseClicked
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int scheduleId = (int) table.getValueAt(selectedRow, 0); // Chuyển đổi kiểu dữ liệu từ Object sang int

            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa lịch trực này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DutyScheduleDAO dutyScheduleDAO = new DutyScheduleDAO();
                boolean deleted = dutyScheduleDAO.deleteDutySchedule(scheduleId);
                if (deleted) {
                    SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Xóa lịch trực thành công!");
                    showDialog.setVisible(true);
                    loadData(); // Cập nhật bảng sau khi xóa
                } else {
                    SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Xóa lịch trực thất bại!");
                    showDialog.setVisible(true);
                }
            }
        } else {
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Vui lòng chọn lịch trực muốn xóa!");
            showDialog.setVisible(true);
        }
    }//GEN-LAST:event_btnXoaLichTrucMouseClicked

    private void btnSuaLichTrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaLichTrucMouseClicked
        // Lấy thông tin lịch trực được chọn từ bảng
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy thông tin từ mô hình bảng
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String maLichTruc = model.getValueAt(selectedRow, 0).toString(); // Giả sử cột đầu tiên là mã lịch trực
            String maSinhVienTruc = model.getValueAt(selectedRow, 1).toString(); // Giả sử cột thứ hai là mã sinh viên trực
            Date ngayTruc = (Date) model.getValueAt(selectedRow, 2); // Giả sử cột thứ ba là ngày trực
            String moTa = model.getValueAt(selectedRow, 3).toString(); // Giả sử cột thứ tư là mô tả

            // Hiển thị cửa sổ hoặc form để sửa thông tin
            FormSuaLichTruc form = new FormSuaLichTruc();
            form.setData(maLichTruc, maSinhVienTruc, ngayTruc, moTa); // Truyền dữ liệu vào form
            form.setVisible(true);
            
        } else {
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Vui lòng chọn lịch trực muốn sửa!");
            showDialog.setVisible(true);
        }
        
    }//GEN-LAST:event_btnSuaLichTrucMouseClicked

    private void btnTaoLichTrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoLichTrucMouseClicked
        // Mở form để thêm lịch trực
        FormThemLichTruc form = new FormThemLichTruc();
        form.setReferencePanel(this);
        form.setVisible(true);
        fitContentOfTable(table);
    }//GEN-LAST:event_btnTaoLichTrucMouseClicked

    public void fitContentOfTable(JTable table) {
        for (int col = 0; col < table.getColumnCount(); col++) {
            int maxWid = 0;
            for (int row = 0; row < table.getRowCount(); row++) {
                int cellWid = table.prepareRenderer(table.getCellRenderer(row, col), row, col).getPreferredSize().width;
                maxWid = Math.max(maxWid, cellWid);
            }
            table.getColumnModel().getColumn(col).setPreferredWidth(maxWid + 10);
        }
        table.setBackground(Color.white);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setFillsViewportHeight(true);
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        int[] column = {0, 1, 2, 3};
        for (int i = 0; i < column.length; i++) {
            table.getColumnModel().getColumn(column[i]).setCellRenderer(centerRenderer);
        }
    }

    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trong bảng
        DutyScheduleDAO dutyScheduleDAO = new DutyScheduleDAO();
        ArrayList<DutySchedule> schedules = dutyScheduleDAO.getListSchedule();
        if (schedules.isEmpty()) {

            Object[] rowData = {"Danh sách trống", "", "", ""};
            model.addRow(rowData);

        } else {
            for (DutySchedule schedule : schedules) {
                Object[] rowData = {schedule.getScheduleId(), schedule.getStudentId(), schedule.getScheduleDate(), schedule.getDescription()};
                model.addRow(rowData);
            }
        }
    }

    // Phương thức để hiển thị kết quả tìm kiếm lên bảng
    private void displayScheduleTable(List<DutySchedule> schedules) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa tất cả các dòng trong bảng trước khi hiển thị kết quả tìm kiếm mới
        for (DutySchedule schedule : schedules) {
            model.addRow(new Object[]{
                schedule.getScheduleId(),
                schedule.getStudentId(),
                schedule.getScheduleDate(),
                schedule.getDescription(),});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSuaLichTruc;
    private javax.swing.JLabel btnTaoLichTruc;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JLabel btnXoaLichTruc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maLichTruc;
    private Handle.PanelRound panelRound1;
    private Handle.PanelRound panelRound10;
    private Handle.PanelRound panelRound12;
    private Handle.PanelRound panelRound13;
    private Handle.PanelRound panelRound14;
    private Handle.PanelRound panelRound15;
    private Handle.PanelRound panelRound16;
    private Handle.PanelRound panelRound17;
    private Handle.PanelRound panelRound2;
    private Handle.PanelRound panelRound4;
    private Handle.PanelRound panelRound5;
    private Handle.PanelRound panelRound6;
    private Handle.PanelRound panelRound7;
    private Handle.PanelRound panelRound8;
    private Handle.PanelRound panelRound9;
    private javax.swing.JPanel pannel_LichTruc;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
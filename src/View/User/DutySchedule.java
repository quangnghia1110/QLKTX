/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.User;

import Dao.DutyScheduleDAO;
import View.Notification.ConfirmRoom;
import java.awt.Label;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.Room;
import Dao.RoomDAO;
import Model.Student;
import Dao.StudentDAO;
import Dao.UserDAO;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Handle.PanelRound;
import View.Notification.SuccessfulExportAndImport;
import java.awt.Color;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
/**
 *
 * @author ADMIN
 */
public class DutySchedule extends javax.swing.JPanel {
private ArrayList<Model.DutySchedule> list;
private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    public DutySchedule(Student student) {
        initComponents();
              this.student = student;

        list = new DutyScheduleDAO().getListSchedule(); 
        fitContentOfTable(table);
    }
    public void fitContentOfTable(JTable table){
        for (int col = 0; col < table.getColumnCount(); col++){
            int maxWid = 0;
            for (int row = 0; row < table.getRowCount(); row++){
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
        int[] column = {0,1,2,3};
        for (int i = 0; i < column.length; i++) {
            table.getColumnModel().getColumn(column[i]).setCellRenderer(centerRenderer);
        }   
    }
    

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        panelRound5 = new Handle.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound11 = new Handle.PanelRound();
        jPanel4 = new javax.swing.JPanel();
        panelRound10 = new Handle.PanelRound();
        panelRound2 = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        panelRound6 = new Handle.PanelRound();
        btnHienThi = new javax.swing.JLabel();
        panelRound12 = new Handle.PanelRound();
        panelRound4 = new Handle.PanelRound();
        panelRound9 = new Handle.PanelRound();
        panelRound7 = new Handle.PanelRound();
        btnExport1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRound3 = new Handle.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout(30, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout(0, 30));

        panelRound5.setBackground(new java.awt.Color(17, 144, 119));
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);
        panelRound5.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN VỀ LỊCH TRỰC");
        jLabel1.setPreferredSize(new java.awt.Dimension(315, 35));
        panelRound5.add(jLabel1, "card2");

        jPanel9.add(panelRound5, java.awt.BorderLayout.PAGE_START);

        panelRound11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound11.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

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

        btnHienThi.setBackground(new java.awt.Color(17, 144, 119));
        btnHienThi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHienThi.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHienThi.setText("Hiển thị");
        btnHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienThiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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

        btnExport1.setBackground(new java.awt.Color(17, 144, 119));
        btnExport1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport1.setForeground(new java.awt.Color(255, 255, 255));
        btnExport1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExport1.setText("Xuất Excel");
        btnExport1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExport1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExport1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound9.add(panelRound7, "card2");

        panelRound4.add(panelRound9, "card2");

        panelRound12.add(panelRound4, "card2");

        jPanel4.add(panelRound12);

        panelRound11.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 5));

        panelRound3.setBackground(new java.awt.Color(17, 144, 119));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(new java.awt.CardLayout());
        jPanel3.add(panelRound3, java.awt.BorderLayout.PAGE_START);

        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trực", "Mã sinh viên", "Ngày trực", "Mô tả"
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
        table.setColumnSelectionAllowed(true);
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(25);
        table.setRowSelectionAllowed(false);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(true);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelRound11.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel9.add(panelRound11, java.awt.BorderLayout.CENTER);

        add(jPanel9, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiMouseClicked
        DutyScheduleDAO dutyScheduleDAO = new DutyScheduleDAO();
        if (student != null) {
            String studentId = student.getId();
            List<Model.DutySchedule> dutySchedules = dutyScheduleDAO.getAll(studentId);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            if (dutySchedules.isEmpty()) {
                Object[] rowData = {"Danh sách trống", "", "", ""};
                model.addRow(rowData);
            } else {
                for (Model.DutySchedule dutySchedule : dutySchedules) {
                    Object[] rowData = {
                        dutySchedule.getScheduleId(),
                        dutySchedule.getStudentId(),
                        dutySchedule.getScheduleDate(),
                        dutySchedule.getDescription()
                    };
                    model.addRow(rowData);
                }
            }
        } else {
            // Handle the case when student is null
            // For example, display an error message
            System.out.println("Error: Student is null");
        }
    }//GEN-LAST:event_btnHienThiMouseClicked

    private void btnExport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExport1MouseClicked
         if (list.isEmpty()) {
        SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách sinh viên trống!");
        emptyList.setVisible(true);
    } else {
        if (student != null) {
            DutyScheduleDAO dutyScheduleDAO = new DutyScheduleDAO(); // Tạo một thể hiện của DutyScheduleDAO
            List<Model.DutySchedule> dutySchedules = dutyScheduleDAO.getAll(student.getId());
            
            if (!dutySchedules.isEmpty()) {
                exportExcelFile(student.getId());
            } else {
                // Xử lý trường hợp danh sách lịch trực của sinh viên trống
                SuccessfulExportAndImport emptyScheduleList = new SuccessfulExportAndImport(null, true, "Danh sách lịch trực của sinh viên trống!");
                emptyScheduleList.setVisible(true);
            }
        } else {
            // Xử lý trường hợp khi student là null
            System.out.println("Error: Student is null");
        }
    }
       }//GEN-LAST:event_btnExport1MouseClicked
    public void exportExcelFile(String studentId) {
    try {
        XSSFWorkbook excelFile = new XSSFWorkbook();
        XSSFSheet sheet = excelFile.createSheet("DANH SÁCH LỊCH TRỰC");

        // Header row
        String[] headers = {"STT", "Mã lịch trực", "Mã sinh viên", "Ngày trực", "Mô tả"};
        Cell cell;
        org.apache.poi.ss.usermodel.Row row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            cell = row.createCell(i, CellType.STRING);
            cell.setCellValue(headers[i]);
        }

        // Data rows
        int rowNum = 1;
        for (Model.DutySchedule schedule : list) {
            // Check if the schedule belongs to the specified studentId
            if (schedule.getStudentId().equals(studentId)) {
                row = sheet.createRow(rowNum++);
                row.createCell(0, CellType.NUMERIC).setCellValue(rowNum - 1); // STT
                row.createCell(1, CellType.NUMERIC).setCellValue(schedule.getScheduleId()); // Mã lịch trực
                row.createCell(2, CellType.STRING).setCellValue(schedule.getStudentId()); // Mã sinh viên
                row.createCell(3, CellType.STRING).setCellValue(schedule.getScheduleDate().toString()); // Ngày trực
                row.createCell(4, CellType.STRING).setCellValue(schedule.getDescription()); // Mô tả
            }
        }

        File file = new File("D:\\Download\\DANH_SACH_LICH_TRUC.xlsx");
        try (FileOutputStream exportedFile = new FileOutputStream(file)) {
            excelFile.write(exportedFile);
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Xuất ra file Excel thành công !");
            showDialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}


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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExport1;
    private javax.swing.JLabel btnHienThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private Handle.PanelRound panelRound10;
    private Handle.PanelRound panelRound11;
    private Handle.PanelRound panelRound12;
    private Handle.PanelRound panelRound2;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound4;
    private Handle.PanelRound panelRound5;
    private Handle.PanelRound panelRound6;
    private Handle.PanelRound panelRound7;
    private Handle.PanelRound panelRound8;
    private Handle.PanelRound panelRound9;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private double getScheduleId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double getStudentId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getScheduleDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

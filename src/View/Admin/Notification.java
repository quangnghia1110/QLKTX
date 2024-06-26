/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import View.User.*;
import Dao.DutyScheduleDAO;
import Dao.MailSinhVienDAO;
import View.Notification.ConfirmRoom;
import java.awt.Label;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.Room;
import Dao.RoomDAO;
import Model.Student;
import Dao.StudentDAO;
import Dao.ThongBaoCaNhanDAO;
import Dao.ThongBaoChungDAO;
import Dao.UserDAO;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Handle.PanelRound;
import Model.User;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author ADMIN
 */
public class Notification extends javax.swing.JPanel {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    private ArrayList<Model.MailSinhVien> list;

    public Notification() {
        initComponents();
        list = new MailSinhVienDAO().getListMail();
        fitContentOfTable(table);
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        panelRound5 = new Handle.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound11 = new Handle.PanelRound();
        jPanel4 = new javax.swing.JPanel();
        panelRound13 = new Handle.PanelRound();
        panelRound14 = new Handle.PanelRound();
        panelRound15 = new Handle.PanelRound();
        panelRound16 = new Handle.PanelRound();
        btnTaoMail = new javax.swing.JLabel();
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
        jLabel1.setText("THÔNG BÁO");
        jLabel1.setPreferredSize(new java.awt.Dimension(315, 35));
        panelRound5.add(jLabel1, "card2");

        jPanel9.add(panelRound5, java.awt.BorderLayout.PAGE_START);

        panelRound11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound11.setLayout(new java.awt.BorderLayout(0, 20));

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

        btnTaoMail.setBackground(new java.awt.Color(17, 144, 119));
        btnTaoMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaoMail.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTaoMail.setText("Tạo Email");
        btnTaoMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaoMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoMailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound16Layout = new javax.swing.GroupLayout(panelRound16);
        panelRound16.setLayout(panelRound16Layout);
        panelRound16Layout.setHorizontalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTaoMail, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound16Layout.setVerticalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTaoMail, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
                "Mã thông báo", "Mã người gửi", "Mã người nhận", "Nội dung", "Ngày gửi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAlignmentY(0.0F);
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
    private String getAdminId() {
        UserDAO userDAO = new UserDAO();
        User adminUser = userDAO.getAdminUser();

        if (adminUser != null && adminUser.getUsername() != null && adminUser.isIsAdmin()) {
            return adminUser.getUsername();
        } else {
            return null;
        }
    }
    private void btnHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiMouseClicked
        MailSinhVienDAO mailSinhVienDAO = new MailSinhVienDAO();
        ThongBaoChungDAO thongBaoChungDAO = new ThongBaoChungDAO();
        ThongBaoCaNhanDAO thongBaoCaNhanDAO = new ThongBaoCaNhanDAO();

        String adminId = getAdminId();
        List<Model.MailSinhVien> mailSinhViens = mailSinhVienDAO.getAllAdmin(adminId);
        List<Model.ThongBaoChung> thongBaoChungs = thongBaoChungDAO.getByAdminId(adminId);
        List<Model.ThongBaoCaNhan> thongBaoCaNhans = thongBaoCaNhanDAO.getByAdminId(adminId);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        if (mailSinhViens.isEmpty() && thongBaoChungs.isEmpty() && thongBaoCaNhans.isEmpty()) {
            Object[] rowData = {"Danh sách trống", "", "", ""};
            model.addRow(rowData);
        } else {
            for (Model.MailSinhVien mailSinhVien : mailSinhViens) {
                Object[] rowData = {
                    mailSinhVien.getIdNotification(),
                    mailSinhVien.getStudentId(),
                    mailSinhVien.getAdminId(),
                    mailSinhVien.getContent(),
                    mailSinhVien.getDate()
                };
                model.addRow(rowData);
            }

            for (Model.ThongBaoChung thongBaoChung : thongBaoChungs) {
                Object[] rowData = {
                    thongBaoChung.getIdNotification(),
                    thongBaoChung.getAdminId(),
                    thongBaoChung.getStudentId(),
                    thongBaoChung.getContent(),
                    thongBaoChung.getDate()
                };
                model.addRow(rowData);
            }

            for (Model.ThongBaoCaNhan thongBaoCaNhan : thongBaoCaNhans) {
                Object[] rowData = {
                    thongBaoCaNhan.getIdNotification(),
                    thongBaoCaNhan.getAdminId(),
                    thongBaoCaNhan.getStudentId(),
                    thongBaoCaNhan.getContent(),
                    thongBaoCaNhan.getDate()
                };
                model.addRow(rowData);
            }
        }
    }//GEN-LAST:event_btnHienThiMouseClicked

    private void btnExport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExport1MouseClicked
        if (list.isEmpty()) {
            SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách sinh viên trống!");
            emptyList.setVisible(true);
        } else {
             String adminId = getAdminId();
            MailSinhVienDAO mailSinhVienDAO = new MailSinhVienDAO();
            List<Model.MailSinhVien> mailSinhViens = mailSinhVienDAO.getAllAdmin(adminId);

            ThongBaoChungDAO thongBaoChungDAO = new ThongBaoChungDAO();
            List<Model.ThongBaoChung> thongBaoChungs = thongBaoChungDAO.getByAdminId(adminId);

            ThongBaoCaNhanDAO thongBaoCaNhanDAO = new ThongBaoCaNhanDAO();
            List<Model.ThongBaoCaNhan> thongBaoCaNhans = thongBaoCaNhanDAO.getByAdminId(adminId);

            // Combine the lists into one
            List<Object> allNotifications = new ArrayList<>();
            allNotifications.addAll(mailSinhViens);
            allNotifications.addAll(thongBaoChungs);
            allNotifications.addAll(thongBaoCaNhans);

            if (!allNotifications.isEmpty()) {
                // Call a method to export all notifications to an Excel file
                exportToExcel(allNotifications);
            } else {
                SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách thông báo của sinh viên trống!");
                emptyList.setVisible(true);
            }
        }
       }//GEN-LAST:event_btnExport1MouseClicked
    public void animationClick(PanelRound panel, String beforeColor) {
        panel.setBackground(new Color(221, 242, 253, 128));
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.decode(beforeColor));
                ((Timer) e.getSource()).stop();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
    private void btnTaoMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoMailMouseClicked
        animationClick(panelRound13, "#119077");
        CreateNotification notification = new CreateNotification(null, true, student);
        notification.setVisible(true);
    }//GEN-LAST:event_btnTaoMailMouseClicked
    private void exportToExcel(List<Object> notifications) {
        Workbook workbookForStudent = new XSSFWorkbook();
        Sheet sheetForStudent = workbookForStudent.createSheet("THÔNG BÁO GỬI ĐẾN SINH VIÊN");

        Workbook workbookForAdmin = new XSSFWorkbook();
        Sheet sheetForAdmin = workbookForAdmin.createSheet("THÔNG BÁO GỬI ĐẾN QUẢN TRỊ VIÊN");

// Create header row for both sheets
        Row headerRowForStudent = sheetForStudent.createRow(0);
        headerRowForStudent.createCell(0).setCellValue("Mã thông báo");
        headerRowForStudent.createCell(1).setCellValue("Mã người gửi");
        headerRowForStudent.createCell(2).setCellValue("Mã người nhận");
        headerRowForStudent.createCell(3).setCellValue("Nội dung");
        headerRowForStudent.createCell(4).setCellValue("Ngày gửi");

        Row headerRowForAdmin = sheetForAdmin.createRow(0);
        headerRowForAdmin.createCell(0).setCellValue("Mã thông báo");
        headerRowForAdmin.createCell(1).setCellValue("Mã người gửi");
        headerRowForAdmin.createCell(2).setCellValue("Mã người nhận");
        headerRowForAdmin.createCell(3).setCellValue("Nội dung");
        headerRowForAdmin.createCell(4).setCellValue("Ngày gửi");

// Fill data rows
        for (Object notification : notifications) {
            if (notification instanceof Model.MailSinhVien) {
                Model.MailSinhVien mailSinhVien = (Model.MailSinhVien) notification;
                Row row = sheetForAdmin.createRow(sheetForAdmin.getLastRowNum() + 1);
                row.createCell(0).setCellValue(mailSinhVien.getIdNotification());
                row.createCell(1).setCellValue(mailSinhVien.getStudentId());
                row.createCell(2).setCellValue(mailSinhVien.getAdminId());
                row.createCell(3).setCellValue(mailSinhVien.getContent());
                row.createCell(4).setCellValue(mailSinhVien.getDate().toString()); // Assuming date is stored as java.util.Date
            } else if (notification instanceof Model.ThongBaoChung || notification instanceof Model.ThongBaoCaNhan) {
                Row row = sheetForStudent.createRow(sheetForStudent.getLastRowNum() + 1);
                if (notification instanceof Model.ThongBaoChung) {
                    Model.ThongBaoChung thongBaoChung = (Model.ThongBaoChung) notification;
                    row.createCell(0).setCellValue(thongBaoChung.getIdNotification());
                    row.createCell(1).setCellValue(thongBaoChung.getAdminId());
                    row.createCell(2).setCellValue(thongBaoChung.getStudentId());
                    row.createCell(3).setCellValue(thongBaoChung.getContent());
                    row.createCell(4).setCellValue(thongBaoChung.getDate().toString()); // Assuming date is stored as java.util.Date
                } else if (notification instanceof Model.ThongBaoCaNhan) {
                    Model.ThongBaoCaNhan thongBaoCaNhan = (Model.ThongBaoCaNhan) notification;
                    row.createCell(0).setCellValue(thongBaoCaNhan.getIdNotification());
                    row.createCell(1).setCellValue(thongBaoCaNhan.getAdminId());
                    row.createCell(2).setCellValue(thongBaoCaNhan.getStudentId());
                    row.createCell(3).setCellValue(thongBaoCaNhan.getContent());
                    row.createCell(4).setCellValue(thongBaoCaNhan.getDate().toString()); // Assuming date is stored as java.util.Date
                }
            }
        }

// Save both workbooks to separate files
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
         String adminId = getAdminId();
        String filePathForStudent = "D:\\Download\\DANH_SACH_THONG_BAO_GUI_DEN_SINH_VIEN_" + adminId + "_" + formattedDate + ".xlsx";
        String filePathForAdmin = "D:\\Download\\DANH_SACH_THONG_BAO_GUI_DEN_QUAN_TRI_VIEN_" + adminId + "_" + formattedDate + ".xlsx";

        File fileForStudent = new File(filePathForStudent);
        File fileForAdmin = new File(filePathForAdmin);

        try (FileOutputStream exportedFileForStudent = new FileOutputStream(fileForStudent); FileOutputStream exportedFileForAdmin = new FileOutputStream(fileForAdmin)) {
            workbookForStudent.write(exportedFileForStudent);
            workbookForAdmin.write(exportedFileForAdmin);
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Xuất ra file Excel thành công !");
            showDialog.setVisible(true);
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
    private javax.swing.JLabel btnTaoMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private Handle.PanelRound panelRound10;
    private Handle.PanelRound panelRound11;
    private Handle.PanelRound panelRound12;
    private Handle.PanelRound panelRound13;
    private Handle.PanelRound panelRound14;
    private Handle.PanelRound panelRound15;
    private Handle.PanelRound panelRound16;
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

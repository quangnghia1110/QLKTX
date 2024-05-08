/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.User;

import Dao.DutyScheduleDAO;
import Dao.RoomDAO;
import Dao.StudentDAO;
import Dao.UtilityBillDAO;
import java.awt.Label;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Handle.PanelRound;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import Model.*;
import View.Notification.ConfirmRoom;
import View.Notification.SuccessfulExportAndImport;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ADMIN
 */
public class UtilityBill extends javax.swing.JPanel {
    private ArrayList<Model.UtilityBill> list;
private Student student;
    DefaultTableModel model;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    Room myR;
    RoomDAO daoR = new RoomDAO();
    
    List<Student> listSofR;
    StudentDAO daoS = new StudentDAO();
    public UtilityBill(Student student) {
        initComponents();
        fitContentOfTable(table);
    this.student = student;

    list = new UtilityBillDAO().getAllUtilityBills();
     model = (DefaultTableModel) table.getModel();

    myR = daoR.getRoomByName(student.getRoom());
    lblName1.setText(myR.getName());
    if(myR.getName() != null)
    {
    listSofR = daoS.getStudentsByRoom(myR.getName().toLowerCase());
    int total = listSofR.size();
    int temp = total;
    jLabel10.setText(""+ temp);
            showListUtility(list);

    }
    else{}
    
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
        int[] column = {0,1,2,3,4,5,6,7};
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
        panelRound1 = new Handle.PanelRound();
        panelRound9 = new Handle.PanelRound();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblSum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tf_thoihan = new javax.swing.JLabel();
        panelRound12 = new Handle.PanelRound();
        panelRound4 = new Handle.PanelRound();
        cbRooms = new javax.swing.JComboBox<>();
        panelRound7 = new Handle.PanelRound();
        btnFilter = new javax.swing.JLabel();
        panelRound10 = new Handle.PanelRound();
        panelRound2 = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        panelRound6 = new Handle.PanelRound();
        btnExport = new javax.swing.JLabel();
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
        jLabel1.setText("THÔNG TIN VỀ HÓA ĐƠN");
        jLabel1.setPreferredSize(new java.awt.Dimension(315, 35));
        panelRound5.add(jLabel1, "card2");

        jPanel9.add(panelRound5, java.awt.BorderLayout.PAGE_START);

        panelRound11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound11.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        panelRound1.setBackground(new java.awt.Color(17, 144, 119));
        panelRound1.setMinimumSize(new java.awt.Dimension(350, 78));
        panelRound1.setPreferredSize(new java.awt.Dimension(450, 70));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new java.awt.CardLayout(3, 3));

        panelRound9.setBackground(new java.awt.Color(17, 144, 119));
        panelRound9.setPreferredSize(new java.awt.Dimension(445, 80));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);
        panelRound9.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(35, 45, 63));
        jPanel8.setLayout(new java.awt.BorderLayout(0, 1));

        jPanel1.setBackground(new java.awt.Color(17, 144, 119));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên phòng:");
        jPanel1.add(jLabel5);

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("2A16");
        jPanel1.add(lblName1);

        jPanel8.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(17, 144, 119));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tổng tiền các tháng:");
        jPanel6.add(jLabel8);

        lblSum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSum.setForeground(new java.awt.Color(255, 255, 255));
        lblSum.setText("1.000.000");
        jPanel6.add(lblSum);

        jPanel8.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        panelRound9.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(17, 144, 119));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 1));

        jPanel7.setBackground(new java.awt.Color(17, 144, 119));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tổng sinh viên:");
        jLabel9.setToolTipText("");
        jPanel7.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("10");
        jPanel7.add(jLabel10);

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(17, 144, 119));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Thời hạn đóng tiền:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, java.awt.BorderLayout.CENTER);

        tf_thoihan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf_thoihan.setForeground(new java.awt.Color(255, 255, 255));
        tf_thoihan.setText("10");
        jPanel2.add(tf_thoihan, java.awt.BorderLayout.LINE_END);

        panelRound9.add(jPanel2, java.awt.BorderLayout.LINE_END);

        panelRound1.add(panelRound9, "card2");

        jPanel4.add(panelRound1);

        panelRound12.setBackground(new java.awt.Color(17, 144, 119));
        panelRound12.setRoundBottomLeft(20);
        panelRound12.setRoundBottomRight(20);
        panelRound12.setRoundTopLeft(20);
        panelRound12.setRoundTopRight(20);
        panelRound12.setLayout(new java.awt.CardLayout(5, 5));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);

        cbRooms.setPreferredSize(new java.awt.Dimension(76, 35));
        panelRound4.add(cbRooms);

        panelRound7.setBackground(new java.awt.Color(17, 144, 119));
        panelRound7.setRoundBottomLeft(5);
        panelRound7.setRoundBottomRight(5);
        panelRound7.setRoundTopLeft(5);
        panelRound7.setRoundTopRight(5);

        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFilter.setText("OK");
        btnFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFilterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound4.add(panelRound7);

        panelRound12.add(panelRound4, "card2");

        jPanel4.add(panelRound12);

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

        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExport.setText("Xuất Excel");
        btnExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelRound8.add(panelRound6, "card2");

        panelRound2.add(panelRound8, "card2");

        panelRound10.add(panelRound2, "card2");

        jPanel4.add(panelRound10);

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
                "Mã hóa đơn", "Phòng", "Tổng điện", "Giá điện", "Số điện", "Tổng nước", "Giá nước", "Số nước", "Tổng tiền", "Ngày tạo", "Ngày hết hạn", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, false, false, false
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

    private void btnFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilterMouseClicked
        String selectedDate = (String) cbRooms.getSelectedItem();    
        filterTableByDate(selectedDate); 
    
        double totalCost = 0;
        List<Model.UtilityBill> filteredBills = filterBillsByDate(selectedDate);

        for(Model.UtilityBill bill : filteredBills) {   
            totalCost += bill.getElectricityCost() + bill.getWaterCost(); // Cộng dồn tiền điện và tiền nước vào tổng tiền
        }
        lblSum.setText(String.valueOf(totalCost));
        showListUtility(list);
    }//GEN-LAST:event_btnFilterMouseClicked


private void filterTableAndBillsByDate(String selectedDate) {
    filterTableByDate(selectedDate);
    filterBillsAndShowListUtility(selectedDate);
}

private void filterBillsAndShowListUtility(String selectedDate) {
   selectedDate = (String) cbRooms.getSelectedItem();    
    filterTableAndBillsByDate(selectedDate); 
}

private void filterTableByDate(String selectedDate) {
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    table.setRowSorter(sorter);    
    RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter(selectedDate, 11); // Filter by the twelfth column which is the endDate
    sorter.setRowFilter(filter);
}

private List<Model.UtilityBill> filterBillsByDate(String selectedDate) {
    List<Model.UtilityBill> filteredBills = new ArrayList<>();
    for (Model.UtilityBill bill : list) {
        if (bill.getEndDate() != null && bill.getEndDate().toString().equals(selectedDate)) {
            filteredBills.add(bill);
        }
    }
    return filteredBills;
}

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
         if (list.isEmpty()) {
        SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách hóa đơn trống!");
        emptyList.setVisible(true);
    } else {
        String selectedDate = (String) cbRooms.getSelectedItem();    

        if (selectedDate.equals("ALL")) {
UtilityBillDAO utilityBillDAO = new UtilityBillDAO(); // Tạo một thể hiện của DutyScheduleDAO
            List<Model.UtilityBill> utilityBills = utilityBillDAO.getAllByRoom(student.getRoom());
exportExcelFile(utilityBills);
        } else {
            // Filter bills based on selected date
            List<Model.UtilityBill> filteredBills = filterBillsByDate(selectedDate);

            if (filteredBills.isEmpty()) {
                // If the filtered list is empty, show a message
                SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách hóa đơn trống!");
                emptyList.setVisible(true);
            } else {
                // If the filtered list is not empty, proceed with exporting
                exportExcelFile(filteredBills);
            }
        }
    }
    }//GEN-LAST:event_btnExportMouseClicked
    
 public void exportExcelFile(List<Model.UtilityBill> utilityBills) {
        try {
            if (utilityBills.isEmpty()) {
                System.out.println("Error: Empty list");
                return;
            }

            XSSFWorkbook excelFile = new XSSFWorkbook();
            XSSFSheet sheet = excelFile.createSheet("DANH SÁCH HÓA ĐƠN");

            // Header row
        String[] headers = {"STT", "Mã hóa đơn", "  Phòng", "Tổng điện", "Giá điện", "Số điện", "Tổng nước", "Giá nước","Số nước", "Tổng tiền","Ngày tạo", "Ngày hết hạn", "Trạng thái"};
            Cell cell;
            org.apache.poi.ss.usermodel.Row row = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                cell = row.createCell(i, CellType.STRING);
                cell.setCellValue(headers[i]);
            }

            // Data rows
            int rowNum = 1;
            for (Model.UtilityBill bill : utilityBills) {
                                row = sheet.createRow(rowNum++);

                row.createCell(0, CellType.NUMERIC).setCellValue(rowNum - 1); // STT
            row.createCell(1, CellType.NUMERIC).setCellValue(bill.getBillId()); // Mã hóa đơn
            row.createCell(2, CellType.STRING).setCellValue(bill.getRoomName()); // Tên phòng
             // Tiền điện
            row.createCell(3, CellType.NUMERIC).setCellValue(bill.getElectricityCost());
            row.createCell(4, CellType.NUMERIC).setCellValue(bill.getElectricityUnitPrice());// Tiền điện
            row.createCell(5, CellType.NUMERIC).setCellValue(bill.getElectricityUsage());
             // Tiền điện
            row.createCell(6, CellType.NUMERIC).setCellValue(bill.getWaterCost()); 
            row.createCell(7, CellType.NUMERIC).setCellValue(bill.getWaterUnitPrice()); 
            row.createCell(8, CellType.NUMERIC).setCellValue(bill.getWaterUseage());
            row.createCell(9, CellType.NUMERIC).setCellValue(bill.getElectricityCost() + bill.getWaterCost()); // Tổng tiền
            row.createCell(10, CellType.STRING).setCellValue(bill.getStartDate().toString()); // Ngày tạo
            row.createCell(11, CellType.STRING).setCellValue(bill.getEndDate().toString()); // Ngày hết hạn
            row.createCell(12, CellType.STRING).setCellValue(bill.getStatus()); // Trạng thái
            }

            // Determine file name
            String fileName;
            String selectedDate = (String) cbRooms.getSelectedItem();    
            if (selectedDate.equals("ALL")) {
                 fileName = "TOAN_BO_DANH_SACH_HOA_DON.xlsx";
            } else {
                // Get current date
                Date currentDate = new Date();

                // Get date of the last bill payment
String lastPaymentDate = utilityBills.get(utilityBills.size() - 1).getEndDate() != null ? utilityBills.get(utilityBills.size() - 1).getEndDate().toString() : "";

                // Format the date to add to the file name
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = dateFormat.format(lastPaymentDate);

                // Modify the file path to include the date
                fileName = "DANH_SACH_HOA_DON_" + formattedDate + ".xlsx";
            }

            // File path
            String filePath = "D:\\Download\\" + fileName;

            // Write to the file
            try (FileOutputStream exportedFile = new FileOutputStream(filePath)) {
                excelFile.write(exportedFile);
                excelFile.close(); // Close the Excel file after writing
                SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Xuất ra file Excel thành công !");
                showDialog.setVisible(true);
            } catch (Exception e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error exporting Excel file: " + e.getMessage());
        }
    }
    public void showListUtility(ArrayList<Model.UtilityBill> tmplist) {
   
    cbRooms.removeAllItems();
    UtilityBillDAO utilityBillDAO = new UtilityBillDAO();
    List<Model.UtilityBill> bills = utilityBillDAO.getAllByRoom(student.getRoom());
    
     cbRooms.addItem("ALL");
     model.setRowCount(0);

    // Lấy tên phòng của sinh viên
    String studentRoomName = student.getRoom(); // Thay "student" bằng đối tượng sinh viên của bạn
    double totalCost = 0;
    for (Model.UtilityBill bill : tmplist) {
        // Kiểm tra nếu tên phòng của hóa đơn trùng với tên phòng của sinh viên
        if (bill.getRoomName().equals(studentRoomName)) {
            String statusText = (bill.getStatus() == 0) ? "Chưa thanh toán" : "Đã thanh toán";
    DateFormat dateFormats = new SimpleDateFormat("dd/MM/yyyy");

            // Lấy ngày tạo hóa đơn
            Date dateOfBill = bill.getDateOfBill();

            // Tạo một đối tượng Calendar và thiết lập ngày tạo hóa đơn
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateOfBill);
            
            calendar.add(Calendar.DATE, Integer.parseInt(tf_thoihan.getText()));

            // Lấy ngày hết hạn sau khi thêm 10 ngày
            Date expirationDate = calendar.getTime();

            // Định dạng ngày tạo hóa đơn
            String formattedDateOfBill = dateFormats.format(dateOfBill);

            // Định dạng ngày hết hạn
            String formattedExpirationDate = dateFormats.format(expirationDate);
          

            totalCost += bill.getElectricityCost() + bill.getWaterCost(); // Cộng dồn tiền điện và tiền nước vào tổng tiền

            // Thêm hàng mới vào model
            model.addRow(new Object[]{
                bill.getBillId(),
                bill.getRoomName(),
                bill.getElectricityCost(),
                bill.getElectricityUnitPrice(),
                bill.getElectricityUsage(),
                bill.getWaterCost(),
                bill.getWaterUnitPrice(),
                bill.getWaterUseage(),
                bill.getElectricityCost() + bill.getWaterCost(),
                formattedDateOfBill, // Ngày tạo hóa đơn đã được định dạng
                formattedExpirationDate, // Ngày hết hạn đã được định dạng
                statusText
            });
        }
    }
    lblSum.setText(String.valueOf(totalCost));
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
    private javax.swing.JLabel btnExport;
    private javax.swing.JLabel btnFilter;
    private javax.swing.JComboBox<String> cbRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblSum;
    private Handle.PanelRound panelRound1;
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
    private javax.swing.JLabel tf_thoihan;
    // End of variables declaration//GEN-END:variables
}

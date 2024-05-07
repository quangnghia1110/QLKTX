package View.Admin;

import Dao.BillDetailDAO;
import java.util.Calendar;
import java.util.Date;
import Dao.UtilityBillDAO;
import Handle.Button.TableActionCellEditor;
import Handle.Button.TableActionCellEditor1;
import Handle.Button.TableActionCellRender;
import Handle.Button.TableActionCellRender1;
import Handle.Button.TableActionEvent;
import Handle.Button.TableActionEvent1;
import Handle.PanelRound;
import Model.BillDetail;
import Model.Student;
import Model.UtilityBill;
import View.Admin.RoomList.CreateRoom;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.apache.commons.math3.analysis.function.Ulp;
import org.jfree.ui.DateCellRenderer;

public class UtilityBillList extends javax.swing.JPanel {

    private ArrayList<UtilityBill> list;
    DefaultTableModel model;
    BillDetailDAO detailDao = new BillDetailDAO();

    public UtilityBillList() {
        initComponents();

        TableActionEvent1 event = new TableActionEvent1() {
            @Override
            public void onProcess(int row) {
                UtilityBill bill = list.get(row);
                bill.setStatus(1); // Set status to processed
                new UtilityBillDAO().updateUtilityBill(bill);
                model.setValueAt("Đã thanh toán", row, 7);
            }

            @Override

            public void onDelete(int row) {
                UtilityBill bill = list.get(row);
                new UtilityBillDAO().deleteUtilityBill(bill.getBillId()); // Assuming deleteUtilityBill method exists
                model.removeRow(row);
                list.remove(row);
            }

            @Override

            public void onDetail(int row) {
               
                int billId=(int) bill_table.getValueAt(row, 0);
                
                UtilityBillDAO dao = new UtilityBillDAO();
                UtilityBill utilityBill = dao.getUtilityBillById(billId);
                 BillDetailDialog dialog = new BillDetailDialog(null, false, utilityBill);
                dialog.pack(); 
                dialog.setLocationRelativeTo(null); 
                dialog.setVisible(true);
                dialog.setAlwaysOnTop(true);
                
                

            }

        };
        bill_table.getColumnModel()
                .getColumn(8).setCellRenderer(new TableActionCellRender1());
        bill_table.getColumnModel()
                .getColumn(8).setCellEditor(new TableActionCellEditor1(event));
//    bill_table.getColumnModel().getColumn(5).setCellRenderer(new DateCellRenderer());
//    bill_table.getColumnModel().getColumn(6).setCellRenderer(new DateCellRenderer());
        list = new UtilityBillDAO().getAllUtilityBills();
        model = (DefaultTableModel) bill_table.getModel();

        showListUtility(list);
        tf_thoihan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khi người dùng nhập giá trị mới, cập nhật lại dữ liệu trong bảng
                updateTableData(list);
            }

            private void updateTableData(ArrayList<UtilityBill> tmplist) {
                model.setRowCount(0);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                for (UtilityBill bill : tmplist) {
                    String statusText = (bill.getStatus() == 0) ? "Chưa thanh toán" : "Đã thanh toán";

                    // Lấy ngày tạo hóa đơn
                    Date dateOfBill = bill.getDateOfBill();

                    // Tạo một đối tượng Calendar và thiết lập ngày tạo hóa đơn
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(dateOfBill);

                    // Thêm số ngày từ tf_thoihan vào ngày tạo hóa đơn
                    calendar.add(Calendar.DATE, Integer.parseInt(tf_thoihan.getText()));

                    // Lấy ngày hết hạn sau khi thêm số ngày từ tf_thoihan
                    Date expirationDate = calendar.getTime();

                    // Định dạng ngày tạo hóa đơn và ngày hết hạn
                    String formattedDateOfBill = dateFormat.format(dateOfBill);
                    String formattedExpirationDate = dateFormat.format(expirationDate);

                    // Thêm hàng mới vào model
                    model.addRow(new Object[]{
                        bill.getBillId(),
                        bill.getRoomName(),
                        bill.getElectricityCost(),
                        bill.getWaterCost(),
                        bill.getElectricityCost() + bill.getWaterCost(),
                        formattedDateOfBill,
                        formattedExpirationDate,
                        statusText
                    });
                }
            }
        });

    }

    public void showListUtility(ArrayList<UtilityBill> tmplist) {
        model.setRowCount(0);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (UtilityBill bill : tmplist) {
            String statusText = (bill.getStatus() == 0) ? "Chưa thanh toán" : "Đã thanh toán";

            // Lấy ngày tạo hóa đơn
            Date dateOfBill = bill.getDateOfBill();

            // Tạo một đối tượng Calendar và thiết lập ngày tạo hóa đơn
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateOfBill);

            // Thêm 10 ngày vào ngày tạo hóa đơn
            calendar.add(Calendar.DATE, Integer.parseInt(tf_thoihan.getText()));

            // Lấy ngày hết hạn sau khi thêm 10 ngày
            Date expirationDate = calendar.getTime();

            // Định dạng ngày tạo hóa đơn
            String formattedDateOfBill = dateFormat.format(dateOfBill);

            // Định dạng ngày hết hạn
            String formattedExpirationDate = dateFormat.format(expirationDate);

            // Thêm hàng mới vào model
            model.addRow(new Object[]{
                bill.getBillId(),
                bill.getRoomName(),
                bill.getElectricityCost(),
                bill.getWaterCost(),
                bill.getElectricityCost() + bill.getWaterCost(),
                formattedDateOfBill, // Ngày tạo hóa đơn đã được định dạng
                formattedExpirationDate, // Ngày hết hạn đã được định dạng
                statusText
            });
        }
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        panelRound6 = new Handle.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        panelRound3 = new Handle.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_change_electric = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_thoihan = new javax.swing.JTextField();
        btn_change_water = new javax.swing.JButton();
        panelRound4 = new Handle.PanelRound();
        panelRound7 = new Handle.PanelRound();
        panelRound11 = new Handle.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        exportPanel = new Handle.PanelRound();
        importExcelFile = new Handle.PanelRound();
        roundExportIcon = new Handle.PanelRound();
        exportFile = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelRound5 = new Handle.PanelRound();
        exportExcelFile = new Handle.PanelRound();
        roundImportIcon = new Handle.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        arrangePanel = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        borderArrange = new Handle.PanelRound();
        arrangeButton = new javax.swing.JLabel();
        panelRound9 = new Handle.PanelRound();
        filterComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill_table = new javax.swing.JTable();
        arrangePanel1 = new Handle.PanelRound();
        panelRound13 = new Handle.PanelRound();
        borderArrange1 = new Handle.PanelRound();
        arrangeButton1 = new javax.swing.JLabel();
        panelRound14 = new Handle.PanelRound();
        filterComboBox1 = new javax.swing.JComboBox<>();
        panelRound10 = new Handle.PanelRound();
        addingRoomPanel = new Handle.PanelRound();
        addBtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(586, 620));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        panelRound6.setBackground(new java.awt.Color(17, 144, 119));
        panelRound6.setRoundBottomLeft(15);
        panelRound6.setRoundBottomRight(15);
        panelRound6.setRoundTopLeft(15);
        panelRound6.setRoundTopRight(15);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Quản lý hóa đơn");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(351, 351, 351))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelRound3.setBackground(new java.awt.Color(17, 144, 119));
        panelRound3.setRoundBottomLeft(15);
        panelRound3.setRoundBottomRight(15);
        panelRound3.setRoundTopLeft(15);
        panelRound3.setRoundTopRight(15);

        jPanel1.setBackground(new java.awt.Color(17, 144, 119));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đơn giá điện:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đơn giá nước:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1 kWh=");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1 m3/s=");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1000");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("1000");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("VND");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("VND");

        btn_change_electric.setBackground(new java.awt.Color(17, 144, 119));
        btn_change_electric.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-edit-24.png"))); // NOI18N
        btn_change_electric.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_change_electric.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_change_electricMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Thời hạn đóng tiền:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ngày");

        tf_thoihan.setBackground(new java.awt.Color(17, 144, 119));
        tf_thoihan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_thoihan.setForeground(new java.awt.Color(255, 255, 255));
        tf_thoihan.setText("10");
        tf_thoihan.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_change_electric))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_thoihan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel20)))
                    .addComponent(btn_change_electric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tf_thoihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btn_change_water.setBackground(new java.awt.Color(17, 144, 119));
        btn_change_water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-edit-24.png"))); // NOI18N
        btn_change_water.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_change_water.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_change_waterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(btn_change_water)
                .addGap(26, 26, 26))
            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound3Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_change_water)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelRound4.setBackground(new java.awt.Color(17, 144, 119));
        panelRound4.setPreferredSize(new java.awt.Dimension(200, 50));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);
        panelRound4.setLayout(new java.awt.CardLayout(6, 6));

        panelRound7.setBackground(new java.awt.Color(255, 255, 255));
        panelRound7.setRoundBottomLeft(40);
        panelRound7.setRoundBottomRight(40);
        panelRound7.setRoundTopLeft(40);
        panelRound7.setRoundTopRight(40);
        panelRound7.setLayout(new java.awt.BorderLayout());

        panelRound11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound11.setRoundBottomLeft(40);
        panelRound11.setRoundBottomRight(40);
        panelRound11.setRoundTopLeft(40);
        panelRound11.setRoundTopRight(40);

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        panelRound7.add(panelRound11, java.awt.BorderLayout.LINE_END);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/findingIcon.png"))); // NOI18N
        panelRound7.add(jLabel22, java.awt.BorderLayout.LINE_START);

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTextField.setBorder(null);
        searchTextField.setPreferredSize(new java.awt.Dimension(175, 18));
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyTyped(evt);
            }
        });
        panelRound7.add(searchTextField, java.awt.BorderLayout.CENTER);

        panelRound4.add(panelRound7, "card2");

        exportPanel.setBackground(new java.awt.Color(17, 144, 119));
        exportPanel.setPreferredSize(new java.awt.Dimension(160, 50));
        exportPanel.setRoundBottomLeft(50);
        exportPanel.setRoundBottomRight(50);
        exportPanel.setRoundTopLeft(50);
        exportPanel.setRoundTopRight(50);
        exportPanel.setLayout(new java.awt.CardLayout(5, 5));

        importExcelFile.setBackground(new java.awt.Color(255, 255, 255));
        importExcelFile.setEnabled(false);
        importExcelFile.setRoundBottomLeft(40);
        importExcelFile.setRoundBottomRight(40);
        importExcelFile.setRoundTopLeft(40);
        importExcelFile.setRoundTopRight(40);
        importExcelFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importExcelFileMouseClicked(evt);
            }
        });
        importExcelFile.setLayout(new java.awt.BorderLayout());

        roundExportIcon.setBackground(new java.awt.Color(255, 255, 255));
        roundExportIcon.setRoundBottomLeft(40);
        roundExportIcon.setRoundBottomRight(40);
        roundExportIcon.setRoundTopLeft(40);
        roundExportIcon.setRoundTopRight(40);
        roundExportIcon.setLayout(new java.awt.CardLayout(4, 4));

        exportFile.setForeground(new java.awt.Color(255, 255, 255));
        exportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/importExcel.png"))); // NOI18N
        exportFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roundExportIcon.add(exportFile, "card2");

        importExcelFile.add(roundExportIcon, java.awt.BorderLayout.LINE_START);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(35, 45, 63));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Nhập file Excel");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importExcelFile.add(jLabel23, java.awt.BorderLayout.CENTER);

        exportPanel.add(importExcelFile, "card2");

        panelRound5.setBackground(new java.awt.Color(17, 144, 119));
        panelRound5.setPreferredSize(new java.awt.Dimension(158, 50));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new java.awt.CardLayout(5, 5));

        exportExcelFile.setBackground(new java.awt.Color(255, 255, 255));
        exportExcelFile.setRoundBottomLeft(40);
        exportExcelFile.setRoundBottomRight(40);
        exportExcelFile.setRoundTopLeft(40);
        exportExcelFile.setRoundTopRight(40);
        exportExcelFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportExcelFileMouseClicked(evt);
            }
        });
        exportExcelFile.setLayout(new java.awt.BorderLayout());

        roundImportIcon.setBackground(new java.awt.Color(255, 255, 255));
        roundImportIcon.setRoundBottomLeft(40);
        roundImportIcon.setRoundBottomRight(40);
        roundImportIcon.setRoundTopLeft(40);
        roundImportIcon.setRoundTopRight(40);
        roundImportIcon.setLayout(new java.awt.CardLayout(5, 4));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportExcel.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roundImportIcon.add(jLabel24, "card2");

        exportExcelFile.add(roundImportIcon, java.awt.BorderLayout.LINE_START);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Xuất file Excel");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportExcelFile.add(jLabel25, java.awt.BorderLayout.CENTER);

        panelRound5.add(exportExcelFile, "card2");

        arrangePanel.setBackground(new java.awt.Color(17, 144, 119));
        arrangePanel.setPreferredSize(new java.awt.Dimension(173, 50));
        arrangePanel.setRoundBottomLeft(50);
        arrangePanel.setRoundBottomRight(20);
        arrangePanel.setRoundTopLeft(50);
        arrangePanel.setRoundTopRight(20);
        arrangePanel.setLayout(new java.awt.CardLayout(5, 5));

        panelRound8.setBackground(new java.awt.Color(17, 144, 119));
        panelRound8.setRoundBottomLeft(50);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(50);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(new java.awt.BorderLayout(5, 5));

        borderArrange.setBackground(new java.awt.Color(17, 144, 119));
        borderArrange.setRoundBottomLeft(50);
        borderArrange.setRoundBottomRight(50);
        borderArrange.setRoundTopLeft(50);
        borderArrange.setRoundTopRight(50);
        borderArrange.setLayout(new java.awt.CardLayout(1, 1));

        arrangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filterIcon.png"))); // NOI18N
        arrangeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrangeButtonMouseClicked(evt);
            }
        });
        borderArrange.add(arrangeButton, "card2");

        panelRound8.add(borderArrange, java.awt.BorderLayout.LINE_START);

        panelRound9.setBackground(new java.awt.Color(255, 255, 255));
        panelRound9.setRoundBottomLeft(10);
        panelRound9.setRoundBottomRight(10);
        panelRound9.setRoundTopLeft(10);
        panelRound9.setRoundTopRight(10);
        panelRound9.setLayout(new java.awt.CardLayout(5, 5));

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Tên", "Mã sinh viên", "Mã lớp" }));
        filterComboBox.setBorder(null);
        filterComboBox.setPreferredSize(new java.awt.Dimension(100, 40));
        panelRound9.add(filterComboBox, "card2");

        panelRound8.add(panelRound9, java.awt.BorderLayout.CENTER);

        arrangePanel.add(panelRound8, "card2");

        bill_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bill_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Phòng", "Tổng điện", "Tổng nước", "Tổng tiền", "Ngày tạo", "Ngày hết hạn", "Trạng thái", "Xử lý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bill_table.setRowHeight(40);
        bill_table.setShowGrid(true);
        jScrollPane1.setViewportView(bill_table);

        arrangePanel1.setBackground(new java.awt.Color(17, 144, 119));
        arrangePanel1.setPreferredSize(new java.awt.Dimension(173, 50));
        arrangePanel1.setRoundBottomLeft(50);
        arrangePanel1.setRoundBottomRight(20);
        arrangePanel1.setRoundTopLeft(50);
        arrangePanel1.setRoundTopRight(20);
        arrangePanel1.setLayout(new java.awt.CardLayout(5, 5));

        panelRound13.setBackground(new java.awt.Color(17, 144, 119));
        panelRound13.setRoundBottomLeft(50);
        panelRound13.setRoundBottomRight(20);
        panelRound13.setRoundTopLeft(50);
        panelRound13.setRoundTopRight(20);
        panelRound13.setLayout(new java.awt.BorderLayout(5, 5));

        borderArrange1.setBackground(new java.awt.Color(17, 144, 119));
        borderArrange1.setRoundBottomLeft(50);
        borderArrange1.setRoundBottomRight(50);
        borderArrange1.setRoundTopLeft(50);
        borderArrange1.setRoundTopRight(50);
        borderArrange1.setLayout(new java.awt.CardLayout(1, 1));

        arrangeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrangeIcon.png"))); // NOI18N
        arrangeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrangeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrangeButton1MouseClicked(evt);
            }
        });
        borderArrange1.add(arrangeButton1, "card2");

        panelRound13.add(borderArrange1, java.awt.BorderLayout.LINE_START);

        panelRound14.setBackground(new java.awt.Color(255, 255, 255));
        panelRound14.setRoundBottomLeft(10);
        panelRound14.setRoundBottomRight(10);
        panelRound14.setRoundTopLeft(10);
        panelRound14.setRoundTopRight(10);
        panelRound14.setLayout(new java.awt.CardLayout(5, 5));

        filterComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Tên", "Mã sinh viên", "Mã lớp" }));
        filterComboBox1.setBorder(null);
        filterComboBox1.setPreferredSize(new java.awt.Dimension(100, 40));
        panelRound14.add(filterComboBox1, "card2");

        panelRound13.add(panelRound14, java.awt.BorderLayout.CENTER);

        arrangePanel1.add(panelRound13, "card2");

        panelRound10.setBackground(new java.awt.Color(17, 144, 119));
        panelRound10.setRoundBottomLeft(50);
        panelRound10.setRoundBottomRight(50);
        panelRound10.setRoundTopLeft(50);
        panelRound10.setRoundTopRight(50);

        addingRoomPanel.setBackground(new java.awt.Color(255, 255, 255));
        addingRoomPanel.setRoundBottomLeft(40);
        addingRoomPanel.setRoundBottomRight(40);
        addingRoomPanel.setRoundTopLeft(40);
        addingRoomPanel.setRoundTopRight(40);
        addingRoomPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addingRoomPanelMouseClicked(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2);
        flowLayout1.setAlignOnBaseline(true);
        addingRoomPanel.setLayout(flowLayout1);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addingIcon.png"))); // NOI18N
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addingRoomPanel.add(addBtn);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thêm hóa đơn");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addingRoomPanel.add(jLabel7);

        panelRound10.add(addingRoomPanel);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(arrangePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(arrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrangePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
//        if (searchTextField.getText().equals("")) {
//            showListStudent(list);
//        }
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
//        if (searchTextField.getText().toUpperCase().startsWith("N".toUpperCase()) && searchTextField.getText().toUpperCase().contains("DC".toUpperCase())){
//            showListStudent(getResultSearchingID(searchTextField.getText()));
//        } else {
//            showListStudent(getResultSearchingName(searchTextField.getText()));
//        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void searchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_searchTextFieldKeyTyped

    private void importExcelFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importExcelFileMouseClicked

        animationClick(roundImportIcon, "#ffffff");
        animationClick(exportExcelFile, "#ffffff");
        //importExcelFile();
        //showListStudent(list);
    }//GEN-LAST:event_importExcelFileMouseClicked

    private void exportExcelFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportExcelFileMouseClicked
        // TODO add your handling code here:
        animationClick(roundExportIcon, "#ffffff");
        animationClick(importExcelFile, "#ffffff");
//        if (list.isEmpty()){
//            SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách sinh viên trống!");
//            emptyList.setVisible(true);
//        } else {
//            exportExcelFile();
//        }
    }//GEN-LAST:event_exportExcelFileMouseClicked

    private void arrangeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrangeButtonMouseClicked
        // TODO add your handling code here:
        animationClick(borderArrange, "#119077");
//        if (list.isEmpty()){
//            SuccessfulExportAndImport emptyList = new SuccessfulExportAndImport(null, true, "Danh sách sinh viên trống!");
//            emptyList.setVisible(true);
//        } else {
//            orderedStudentsList();
//        }
    }//GEN-LAST:event_arrangeButtonMouseClicked

    private void arrangeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrangeButton1MouseClicked

    }//GEN-LAST:event_arrangeButton1MouseClicked

    private void btn_change_electricMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_change_electricMouseClicked
        EditElectricityPrice changePrice = new EditElectricityPrice(null, true);
        changePrice.setVisible(true);
    }//GEN-LAST:event_btn_change_electricMouseClicked

    private void btn_change_waterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_change_waterMouseClicked
        EditElectricityPrice changePrice = new EditElectricityPrice();
        changePrice.setVisible(true);
    }//GEN-LAST:event_btn_change_waterMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        CreateBill dialog = new CreateBill(null, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_addBtnMouseClicked

    private void addingRoomPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addingRoomPanelMouseClicked
        // TODO add your handling code here:
        animationClick(addingRoomPanel, "#ffffff");
        CreateBill dialog = new CreateBill(null, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_addingRoomPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private Handle.PanelRound addingRoomPanel;
    private javax.swing.JLabel arrangeButton;
    private javax.swing.JLabel arrangeButton1;
    private Handle.PanelRound arrangePanel;
    private Handle.PanelRound arrangePanel1;
    private javax.swing.JTable bill_table;
    private Handle.PanelRound borderArrange;
    private Handle.PanelRound borderArrange1;
    private javax.swing.JButton btn_change_electric;
    private javax.swing.JButton btn_change_water;
    private Handle.PanelRound exportExcelFile;
    private javax.swing.JLabel exportFile;
    private Handle.PanelRound exportPanel;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JComboBox<String> filterComboBox1;
    private Handle.PanelRound importExcelFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private Handle.PanelRound panelRound10;
    private Handle.PanelRound panelRound11;
    private Handle.PanelRound panelRound13;
    private Handle.PanelRound panelRound14;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound4;
    private Handle.PanelRound panelRound5;
    private Handle.PanelRound panelRound6;
    private Handle.PanelRound panelRound7;
    private Handle.PanelRound panelRound8;
    private Handle.PanelRound panelRound9;
    private Handle.PanelRound roundExportIcon;
    private Handle.PanelRound roundImportIcon;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField tf_thoihan;
    // End of variables declaration//GEN-END:variables

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.Admin;

import Model.UtilityBill;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class BillDetailDialog extends javax.swing.JDialog {

    public BillDetailDialog(java.awt.Frame parent, boolean modal, UtilityBill bill) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);   
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        lbl_ma.setText(String.valueOf(bill.getBillId()));
        lbl_sodien.setText(String.valueOf(bill.getElectricityUsage()));
        lbl_sonuoc.setText(String.valueOf(bill.getWaterUseage()));
        lbl_tongdien.setText(String.valueOf(bill.getElectricityCost()));
        lbl_tongnuoc.setText(String.valueOf(bill.getWaterCost()));
        lbl_tongtien.setText(String.valueOf(bill.getElectricityCost() + bill.getWaterCost()));
        //lbl_trangthai.setText(bill.getStatus() == 1 ? "Đã thanh toán" : "Chưa thanh toán");
        lbl_ngaybatdau.setText(dateFormat.format(bill.getStartDate()));
        lbl_ngayketthuc.setText(dateFormat.format(bill.getEndDate()));
        lbl_phong.setText(bill.getRoomName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound5 = new Handle.PanelRound();
        panelRound1 = new Handle.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound3 = new Handle.PanelRound();
        createBtn = new Handle.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        panelRound4 = new Handle.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_ma = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_sodien = new javax.swing.JLabel();
        lbl_tongdien = new javax.swing.JLabel();
        lbl_ngaybatdau = new javax.swing.JLabel();
        lbl_phong = new javax.swing.JLabel();
        lbl_dongianuoc = new javax.swing.JLabel();
        lbl_sonuoc = new javax.swing.JLabel();
        lbl_tongnuoc = new javax.swing.JLabel();
        lbl_ngayketthuc = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_tongtien = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_dongiadien = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelRound5.setBackground(new java.awt.Color(17, 144, 119));
        panelRound5.setLayout(new java.awt.CardLayout(5, 5));

        panelRound1.setBackground(new java.awt.Color(17, 144, 119));
        panelRound1.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin chi tiết hóa đơn");
        panelRound1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        panelRound3.setBackground(new java.awt.Color(17, 144, 119));
        panelRound3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        createBtn.setBackground(new java.awt.Color(255, 255, 255));
        createBtn.setForeground(new java.awt.Color(35, 45, 63));
        createBtn.setPreferredSize(new java.awt.Dimension(80, 40));
        createBtn.setRoundBottomLeft(15);
        createBtn.setRoundBottomRight(15);
        createBtn.setRoundTopLeft(15);
        createBtn.setRoundTopRight(15);
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Đóng");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout createBtnLayout = new javax.swing.GroupLayout(createBtn);
        createBtn.setLayout(createBtnLayout);
        createBtnLayout.setHorizontalGroup(
            createBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createBtnLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        createBtnLayout.setVerticalGroup(
            createBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelRound3.add(createBtn);

        panelRound1.add(panelRound3, java.awt.BorderLayout.PAGE_END);

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setPreferredSize(new java.awt.Dimension(800, 300));
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);

        jLabel2.setText("Mã hóa đơn:");

        jLabel3.setText("Đơn giá nước");

        jLabel4.setText("Phòng:");

        jLabel5.setText("Đơn giá điện:");

        jLabel8.setText("Số điện sử dụng:");

        jLabel9.setText("Số nước sử dụng:");

        jLabel10.setText("Tổng số tiền nước:");

        jLabel11.setText("Tổng số tiền điện:");

        jLabel12.setText("Tổng tiền thanh toán:");

        jLabel13.setText("Ngày bắt đầu:");

        jLabel14.setText("Ngày kết thúc:");

        lbl_ma.setText("01");

        jLabel16.setText("1 kWh=");

        lbl_sodien.setText("50");

        lbl_tongdien.setText("1000");

        lbl_ngaybatdau.setText("11/9/2024");

        lbl_phong.setText("812");

        lbl_dongianuoc.setText("1000");

        lbl_sonuoc.setText("50");

        lbl_tongnuoc.setText("1000");

        lbl_ngayketthuc.setText("11/10/2024");

        jLabel25.setText("VND");

        lbl_tongtien.setText("1000");

        jLabel28.setText("1 m3/s=");

        jLabel29.setText("m3/s");

        jLabel30.setText("VND");

        jLabel31.setText("VND");

        lbl_dongiadien.setText("1000");

        jLabel33.setText("VND");

        jLabel34.setText("kWh");

        jLabel35.setText("VND");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(lbl_tongtien)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel25))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(lbl_sodien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(94, 94, 94)
                                .addComponent(lbl_dongiadien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33))
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_ma)))
                        .addGap(32, 32, 32)
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(67, 67, 67)
                                .addComponent(lbl_phong))
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound4Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_dongianuoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30))
                                    .addGroup(panelRound4Layout.createSequentialGroup()
                                        .addComponent(lbl_sonuoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29))))))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addGap(180, 180, 180)
                                .addComponent(jLabel14)
                                .addGap(72, 72, 72))
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRound4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(26, 26, 26)
                                        .addComponent(lbl_tongdien))
                                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(lbl_ngaybatdau)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_tongnuoc)
                                .addGap(18, 18, 18)))
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound4Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(42, 42, 42))
                            .addComponent(lbl_ngayketthuc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ma)
                        .addComponent(jLabel2))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_phong)
                        .addComponent(jLabel4)))
                .addGap(4, 4, 4)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lbl_tongtien)
                    .addComponent(jLabel25))
                .addGap(4, 4, 4)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel16)
                        .addComponent(lbl_dongiadien))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel28)
                        .addComponent(lbl_dongianuoc)
                        .addComponent(jLabel30)
                        .addComponent(jLabel33)))
                .addGap(24, 24, 24)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_sodien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_sonuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tongdien)
                        .addComponent(jLabel35))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(lbl_tongnuoc)
                        .addComponent(jLabel10)))
                .addGap(24, 24, 24)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ngaybatdau)
                        .addComponent(jLabel13))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ngayketthuc)
                        .addComponent(jLabel14))))
        );

        panelRound1.add(panelRound4, java.awt.BorderLayout.CENTER);

        panelRound5.add(panelRound1, "card2");

        getContentPane().add(panelRound5, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseClicked
            this.dispose();
    }//GEN-LAST:event_createBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UtilityBill utilityBill= new UtilityBill();
                BillDetailDialog dialog = new BillDetailDialog(new javax.swing.JFrame(), true, utilityBill);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Handle.PanelRound createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_dongiadien;
    private javax.swing.JLabel lbl_dongianuoc;
    private javax.swing.JLabel lbl_ma;
    private javax.swing.JLabel lbl_ngaybatdau;
    private javax.swing.JLabel lbl_ngayketthuc;
    private javax.swing.JLabel lbl_phong;
    private javax.swing.JLabel lbl_sodien;
    private javax.swing.JLabel lbl_sonuoc;
    private javax.swing.JLabel lbl_tongdien;
    private javax.swing.JLabel lbl_tongnuoc;
    private javax.swing.JLabel lbl_tongtien;
    private Handle.PanelRound panelRound1;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound4;
    private Handle.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}

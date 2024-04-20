/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.User;
import java.util.Date;

/**
 *
 * @author NgoQuangNghia
 */
public class UtilityBill extends javax.swing.JFrame {

    /**
     * Creates new form UtilityBill
     */
    public UtilityBill() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        lblMem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblSizeRoom = new javax.swing.JLabel();
        panelRound12 = new Handle.PanelRound();
        panelRound4 = new Handle.PanelRound();
        cbBill = new javax.swing.JComboBox<>();
        panelRound7 = new Handle.PanelRound();
        btnFilter = new javax.swing.JLabel();
        prXuatHoaDon = new Handle.PanelRound();
        panelRound2 = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        panelRound6 = new Handle.PanelRound();
        btnExport = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRound3 = new Handle.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel1.setText("THÔNG TIN VỀ HÓA ĐƠN CỦA BẠN");
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
        jLabel8.setText("Tổng số tiền:");
        jPanel6.add(jLabel8);

        lblMem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMem.setForeground(new java.awt.Color(255, 255, 255));
        lblMem.setText("10.000.000");
        jPanel6.add(lblMem);

        jPanel8.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        panelRound9.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(35, 45, 63));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 1));

        jPanel7.setBackground(new java.awt.Color(17, 144, 119));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ngày xuất đơn:");
        jPanel7.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("1/4/2024");
        jPanel7.add(jLabel10);

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(17, 144, 119));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hạn đóng tiền:");
        jPanel5.add(jLabel7);

        lblSizeRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSizeRoom.setForeground(new java.awt.Color(255, 255, 255));
        lblSizeRoom.setText("1/5/2024");
        jPanel5.add(lblSizeRoom);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

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

        cbBill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbBill.setPreferredSize(new java.awt.Dimension(76, 35));
        panelRound4.add(cbBill);

        panelRound7.setBackground(new java.awt.Color(17, 144, 119));
        panelRound7.setRoundBottomLeft(5);
        panelRound7.setRoundBottomRight(5);
        panelRound7.setRoundTopLeft(5);
        panelRound7.setRoundTopRight(5);

        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFilter.setText("Lọc");
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

        prXuatHoaDon.setBackground(new java.awt.Color(17, 144, 119));
        prXuatHoaDon.setRoundBottomLeft(20);
        prXuatHoaDon.setRoundBottomRight(20);
        prXuatHoaDon.setRoundTopLeft(20);
        prXuatHoaDon.setRoundTopRight(20);
        prXuatHoaDon.setLayout(new java.awt.CardLayout(5, 5));

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

        btnExport.setBackground(new java.awt.Color(17, 144, 119));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExport.setText("Xuất Hóa Đơn");
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

        prXuatHoaDon.add(panelRound2, "card2");

        jPanel4.add(prXuatHoaDon);

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
                "Mã hóa đơn", "Mã sinh viên", "Tiền điện", "Tiền nước", "Số điện mới", "Số nước mới"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelRound11.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel9.add(panelRound11, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilterMouseClicked
       
    }//GEN-LAST:event_btnFilterMouseClicked

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        
    }//GEN-LAST:event_btnExportMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(UtilityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilityBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExport;
    private javax.swing.JLabel btnFilter;
    private javax.swing.JComboBox<String> cbBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel lblMem;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblSizeRoom;
    private Handle.PanelRound panelRound1;
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
    private Handle.PanelRound prXuatHoaDon;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
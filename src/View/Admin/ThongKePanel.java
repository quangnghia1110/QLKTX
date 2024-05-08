/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import Model.ThongKe;

/**
 *
 * @author hoang
 */
public class ThongKePanel extends javax.swing.JPanel {
    public ThongKePanel() {
        initComponents();
        
        ThongKe controller = new ThongKe();
        controller.setDataToChart1(Bieudocot);
        controller.setDataToChart2(Bieudotron);
//        controller.setDataToChart3(BieuDoDuong);


        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelRound1 = new Handle.PanelRound();
        Bieudocot = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Bieudotron = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BieuDoDuong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout(100, 50));

        panelRound1.setLayout(new javax.swing.BoxLayout(panelRound1, javax.swing.BoxLayout.Y_AXIS));

        Bieudocot.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BieudocotLayout = new javax.swing.GroupLayout(Bieudocot);
        Bieudocot.setLayout(BieudocotLayout);
        BieudocotLayout.setHorizontalGroup(
            BieudocotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        BieudocotLayout.setVerticalGroup(
            BieudocotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        panelRound1.add(Bieudocot);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(465, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel1);

        Bieudotron.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BieudotronLayout = new javax.swing.GroupLayout(Bieudotron);
        Bieudotron.setLayout(BieudotronLayout);
        BieudotronLayout.setHorizontalGroup(
            BieudotronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        BieudotronLayout.setVerticalGroup(
            BieudotronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        panelRound1.add(Bieudotron);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel3);

        BieuDoDuong.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BieuDoDuongLayout = new javax.swing.GroupLayout(BieuDoDuong);
        BieuDoDuong.setLayout(BieuDoDuongLayout);
        BieuDoDuongLayout.setHorizontalGroup(
            BieuDoDuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        BieuDoDuongLayout.setVerticalGroup(
            BieuDoDuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        panelRound1.add(BieuDoDuong);

        add(panelRound1, "card2");
        add(jScrollPane1, "card3");

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BieuDoDuong;
    private javax.swing.JPanel Bieudocot;
    private javax.swing.JPanel Bieudotron;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Handle.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}

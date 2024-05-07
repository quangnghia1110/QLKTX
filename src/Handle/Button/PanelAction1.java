/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Handle.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAction1 extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction1
     */
    public PanelAction1() {
        initComponents();
    }
    public void initEvent1(TableActionEvent1 event, int row){
      if (event == null) {
           System.out.println("Event handler is not initialized");
           return;
       }
       processBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               event.onProcess(row);
           }
       });
       deleteBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               event.onDelete(row);
           }
       });
       detailBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               event.onDetail(row);
           }
       });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processBtn = new Handle.Button.ActionButton();
        deleteBtn = new Handle.Button.ActionButton();
        detailBtn = new Handle.Button.ActionButton();

        processBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Handle/Button/accept_icon.png"))); // NOI18N

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Handle/Button/delete_icon.png"))); // NOI18N

        detailBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Handle/Button/icons8-detail-25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Handle.Button.ActionButton deleteBtn;
    private Handle.Button.ActionButton detailBtn;
    private Handle.Button.ActionButton processBtn;
    // End of variables declaration//GEN-END:variables
}

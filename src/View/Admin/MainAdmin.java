
package View.Admin;

import View.Admin.RoomList.RoomList;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainAdmin extends javax.swing.JFrame {
    RoomList roomList = new RoomList();
    Notification notification = new Notification();
    UtilityBillList utilityBill=new UtilityBillList();
    ApprovingMoveAndRegister approvingPn = new ApprovingMoveAndRegister();
    StudentList studentList = new StudentList();
    private String username;
    public MainAdmin() {
        initComponents();
        menuAdmin1.setHeaderAdmin(this);
        setMinimumSize(new Dimension(600, 600));
        setLocationRelativeTo(null);
        requestFocus();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public void addRoomListToBody() {
        body.removeAll();
        roomList = new RoomList();
        body.add(roomList);
        body.revalidate();
        body.repaint();
    }
    public void addHomeToBody() {
        body.removeAll();
        body.add(pnHome);
        body.revalidate();
        body.repaint();
    }
    public void addApprovingToBody() {
        body.removeAll();
        approvingPn = new ApprovingMoveAndRegister();
        body.add(approvingPn);
        body.revalidate();
        body.repaint();
    }
    
    public void addStudentListToBody() {
        body.removeAll();
        studentList = new StudentList();
        body.add(studentList);
        body.revalidate();
        body.repaint();
    }
    
    public void addThongKeToBody(){
        ThongKePanel thongKePanel = new ThongKePanel();
        body.removeAll();
        body.add(thongKePanel);
        body.revalidate();
        body.repaint();
    }
    public void addNotificationToBody(){
        body.removeAll();
        notification = new Notification();
        body.add(notification);
        body.revalidate();
        body.repaint();
    }
    public void addUilityBillToBody(){
        body.removeAll();
        utilityBill = new UtilityBillList();
        body.add(utilityBill);
        body.revalidate();
        body.repaint();
    }
    

    public void addDutyScheduleToBody(){
        body.removeAll();
        LichTruc lichtruc = new LichTruc();
        body.add(lichtruc);
        body.revalidate();
        body.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menuAdmin1 = new View.Admin.MenuAdmin();
        body = new javax.swing.JPanel();
        pnHome = new Handle.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel2.setLayout(new java.awt.BorderLayout());

        menuAdmin1.setBackground(new java.awt.Color(17, 144, 119));
        menuAdmin1.setForeground(new java.awt.Color(17, 144, 119));
        jPanel2.add(menuAdmin1, java.awt.BorderLayout.LINE_START);

        body.setBackground(new java.awt.Color(204, 0, 0));
        body.setLayout(new java.awt.BorderLayout());

        pnHome.setBackground(new java.awt.Color(255, 255, 255));
        pnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnHome.setLayout(new java.awt.CardLayout(20, 20));
        body.add(pnHome, java.awt.BorderLayout.CENTER);

        jPanel2.add(body, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel2;
    private View.Admin.MenuAdmin menuAdmin1;
    private Handle.PanelRound pnHome;
    // End of variables declaration//GEN-END:variables
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        
        this.username = username;
    }
}
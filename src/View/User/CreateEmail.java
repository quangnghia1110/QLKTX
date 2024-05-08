/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.User;
import Dao.MailSinhVienDAO;
import Model.Student;
import Dao.StudentDAO;
import Dao.UserDAO;
import Handle.PanelRound;
import Model.StaticVariable;
import Model.User;
import View.Notification.SuccessfulExportAndImport;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.UUID;

/**
 *
 * @author ADMIN
 */
public class CreateEmail extends javax.swing.JFrame {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    
    
    /**
     * Creates new form updateProfile
     */
    public CreateEmail(java.awt.Frame parent, boolean modal, Student student) {
        initComponents();
this.student = student;
        btnGuiMail.setEnabled(false);
                setLocationRelativeTo(null);

    }
    
    public CreateEmail(java.awt.Frame parent, boolean modal) {
    String noiDung = jTextArea1.getText();
    
    // Truy xuất studentId từ mã sinh viên hiện tại
    MailSinhVienDAO mailSinhVienDAO = new MailSinhVienDAO();
    String studentId = mailSinhVienDAO.getId(student.getId()); // Giả sử phương thức getId(student.getId()) trả về một studentId duy nhất
    
    // Truy xuất adminId từ một nguồn khác hoặc từ cơ sở dữ liệu
    String adminId = getAdminId(); // Giả định phương thức này trả về adminId
    
    if (studentId != null && adminId != null) {
              // Chèn email với studentId và adminId vào cơ sở dữ liệu
        int x = MailSinhVienDAO.insertMail(adminId, studentId, noiDung, new Timestamp(System.currentTimeMillis()));
    
        if (x == 1) {
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Gửi Email Thành Công!");
            showDialog.setVisible(true);
        } else {
            SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Gửi Email Thất Bại!");
            showDialog.setVisible(true);        }   
    } else {
        JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sinh viên hoặc admin", "Thông Báo", JOptionPane.ERROR_MESSAGE);
    }
    }
// Phương thức này cần được thay đổi để truy vấn hoặc lấy adminId từ nguồn khác



    
    
    public void animationClick (PanelRound panel, String beforeColor) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGuiEmail = new Handle.PanelRound();
        btnGuiMail = new Handle.PanelRound();
        okLabel = new javax.swing.JLabel();
        cancelButton = new Handle.PanelRound();
        panelRound8 = new Handle.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        panelRound3 = new Handle.PanelRound();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(17, 144, 119));
        jPanel1.setLayout(new java.awt.CardLayout(5, 5));

        jPanel5.setBackground(new java.awt.Color(17, 144, 119));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NỘI DUNG EMAIL");
        jPanel5.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(17, 144, 119));

        btnGuiEmail.setRoundBottomLeft(20);
        btnGuiEmail.setRoundBottomRight(20);
        btnGuiEmail.setRoundTopLeft(20);
        btnGuiEmail.setRoundTopRight(20);
        btnGuiEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuiEmailMouseClicked(evt);
            }
        });
        btnGuiEmail.setLayout(new java.awt.CardLayout(5, 5));

        btnGuiMail.setBackground(new java.awt.Color(17, 144, 119));
        btnGuiMail.setRoundBottomLeft(10);
        btnGuiMail.setRoundBottomRight(10);
        btnGuiMail.setRoundTopLeft(10);
        btnGuiMail.setRoundTopRight(10);
        btnGuiMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuiMailMouseClicked(evt);
            }
        });

        okLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        okLabel.setForeground(new java.awt.Color(255, 255, 255));
        okLabel.setText("Gửi");
        okLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuiMail.add(okLabel);

        btnGuiEmail.add(btnGuiMail, "card2");

        cancelButton.setRoundBottomLeft(20);
        cancelButton.setRoundBottomRight(20);
        cancelButton.setRoundTopLeft(20);
        cancelButton.setRoundTopRight(20);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.setLayout(new java.awt.CardLayout(5, 5));

        panelRound8.setBackground(new java.awt.Color(204, 204, 204));
        panelRound8.setRoundBottomLeft(10);
        panelRound8.setRoundBottomRight(10);
        panelRound8.setRoundTopLeft(10);
        panelRound8.setRoundTopRight(10);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Hủy");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound8.add(jLabel11);

        cancelButton.add(panelRound8, "card2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btnGuiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout(10, 2));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nội dung:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout(20, 5));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(statusLabel);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(panelRound3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, "card2");

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuiEmailMouseClicked
        
    }//GEN-LAST:event_btnGuiEmailMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        animationClick(panelRound8, "#cccccc");
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void btnGuiMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuiMailMouseClicked
    String noiDung = jTextArea1.getText();
    
    if (!noiDung.isEmpty()) {
        // Truy xuất studentId từ mã sinh viên hiện tại
        MailSinhVienDAO mailSinhVienDAO = new MailSinhVienDAO();
        String studentId = mailSinhVienDAO.getId(student.getId()); // Giả sử phương thức getId(student.getId()) trả về một studentId duy nhất
        
        // Truy xuất adminId từ một nguồn khác hoặc từ cơ sở dữ liệu
        String adminId = getAdminId(); // Giả định phương thức này trả về adminId
        
        if (studentId != null && adminId != null) {
        
            // Chèn email với studentId và adminId vào cơ sở dữ liệu
            int x = MailSinhVienDAO.insertMail( adminId, studentId, noiDung, new Timestamp(System.currentTimeMillis()));
        
            if (x == 1) {
                SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Gửi Email Thành Công!");
                showDialog.setVisible(true);
            } else {
                SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, "Gửi Email Thất Bại!");
                showDialog.setVisible(true);
            }   
        } else {
            
            String errorMessage = "Không tìm thấy thông tin sinh viên hoặc admin";
            showErrorMessage(errorMessage);

        }
    } else {
        String errorMessage = "Nội dung không được để trống";
            showErrorMessage(errorMessage);
    }
    }//GEN-LAST:event_btnGuiMailMouseClicked
    private void showErrorMessage(String errorMessage) {
    SuccessfulExportAndImport showDialog = new SuccessfulExportAndImport(null, true, errorMessage);
    showDialog.setVisible(true);
}
    private String getAdminId() {
    UserDAO userDAO = new UserDAO(); 
    User adminUser = userDAO.getAdminUser(); 
    
    if(adminUser != null && adminUser.getUsername() != null && adminUser.isIsAdmin()) {
        return adminUser.getUsername(); 
    } else {
        return null; 
    }
}
    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        if(jTextArea1.getText().equals("")) {
            btnGuiMail.setEnabled(false);
        }
        if(!jTextArea1.getText().equals("")) {
            btnGuiMail.setEnabled(true);
        }
    }//GEN-LAST:event_jTextArea1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            CreateEmail dialog = new CreateEmail(new javax.swing.JFrame(), true);
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
    private Handle.PanelRound btnGuiEmail;
    private Handle.PanelRound btnGuiMail;
    private javax.swing.ButtonGroup buttonGroup1;
    private Handle.PanelRound cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel okLabel;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound8;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

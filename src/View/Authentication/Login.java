/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.Authentication;
import View.Notification.NotFoundUser;
import View.Notification.FailedLogIn;
import Handle.PanelRound;
import View.User.MyProfile;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import Model.Student;
import Dao.StudentDAO;
import Model.User;
import Dao.UserDAO;
import View.Admin.MainAdmin;
import View.User.MainUser;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JDialog {   
        
    
    /**
     * Creates new form Login
     */
    public Login(){
        getContentPane().setBackground(new java.awt.Color(153, 0, 51));
        initComponents();
        setLocationRelativeTo(null);
    }
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //setUndecorated(true);
        
        //jPanel1.setBorder(new EmptyBorder(25,25,25,25));
    
        // Set the background color of the content pane
        getContentPane().setBackground(new java.awt.Color(153, 0, 51));
        initComponents();
        setLocationRelativeTo(null);
         setFullScreen();

    }
    private void setFullScreen() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        setBounds(env.getMaximumWindowBounds());
    }

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
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelRound3 = new Handle.PanelRound();
        panelRound2 = new Handle.PanelRound();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new Handle.PanelRound();
        loginLabel = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRound4 = new Handle.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        pictureBox1 = new Util.PictureBox();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout(5, 5));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 425));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 10));
        jPanel1.add(jPanel2);

        panelRound3.setBackground(new java.awt.Color(17, 144, 119));
        panelRound3.setForeground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(new java.awt.CardLayout(4, 4));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usernameField.setForeground(new java.awt.Color(17, 144, 119));
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        usernameField.setCaretColor(new java.awt.Color(17, 144, 119));
        usernameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        loginBtn.setBackground(new java.awt.Color(17, 144, 119));
        loginBtn.setRoundBottomLeft(15);
        loginBtn.setRoundBottomRight(15);
        loginBtn.setRoundTopLeft(15);
        loginBtn.setRoundTopRight(15);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.setLayout(new java.awt.CardLayout(2, 2));

        loginLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("ĐĂNG NHẬP");
        loginBtn.add(loginLabel, "card2");

        forgotPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        forgotPassword.setText("Quên mật khẩu ?");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tạo tài khoản");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        panelRound4.setBackground(new java.awt.Color(17, 144, 119));
        panelRound4.setRoundBottomLeft(15);
        panelRound4.setRoundBottomRight(15);
        panelRound4.setRoundTopLeft(15);
        panelRound4.setRoundTopRight(15);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CHÀO MỪNG BẠN");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        showPasswordCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        showPasswordCheckBox.setText("Hiển thị mật khẩu");
        showPasswordCheckBox.setBorder(null);
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(forgotPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameField)
                            .addComponent(passwordField))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(forgotPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelRound3.add(panelRound2, "card2");

        jPanel1.add(panelRound3);

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel3, "card2");

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showPasswordCheckBox.isSelected()){
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setForeground(Color.decode("#00A9FF"));
        jLabel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new SignupDialog(this, true).setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void forgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseExited
        // TODO add your handling code here:
        forgotPassword.setForeground(Color.decode("#000000"));
    }//GEN-LAST:event_forgotPasswordMouseExited

    private void forgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseEntered
        // TODO add your handling code here:
        forgotPassword.setForeground(Color.decode("#00A9FF"));
    }//GEN-LAST:event_forgotPasswordMouseEntered

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        new ForgotPassword(this, true).setVisible(true);
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
       
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        animationClick(loginBtn, "#232D3F");
        UserDAO userDAO = new UserDAO();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        if(usernameField.getText().strip() == "" || password.strip() == ""){
            shakePanel(panelRound3);
            return;
        }
        //        System.out.println("pass"+password);
        if(userDAO.checkLogin(usernameField.getText().strip().toUpperCase(), password)== 1){
            System.out.println("yes");
            User user = userDAO.getUser(usernameField.getText());
            if(user.isIsAdmin()){
                MainAdmin mainAdmin = new MainAdmin();
                mainAdmin.setUsername(usernameField.getText().strip().toUpperCase());
                mainAdmin.setVisible(true);
                mainAdmin.requestFocus();

            }else{
                StudentDAO studentDAO = new StudentDAO();
                Student st = studentDAO.getStudentById(usernameField.getText());
                System.out.println(st.getName() + " " + st.getId());
                MainUser mainUser = new MainUser(st);
                mainUser.setVisible(true);
            }
            this.dispose();
        }else if (userDAO.checkLogin(usernameField.getText().strip().toUpperCase(), password)== 2){
            System.out.println("no");
            new FailedLogIn(this, true).setVisible(true);
        }else {
            System.out.println("no");
            new NotFoundUser(this, true).setVisible(true);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
        //userName = usernameField.getText();
    }//GEN-LAST:event_usernameFieldActionPerformed

    
    private void shakePanel(JPanel panel) {
    int originalX = panel.getX();
    int shakeDistance = 5; // Khoảng cách di chuyển khi rung rung

    Timer timer = new Timer(50, new ActionListener() {
        int shakeCount = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (shakeCount % 2 == 0) {
                panel.setLocation(panel.getX() + shakeDistance, panel.getY());
            } else {
                panel.setLocation(panel.getX() - shakeDistance, panel.getY());
            }

            shakeCount++;

            if (shakeCount >= 10) {
                // Dừng timer khi đạt số lần rung cần thiết
                ((Timer) e.getSource()).stop();
                panel.setLocation(originalX, panel.getY());
            }
        }
    });
    timer.start();
}

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private Handle.PanelRound loginBtn;
    private javax.swing.JLabel loginLabel;
    private Handle.PanelRound panelRound2;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound4;
    private javax.swing.JPasswordField passwordField;
    private Util.PictureBox pictureBox1;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}

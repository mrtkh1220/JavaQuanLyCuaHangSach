/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.AccountBUS;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.SwingUtilities;

/**
 *
 * @author HP
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginJFrame() {
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

        pnlImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwfPassword = new javax.swing.JPasswordField();
        lblLoginButton = new javax.swing.JLabel();
        lblExitButton = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        lblMiniLogo = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgGiay.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addComponent(lblImage)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addComponent(lblImage)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblLogin.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 18)); // NOI18N
        lblLogin.setText("Đăng nhập");

        lblUser.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblUser.setText("Tài khoản");

        txtUser.setFont(new java.awt.Font("#9Slide03 Source Sans Pro Extra", 0, 14)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtUser.setCaretColor(new java.awt.Color(0, 146, 242));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblPassword.setText("Mật khẩu");

        pwfPassword.setFont(new java.awt.Font("#9Slide03 Source Sans Pro Extra", 0, 14)); // NOI18N
        pwfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pwfPassword.setCaretColor(new java.awt.Color(0, 146, 242));
        pwfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwfPasswordFocusLost(evt);
            }
        });
        pwfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwfPasswordKeyPressed(evt);
            }
        });

        lblLoginButton.setBackground(new java.awt.Color(0, 146, 242));
        lblLoginButton.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 0, 14)); // NOI18N
        lblLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginButton.setText("Đăng nhập");
        lblLoginButton.setOpaque(true);
        lblLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseExited(evt);
            }
        });

        lblExitButton.setBackground(new java.awt.Color(255, 255, 255));
        lblExitButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExitButton.setText("X");
        lblExitButton.setOpaque(true);
        lblExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseExited(evt);
            }
        });

        lblCopyright.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblCopyright.setText("© Cung cấp và thiết kế bởi");

        lblMiniLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/miniLogoB.png"))); // NOI18N

        lblError.setBackground(new java.awt.Color(29, 27, 28));
        lblError.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 0, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("Tài khoản hoặc mật khẩu không hợp lệ");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblCopyright)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMiniLogo))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPassword)
                            .addComponent(lblUser)
                            .addComponent(lblLogin)
                            .addComponent(pwfPassword)
                            .addComponent(txtUser))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addComponent(lblExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCopyright, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMiniLogo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseEntered
        lblExitButton.setBackground(Color.decode("#0092f2"));
    }//GEN-LAST:event_lblExitButtonMouseEntered

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt))   
            System.exit(0);
    }//GEN-LAST:event_lblExitButtonMouseClicked

    private void lblExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseExited
        lblExitButton.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblExitButtonMouseExited

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            pwfPassword.requestFocus();
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0,0,1,0,java.awt.Color.decode("#0092f2")));
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,Color.BLACK));
    }//GEN-LAST:event_txtUserFocusLost

    private void pwfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwfPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
             Login();
        
    }//GEN-LAST:event_pwfPasswordKeyPressed
    public void Login(){
        if(txtUser.getText().equals("") || pwfPassword.getText().equals(""))    
        lblError.setForeground(java.awt.Color.decode("#d2302c"));
        else{
            AccountDTO account = new AccountDTO(txtUser.getText(),pwfPassword.getText());
                if(!AccountBUS.getAuth(account)) lblError.setForeground(java.awt.Color.decode("#d2302c"));
            else {
                  if(account.getRole().equals("admin")){
                    this.dispose();
                    new quanlycuahangsach.quanlycuahangsach().setVisible(true);
                    
                  }
                  else
                      
                  if(account.getRole().indexOf("1") < 0 || account.getRole().indexOf("1") > 10) GUI.SweetAlert.SweetAlert.showSweetAlert(new javax.swing.JFrame(), "Lỗi", "Tài khoản này chưa được cấp quyền.", 1);
                  else{
                  this.dispose();
                  new quanlycuahangsach.quanlycuahangsach().setVisible(true);
                  }
            }
        }

    }
    private void pwfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwfPasswordFocusGained
        pwfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,java.awt.Color.decode("#0092f2")));
    }//GEN-LAST:event_pwfPasswordFocusGained

    private void pwfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwfPasswordFocusLost
        pwfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,Color.BLACK));
    }//GEN-LAST:event_pwfPasswordFocusLost

    private void lblLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt))
        {    
           Login();
        }
    }//GEN-LAST:event_lblLoginButtonMouseClicked

    private void lblLoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseEntered
        lblLoginButton.setBackground(Color.decode("#0064a6"));
    }//GEN-LAST:event_lblLoginButtonMouseEntered

    private void lblLoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseExited
        lblLoginButton.setBackground(Color.decode("#0092f2"));
    }//GEN-LAST:event_lblLoginButtonMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLoginButton;
    private javax.swing.JLabel lblMiniLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

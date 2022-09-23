package com.polypro.view;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author PHUOCTAI
 */
public class Login extends javax.swing.JFrame {

    ImageIcon icon;
    Timer thoiGian;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtPassword.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.setTitle("LOGIN");
        changeIcon();
        setInterface();
    }

    private void setInterface() {
        txtPassword.requestFocus();
        btnFacebook.setBackground(Color.white);
        btnGoogle.setBackground(Color.white);
        lblLogin.requestFocus();
        txtPassword.setEchoChar((char) 0);
        lblErorUsername.setVisible(false);
        lblErorPassword.setVisible(false);
    }

    public void changeIcon() {
        icon = new ImageIcon("src//com/polypro/view/icon/decor_1.png");
        setIconImage(icon.getImage());
    }

    private boolean checking() {
        String pass = new String(txtPassword.getPassword()).trim();
        if ((txtUsername.getText().isEmpty() || txtUsername.getText().trim().equalsIgnoreCase("Username")) && (pass.isEmpty() || pass.equalsIgnoreCase("Password"))) {
            lblErorUsername.setVisible(true);
            txtUsername.setText("");
            lblErorPassword.setVisible(true);
            txtPassword.setText("");
            return false;
        } else if (txtUsername.getText().isEmpty() || txtUsername.getText().trim().equalsIgnoreCase("Username")) {
            lblErorUsername.setVisible(true);
            lblErorPassword.setVisible(false);
            txtUsername.setText("");
            return false;

        } else if (pass.isEmpty() || pass.equalsIgnoreCase("Password")) {
            lblErorPassword.setVisible(true);
            lblErorUsername.setVisible(false);
            txtPassword.setText("");
            return false;
        } else {
            lblErorUsername.setVisible(false);
            lblErorPassword.setVisible(false);
            return true;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        lblErorPassword = new javax.swing.JLabel();
        lblErorUsername = new javax.swing.JLabel();
        viewPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFacebook = new javax.swing.JButton();
        btnGoogle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblErorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErorPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorPassword.setText("Please enter your Password!");
        pnlRight.add(lblErorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        lblErorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErorUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorUsername.setText("Please enter your Username!");
        pnlRight.add(lblErorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, 30));

        viewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/show.png"))); // NOI18N
        viewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        viewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewPassMouseReleased(evt);
            }
        });
        pnlRight.add(viewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/user.png"))); // NOI18N
        pnlRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 57, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/padlockk.png"))); // NOI18N
        pnlRight.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 124, -1, -1));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.setText("  Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        pnlRight.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 37, 297, 52));

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/button_login_1.png"))); // NOI18N
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        lblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblLoginKeyTyped(evt);
            }
        });
        pnlRight.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("OR");
        pnlRight.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 277, -1, -1));

        btnFacebook.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/fb.png"))); // NOI18N
        btnFacebook.setText(" Continue with Facebook");
        btnFacebook.setBorder(new javax.swing.border.MatteBorder(null));
        btnFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacebook.setMargin(new java.awt.Insets(2, 35, 2, 14));
        pnlRight.add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 336, 356, 50));

        btnGoogle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/google.png"))); // NOI18N
        btnGoogle.setText(" Continue with Google");
        btnGoogle.setBorder(new javax.swing.border.MatteBorder(null));
        btnGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRight.add(btnGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 399, 356, 50));

        jLabel7.setText("___________");
        pnlRight.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 20));

        jLabel8.setText("___________");
        pnlRight.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 20));

        txtPassword.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("   Password");
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtPassword.setEchoChar('\uf06c');
        txtPassword.setFocusCycleRoot(true);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        pnlRight.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 260, 50));

        getContentPane().add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 440, 470));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/backgr_1.png"))); // NOI18N
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        lblErorUsername.setVisible(false);
        if (txtUsername.getText().trim().equalsIgnoreCase("Username")) {
            txtUsername.setText("");
            txtUsername.setFont(new Font("Roboto", Font.PLAIN, 18));
            txtUsername.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().trim().equals("")) {
            if (lblErorUsername.isVisible()) {
                txtUsername.setText("");
            } else {
                txtUsername.setText("Username");
                txtUsername.setForeground(Color.LIGHT_GRAY);
                txtUsername.setFont(new Font("Roboto", Font.PLAIN, 16));
            }
        } else {
            txtUsername.setText(txtUsername.getText());
            txtUsername.setFont(new Font("Roboto", Font.PLAIN, 18));
            txtUsername.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        lblErorPassword.setVisible(false);
        String pass = String.valueOf(txtPassword.getPassword()).trim();
//        System.out.println(pass);
        if (pass.equalsIgnoreCase("Password")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        String pass = String.valueOf(txtPassword.getPassword()).trim();
        if (pass.equalsIgnoreCase("")) {
            if (lblErorPassword.isVisible()) {
                txtPassword.setText("");
            } else {
                txtPassword.setText("Password");
                txtPassword.setFont(new Font("Caribi", Font.PLAIN, 16));
                txtPassword.setForeground(Color.LIGHT_GRAY);
            }
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void viewPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassMousePressed
        String view = String.valueOf(txtPassword.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Password")) {
            return;
        }
        txtPassword.setEchoChar((char) 0);
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 18));
        viewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/dontshow.png"));

    }//GEN-LAST:event_viewPassMousePressed

    private void viewPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassMouseReleased
        String view = String.valueOf(txtPassword.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Password")) {
            return;
        }
        txtPassword.setEchoChar('\uf06c');
        txtPassword.setFont(new Font("Caribi", Font.PLAIN, 16));
        viewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/show.png"));
    }//GEN-LAST:event_viewPassMouseReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        String pass = new String(txtPassword.getPassword());
        if (!pass.isEmpty()) {
            txtPassword.setFont(new Font("Caribi", Font.PLAIN, 16));
            txtPassword.setEchoChar('\uf06c');
            txtPassword.setText(String.valueOf(pass));
            txtPassword.setForeground(Color.black);
        } else {
            txtPassword.setText("");
            txtPassword.setEchoChar((char) 0);
            txtPassword.setForeground(Color.LIGHT_GRAY);
            txtPassword.setFont(new Font("Roboto", Font.PLAIN, 16));
        }

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked

    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setIcon(new ImageIcon("src//com/polypro/view/icon/button_login_2.png"));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        lblLogin.setIcon(new ImageIcon("src//com/polypro/view/icon/button_login_1.png"));
    }//GEN-LAST:event_lblLoginMouseExited

    private void lblLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyTyped

    }//GEN-LAST:event_lblLoginKeyTyped

    private void lblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyPressed

    }//GEN-LAST:event_lblLoginKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnGoogle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblErorPassword;
    private javax.swing.JLabel lblErorUsername;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel viewPass;
    // End of variables declaration//GEN-END:variables
}

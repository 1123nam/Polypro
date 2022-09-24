/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.view;


import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PHUOCTAI
 */
public class ChangePass extends javax.swing.JFrame {

    ImageIcon icon;


    public ChangePass() {
        initComponents();
        changeIcon();
        this.setLocationRelativeTo(null);
        this.setTitle("CHANGE PASSWORD");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtOldPass.setEchoChar((char) 0);
        txtNewPass.setEchoChar((char) 0);
        txtConfirm.setEchoChar((char) 0);
        lblErorUsername.setVisible(false);
        lblErorOldPassword.setVisible(false);
        lblErorNewPassword.setVisible(false);
        lblErorConfirm.setVisible(false);
        lblTitle.setFocusable(true);
    }

    public void changeIcon() {
        icon = new ImageIcon("src//com/polypro/view/icon/update.png");
        setIconImage(icon.getImage());
    }

    private void checkConfirmError() {
        if (!String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtConfirm.getPassword()))) {
            lblErorConfirm.setVisible(true);
            txtConfirm.setText("");
        } else {
            lblErorConfirm.setVisible(false);
        }
    }

    private boolean checkNull() {
        if (!(String.valueOf(txtOldPass.getPassword()).equals(""))
                && !(String.valueOf(txtOldPass.getPassword()).equals("Old Password"))
                && !(String.valueOf(txtNewPass.getPassword()).equals(""))
                && !(String.valueOf(txtNewPass.getPassword()).equals("New Password"))
                && (String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtConfirm.getPassword())))) {
            return true;
        }
        if ((String.valueOf(txtOldPass.getPassword()).equals("") || (String.valueOf(txtOldPass.getPassword()).equals("Old Password")))) {
            lblErorOldPassword.setVisible(true);
            txtOldPass.setText("");
        } else {
            lblErorConfirm.setVisible(false);
        }

        if ((String.valueOf(txtNewPass.getPassword()).equals("") || String.valueOf(txtNewPass.getPassword()).equals("New Password"))
                || ((String.valueOf(txtNewPass.getPassword()).length() < 5)) || ((String.valueOf(txtNewPass.getPassword()).length() > 20))) {
            lblErorNewPassword.setVisible(true);
            txtNewPass.setText("");
        } else {
            lblErorConfirm.setVisible(false);
            checkConfirmError();
        }

        return false;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignup = new javax.swing.JPanel();
        lblErorNewPassword = new javax.swing.JLabel();
        lblErorConfirm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewConfirmPass = new javax.swing.JLabel();
        viewNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        lblChange = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblErorOldPassword = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        lblErorUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSignup.setBackground(new java.awt.Color(255, 255, 255));
        pnlSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblErorNewPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErorNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorNewPassword.setText("Please enter your new Password! (5- 20 character)");
        pnlSignup.add(lblErorNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 330, 30));

        lblErorConfirm.setForeground(new java.awt.Color(255, 51, 51));
        lblErorConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorConfirm.setText("Please confirm your new Password!");
        pnlSignup.add(lblErorConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/newpassword.png"))); // NOI18N
        pnlSignup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/confirmation.png"))); // NOI18N
        pnlSignup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        viewConfirmPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/show.png"))); // NOI18N
        viewConfirmPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        viewConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewConfirmPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewConfirmPassMouseReleased(evt);
            }
        });
        pnlSignup.add(viewConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 30, 50));

        viewNewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/show.png"))); // NOI18N
        viewNewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        viewNewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewNewPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewNewPassMouseReleased(evt);
            }
        });
        pnlSignup.add(viewNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 30, 50));

        txtNewPass.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtNewPass.setForeground(new java.awt.Color(204, 204, 204));
        txtNewPass.setText("New Password");
        txtNewPass.setToolTipText("");
        txtNewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtNewPass.setFocusCycleRoot(true);
        txtNewPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPassFocusLost(evt);
            }
        });
        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassKeyReleased(evt);
            }
        });
        pnlSignup.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 330, 50));

        txtConfirm.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtConfirm.setForeground(new java.awt.Color(204, 204, 204));
        txtConfirm.setText("Confirm Password");
        txtConfirm.setToolTipText("");
        txtConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtConfirm.setFocusCycleRoot(true);
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmFocusLost(evt);
            }
        });
        txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmKeyReleased(evt);
            }
        });
        pnlSignup.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 340, 50));

        lblChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/button_change.png"))); // NOI18N
        lblChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChangeMouseExited(evt);
            }
        });
        pnlSignup.add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord3.png"))); // NOI18N
        pnlSignup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord6.png"))); // NOI18N
        pnlSignup.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord4.png"))); // NOI18N
        pnlSignup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 70, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord2.png"))); // NOI18N
        pnlSignup.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord1.png"))); // NOI18N
        pnlSignup.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_decord5.png"))); // NOI18N
        pnlSignup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/title_changepass.png"))); // NOI18N
        pnlSignup.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/padlockk.png"))); // NOI18N
        pnlSignup.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblErorOldPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErorOldPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorOldPassword.setText("Please enter your old Password!");
        pnlSignup.add(lblErorOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 320, 30));

        txtOldPass.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtOldPass.setForeground(new java.awt.Color(204, 204, 204));
        txtOldPass.setText("Old Password");
        txtOldPass.setToolTipText("");
        txtOldPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtOldPass.setFocusCycleRoot(true);
        txtOldPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOldPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOldPassFocusLost(evt);
            }
        });
        txtOldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPassKeyReleased(evt);
            }
        });
        pnlSignup.add(txtOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 360, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/user.png"))); // NOI18N
        pnlSignup.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblErorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErorUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/error.png"))); // NOI18N
        lblErorUsername.setText("Please enter your Usename!");
        pnlSignup.add(lblErorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 320, 30));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.setText("Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        pnlSignup.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 360, 50));

        getContentPane().add(pnlSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 560, 473));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/backgr_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewConfirmPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewConfirmPassMousePressed
        String view = String.valueOf(txtConfirm.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Confirm Password")) {
            return;
        }
        txtConfirm.setEchoChar((char) 0);
        txtConfirm.setFont(new Font("Arial", Font.PLAIN, 18));
        viewConfirmPass.setIcon(new ImageIcon("src//com/polypro/view/icon/dontshow.png"));
    }//GEN-LAST:event_viewConfirmPassMousePressed

    private void viewConfirmPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewConfirmPassMouseReleased
        String view = String.valueOf(txtConfirm.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Confirm Password")) {
            return;
        }
        txtConfirm.setEchoChar('\uf06c');
        txtConfirm.setFont(new Font("Caribi", Font.PLAIN, 16));
        viewConfirmPass.setIcon(new ImageIcon("src//com/polypro/view/icon/show.png"));
    }//GEN-LAST:event_viewConfirmPassMouseReleased

    private void viewNewPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNewPassMousePressed
        String view = String.valueOf(txtNewPass.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("New Password")) {
            return;
        }
        txtNewPass.setEchoChar((char) 0);
        txtNewPass.setFont(new Font("Arial", Font.PLAIN, 18));
        viewNewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/dontshow.png"));
    }//GEN-LAST:event_viewNewPassMousePressed

    private void viewNewPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNewPassMouseReleased
        String view = String.valueOf(txtNewPass.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("New Password")) {
            return;
        }
        txtNewPass.setEchoChar('\uf06c');
        txtNewPass.setFont(new Font("Caribi", Font.PLAIN, 16));
        viewNewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/show.png"));
    }//GEN-LAST:event_viewNewPassMouseReleased

    private void txtNewPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPassFocusGained
        lblErorNewPassword.setVisible(false);
        String pass = String.valueOf(txtNewPass.getPassword()).trim();
        if (pass.equalsIgnoreCase("New Password")) {
            txtNewPass.setText("");
            txtNewPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNewPassFocusGained

    private void txtNewPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPassFocusLost
        String pass = String.valueOf(txtNewPass.getPassword()).trim();
        if (pass.equalsIgnoreCase("")) {
            if (lblErorNewPassword.isVisible()) {
                txtNewPass.setText("");
            } else {
                txtNewPass.setText("New Password");
                txtNewPass.setForeground(Color.LIGHT_GRAY);
            }
        }
    }//GEN-LAST:event_txtNewPassFocusLost

    private void txtNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyReleased
        String pass = new String(txtNewPass.getPassword());
        if (!pass.isEmpty()) {
            txtNewPass.setFont(new Font("Caribi", Font.PLAIN, 16));
            txtNewPass.setEchoChar('\uf06c');
            txtNewPass.setText(String.valueOf(pass));
            txtNewPass.setForeground(Color.black);
        } else {
            txtNewPass.setText("");
            txtNewPass.setEchoChar((char) 0);
            txtNewPass.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtNewPassKeyReleased

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
        lblErorConfirm.setVisible(false);
        String cfPass = String.valueOf(txtConfirm.getPassword());
        if (cfPass.equalsIgnoreCase("Confirm Password")) {
            txtConfirm.setText("");
            txtConfirm.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtConfirmFocusGained

    private void txtConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusLost
        String cfPass = String.valueOf(txtConfirm.getPassword());
        if (cfPass.equalsIgnoreCase("")) {
            if (lblErorConfirm.isVisible()) {
                txtConfirm.setText("");
            } else {
                txtConfirm.setText("Confirm Password");
                txtConfirm.setForeground(Color.LIGHT_GRAY);
            }
        }
    }//GEN-LAST:event_txtConfirmFocusLost

    private void txtConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmKeyReleased
        String pass = new String(txtConfirm.getPassword());
        if (!pass.isEmpty()) {
            txtConfirm.setFont(new Font("Caribi", Font.PLAIN, 16));
            txtConfirm.setEchoChar('\uf06c');
            txtConfirm.setText(String.valueOf(pass));
            txtConfirm.setForeground(Color.black);
        } else {

            txtConfirm.setText("");
            txtConfirm.setEchoChar((char) 0);
            txtConfirm.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtConfirmKeyReleased

    private void lblChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseEntered
        lblChange.setIcon(new ImageIcon("src//com/polypro/view/icon/button_change_hover.png"));
    }//GEN-LAST:event_lblChangeMouseEntered

    private void lblChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseExited
        lblChange.setIcon(new ImageIcon("src//com/polypro/view/icon/button_change.png"));
    }//GEN-LAST:event_lblChangeMouseExited

    private void lblChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseClicked

    }//GEN-LAST:event_lblChangeMouseClicked

    private void txtOldPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOldPassFocusGained
        lblErorOldPassword.setVisible(false);
        String pass = String.valueOf(txtOldPass.getPassword()).trim();
        if (pass.equalsIgnoreCase("Old Password")) {
            txtOldPass.setText("");
            txtOldPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtOldPassFocusGained

    private void txtOldPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOldPassFocusLost
        String pass = String.valueOf(txtOldPass.getPassword()).trim();
        if (pass.equalsIgnoreCase("")) {
            if (lblErorOldPassword.isVisible()) {
                txtOldPass.setText("");
            } else {
                txtOldPass.setText("Old Password");
                txtOldPass.setForeground(Color.LIGHT_GRAY);
            }
        }
    }//GEN-LAST:event_txtOldPassFocusLost

    private void txtOldPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPassKeyReleased
        String pass = new String(txtOldPass.getPassword());
        if (!pass.isEmpty()) {
            txtOldPass.setFont(new Font("Caribi", Font.PLAIN, 16));
            txtOldPass.setText(String.valueOf(pass));
            txtOldPass.setForeground(Color.black);
        } else {
            txtOldPass.setText("");
            txtOldPass.setEchoChar((char) 0);
            txtOldPass.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtOldPassKeyReleased

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblErorConfirm;
    private javax.swing.JLabel lblErorNewPassword;
    private javax.swing.JLabel lblErorOldPassword;
    private javax.swing.JLabel lblErorUsername;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlSignup;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel viewConfirmPass;
    private javax.swing.JLabel viewNewPass;
    // End of variables declaration//GEN-END:variables
}

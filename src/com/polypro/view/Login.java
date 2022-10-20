package com.polypro.view;

import com.polypro.DAO.NhanVienDAO;
import com.polypro.model.NhanVien;
import com.polypro.utils.Auth;
import com.polypro.utils.MsgBox;
//import com.sun.glass.events.KeyEvent;
//import com.sun.glass.events.WindowEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
        txtMaNhanVien.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.setTitle("LOGIN");
        changeIcon();
        setInterface();
        btnLogin.requestFocus();
    }

    private void setInterface() {
        txtMatKhau.setEchoChar((char) 0);
    }

    public void changeIcon() {
        icon = new ImageIcon("icon/decor_1.png");
        setIconImage(icon.getImage());
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/user.png"))); // NOI18N
        pnlRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/padlockk.png"))); // NOI18N
        pnlRight.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtMaNhanVien.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtMaNhanVien.setForeground(new java.awt.Color(204, 204, 204));
        txtMaNhanVien.setText("Tên đăng nhập");
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtMaNhanVien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaNhanVienFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaNhanVienFocusLost(evt);
            }
        });
        pnlRight.add(txtMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 297, 52));

        txtMatKhau.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(204, 204, 204));
        txtMatKhau.setText("Mật khẩu");
        txtMatKhau.setToolTipText("");
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtMatKhau.setEchoChar('\uf06c');
        txtMatKhau.setFocusCycleRoot(true);
        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusLost(evt);
            }
        });
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyReleased(evt);
            }
        });
        pnlRight.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 146, 161));
        jLabel4.setText("ĐĂNG NHẬP");
        pnlRight.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnLogin.setBackground(new java.awt.Color(40, 146, 161));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlRight.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 300, 50));

        getContentPane().add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 440, 470));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/backgr_1.png"))); // NOI18N
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNhanVienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNhanVienFocusGained
        if (txtMaNhanVien.getText().trim().equalsIgnoreCase("Tên đăng nhập")) {
            txtMaNhanVien.setText("");
            txtMaNhanVien.setFont(new Font("Roboto", Font.PLAIN, 20));
            txtMaNhanVien.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtMaNhanVienFocusGained

    private void txtMaNhanVienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNhanVienFocusLost
        if (txtMaNhanVien.getText().trim().equals("")) {
          
                txtMaNhanVien.setText("Tên đăng nhập");
                txtMaNhanVien.setForeground(Color.LIGHT_GRAY);
                txtMaNhanVien.setFont(new Font("Roboto", Font.PLAIN, 16));
        } else {
            txtMaNhanVien.setText(txtMaNhanVien.getText());
            txtMaNhanVien.setFont(new Font("Roboto", Font.PLAIN, 18));
            txtMaNhanVien.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtMaNhanVienFocusLost

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        String pass = String.valueOf(txtMatKhau.getPassword()).trim();
//        System.out.println(pass);
        if (pass.equalsIgnoreCase("Mật khẩu")) {
            txtMatKhau.setText("");
            txtMatKhau.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void txtMatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusLost
        String pass = String.valueOf(txtMatKhau.getPassword()).trim();
        if (pass.equalsIgnoreCase("")) {
          
                txtMatKhau.setText("Mật khẩu");
                txtMatKhau.setFont(new Font("Caribi", Font.PLAIN, 16));
                txtMatKhau.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtMatKhauFocusLost

    private void txtMatKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyReleased
        String pass = new String(txtMatKhau.getPassword());
        if (!pass.isEmpty()) {
            txtMatKhau.setFont(new Font("Caribi", Font.PLAIN, 16));
            txtMatKhau.setEchoChar('\uf06c');
            txtMatKhau.setText(String.valueOf(pass));
            txtMatKhau.setForeground(Color.black);
        } else {
            txtMatKhau.setText("");
            txtMatKhau.setEchoChar((char) 0);
            txtMatKhau.setForeground(Color.LIGHT_GRAY);
            txtMatKhau.setFont(new Font("Roboto", Font.PLAIN, 16));
        }
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            if (checkInput()) {
                login();
            }
        }

    }//GEN-LAST:event_txtMatKhauKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean isExit = MsgBox.confirm(this, "Bạn có chắc chắn muốn thoát khỏi chương trình ?");
        if (!isExit) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (checkInput()) {
            login();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables

    private boolean checkInput() {
        StringBuilder sb = new StringBuilder();
        String maNV = txtMaNhanVien.getText();
        String matKhau = String.valueOf(txtMatKhau.getPassword());
        if (maNV.equals("") || maNV.equals("Tên đăng nhập")) {
            sb.append("Tên đăng nhập không được để trống\n");
        }
        if (matKhau.equals("") || matKhau.equals("Mật khẩu")) {
            sb.append("Mật khẩu không được để trống\n");
        }
        if (sb.length() > 0) {
            sb.append("Vui lòng kiểm tra lại !");
            MsgBox.alert(this, sb.toString());
            return false;
        }
        return true;
    }

    private void login() {

        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        String maNV = txtMaNhanVien.getText();
        String matKhau = String.valueOf(txtMatKhau.getPassword());
        NhanVien nhanVien = nhanVienDAO.selectID(maNV);
        if (nhanVien == null) {
            MsgBox.alert(this, "Tên đăng nhập của bạn không đúng. Vui lòng kiểm tra lại");
            txtMaNhanVien.requestFocus();
        } else if (!matKhau.equals(nhanVien.getMatKhau())) {
            MsgBox.alert(this, "Mật khẩu của bạn không đúng. Vui lòng kiểm tra lại");
            txtMatKhau.requestFocus();
        } else {
            Auth.user = nhanVien;
            new mainframe_update().setVisible(true);
            this.dispose();
        }
    }

}

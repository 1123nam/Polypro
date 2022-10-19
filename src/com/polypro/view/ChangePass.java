/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.view;

import com.polypro.DAO.NhanVienDAO;
import com.polypro.utils.Auth;
import com.polypro.utils.MsgBox;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
        txtMaNhanVien.setText(Auth.user.getMaNV());
        txtMaNhanVien.setEditable(false);
//        this.setTitle("CHANGE PASSWORD");
//        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        txtMatkhauMoi.setEchoChar((char) 0);
//        txtXacNhanMatkhauMoi.setEchoChar((char) 0);
    }

    public void changeIcon() {
        icon = new ImageIcon("src//com/polypro/view/icon/update.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignup = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtMatkhauCu = new javax.swing.JPasswordField();
        txtMatkhauMoi = new javax.swing.JPasswordField();
        txtXacNhanMatkhauMoi = new javax.swing.JPasswordField();
        viewNewPass = new javax.swing.JLabel();
        viewConfirmPass = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSignup.setBackground(new java.awt.Color(255, 255, 255));
        pnlSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 146, 161));
        jLabel7.setText("Tên đăng nhập");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 146, 161));
        jLabel14.setText("Mật khẩu hiện tại");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(40, 146, 161));
        jLabel15.setText("Mật khẩu mới ");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(40, 146, 161));
        jLabel16.setText("Xác nhận lại mật khẩu");

        txtMaNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        txtMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVienActionPerformed(evt);
            }
        });

        txtMatkhauCu.setBackground(new java.awt.Color(255, 255, 255));
        txtMatkhauCu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMatkhauCu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtMatkhauCu.setEchoChar('\uf06c');
        txtMatkhauCu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatkhauCuFocusGained(evt);
            }
        });

        txtMatkhauMoi.setBackground(new java.awt.Color(255, 255, 255));
        txtMatkhauMoi.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtMatkhauMoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtMatkhauMoi.setEchoChar('\uf06c');
        txtMatkhauMoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatkhauMoiFocusGained(evt);
            }
        });

        txtXacNhanMatkhauMoi.setBackground(new java.awt.Color(255, 255, 255));
        txtXacNhanMatkhauMoi.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtXacNhanMatkhauMoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtXacNhanMatkhauMoi.setEchoChar('\uf06c');
        txtXacNhanMatkhauMoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXacNhanMatkhauMoiFocusGained(evt);
            }
        });

        viewNewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/show.png"))); // NOI18N
        viewNewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewNewPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewNewPassMouseReleased(evt);
            }
        });

        viewConfirmPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/show.png"))); // NOI18N
        viewConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewConfirmPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewConfirmPassMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXacNhanMatkhauMoi)
                    .addComponent(txtMatkhauMoi)
                    .addComponent(txtMatkhauCu)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaNhanVien)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewConfirmPass)
                    .addComponent(viewNewPass))
                .addGap(1507, 1507, 1507))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatkhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatkhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewNewPass))
                .addGap(31, 31, 31)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXacNhanMatkhauMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewConfirmPass, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlSignup.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 360, 430));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(40, 146, 161));
        jLabel11.setText("ĐỔI MẬT KHẨU");
        pnlSignup.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

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
        pnlSignup.add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 180, 70));

        getContentPane().add(pnlSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 460, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/bg_changepass.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1230, -290, 1590, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewConfirmPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewConfirmPassMousePressed
        String view = String.valueOf(txtXacNhanMatkhauMoi.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Confirm Password")) {
            return;
        }
        txtXacNhanMatkhauMoi.setEchoChar((char) 0);
        txtXacNhanMatkhauMoi.setFont(new Font("Arial", Font.PLAIN, 18));
        viewConfirmPass.setIcon(new ImageIcon("src//com/polypro/view/icon/dontshow.png"));
    }//GEN-LAST:event_viewConfirmPassMousePressed

    private void viewConfirmPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewConfirmPassMouseReleased
        String view = String.valueOf(txtXacNhanMatkhauMoi.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("Confirm Password")) {
            return;
        }
        txtXacNhanMatkhauMoi.setEchoChar('\uf06c');
        txtXacNhanMatkhauMoi.setFont(new Font("Caribi", Font.PLAIN, 16));
        viewConfirmPass.setIcon(new ImageIcon("src//com/polypro/view/icon/show.png"));
    }//GEN-LAST:event_viewConfirmPassMouseReleased

    private void viewNewPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNewPassMousePressed
        String view = String.valueOf(txtMatkhauMoi.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("New Password")) {
            return;
        }
        txtMatkhauMoi.setEchoChar((char) 0);
        txtMatkhauMoi.setFont(new Font("Arial", Font.PLAIN, 18));
        viewNewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/dontshow.png"));
    }//GEN-LAST:event_viewNewPassMousePressed

    private void viewNewPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNewPassMouseReleased
        String view = String.valueOf(txtMatkhauMoi.getPassword()).trim();
        if (view.isEmpty() || view.equalsIgnoreCase("New Password")) {
            return;
        }
        txtMatkhauMoi.setEchoChar('\uf06c');
        txtMatkhauMoi.setFont(new Font("Caribi", Font.PLAIN, 16));
        viewNewPass.setIcon(new ImageIcon("src//com/polypro/view/icon/show.png"));
    }//GEN-LAST:event_viewNewPassMouseReleased

    private void lblChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseEntered
        lblChange.setIcon(new ImageIcon("src//com/polypro/view/icon/button_change_hover.png"));
    }//GEN-LAST:event_lblChangeMouseEntered

    private void lblChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseExited
        lblChange.setIcon(new ImageIcon("src//com/polypro/view/icon/button_change.png"));
    }//GEN-LAST:event_lblChangeMouseExited

    private void lblChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeMouseClicked
        if (checkNull()) {
            changePassword();
        }
    }//GEN-LAST:event_lblChangeMouseClicked

    private void txtMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVienActionPerformed

    private void txtMatkhauMoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatkhauMoiFocusGained
        txtMatkhauMoi.setEchoChar('\uf06c');
        txtMatkhauMoi.setFont(new Font("Caribi", Font.PLAIN, 16));
    }//GEN-LAST:event_txtMatkhauMoiFocusGained

    private void txtXacNhanMatkhauMoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXacNhanMatkhauMoiFocusGained
        txtXacNhanMatkhauMoi.setEchoChar('\uf06c');
        txtXacNhanMatkhauMoi.setFont(new Font("Caribi", Font.PLAIN, 16));
    }//GEN-LAST:event_txtXacNhanMatkhauMoiFocusGained

    private void txtMatkhauCuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatkhauCuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatkhauCuFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String[] languages = {"Trở về ", "Thoát"};
        int options = JOptionPane.showOptionDialog(this, "Bạn có muốn quay về Trang chủ ?", "Hệ thống đào tạo ", 0, JOptionPane.QUESTION_MESSAGE, null, languages, "Trở về Trang Chủ");
        if (options == 0) {
            new mainframe_update().setVisible(true);
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          this.dispose();
        } else if (options != 1 && options != 0) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }

    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblChange;
    private javax.swing.JPanel pnlSignup;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtMatkhauCu;
    private javax.swing.JPasswordField txtMatkhauMoi;
    private javax.swing.JPasswordField txtXacNhanMatkhauMoi;
    private javax.swing.JLabel viewConfirmPass;
    private javax.swing.JLabel viewNewPass;
    // End of variables declaration//GEN-END:variables

    private void changePassword() {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();

        String maNhanVien = txtMaNhanVien.getText();
        String matKhauCu = String.valueOf(txtMatkhauCu.getPassword());
        String matKhauMoi = String.valueOf(txtMatkhauMoi.getPassword());
        String xacNhanMK = String.valueOf(txtXacNhanMatkhauMoi.getPassword());

        if (!xacNhanMK.equals(matKhauMoi)) {
            MsgBox.alert(this, "Vui lòng xác nhận lại mật khẩu !");
            return;
        }

        try {
            if (!maNhanVien.equalsIgnoreCase(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Tên đăng nhập không đúng. Vui lòng kiểm tra lại !");
            } else if (!matKhauCu.equalsIgnoreCase(Auth.user.getMatKhau())) {
                MsgBox.alert(this, "Tên đăng nhập không đúng. Vui lòng kiểm tra lại !");
            } else {
                Auth.user.setMatKhau(matKhauMoi);
                nhanVienDAO.update(Auth.user);
                MsgBox.alert(this, "Thay đổi mật khẩu thành công ! ");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private boolean checkNull() {
        String maNhanVien = txtMaNhanVien.getText();
        String matKhauCu = txtMatkhauCu.getText();
        String matKhauMoi = txtMatkhauMoi.getText();
        String xacNhanMK = txtXacNhanMatkhauMoi.getText();
        StringBuilder sb = new StringBuilder();

        boolean isNotNull = true;
        if (maNhanVien.equals("")) {
            sb.append("Vui lòng nhập tên đăng nhập\n");
        }
        if (matKhauCu.equals("")) {
            sb.append("Vui lòng nhập mật khẩu hiện tại\n");
        }
        if (matKhauMoi.equals("")) {
            sb.append("Vui lòng nhập mật khẩu mới\n");

        }
        if (xacNhanMK.equals("")) {
            sb.append("Vui lòng xác nhận mật khẩu");
        }

        if (sb.length() > 0) {
            MsgBox.alert(this, sb.toString());
            isNotNull = false;
        }
        return isNotNull;
    }
}

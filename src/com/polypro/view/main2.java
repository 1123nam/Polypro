package com.polypro.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class main2 extends javax.swing.JFrame {

    GradientDropdownMenu menu = new GradientDropdownMenu();
    CardLayout cardLayout;

    public main2() {
        initComponents();
        cardLayout = (CardLayout) (main.getLayout());
        initMenu();
        addEvent();
    }

    public void initMenu() {
        menu.setGradientColor(new Color(190, 48, 96), new Color(67, 73, 97));
        menu.setBackground(new Color(36, 41, 71));
        menu.setForeground(new Color(242, 201, 77));
        menu.setMenuHeight(50);

        menu.setFont(new Font("Cambria", Font.BOLD, 18));
//        menu.setHeaderGradient(false);
        menu.addItem("Home");
        menu.addItem("Quản Lý", "Chuyên Đề", "Khóa Học", "Người Học", "Học Viên", "Nhân Viên");
        menu.addItem("Thống Kê", "Bảng Điểm", "Lượng Người Học", "Điểm Chuyên Đề", "Doanh Thu");
        menu.addItem("Trợ Giúp", "Hướng Dẫn Sử Dụng", "Giới Thiệu Sản Phẩm");
        menu.addItem(" Hệ Thống ", "Đổi Mật Khẩu", "Đăng Xuất", "Kết Thúc");
        menu.applay(this);
    }

    public void addEvent() {
        menu.addEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex, boolean menuItem) {
                if (menuItem) {
                    // Nếu click vào menu theo tên nào truy cập đến card đó
                    switch (menu.getMenuNameAt(index, subIndex).trim()) {
                        case "Home":
                            cardLayout.show(main, "cardRoot");
                            break;
                        case "Chuyên Đề":
                            cardLayout.show(main, "cardQLChuyenDe");
                            break;
                        case "Người Học":
                            cardLayout.show(main, "cardQLNguoiHoc");
                            break;
                        case "Khóa Học":
                            cardLayout.show(main, "cardQLKhoaHoc");
                            break;
                        case "Nhân Viên":
                            cardLayout.show(main, "cardQLNhanVien");
                            break;
                        case "Học Viên":
                            cardLayout.show(main, "cardQLHocVien");
                            break;
                        default:
                            break;
                    }
                }
            }
        });
    }

    private void entered_Button_Menu(JButton btn) {
        btn.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
        btn.setBorderPainted(true);
    }

    private void exited_Button_Menu(JButton btn) {
        btn.setBorder(new MatteBorder(0, 0, 0, 0, Color.white));
        btn.setBorderPainted(true);
    }

    private void clicked_Button_Menu(JButton btn) {
        btn.setBorder(new MatteBorder(0, 10, 0, 0, Color.red));
        btn.setBorderPainted(true);
    }

    private void dontclicked_Button_Menu(JButton btn) {
//        btn.setBorder(new MatteBorder(0, 0, 0, 0, Color.black));
        btn.setBorderPainted(false);
    }

    //Hoai Nam
    public boolean isConfirm(String msg, String tittle) {
        int result = JOptionPane.showConfirmDialog(this, msg, tittle, JOptionPane.YES_NO_OPTION);
       return result == JOptionPane.YES_OPTION;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgRole = new javax.swing.ButtonGroup();
        btgSex = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        pnlRoot = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlQLChuyenDe = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pnlQLKhoaHoc = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        pnlQLNhanVien = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlQLNguoiHoc = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        pnlQLHocVien = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        pnlTrangThai = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        btnMenubar_showhide = new javax.swing.JButton();
        pnlLogout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        pnlLearner = new javax.swing.JPanel();
        btnLearner = new javax.swing.JButton();
        pnlTopic = new javax.swing.JPanel();
        btnTopic = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        btnCourse = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        btnStudent = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        btnGuide = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 246, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setPreferredSize(new java.awt.Dimension(1400, 800));
        main.setLayout(new java.awt.CardLayout());

        pnlRoot.setBackground(new java.awt.Color(243, 246, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOT");

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(0, 1220, Short.MAX_VALUE))
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 667, Short.MAX_VALUE))
        );

        main.add(pnlRoot, "cardRoot");

        pnlQLChuyenDe.setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 153));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jTabbedPane1.addTab("Danh sách", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Hình Logo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/fpt-32px.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 230));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Mã chuyên đề");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 730, 42));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Tên chuyên đề");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 730, 42));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 730, 42));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Thời lượng (giờ)");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Học phí");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 730, 42));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Mô tả chuyên đề");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 1010, 150));

        jPanel4.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/return-32px.png"))); // NOI18N
        jButton10.setText("Thêm");
        jButton10.setBorder(null);
        jButton10.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton10.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton10.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 102, 49));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/diem-tung-khoa-hoc-32px.png"))); // NOI18N
        jButton9.setText("Sửa");
        jButton9.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton9.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 102, 49));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/exit-32px.png"))); // NOI18N
        jButton12.setText("Xóa");
        jButton12.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton12.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton12.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 102, 49));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/income-32px.png"))); // NOI18N
        jButton11.setText("Mới");
        jButton11.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton11.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton11.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 102, 49));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 430, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setText("<<");
        jButton13.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 50));

        jButton14.setText("<");
        jButton14.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 75, 50));

        jButton15.setText(">");
        jButton15.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 75, 50));

        jButton16.setText(">>");
        jButton16.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 340, 50));

        jTabbedPane1.addTab("Cập nhật", jPanel3);

        pnlQLChuyenDe.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quản Lý Chuyên Đề");
        jLabel12.setPreferredSize(new java.awt.Dimension(233, 35));
        pnlQLChuyenDe.add(jLabel12, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLChuyenDe, "cardQLChuyenDe");

        pnlQLKhoaHoc.setLayout(new java.awt.BorderLayout());

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel35.setText("Chuyên đề");
        jPanel17.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 435, 42));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel36.setText("Học phí");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 113, -1, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 136, 435, 42));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel37.setText("Người tạo");
        jPanel17.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 219, 435, 42));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel39.setText("Khai giảng");
        jPanel17.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 53, 435, 42));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel40.setText("Thời lượng (giờ)");
        jPanel17.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 113, -1, -1));

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 136, 435, 42));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel41.setText("Người tạo");
        jPanel17.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 196, -1, -1));

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel17.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 219, 435, 42));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel38.setText("Người tạo");
        jPanel17.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 196, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jPanel17.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 930, 170));

        jPanel19.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/return-32px.png"))); // NOI18N
        jButton33.setText("Thêm");
        jButton33.setBorder(null);
        jButton33.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton33.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton33.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton33.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 102, 49));

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/diem-tung-khoa-hoc-32px.png"))); // NOI18N
        jButton34.setText("Sửa");
        jButton34.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton34.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton34.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton34.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 102, 49));

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/exit-32px.png"))); // NOI18N
        jButton35.setText("Xóa");
        jButton35.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton35.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton35.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton35.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 102, 49));

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/income-32px.png"))); // NOI18N
        jButton36.setText("Mới");
        jButton36.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton36.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton36.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 102, 49));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 430, 50));

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setText("<<");
        jButton37.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 50));

        jButton38.setText("<");
        jButton38.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 75, 50));

        jButton39.setText(">");
        jButton39.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 75, 50));

        jButton40.setText(">>");
        jButton40.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 50));

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 340, 50));

        jTabbedPane4.addTab("   Cập Nhật   ", jPanel17);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("   Danh Sách   ", jPanel18);

        pnlQLKhoaHoc.add(jTabbedPane4, java.awt.BorderLayout.LINE_START);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setOpaque(false);
        jPanel16.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 990, 60));

        jLabel27.setBackground(new java.awt.Color(67, 73, 97));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Quản lý khóa học / Chuyên đề");
        jLabel27.setOpaque(true);
        jPanel16.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        pnlQLKhoaHoc.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLKhoaHoc, "cardQLKhoaHoc");

        pnlQLNhanVien.setBackground(new java.awt.Color(243, 246, 255));
        pnlQLNhanVien.setLayout(new java.awt.BorderLayout());

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cập Nhật", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Mã nhân viên");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 640, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Mật khẩu");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 640, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Xác nhân mật khẩu");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 640, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Vai trò");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 640, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Họ và tên");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btgRole.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton1.setText("Trưởng phòng");
        jPanel7.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        btgRole.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton2.setText("Nhân viên");
        jPanel7.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jPanel8.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/return-32px.png"))); // NOI18N
        jButton17.setText("Thêm");
        jButton17.setBorder(null);
        jButton17.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton17.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton17.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel8.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 102, 49));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/diem-tung-khoa-hoc-32px.png"))); // NOI18N
        jButton18.setText("Sửa");
        jButton18.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton18.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton18.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel8.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 102, 49));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/exit-32px.png"))); // NOI18N
        jButton19.setText("Xóa");
        jButton19.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton19.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton19.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel8.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 102, 49));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/income-32px.png"))); // NOI18N
        jButton20.setText("Mới");
        jButton20.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton20.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton20.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel8.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 102, 49));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 430, 50));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setText("<<");
        jButton21.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel9.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 50));

        jButton22.setText("<");
        jButton22.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel9.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 75, 50));

        jButton23.setText(">");
        jButton23.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel9.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 75, 50));

        jButton24.setText(">>");
        jButton24.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel9.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 50));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 340, 50));

        jTabbedPane2.addTab("Danh Sách", jPanel7);

        pnlQLNhanVien.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản Lý Nhân Viên Quản Trị");
        jLabel2.setPreferredSize(new java.awt.Dimension(334, 35));
        pnlQLNhanVien.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLNhanVien, "cardQLNhanVien");

        pnlQLNguoiHoc.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Quản Lý Người Học");
        jLabel18.setPreferredSize(new java.awt.Dimension(230, 35));
        pnlQLNguoiHoc.add(jLabel18, java.awt.BorderLayout.NORTH);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(36, 41, 71));
        jPanel12.setPreferredSize(new java.awt.Dimension(1358, 50));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Search");
        jPanel12.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 910, 50));

        jLabel19.setBackground(new java.awt.Color(67, 73, 97));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/settings.png"))); // NOI18N
        jLabel19.setOpaque(true);
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 70, 50));

        jPanel10.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1358, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel13, java.awt.BorderLayout.CENTER);

        jTabbedPane3.addTab("Danh Sách", jPanel10);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Mã người học");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel11.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 690, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Họ và tên");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel11.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 690, 40));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel11.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 320, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Ngày sinh");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 120, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Địa chỉ email");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 110, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel11.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 320, 40));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel11.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 320, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Giới tính");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Ghi chú");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 80, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("Điện thoại");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jPanel11.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 690, 140));

        jPanel14.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/return-32px.png"))); // NOI18N
        jButton25.setText("Thêm");
        jButton25.setBorder(null);
        jButton25.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton25.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton25.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 102, 49));

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/diem-tung-khoa-hoc-32px.png"))); // NOI18N
        jButton26.setText("Sửa");
        jButton26.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton26.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton26.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 102, 49));

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/exit-32px.png"))); // NOI18N
        jButton27.setText("Xóa");
        jButton27.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton27.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton27.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 102, 49));

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/income-32px.png"))); // NOI18N
        jButton28.setText("Mới");
        jButton28.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton28.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton28.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 102, 49));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 430, 50));

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton29.setText("<<");
        jButton29.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 50));

        jButton30.setText("<");
        jButton30.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 75, 50));

        jButton31.setText(">");
        jButton31.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 75, 50));

        jButton32.setText(">>");
        jButton32.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 50));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 340, 50));

        btgSex.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton3.setText("Nam");
        jPanel11.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        btgSex.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton4.setText("Nữ");
        jPanel11.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jTabbedPane3.addTab("Cập Nhật", jPanel11);

        pnlQLNguoiHoc.add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        main.add(pnlQLNguoiHoc, "cardQLNguoiHoc");

        pnlQLHocVien.setLayout(new java.awt.BorderLayout());

        jPanel22.setPreferredSize(new java.awt.Dimension(681, 50));
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setBackground(new java.awt.Color(67, 73, 97));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Chuyên đề");
        jLabel28.setOpaque(true);
        jPanel21.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel21.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -1, 520, 50));

        jPanel22.add(jPanel21);

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(67, 73, 97));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Khóa học");
        jLabel29.setOpaque(true);
        jPanel23.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel23.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 570, 50));

        jPanel22.add(jPanel23);

        pnlQLHocVien.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel24.setLayout(new java.awt.BorderLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable5);

        jPanel24.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel27.setPreferredSize(new java.awt.Dimension(1399, 60));

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton41.setText("Xóa khỏi khóa học");

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton42.setText("Cập nhật điểm");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(937, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel24.add(jPanel27, java.awt.BorderLayout.PAGE_END);

        jTabbedPane5.addTab("   Học Viên   ", jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel26.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel26.setPreferredSize(new java.awt.Dimension(1399, 50));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(67, 73, 97));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Tìm kiếm");
        jLabel30.setOpaque(true);
        jPanel26.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 210, 50));

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 50));

        jPanel25.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        jTable6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable6);

        jPanel25.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jPanel28.setPreferredSize(new java.awt.Dimension(1399, 60));

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton43.setText("Thêm vào khóa học");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(1075, Short.MAX_VALUE)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel25.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        jTabbedPane5.addTab("   Người Học   ", jPanel25);

        pnlQLHocVien.add(jTabbedPane5, java.awt.BorderLayout.CENTER);

        main.add(pnlQLHocVien, "cardQLHocVien");

        jPanel2.add(main, java.awt.BorderLayout.CENTER);

        pnlTrangThai.setBackground(new java.awt.Color(208, 239, 182));
        pnlTrangThai.setPreferredSize(new java.awt.Dimension(1130, 40));
        pnlTrangThai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/info-24px.png"))); // NOI18N
        jLabel3.setText(" Hệ quản lý đào tạo");
        pnlTrangThai.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 3, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/stopwatch.png"))); // NOI18N
        jLabel4.setText(" 00:00:00 AM");
        pnlTrangThai.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 170, 40));

        jPanel2.add(pnlTrangThai, java.awt.BorderLayout.PAGE_END);

        pnlDashboard.setBackground(new java.awt.Color(67, 73, 97));
        pnlDashboard.setPreferredSize(new java.awt.Dimension(50, 600));
        pnlDashboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        btnMenubar_showhide.setBackground(new java.awt.Color(245, 145, 146));
        btnMenubar_showhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/menu.png"))); // NOI18N
        btnMenubar_showhide.setToolTipText("Menu");
        btnMenubar_showhide.setAlignmentY(2.0F);
        btnMenubar_showhide.setBorder(null);
        btnMenubar_showhide.setBorderPainted(false);
        btnMenubar_showhide.setContentAreaFilled(false);
        btnMenubar_showhide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenubar_showhide.setFocusPainted(false);
        btnMenubar_showhide.setPreferredSize(new java.awt.Dimension(60, 50));
        pnlDashboard.add(btnMenubar_showhide);

        pnlLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(67, 73, 97));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/logout.png"))); // NOI18N
        btnLogout.setToolTipText("Đăng Xuất");
        btnLogout.setAlignmentY(2.0F);
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusPainted(false);
        btnLogout.setOpaque(true);
        btnLogout.setPreferredSize(new java.awt.Dimension(60, 50));
        pnlLogout.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(pnlLogout);

        pnlExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(67, 73, 97));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/exit.png"))); // NOI18N
        btnExit.setToolTipText("Kết Thúc");
        btnExit.setAlignmentY(2.0F);
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setOpaque(true);
        btnExit.setPreferredSize(new java.awt.Dimension(60, 50));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlExit.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(pnlExit);

        pnlLearner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLearner.setBackground(new java.awt.Color(67, 73, 97));
        btnLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/learner.png"))); // NOI18N
        btnLearner.setToolTipText("Người Học");
        btnLearner.setAlignmentY(2.0F);
        btnLearner.setBorder(null);
        btnLearner.setBorderPainted(false);
        btnLearner.setContentAreaFilled(false);
        btnLearner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLearner.setFocusPainted(false);
        btnLearner.setOpaque(true);
        btnLearner.setPreferredSize(new java.awt.Dimension(60, 50));
        pnlLearner.add(btnLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(pnlLearner);

        pnlTopic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTopic.setBackground(new java.awt.Color(67, 73, 97));
        btnTopic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/topic.png"))); // NOI18N
        btnTopic.setToolTipText("Chuyên Đề");
        btnTopic.setAlignmentY(2.0F);
        btnTopic.setBorder(null);
        btnTopic.setBorderPainted(false);
        btnTopic.setContentAreaFilled(false);
        btnTopic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTopic.setFocusPainted(false);
        btnTopic.setOpaque(true);
        btnTopic.setPreferredSize(new java.awt.Dimension(60, 50));
        pnlTopic.add(btnTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(pnlTopic);

        jPanel34.setBackground(new java.awt.Color(67, 73, 97));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCourse.setBackground(new java.awt.Color(67, 73, 97));
        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/course.png"))); // NOI18N
        btnCourse.setToolTipText("Khóa Học");
        btnCourse.setAlignmentY(2.0F);
        btnCourse.setBorder(null);
        btnCourse.setBorderPainted(false);
        btnCourse.setContentAreaFilled(false);
        btnCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCourse.setFocusPainted(false);
        btnCourse.setPreferredSize(new java.awt.Dimension(60, 50));
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jPanel34.add(btnCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(jPanel34);

        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudent.setBackground(new java.awt.Color(67, 73, 97));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/student.png"))); // NOI18N
        btnStudent.setToolTipText("Học Viên");
        btnStudent.setAlignmentY(2.0F);
        btnStudent.setBorder(null);
        btnStudent.setBorderPainted(false);
        btnStudent.setContentAreaFilled(false);
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.setFocusPainted(false);
        btnStudent.setOpaque(true);
        btnStudent.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel35.add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pnlDashboard.add(jPanel35);

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuide.setBackground(new java.awt.Color(67, 73, 97));
        btnGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/guide.png"))); // NOI18N
        btnGuide.setToolTipText("Hướng Dẫn");
        btnGuide.setAlignmentY(2.0F);
        btnGuide.setBorder(null);
        btnGuide.setBorderPainted(false);
        btnGuide.setContentAreaFilled(false);
        btnGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuide.setFocusPainted(false);
        btnGuide.setOpaque(true);
        btnGuide.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel29.add(btnGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        pnlDashboard.add(jPanel29);

        jPanel2.add(pnlDashboard, java.awt.BorderLayout.WEST);

        pnlMenu.setBackground(new java.awt.Color(204, 102, 0));
        pnlMenu.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setText("Thanh này để menu ròi nên không design trên đay");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel31)
                .addContainerGap(552, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        jPanel2.add(pnlMenu, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1413, 847));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (isConfirm( "Bạn có thực sự muốn thoát chương trình ??", "Xác nhận thoát ?")) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseActionPerformed

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
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgRole;
    private javax.swing.ButtonGroup btgSex;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenubar_showhide;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTopic;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel main;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlLearner;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlQLChuyenDe;
    private javax.swing.JPanel pnlQLHocVien;
    private javax.swing.JPanel pnlQLKhoaHoc;
    private javax.swing.JPanel pnlQLNguoiHoc;
    private javax.swing.JPanel pnlQLNhanVien;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlTopic;
    private javax.swing.JPanel pnlTrangThai;
    // End of variables declaration//GEN-END:variables
}

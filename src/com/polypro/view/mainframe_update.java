package com.polypro.view;

import com.polypro.DAO.ChuyenDeDAO;
import com.polypro.DAO.NhanVienDAO;
import com.polypro.model.ChuyenDe;
import com.polypro.model.NhanVien;
import com.polypro.utils.Auth;
import com.polypro.utils.MsgBox;
import com.polypro.utils.XImage;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.util.List;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class mainframe_update extends javax.swing.JFrame {

    GradientDropdownMenu menu = new GradientDropdownMenu();
    CardLayout cardLayout;
    //Quản lý Nhân Viên - Hải
    NhanVienDAO nvDAO = new NhanVienDAO();
    int row_NhanVien = -1; //Hàng được chọn hiện tại trên bảng nhân viên

    public mainframe_update() {
        initComponents();
        cardLayout = (CardLayout) (main.getLayout());
        initMenu();
        addEvent();
        initloadData();
    }

    public void initloadData() {
        //Quản lý nhân viên - Hải
        this.setColumn_NhanVien();
        this.fillTableNhanVien();

// set model cho bản
        setModelTableChuyenDe();
// load data chuyen de
        fillTableChuyenDe();
    }

    public void initMenu() {
        menu.setGradientColor(new Color(26, 72, 86), new Color(196, 205, 205));
        menu.setBackground(new Color(26, 72, 86));
        menu.setForeground(new Color(255, 255, 255));
        menu.setMenuHeight(50);

        menu.setFont(new Font("Cambria", Font.BOLD, 18));
//        menu.setHeaderGradient(false);
        menu.addItem("Home");
        menu.addItem("Quản Lý", "Chuyên Đề", "Khóa Học", "Người Học", "Học Viên", "Nhân Viên");
        menu.addItem("Thống Kê");
//        menu.addItem("Thống Kê", "Bảng Điểm", "Lượng Người Học", "Điểm Chuyên Đề", "Doanh Thu");
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
                        case "Kết Thúc":
                            exitProgram();
                            break;
                        case "Thống Kê":
                            cardLayout.show(main, "cardThongKe");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgRole = new javax.swing.ButtonGroup();
        btgSex = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        pnlRoot = new javax.swing.JPanel();
        jPanel30 = new RoundedPanel(15);
        jPanel31 = new RoundedPanel(20);
        jPanel36 = new RoundedPanel(100);
        jLabel50 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel32 = new RoundedPanel(20);
        jPanel32.setOpaque(false);
        jPanel37 = new RoundedPanel(100);
        jPanel37.setOpaque(false);
        jLabel52 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel33 = new RoundedPanel(20);
        jPanel33.setOpaque(false);
        jPanel38 = new RoundedPanel(100);
        jPanel38.setOpaque(false);
        jLabel53 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        pnlQLChuyenDe = new javax.swing.JPanel();
        tbpChuyenDe = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach_ChuyenDe = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnThem_ChuyenDe = new javax.swing.JButton();
        btnSua_ChuyenDe = new javax.swing.JButton();
        btnXoa_ChuyenDe = new javax.swing.JButton();
        btnMoi_ChuyenDe = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnFirst_ChuyenDe = new javax.swing.JButton();
        btnPre_ChuyenDe = new javax.swing.JButton();
        btnNext_ChuyenDe = new javax.swing.JButton();
        btnLast_ChuyenDe = new javax.swing.JButton();
        jPanel40 = new RoundedPanel(20);
        jLabel5 = new javax.swing.JLabel();
        lblHinhAnh_ChuyenDe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaCD_ChuyenDe = new RoundJTextField(10);
        jLabel8 = new javax.swing.JLabel();
        txtTenChuyenDe_ChuyenDe = new RoundJTextField(10);
        jLabel9 = new javax.swing.JLabel();
        txtThoiGian_ChuyenDe = new RoundJTextField(10);
        jLabel10 = new javax.swing.JLabel();
        txtHocPhi_ChuyenDe = new RoundJTextField(10);
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa_ChuyenDe = new javax.swing.JTextArea();
        jPanel41 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlQLKhoaHoc = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
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
        jPanel45 = new RoundedPanel(50);
        jLabel35 = new javax.swing.JLabel();
        jTextField19 = new RoundJTextField(10);
        jLabel36 = new javax.swing.JLabel();
        jTextField20 = new RoundJTextField(10);
        jLabel38 = new javax.swing.JLabel();
        jTextField21 = new RoundJTextField(10);
        jLabel37 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField25 = new RoundJTextField(10)
        ;
        jLabel41 = new javax.swing.JLabel();
        jTextField24 = new RoundJTextField(10);
        jLabel40 = new javax.swing.JLabel();
        jTextField23 = new RoundJTextField(10);
        jLabel39 = new javax.swing.JLabel();
        jPanel46 = new RoundedPanel(15);
        jLabel73 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel47 = new RoundedPanel(15);
        jPanel47.setOpaque(false);
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel48 = new RoundedPanel(15);
        jPanel48.setOpaque(false);
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel49 = new RoundedPanel(15);
        jLabel70 = new javax.swing.JLabel();
        jPanel50 = new RoundedPanel(15);
        jPanel50.setOpaque(false);
        jLabel71 = new javax.swing.JLabel();
        jPanel51 = new RoundedPanel(15);
        jLabel72 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnlQLNhanVien = new javax.swing.JPanel();
        tbpNhanVien = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSach_NhanVien = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel61 = new RoundedPanel(50);
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel70 = new RoundedPanel(30);
        jLabel145 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnThem_NhanVien = new javax.swing.JButton();
        btnSua_NhanVien = new javax.swing.JButton();
        btnXoa_NhanVien = new javax.swing.JButton();
        btnMoi_NhanVien = new javax.swing.JButton();
        jPanel52 = new RoundedPanel(30);
        jLabel13 = new javax.swing.JLabel();
        txtMaNV_NhanVien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtHoTen_NhanVien = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rdoTruongPhong_NhanVien = new javax.swing.JRadioButton();
        rdoNhanVien_NhanVien = new javax.swing.JRadioButton();
        txtMatKhau_NhanVien = new javax.swing.JPasswordField();
        txtXacNhanMK_NhanVien = new javax.swing.JPasswordField();
        jPanel53 = new javax.swing.JPanel();
        btnFirst_NhanVien = new javax.swing.JButton();
        btnBack_NhanVien = new javax.swing.JButton();
        btnNext_NhanVien = new javax.swing.JButton();
        btnLast_NhanVien = new javax.swing.JButton();
        jPanel54 = new RoundedPanel(50);
        jPanel55 = new RoundedPanel(50);
        jPanel55.setOpaque(false);
        jLabel124 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jPanel69 = new RoundedPanel(30);
        jLabel131 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jPanel9 = new RoundedPanel(50);
        jLabel86 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel56 = new RoundedPanel(50);
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanel57 = new RoundedPanel(50);
        jLabel114 = new javax.swing.JLabel();
        jPanel58 = new RoundedPanel(50);
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
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
        jPanel62 = new javax.swing.JPanel();
        jTextField10 = new RoundJTextField(10);
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new RoundJTextField(10);
        jLabel24 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new RoundJTextField(10);
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new RoundJTextField(10);
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new RoundJTextField(10);
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jPanel71 = new RoundedPanel(100);
        jLabel156 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jPanel72 = new RoundedPanel(100);
        jPanel72.setOpaque(false);
        jLabel157 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jPanel73 = new RoundedPanel(100);
        jPanel73.setOpaque(false);
        jLabel158 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        pnlQLHocVien = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
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
        pnlThongKe = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
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
        main.setPreferredSize(new java.awt.Dimension(1400, 900));
        main.setLayout(new java.awt.CardLayout());

        pnlRoot.setBackground(new java.awt.Color(255, 255, 255));
        pnlRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setOpaque(false);
        jPanel30.setBackground(new java.awt.Color(26, 72, 86));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setOpaque(false);
        jPanel31.setBackground(new java.awt.Color(248, 250, 249));
        jPanel31.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setOpaque(false);
        jPanel36.setBackground(new java.awt.Color(199, 212, 214));
        jPanel36.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_2.png"))); // NOI18N
        jPanel36.add(jLabel50, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 32, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Quản lí thông tin ");
        jPanel31.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 250, 25));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Bla bla");
        jPanel31.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 28));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Bla bla");
        jPanel31.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, 226, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Bla bla");
        jPanel31.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 28));

        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 250));

        jPanel32.setBackground(new java.awt.Color(222, 236, 163));
        jPanel32.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(26, 72, 86));
        jPanel37.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel37.setLayout(new java.awt.BorderLayout());

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_1.png"))); // NOI18N
        jPanel37.add(jLabel52, java.awt.BorderLayout.CENTER);

        jPanel32.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 34, -1, -1));

        jLabel42.setBackground(new java.awt.Color(26, 72, 86));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(26, 72, 86));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Nhanh chóng và tiện lợi");
        jPanel32.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 254, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(26, 72, 86));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Bla bla");
        jPanel32.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, 226, 30));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(26, 72, 86));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Bla bla");
        jPanel32.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 28));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(26, 72, 86));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Bla bla");
        jPanel32.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 28));

        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 250, 250));

        jPanel33.setBackground(new java.awt.Color(248, 250, 249));
        jPanel33.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(199, 212, 214));
        jPanel38.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_3.png"))); // NOI18N
        jPanel38.add(jLabel53, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 37, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Kiểm kê doanh số");
        jPanel33.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, 226, 25));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Bla bla");
        jPanel33.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 226, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Bla bla");
        jPanel33.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 20));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Bla bla");
        jPanel33.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 20));

        jPanel30.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 250, 250));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Keep contact with our");
        jPanel30.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 350, -1));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Work smart together");
        jPanel30.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        pnlRoot.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 890, 400));

        jPanel39.setBackground(new java.awt.Color(222, 236, 163));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower.png"))); // NOI18N
        jPanel39.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 90, 50));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Quản lí nhanh chóng");
        jPanel39.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 380, 70));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("& hiệu quả");
        jPanel39.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 72, 86));
        jLabel1.setText("Đi tìm hiểu cấu trúc của gấu trúc");
        jPanel39.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 350, 40));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(26, 72, 86));
        jLabel47.setText("Hai đôi chân bắt chéo một pha cắt kéo rất lắc léo");
        jPanel39.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 350, 40));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_2.png"))); // NOI18N
        jPanel39.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_1.png"))); // NOI18N
        jPanel39.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(26, 72, 86));
        jLabel48.setText("Anh em cột chèo đi lộn mèo");
        jPanel39.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 350, 40));

        jLabel49.setBackground(new java.awt.Color(26, 72, 86));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Watch Now");
        jLabel49.setOpaque(true);
        jPanel39.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 50));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/bg_decord.png"))); // NOI18N
        jPanel39.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -230, 400, 600));

        pnlRoot.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 1000, 310));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/bg_root.png"))); // NOI18N
        pnlRoot.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        main.add(pnlRoot, "cardRoot");

        pnlQLChuyenDe.setLayout(new java.awt.BorderLayout());

        tbpChuyenDe.setBackground(new java.awt.Color(255, 255, 255));
        tbpChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbpChuyenDe.setOpaque(true);

        tblDanhSach_ChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDanhSach_ChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhSach_ChuyenDe.setFillsViewportHeight(true);
        tblDanhSach_ChuyenDe.setGridColor(new java.awt.Color(255, 255, 255));
        tblDanhSach_ChuyenDe.setRowHeight(25);
        tblDanhSach_ChuyenDe.setSelectionBackground(new java.awt.Color(0, 204, 153));
        tblDanhSach_ChuyenDe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDanhSach_ChuyenDe.getTableHeader().setResizingAllowed(false);
        tblDanhSach_ChuyenDe.getTableHeader().setReorderingAllowed(false);
        tblDanhSach_ChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSach_ChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach_ChuyenDe);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1372, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        tbpChuyenDe.addTab("   Danh sách   ", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem_ChuyenDe.setBackground(new java.awt.Color(204, 204, 204));
        btnThem_ChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnThem_ChuyenDe.setForeground(new java.awt.Color(0, 204, 255));
        btnThem_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/add.png"))); // NOI18N
        btnThem_ChuyenDe.setText("Thêm");
        btnThem_ChuyenDe.setBorder(null);
        btnThem_ChuyenDe.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnThem_ChuyenDe.setMaximumSize(new java.awt.Dimension(150, 50));
        btnThem_ChuyenDe.setPreferredSize(new java.awt.Dimension(100, 50));
        btnThem_ChuyenDe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnThem_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel4.add(btnThem_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        btnSua_ChuyenDe.setBackground(new java.awt.Color(204, 204, 204));
        btnSua_ChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSua_ChuyenDe.setForeground(new java.awt.Color(0, 204, 255));
        btnSua_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/update.png"))); // NOI18N
        btnSua_ChuyenDe.setText("Sửa");
        btnSua_ChuyenDe.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnSua_ChuyenDe.setMaximumSize(new java.awt.Dimension(150, 50));
        btnSua_ChuyenDe.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSua_ChuyenDe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnSua_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel4.add(btnSua_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 110, 60));

        btnXoa_ChuyenDe.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa_ChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXoa_ChuyenDe.setForeground(new java.awt.Color(0, 204, 255));
        btnXoa_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/delete.png"))); // NOI18N
        btnXoa_ChuyenDe.setText("Xóa");
        btnXoa_ChuyenDe.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnXoa_ChuyenDe.setMaximumSize(new java.awt.Dimension(150, 50));
        btnXoa_ChuyenDe.setPreferredSize(new java.awt.Dimension(100, 50));
        btnXoa_ChuyenDe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnXoa_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoa_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 110, 60));

        btnMoi_ChuyenDe.setBackground(new java.awt.Color(204, 204, 204));
        btnMoi_ChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnMoi_ChuyenDe.setForeground(new java.awt.Color(0, 204, 255));
        btnMoi_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/refresh.png"))); // NOI18N
        btnMoi_ChuyenDe.setText("Mới");
        btnMoi_ChuyenDe.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnMoi_ChuyenDe.setMaximumSize(new java.awt.Dimension(150, 50));
        btnMoi_ChuyenDe.setPreferredSize(new java.awt.Dimension(100, 50));
        btnMoi_ChuyenDe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnMoi_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel4.add(btnMoi_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 110, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 500, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFirst_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/first.png"))); // NOI18N
        btnFirst_ChuyenDe.setBorderPainted(false);
        btnFirst_ChuyenDe.setContentAreaFilled(false);
        btnFirst_ChuyenDe.setMargin(new java.awt.Insets(0, 10, 0, 10));
        btnFirst_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel5.add(btnFirst_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 70));

        btnPre_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/prev.png"))); // NOI18N
        btnPre_ChuyenDe.setBorderPainted(false);
        btnPre_ChuyenDe.setContentAreaFilled(false);
        btnPre_ChuyenDe.setMargin(new java.awt.Insets(0, 10, 0, 10));
        btnPre_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPre_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel5.add(btnPre_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 75, 70));

        btnNext_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/next.png"))); // NOI18N
        btnNext_ChuyenDe.setBorderPainted(false);
        btnNext_ChuyenDe.setContentAreaFilled(false);
        btnNext_ChuyenDe.setMargin(new java.awt.Insets(0, 10, 0, 10));
        btnNext_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel5.add(btnNext_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 75, 70));

        btnLast_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/last.png"))); // NOI18N
        btnLast_ChuyenDe.setBorderPainted(false);
        btnLast_ChuyenDe.setContentAreaFilled(false);
        btnLast_ChuyenDe.setMargin(new java.awt.Insets(0, 10, 0, 10));
        btnLast_ChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_ChuyenDeActionPerformed(evt);
            }
        });
        jPanel5.add(btnLast_ChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 70, 70));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 320, 70));

        jPanel40.setOpaque(false);
        jPanel40.setBackground(new java.awt.Color(34, 57, 57));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hình Logo");

        lblHinhAnh_ChuyenDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh_ChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/fpt-32px.png"))); // NOI18N
        lblHinhAnh_ChuyenDe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        lblHinhAnh_ChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnh_ChuyenDeMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mã chuyên đề");

        txtMaCD_ChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên chuyên đề");

        txtTenChuyenDe_ChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thời lượng (giờ)");

        txtThoiGian_ChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Học phí");

        txtHocPhi_ChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mô tả chuyên đề");

        txtMoTa_ChuyenDe.setColumns(20);
        txtMoTa_ChuyenDe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMoTa_ChuyenDe.setRows(5);
        txtMoTa_ChuyenDe.setOpaque(false);
        jScrollPane2.setViewportView(txtMoTa_ChuyenDe);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(207, 207, 207)
                        .addComponent(jLabel7))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHinhAnh_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtThoiGian_ChuyenDe)
                            .addComponent(txtTenChuyenDe_ChuyenDe)
                            .addComponent(txtMaCD_ChuyenDe)
                            .addComponent(txtHocPhi_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHinhAnh_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(txtMaCD_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(txtTenChuyenDe_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(txtThoiGian_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(txtHocPhi_ChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 880, 540));

        jPanel41.setBackground(new java.awt.Color(243, 246, 255));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/topic_decor1.jpg"))); // NOI18N
        jPanel41.add(jLabel66, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 400, 90));

        jPanel42.setBackground(new java.awt.Color(243, 246, 255));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/topic_decor2.jpg"))); // NOI18N
        jPanel42.add(jLabel67, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 190, 180));

        jPanel43.setBackground(new java.awt.Color(243, 246, 255));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/topic_decor3.jpg"))); // NOI18N
        jPanel43.add(jLabel68, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 110, 190, 180));

        jPanel44.setBackground(new java.awt.Color(243, 246, 255));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/topic_decor4.jpg"))); // NOI18N
        jPanel44.add(jLabel69, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 400, 330));

        tbpChuyenDe.addTab("   Cập nhật   ", jPanel3);

        pnlQLChuyenDe.add(tbpChuyenDe, java.awt.BorderLayout.CENTER);

        jLabel12.setBackground(new java.awt.Color(71, 102, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("QUẢN LÝ CHUYÊN ĐỀ");
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(430, 40));
        pnlQLChuyenDe.add(jLabel12, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLChuyenDe, "cardQLChuyenDe");

        pnlQLKhoaHoc.setLayout(new java.awt.BorderLayout());

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTabbedPane4.setOpaque(true);

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("   Danh Sách   ", jPanel18);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel19.setLayout(new java.awt.GridLayout(0, 2, 10, 5));

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 153, 153));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/add.png"))); // NOI18N
        jButton33.setText("Thêm");
        jButton33.setBorder(null);
        jButton33.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton33.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton33.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton33.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton33);

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 153, 153));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/update.png"))); // NOI18N
        jButton34.setText("Sửa");
        jButton34.setBorder(null);
        jButton34.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton34.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton34.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton34.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton34);

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 153, 153));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/delete.png"))); // NOI18N
        jButton35.setText("Xóa");
        jButton35.setBorder(null);
        jButton35.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton35.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton35.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton35.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel19.add(jButton35);

        jButton36.setBackground(new java.awt.Color(255, 255, 255));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 153, 153));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/refresh.png"))); // NOI18N
        jButton36.setText("Mới");
        jButton36.setBorder(null);
        jButton36.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton36.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton36.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton36);

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 330, 110));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/first.png"))); // NOI18N
        jButton37.setBorderPainted(false);
        jButton37.setContentAreaFilled(false);
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton37.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 75, 70));

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/prev.png"))); // NOI18N
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton38.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 75, 70));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/next.png"))); // NOI18N
        jButton39.setBorderPainted(false);
        jButton39.setContentAreaFilled(false);
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton39.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 75, 70));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/last.png"))); // NOI18N
        jButton40.setBorderPainted(false);
        jButton40.setContentAreaFilled(false);
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton40.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel20.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 70, 70));

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 420, 130));

        jPanel45.setOpaque(false);
        jPanel45.setBackground(new java.awt.Color(52, 86, 86));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Chuyên đề");
        jPanel45.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 390, 42));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Học phí");
        jPanel45.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 113, -1, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 136, 390, 42));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Người tạo");
        jPanel45.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 196, -1, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 219, 390, 42));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Người tạo");
        jPanel45.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jPanel45.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 770, 150));

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 360, 42));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Người tạo");
        jPanel45.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 360, 42));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Thời lượng (giờ)");
        jPanel45.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel45.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 360, 42));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Khai giảng");
        jPanel45.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jPanel17.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 860, 490));

        jPanel46.setOpaque(false);
        jPanel46.setBackground(new java.awt.Color(52, 86, 86));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/c-sharp.png"))); // NOI18N
        jPanel46.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("C#");
        jPanel46.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 40));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(52, 86, 86));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Xem");
        jLabel82.setOpaque(true);
        jPanel46.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 110, 50));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/newLanguage.png"))); // NOI18N
        jPanel46.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 160, -1));

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Microsoft");
        jPanel46.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Ngôn ngữ lập trình hướng đối");
        jPanel46.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("tượng mạnh mẽ, đa năng, ");
        jPanel46.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("được phát triển bởi");
        jPanel46.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jPanel17.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 160));

        jPanel47.setBackground(new java.awt.Color(52, 86, 86));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/php.png"))); // NOI18N
        jPanel47.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("PHP");
        jPanel47.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 40));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(52, 86, 86));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Xem");
        jLabel83.setOpaque(true);
        jPanel47.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 110, 50));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/newLanguage.png"))); // NOI18N
        jPanel47.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Ngôn ngữ lập trình kịch bản hay ");
        jPanel47.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 30));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("một loại mã lệnh chủ yếu dùng  ");
        jPanel47.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("để phát triển các ứng dụng ");
        jPanel47.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("viết cho máy chủ");
        jPanel47.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));

        jPanel17.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 460, 160));

        jPanel48.setBackground(new java.awt.Color(52, 86, 86));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/python.png"))); // NOI18N
        jPanel48.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("PYTHON");
        jPanel48.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 40));

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(52, 86, 86));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Xem");
        jLabel84.setOpaque(true);
        jPanel48.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 50));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/newLanguage.png"))); // NOI18N
        jPanel48.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 150));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Ngôn ngữ lập trình bậc cao cho các ");
        jPanel48.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 30));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("mục đích lập trình đa năng, do");
        jPanel48.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Guido van Rossum tạo ra và ");
        jPanel48.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("lần đầu ra mắt vào năm 1991");
        jPanel48.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));

        jPanel17.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 460, 150));

        jPanel49.setOpaque(false);
        jPanel49.setBackground(new java.awt.Color(52, 86, 86));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //jLabel70.setOpaque(false);
        jLabel70.setBackground(new java.awt.Color(52, 86, 86));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/html-5.png"))); // NOI18N
        jPanel49.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 141, 130));

        jPanel17.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 141, 120));

        jPanel50.setBackground(new java.awt.Color(52, 86, 86));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setBackground(new java.awt.Color(52, 86, 86));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/javascript.png"))); // NOI18N
        jPanel50.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 141, 130));

        jPanel17.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 141, 120));

        jPanel51.setOpaque(false);
        jPanel51.setBackground(new java.awt.Color(52, 86, 86));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setBackground(new java.awt.Color(52, 86, 86));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/java.png"))); // NOI18N
        jPanel51.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 141, 130));

        jPanel17.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 141, 120));

        jTabbedPane4.addTab("   Cập Nhật   ", jPanel17);

        pnlQLKhoaHoc.add(jTabbedPane4, java.awt.BorderLayout.LINE_START);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(1230, 100));

        jLabel27.setBackground(new java.awt.Color(71, 102, 102));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("QUẢN LÝ KHÓA HỌC");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel27.setOpaque(true);
        jLabel27.setPreferredSize(new java.awt.Dimension(340, 60));
        jLabel27.setVerifyInputWhenFocusTarget(false);

        jPanel75.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(67, 73, 97));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Chọn chuyên đề:");
        jLabel6.setOpaque(true);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setOpaque(false);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLKhoaHoc.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLKhoaHoc, "cardQLKhoaHoc");

        pnlQLNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        pnlQLNhanVien.setLayout(new java.awt.BorderLayout());

        tbpNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        tbpNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tblDanhSach_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhSach_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSach_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDanhSach_NhanVien);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpNhanVien.addTab("   Danh Sách   ", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel61.setOpaque(false);
        jPanel61.setBackground(new java.awt.Color(111, 111, 113));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Orther");
        jPanel61.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jLabel136.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("HTML & CSS");
        jPanel61.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("Java, JS");
        jPanel61.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel138.setBackground(new java.awt.Color(111, 111, 113));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/heart_yellow.png"))); // NOI18N
        jLabel138.setOpaque(true);
        jPanel61.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 40, 30));

        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/pin_icon.png"))); // NOI18N
        jPanel61.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 40, 30));

        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/share_Icon.png"))); // NOI18N
        jPanel61.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 40, 30));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/avata_decor2.png"))); // NOI18N
        jPanel61.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Exprience");
        jPanel61.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel143.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("2 years");
        jPanel61.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/hobbies.png"))); // NOI18N
        jLabel144.setText("FPT Polytechnic");
        jPanel61.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        jPanel70.setOpaque(false);
        jPanel70.setBackground(new java.awt.Color(245, 205, 55));

        jLabel145.setBackground(new java.awt.Color(245, 205, 55));
        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("View all");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel61.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 30));

        jPanel7.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, 160, 290));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnThem_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/add.png"))); // NOI18N
        btnThem_NhanVien.setText("Thêm");
        btnThem_NhanVien.setBorder(null);
        btnThem_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnThem_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnThem_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnThem_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnThem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NhanVienActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 80));

        btnSua_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSua_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/update.png"))); // NOI18N
        btnSua_NhanVien.setText("Sửa");
        btnSua_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnSua_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnSua_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSua_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnSua_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NhanVienActionPerformed(evt);
            }
        });
        jPanel8.add(btnSua_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 100, 80));

        btnXoa_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXoa_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/delete.png"))); // NOI18N
        btnXoa_NhanVien.setText("Xóa");
        btnXoa_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnXoa_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnXoa_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnXoa_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnXoa_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NhanVienActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 100, 80));

        btnMoi_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnMoi_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/refresh.png"))); // NOI18N
        btnMoi_NhanVien.setText("Mới");
        btnMoi_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnMoi_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnMoi_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnMoi_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnMoi_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_NhanVienActionPerformed(evt);
            }
        });
        jPanel8.add(btnMoi_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 100, 80));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 460, 80));

        jPanel52.setOpaque(false);
        jPanel52.setBackground(new java.awt.Color(52, 86, 86));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mã nhân viên");

        txtMaNV_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mật khẩu");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Xác nhân mật khẩu");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Họ và tên");

        txtHoTen_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vai trò");

        rdoTruongPhong_NhanVien.setBackground(new java.awt.Color(52, 86, 86));
        btgRole.add(rdoTruongPhong_NhanVien);
        rdoTruongPhong_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoTruongPhong_NhanVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoTruongPhong_NhanVien.setText("Trưởng phòng");

        rdoNhanVien_NhanVien.setBackground(new java.awt.Color(52, 86, 86));
        btgRole.add(rdoNhanVien_NhanVien);
        rdoNhanVien_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoNhanVien_NhanVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoNhanVien_NhanVien.setText("Nhân viên");

        txtMatKhau_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtXacNhanMK_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhau_NhanVien)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(rdoTruongPhong_NhanVien)
                        .addGap(29, 29, 29)
                        .addComponent(rdoNhanVien_NhanVien))
                    .addComponent(txtMaNV_NhanVien)
                    .addComponent(txtHoTen_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(txtXacNhanMK_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(10, 10, 10)
                .addComponent(txtMaNV_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addComponent(txtXacNhanMK_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(txtHoTen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoTruongPhong_NhanVien)
                    .addComponent(rdoNhanVien_NhanVien))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 460, 460));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        btnFirst_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnFirst_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/first.png"))); // NOI18N
        btnFirst_NhanVien.setBorder(null);
        btnFirst_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnFirst_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnFirst_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnFirst_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnFirst_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_NhanVienActionPerformed(evt);
            }
        });

        btnBack_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnBack_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/prev.png"))); // NOI18N
        btnBack_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnBack_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnBack_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnBack_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnBack_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack_NhanVienActionPerformed(evt);
            }
        });

        btnNext_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnNext_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/next.png"))); // NOI18N
        btnNext_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnNext_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnNext_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNext_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnNext_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_NhanVienActionPerformed(evt);
            }
        });

        btnLast_NhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnLast_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/last.png"))); // NOI18N
        btnLast_NhanVien.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnLast_NhanVien.setMaximumSize(new java.awt.Dimension(150, 50));
        btnLast_NhanVien.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLast_NhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        btnLast_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_NhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnFirst_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(btnBack_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(btnNext_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(btnLast_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFirst_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLast_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 460, -1));

        jPanel54.setOpaque(false);
        jPanel54.setBackground(new java.awt.Color(245, 205, 55));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel55.setBackground(new java.awt.Color(40, 40, 42));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel124.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Infor");
        jPanel55.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jPanel60.setBackground(new java.awt.Color(40, 40, 42));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel125.setBackground(new java.awt.Color(111, 111, 113));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/heart_yellow.png"))); // NOI18N
        jLabel125.setOpaque(true);
        jPanel60.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/pin_icon.png"))); // NOI18N
        jPanel60.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 40, 30));

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/share_Icon.png"))); // NOI18N
        jPanel60.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 40, 30));

        jPanel55.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 13, 36, 116));

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("information ");
        jPanel55.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Managerment");
        jPanel55.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/avata_decor2.png"))); // NOI18N
        jPanel55.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/hobbies.png"))); // NOI18N
        jLabel132.setText(" Volleyball");
        jPanel55.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("19");
        jPanel55.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("Age");
        jPanel55.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jPanel69.setOpaque(false);
        jPanel69.setBackground(new java.awt.Color(245, 205, 55));

        jLabel131.setBackground(new java.awt.Color(245, 205, 55));
        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Detail");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel55.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 70, 30));

        jPanel54.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 310));

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel117.setText("Detail");
        jPanel54.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel119.setText("Info");
        jPanel54.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, -1));

        jLabel120.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel120.setText("Active");
        jPanel54.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel121.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel121.setText("Hobbies");
        jPanel54.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));

        jPanel59.setBackground(new java.awt.Color(245, 205, 55));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/search_black.png"))); // NOI18N
        jPanel59.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 40));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/filter.png"))); // NOI18N
        jPanel59.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/dashboard.png"))); // NOI18N
        jPanel59.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        jPanel54.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, 40));

        jPanel7.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 310, 530));

        jPanel9.setOpaque(false);
        jPanel9.setBackground(new java.awt.Color(52, 86, 86));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Profile");
        jPanel9.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Contact");
        jPanel9.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/search.png"))); // NOI18N
        jPanel9.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("All info");
        jPanel9.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, -1));

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Personal");
        jPanel9.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Adress");
        jPanel9.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/avata_icon.png"))); // NOI18N
        jPanel9.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 240));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/share_Icon.png"))); // NOI18N
        jPanel9.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/heart_yellow.png"))); // NOI18N
        jPanel9.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 30, 20));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/pin_icon.png"))); // NOI18N
        jPanel9.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(245, 205, 55));
        jLabel107.setText("Favorite");
        jPanel9.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Manager");
        jPanel9.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, 60));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("Role");
        jPanel9.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jPanel56.setOpaque(false);
        jPanel56.setBackground(new java.awt.Color(34, 57, 57));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/idea.png"))); // NOI18N
        jLabel110.setText(" Nguyen Phuoc Tai");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/check.png"))); // NOI18N
        jLabel111.setText("  Graduate");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/shield.png"))); // NOI18N
        jLabel112.setText(" Vietnamese");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112)
                    .addComponent(jLabel111))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 300, 120));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/back_24.png"))); // NOI18N
        jPanel9.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jPanel57.setOpaque(false);
        jPanel57.setBackground(new java.awt.Color(71, 102, 102));

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("-   2  +");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 50));

        jPanel58.setOpaque(false);
        jPanel58.setBackground(new java.awt.Color(221, 198, 198));
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change.png"))); // NOI18N
        jPanel58.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 40, 50));

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(51, 51, 51));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Change");
        jPanel58.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jPanel9.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, 50));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 340, 650));

        tbpNhanVien.addTab("Cập Nhật", jPanel7);

        pnlQLNhanVien.add(tbpNhanVien, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(71, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(430, 40));
        pnlQLNhanVien.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        main.add(pnlQLNhanVien, "cardQLNhanVien");

        pnlQLNguoiHoc.setLayout(new java.awt.BorderLayout());

        jLabel18.setBackground(new java.awt.Color(71, 102, 102));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("QUẢN LÝ NGƯỜI HỌC");
        jLabel18.setOpaque(true);
        jLabel18.setPreferredSize(new java.awt.Dimension(340, 40));
        pnlQLNguoiHoc.add(jLabel18, java.awt.BorderLayout.NORTH);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(1358, 50));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Search...");
        jPanel12.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 800, 50));

        jLabel19.setBackground(new java.awt.Color(67, 73, 97));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/search.png"))); // NOI18N
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
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1372, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel13, java.awt.BorderLayout.CENTER);

        jTabbedPane3.addTab("   Danh Sách   ", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/add.png"))); // NOI18N
        jButton25.setText("Thêm");
        jButton25.setBorder(null);
        jButton25.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton25.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton25.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 55));

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/update.png"))); // NOI18N
        jButton26.setText("Sửa");
        jButton26.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton26.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton26.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 55));

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/delete.png"))); // NOI18N
        jButton27.setText("Xóa");
        jButton27.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton27.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton27.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 55));

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/refresh.png"))); // NOI18N
        jButton28.setText("Mới");
        jButton28.setMargin(new java.awt.Insets(2, 1, 2, 1));
        jButton28.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton28.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/change-pass-24px.png"))); // NOI18N
        jPanel14.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 55));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 140, 330));

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/first.png"))); // NOI18N
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 70));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/prev.png"))); // NOI18N
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 80, 70));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/next.png"))); // NOI18N
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 90, 70));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/last.png"))); // NOI18N
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jPanel15.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 80, 70));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 610, 70));

        jPanel62.setBackground(new java.awt.Color(34, 57, 57));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField10.setSelectionColor(new java.awt.Color(255, 0, 51));
        jPanel62.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 550, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Họ và tên");
        jPanel62.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Mã người học");
        jPanel62.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel62.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Giới tính");
        jPanel62.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));

        jRadioButton3.setBackground(new java.awt.Color(34, 57, 57));
        btgSex.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Nam");
        jPanel62.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(34, 57, 57));
        btgSex.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Nữ");
        jPanel62.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ngày sinh");
        jPanel62.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 130, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel62.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 270, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Địa chỉ email");
        jPanel62.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 120, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel62.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Điện thoại");
        jPanel62.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 20));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel62.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 270, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jPanel62.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 550, 140));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ghi chú");
        jPanel62.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, -1));

        jPanel11.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 610, 510));

        jPanel63.setBackground(new java.awt.Color(34, 57, 57));
        jPanel63.setLayout(new java.awt.BorderLayout());

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/learner_decor.png"))); // NOI18N
        jPanel63.add(jLabel150, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 470, 60));

        jPanel64.setBackground(new java.awt.Color(236, 240, 241));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel71.setOpaque(false);
        jPanel71.setBackground(new java.awt.Color(199, 212, 214));
        jPanel71.setLayout(new java.awt.BorderLayout());

        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_2.png"))); // NOI18N
        jPanel71.add(jLabel156, java.awt.BorderLayout.CENTER);

        jPanel64.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 85, 85));

        jPanel11.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 140, 140));

        jPanel65.setBackground(new java.awt.Color(222, 236, 163));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel72.setBackground(new java.awt.Color(34, 57, 57));
        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_1.png"))); // NOI18N
        jPanel72.add(jLabel157, java.awt.BorderLayout.CENTER);

        jPanel65.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 85, 85));

        jPanel11.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 150, 140));

        jPanel66.setBackground(new java.awt.Color(236, 240, 241));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel73.setBackground(new java.awt.Color(199, 212, 214));
        jPanel73.setLayout(new java.awt.BorderLayout());

        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_3.png"))); // NOI18N
        jPanel73.add(jLabel158, java.awt.BorderLayout.CENTER);

        jPanel66.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 85, 85));

        jPanel11.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, 140, 140));

        jPanel67.setBackground(new java.awt.Color(71, 102, 102));
        jPanel67.setLayout(new java.awt.BorderLayout());

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/edusys.png"))); // NOI18N
        jPanel67.add(jLabel165, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 470, 70));

        jPanel68.setBackground(new java.awt.Color(34, 57, 57));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel159.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("Education System");
        jPanel68.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel160.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setText("system");
        jPanel68.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel161.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setText("Fast, convenient and ");
        jPanel68.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel162.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("easy management ");
        jPanel68.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel163.setBackground(new java.awt.Color(215, 211, 183));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("Learn more");
        jLabel163.setOpaque(true);
        jPanel68.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, 30));

        jPanel74.setLayout(new java.awt.BorderLayout());

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/decor_4.png"))); // NOI18N
        jPanel74.add(jLabel164, java.awt.BorderLayout.CENTER);

        jPanel68.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 200));

        jPanel11.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 470, 260));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/duoi-trai.png"))); // NOI18N
        jPanel11.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, 190));

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/tren-phai.png"))); // NOI18N
        jPanel11.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 200, 200));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/tren-trai.png"))); // NOI18N
        jPanel11.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/duoi-phai.png"))); // NOI18N
        jPanel11.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 520, -1, 190));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_2.png"))); // NOI18N
        jPanel11.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_1.png"))); // NOI18N
        jPanel11.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/fpt-32px.png"))); // NOI18N
        jPanel11.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower.png"))); // NOI18N
        jPanel11.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/flower_2.png"))); // NOI18N
        jPanel11.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, -1));

        jTabbedPane3.addTab("   Cập Nhật   ", jPanel11);

        pnlQLNguoiHoc.add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        main.add(pnlQLNguoiHoc, "cardQLNguoiHoc");

        pnlQLHocVien.setLayout(new java.awt.BorderLayout());

        jPanel22.setPreferredSize(new java.awt.Dimension(681, 100));
        jPanel22.setLayout(new java.awt.GridLayout(0, 1));

        jPanel21.setPreferredSize(new java.awt.Dimension(630, 40));
        jPanel21.setLayout(new java.awt.GridLayout());

        jLabel166.setBackground(new java.awt.Color(71, 102, 102));
        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("QUẢN LÝ HỌC VIÊN");
        jLabel166.setOpaque(true);
        jLabel166.setPreferredSize(new java.awt.Dimension(340, 40));
        jLabel166.setRequestFocusEnabled(false);
        jPanel21.add(jLabel166);

        jPanel22.add(jPanel21);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setPreferredSize(new java.awt.Dimension(1404, 60));

        jLabel29.setBackground(new java.awt.Color(67, 73, 97));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Khóa học");
        jLabel29.setOpaque(true);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setBackground(new java.awt.Color(67, 73, 97));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Chuyên đề");
        jLabel28.setOpaque(true);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel23);

        pnlQLHocVien.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTabbedPane5.setOpaque(true);

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

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setPreferredSize(new java.awt.Dimension(1399, 60));

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/delete.png"))); // NOI18N
        jButton41.setText("Xóa khỏi khóa học");

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/update.png"))); // NOI18N
        jButton42.setText("Cập nhật điểm");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(896, Short.MAX_VALUE)
                .addComponent(jButton41)
                .addGap(29, 29, 29)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/search.png"))); // NOI18N
        jLabel30.setText("Tìm kiếm");
        jLabel30.setOpaque(true);
        jPanel26.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 200, 50));

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

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/add.png"))); // NOI18N
        jButton43.setText("Thêm vào khóa học");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(1063, Short.MAX_VALUE)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel25.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        jTabbedPane5.addTab("   Người Học   ", jPanel25);

        pnlQLHocVien.add(jTabbedPane5, java.awt.BorderLayout.CENTER);

        main.add(pnlQLHocVien, "cardQLHocVien");

        jLabel167.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel167.setText("THỐNG KÊ");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel167)
                .addContainerGap(881, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel167)
                .addContainerGap(596, Short.MAX_VALUE))
        );

        main.add(pnlThongKe, "cardThongKe");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1377, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );

        main.add(jPanel77, "card9");

        jPanel2.add(main, java.awt.BorderLayout.CENTER);

        pnlTrangThai.setBackground(new java.awt.Color(208, 239, 182));
        pnlTrangThai.setPreferredSize(new java.awt.Dimension(1130, 35));
        pnlTrangThai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/info-24px.png"))); // NOI18N
        jLabel3.setText(" Hệ quản lý đào tạo");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlTrangThai.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/view/icon/stopwatch.png"))); // NOI18N
        jLabel4.setText(" 00:00:00 AM");
        pnlTrangThai.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 160, 40));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        exitProgram();

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseActionPerformed

    private void tblDanhSach_ChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSach_ChuyenDeMouseClicked
        if (evt.getClickCount() == 2) {
            this.row_ChuyenDe = tblDanhSach_ChuyenDe.getSelectedRow();
            this.editChuyenDe();
        }
    }//GEN-LAST:event_tblDanhSach_ChuyenDeMouseClicked

    private void tblDanhSach_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSach_NhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.row_NhanVien = tblDanhSach_NhanVien.getSelectedRow();
            this.editNhanVien();
        }
    }//GEN-LAST:event_tblDanhSach_NhanVienMouseClicked

    private void btnThem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NhanVienActionPerformed
        insertNhanVien();
    }//GEN-LAST:event_btnThem_NhanVienActionPerformed

    private void btnSua_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NhanVienActionPerformed
        updateNhanVien();
    }//GEN-LAST:event_btnSua_NhanVienActionPerformed

    private void btnXoa_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NhanVienActionPerformed
        deleteNhanVien();
    }//GEN-LAST:event_btnXoa_NhanVienActionPerformed

    private void btnMoi_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_NhanVienActionPerformed
        clearFormNhanVien();
    }//GEN-LAST:event_btnMoi_NhanVienActionPerformed

    private void btnFirst_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_NhanVienActionPerformed
        first_NhanVien();
    }//GEN-LAST:event_btnFirst_NhanVienActionPerformed

    private void btnBack_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack_NhanVienActionPerformed
        back_NhanVien();
    }//GEN-LAST:event_btnBack_NhanVienActionPerformed

    private void btnNext_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_NhanVienActionPerformed
        next_NhanVien();
    }//GEN-LAST:event_btnNext_NhanVienActionPerformed

    private void btnLast_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_NhanVienActionPerformed
        last_NhanVien();
    }//GEN-LAST:event_btnLast_NhanVienActionPerformed

    private void btnThem_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ChuyenDeActionPerformed
        isUpdate = false;
        if (checkFormChuyenDe()) {
            insertChuyenDe();
        }
    }//GEN-LAST:event_btnThem_ChuyenDeActionPerformed

    private void btnSua_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ChuyenDeActionPerformed
        isUpdate = true;
        if (checkFormChuyenDe()) {
            updateChuyenDe();
        }
    }//GEN-LAST:event_btnSua_ChuyenDeActionPerformed

    private void btnXoa_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_ChuyenDeActionPerformed
        deleteChuyenDe();
    }//GEN-LAST:event_btnXoa_ChuyenDeActionPerformed

    private void btnMoi_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_ChuyenDeActionPerformed
        clearChuyenDe();
    }//GEN-LAST:event_btnMoi_ChuyenDeActionPerformed

    private void btnFirst_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_ChuyenDeActionPerformed
        first();
    }//GEN-LAST:event_btnFirst_ChuyenDeActionPerformed

    private void btnPre_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPre_ChuyenDeActionPerformed
        prev();
    }//GEN-LAST:event_btnPre_ChuyenDeActionPerformed

    private void btnNext_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_ChuyenDeActionPerformed
        next();
    }//GEN-LAST:event_btnNext_ChuyenDeActionPerformed

    private void btnLast_ChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_ChuyenDeActionPerformed
        last();
    }//GEN-LAST:event_btnLast_ChuyenDeActionPerformed

    private void lblHinhAnh_ChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnh_ChuyenDeMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhAnh_ChuyenDeMouseClicked

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

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
            java.util.logging.Logger.getLogger(mainframe_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new mainframe_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgRole;
    private javax.swing.ButtonGroup btgSex;
    private javax.swing.JButton btnBack_NhanVien;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst_ChuyenDe;
    private javax.swing.JButton btnFirst_NhanVien;
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnLast_ChuyenDe;
    private javax.swing.JButton btnLast_NhanVien;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenubar_showhide;
    private javax.swing.JButton btnMoi_ChuyenDe;
    private javax.swing.JButton btnMoi_NhanVien;
    private javax.swing.JButton btnNext_ChuyenDe;
    private javax.swing.JButton btnNext_NhanVien;
    private javax.swing.JButton btnPre_ChuyenDe;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnSua_ChuyenDe;
    private javax.swing.JButton btnSua_NhanVien;
    private javax.swing.JButton btnThem_ChuyenDe;
    private javax.swing.JButton btnThem_NhanVien;
    private javax.swing.JButton btnTopic;
    private javax.swing.JButton btnXoa_ChuyenDe;
    private javax.swing.JButton btnXoa_NhanVien;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
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
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblHinhAnh_ChuyenDe;
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
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlTopic;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JRadioButton rdoNhanVien_NhanVien;
    private javax.swing.JRadioButton rdoTruongPhong_NhanVien;
    private javax.swing.JTable tblDanhSach_ChuyenDe;
    private javax.swing.JTable tblDanhSach_NhanVien;
    private javax.swing.JTabbedPane tbpChuyenDe;
    private javax.swing.JTabbedPane tbpNhanVien;
    private javax.swing.JTextField txtHoTen_NhanVien;
    private javax.swing.JTextField txtHocPhi_ChuyenDe;
    private javax.swing.JTextField txtMaCD_ChuyenDe;
    private javax.swing.JTextField txtMaNV_NhanVien;
    private javax.swing.JPasswordField txtMatKhau_NhanVien;
    private javax.swing.JTextArea txtMoTa_ChuyenDe;
    private javax.swing.JTextField txtTenChuyenDe_ChuyenDe;
    private javax.swing.JTextField txtThoiGian_ChuyenDe;
    private javax.swing.JPasswordField txtXacNhanMK_NhanVien;
    // End of variables declaration//GEN-END:variables

// ROUNDED PANEL
    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, 0, 0, arcs.width, arcs.height); //paint border
        }

    }

// ROUNDED TEXTFIELD
    class RoundJTextField extends JTextField {

        private Shape shape;

        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }

        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, 0, 0, 15, 15);
        }

        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }

    void fillTableNhanVien() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSach_NhanVien.getModel();

        //Tắt edit cho table
        tblDanhSach_NhanVien.setDefaultEditor(Object.class, null);

        model.setRowCount(0); //Xóa tất cả các hàng trên jtable nhân viên

        try {
            List<NhanVien> list = nvDAO.select(); //Đọc dữ liệu từ CSDL
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên"
                };
                model.addRow(row); //Thêm một hàng vào Jtable nhân viên
            }
        } catch (Exception e) {
//            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }

    }

    void setColumn_NhanVien() {
        String[] column = {"Mã nhân viên", "Mật khẩu", "Họ tên", "Vai trò"};
        DefaultTableModel model = (DefaultTableModel) tblDanhSach_NhanVien.getModel();
        model.setColumnIdentifiers(column);
    }

    void setFormNhanVien(NhanVien nv) {
        txtMaNV_NhanVien.setText(nv.getMaNV());
        txtHoTen_NhanVien.setText(nv.getHoTen());
        txtMatKhau_NhanVien.setText(nv.getMatKhau());
        txtXacNhanMK_NhanVien.setText(nv.getMatKhau());
        rdoTruongPhong_NhanVien.setSelected(nv.isVaiTro());
        rdoNhanVien_NhanVien.setSelected(!nv.isVaiTro());
    }

    void clearFormNhanVien() { //btnMoi_NhanVien
        NhanVien nv = new NhanVien();
        this.setFormNhanVien(nv);
        this.row_NhanVien = -1;
        this.updateStatus_NhanVien();
    }

    void editNhanVien() {
        String maNV = (String) tblDanhSach_NhanVien.getValueAt(this.row_NhanVien, 0);
        NhanVien nv = nvDAO.selectID(maNV);
        this.setFormNhanVien(nv);
        tbpNhanVien.setSelectedIndex(1);
        this.updateStatus_NhanVien();
    }

    NhanVien getFormNhanVien() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV_NhanVien.getText());
        nv.setHoTen(txtHoTen_NhanVien.getText());
        nv.setMatKhau(new String(txtMatKhau_NhanVien.getPassword()));
        nv.setVaiTro(rdoTruongPhong_NhanVien.isSelected());
        return nv;
    }

    void insertNhanVien() { //btnThemNhanVien
        NhanVien nv = getFormNhanVien();
        String xacNhanMK = new String(txtXacNhanMK_NhanVien.getPassword());
        if (!xacNhanMK.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                nvDAO.insert(nv);
                this.fillTableNhanVien();
                this.clearFormNhanVien();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    void updateNhanVien() {
        NhanVien nv = getFormNhanVien();
        String xacNhanMK = new String(txtXacNhanMK_NhanVien.getPassword());
        if (!xacNhanMK.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                nvDAO.update(nv);
                this.fillTableNhanVien();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void deleteNhanVien() { //btnXoa_NhanVien
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String maNV = txtMaNV_NhanVien.getText();
            if (maNV.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn!");
            } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
                try {
                    nvDAO.delete(maNV);
                    this.fillTableNhanVien();
                    this.clearFormNhanVien();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void first_NhanVien() {//btnFirst_NhanVien
        this.row_NhanVien = 0;
        this.editNhanVien();
    }

    void back_NhanVien() {//btnBack_NhanVien
        if (this.row_NhanVien > 0) {
            this.row_NhanVien--;
            this.editNhanVien();
        }
    }

    void next_NhanVien() {//btnNext_NhanVien
        if (this.row_NhanVien < tblDanhSach_NhanVien.getRowCount() - 1) {
            this.row_NhanVien++;
            this.editNhanVien();
        }
    }

    void last_NhanVien() {//btnLast_NhanVien
        this.row_NhanVien = tblDanhSach_NhanVien.getRowCount() - 1;
        this.editNhanVien();
    }

    void updateStatus_NhanVien() {
        boolean edit = (this.row_NhanVien >= 0);
        boolean first = (this.row_NhanVien == 0);
        boolean last = (this.row_NhanVien == tblDanhSach_NhanVien.getRowCount());
        //Trạng thái form
        txtMaNV_NhanVien.setEditable(!edit);
        btnThem_NhanVien.setEnabled(!edit);
        btnSua_NhanVien.setEnabled(edit);
        btnXoa_NhanVien.setEnabled(edit);
        //Trạng thái điều hướng
        btnFirst_NhanVien.setEnabled(edit && !first);
        btnBack_NhanVien.setEnabled(edit && !first);
        btnNext_NhanVien.setEnabled(edit && !last);
        btnLast_NhanVien.setEnabled(edit && !last);
    }

    //2. xu ly chuyen de thai
//
//
    JFileChooser filenChooser = new JFileChooser();
    static ChuyenDeDAO chuyenDeDAO = new ChuyenDeDAO();
    int row_ChuyenDe = -1;
    boolean isUpdate = false;
    static DefaultTableModel modelChuyenDe;

    public void setModelTableChuyenDe() {
        modelChuyenDe = new DefaultTableModel(new Object[][]{}, new Object[]{"Mã chuyên đề", "Tên chuyên đề", "Học phí", "Thời lượng", "Mô tả", "Ảnh"});
        tblDanhSach_ChuyenDe.setModel(modelChuyenDe);
        //Tắt edit cho table
        tblDanhSach_ChuyenDe.setDefaultEditor(Object.class, null);
    }

    void chonAnh() {
        if (filenChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = filenChooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblHinhAnh_ChuyenDe.setIcon(icon);
            lblHinhAnh_ChuyenDe.setToolTipText(file.getName());
        }
    }

    static public void fillTableChuyenDe() {
        //DefaultTableModel model = (DefaultTableModel) tblChuyenDe.getModel();
        modelChuyenDe.setRowCount(0);

        try {
            List<ChuyenDe> list;

            list = chuyenDeDAO.select();

            for (ChuyenDe cd : list) {
                Object[] row = {
                    cd.getMaCD(),
                    cd.getTenCD(),
                    (long) cd.getHocPhi(),
                    cd.getThoiLuong(),
                    cd.getMoTa(),
                    cd.getHinh()
                };
                modelChuyenDe.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    void setFormChuyenDe(ChuyenDe cd) {
        txtMaCD_ChuyenDe.setText(cd.getMaCD());
        txtTenChuyenDe_ChuyenDe.setText(cd.getTenCD());
        txtHocPhi_ChuyenDe.setText(String.valueOf((long) cd.getHocPhi()));
        txtThoiGian_ChuyenDe.setText(String.valueOf(cd.getThoiLuong()));
        lblHinhAnh_ChuyenDe.setToolTipText(cd.getHinh());
        if (cd.getHinh() != null) {
            lblHinhAnh_ChuyenDe.setIcon(XImage.read(cd.getHinh()));
        }
        txtMoTa_ChuyenDe.setText(cd.getMoTa());
    }

    ChuyenDe getFormChuyenDe() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(txtMaCD_ChuyenDe.getText());
        cd.setTenCD(txtTenChuyenDe_ChuyenDe.getText());
        cd.setHocPhi(Float.parseFloat(txtHocPhi_ChuyenDe.getText()));
        cd.setThoiLuong(Integer.valueOf(txtThoiGian_ChuyenDe.getText()));
        cd.setHinh(lblHinhAnh_ChuyenDe.getToolTipText());
        cd.setMoTa(txtMoTa_ChuyenDe.getText());
        return cd;
    }

    void editChuyenDe() {
//        try {
//            String macd = (String) tblDanhSach_ChuyenDe.getValueAt(this.index, 0);
//            ChuyenDe model = dao.selectID(macd);
//            if (model != null) {
//                setFormChuyenDe(model);//lỗi chưa bk sửa
//                this.updateStatusChuyenDe();
//            }
//        } catch (Exception e) {
//            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
//        }

        String maCD = (String) tblDanhSach_ChuyenDe.getValueAt(this.row_ChuyenDe, 0);
        ChuyenDe cd = chuyenDeDAO.selectID(maCD);
        this.setFormChuyenDe(cd);
        tbpChuyenDe.setSelectedIndex(1);
        this.updateStatusChuyenDe();
    }

    void insertChuyenDe() {
        ChuyenDe model = getFormChuyenDe();
        if (model.getHinh() == null) {
            MsgBox.alert(this, "Hình Không Được Để Trống");
            return;
        }
        try {
            chuyenDeDAO.insert(model);
            this.fillTableChuyenDe();
            //MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void updateChuyenDe() {
        ChuyenDe model = getFormChuyenDe();
        if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật chuyên đề này không?")) {
            try {
                chuyenDeDAO.update(model);
                this.fillTableChuyenDe();
                clearChuyenDe();
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
            }
        }
    }

    void deleteChuyenDe() {
        ChuyenDe cd = chuyenDeDAO.selectID(String.valueOf(tblDanhSach_ChuyenDe.getValueAt(row_ChuyenDe, 0)));
        if (MsgBox.confirm(this, "Bạn có chắc muốn xóa chuyên đề này không?")) {
            try {
                String maCD = txtMaCD_ChuyenDe.getText();
                chuyenDeDAO.delete(maCD);
                this.fillTableChuyenDe();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Không thể xóa chuyên đề đã tồn tại khóa học!");
            }
        }

    }

    void updateStatusChuyenDe() {
        boolean edit = (row_ChuyenDe >= 0);
        boolean first = this.row_ChuyenDe == 0;
        boolean last = this.row_ChuyenDe == tblDanhSach_ChuyenDe.getRowCount() - 1;
        txtMaCD_ChuyenDe.setEditable(!edit);
        btnThem_ChuyenDe.setEnabled(!edit);
        btnSua_ChuyenDe.setEnabled(edit);
        btnXoa_ChuyenDe.setEnabled(edit);
        btnFirst_ChuyenDe.setEnabled(edit && !first);
        btnPre_ChuyenDe.setEnabled(edit && !first);
        btnNext_ChuyenDe.setEnabled(edit && !last);
        btnLast_ChuyenDe.setEnabled(edit && !last);
    }

    public void first() {
        row_ChuyenDe = 0;
        tblDanhSach_ChuyenDe.setRowSelectionInterval(row_ChuyenDe, row_ChuyenDe);
        editChuyenDe();
    }

    public void prev() {
        if (row_ChuyenDe > 0) {
            row_ChuyenDe--;
            tblDanhSach_ChuyenDe.setRowSelectionInterval(row_ChuyenDe, row_ChuyenDe);
            editChuyenDe();
        }
    }

    public void next() {
        if (row_ChuyenDe < tblDanhSach_ChuyenDe.getRowCount() - 1) {
            row_ChuyenDe++;
            tblDanhSach_ChuyenDe.setRowSelectionInterval(row_ChuyenDe, row_ChuyenDe);
            editChuyenDe();
        }
    }

    public void last() {
        row_ChuyenDe = tblDanhSach_ChuyenDe.getRowCount() - 1;
        tblDanhSach_ChuyenDe.setRowSelectionInterval(row_ChuyenDe, row_ChuyenDe);
        editChuyenDe();
    }

    void clearChuyenDe() {
        txtMaCD_ChuyenDe.setText("");
        txtTenChuyenDe_ChuyenDe.setText("");
        txtThoiGian_ChuyenDe.setText("");
        txtHocPhi_ChuyenDe.setText("");
        txtMoTa_ChuyenDe.setText("");
        lblHinhAnh_ChuyenDe.setIcon(null);
        row_ChuyenDe = -1;
        updateStatusChuyenDe();
    }

    public boolean checkFormChuyenDe() {
        if (txtMaCD_ChuyenDe.getText().equals("") || txtMaCD_ChuyenDe.getText().equals("") || txtThoiGian_ChuyenDe.getText().equals("")
                || txtHocPhi_ChuyenDe.getText().equals("") || txtMoTa_ChuyenDe.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đủ dữ liệu sau đó ấn Thêm", "Error", 1);
            return false;
        } else if (!(txtMaCD_ChuyenDe.getText()).matches("CD[0-9]{1,5}")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng mã \n VD : CD07", "Error", 1);
            txtMaCD_ChuyenDe.requestFocus();
            return false;
        } else if (!(txtThoiGian_ChuyenDe.getText()).matches("[0-9]{1,99}")) {
            JOptionPane.showMessageDialog(this, "Thời lượng phải nhập số dương", "Error", 1);
            txtThoiGian_ChuyenDe.requestFocus();
            return false;
        } else if (!(txtHocPhi_ChuyenDe.getText()).matches("[0-9]{1,99}")) {
            JOptionPane.showMessageDialog(this, "Học phí phải nhập số dương", "Error", 1);
            txtHocPhi_ChuyenDe.requestFocus();
            return false;
        }
        List<ChuyenDe> list = chuyenDeDAO.select();
        for (int i = 0; i < list.size(); i++) {
            if (isUpdate) {
            } else {
                if (txtMaCD_ChuyenDe.getText().equalsIgnoreCase(list.get(i).getMaCD())) {
                    JOptionPane.showMessageDialog(this, "Trùng Mã Chuyên Đề", "Error", 1);
                    return false;
                }
            }
        }

        return true;
    }

    /*
   * System function
     */
    private void exitProgram() {
        if (MsgBox.confirm(this, "Bạn có thực sự muốn thoát chương trình ?")) {
            System.exit(0);
        }
    }
}

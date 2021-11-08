/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.AccountDTO;
import DTO.NhanVienDTO;
import GUI.NhanVien.*;
import GUI.Sweet.SweetComboBox;
import static GUI.Sweet.SweetFileChooser.FileExists;
import static GUI.Sweet.SweetFileChooser.PATH_NHANVIEN;
import static GUI.Sweet.SweetImage.*;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import quanlycuahangsach.Currency;
import static quanlycuahangsach.quanlycuahangsach.currentAccount;
import static quanlycuahangsach.quanlycuahangsach.currentNhanVien;


/**
 *
 * @author admin
 */
public class CaiDatJPanel extends javax.swing.JPanel {

    SweetComboBox cbxTrangThai,cbxCaLam;
    public ImageIcon imgAnhDaiDien;
    public Currency currency;
    /**
     * Creates new form SuaNhanVienJPanel
     */
    public ArrayList<javax.swing.AbstractButton> arrButton =new ArrayList<>();
    public void hidePassword(){
        String hide = "";
        for(int i=0;i<10;i++){
            hide += "*";
        }
        lblPassword.setText(hide);
    }      
    public void setShadow(){
        pnlThongTin.setShadow(1);
        pnlTacVu.setShadow(1);
    }     
    public void setRadioButton(){
        ButtonGroup groupGioiTinh = new javax.swing.ButtonGroup();   
        
        groupGioiTinh.add(radNam);
        groupGioiTinh.add(radNu);     
    }

    public CaiDatJPanel() {
        initComponents();
        
        setShadow();
        setRadioButton();
        hidePassword();
        lblDoiMatKhau.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnlDangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        lblPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setData();
    }
    public void setRole(){
        String Role = currentAccount.getRole();
        int i;
       for(i=0;i<Role.length()-2;i++){
           if(Role.codePointAt(i) == 49){
               arrButton.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png")));
           }arrButton.get(i).setEnabled(false);
       }
       for(;i<arrButton.size();i++){
           String Command = arrButton.get(i).getActionCommand();
           if(Command.equals(currentNhanVien.getGioiTinh())||Command.equals(currentNhanVien.getCaLam()) || Command.equals(currentNhanVien.getTrangThai())){
               arrButton.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png")));
               arrButton.get(i).setSelected(true);
       }arrButton.get(i).setEnabled(false);
       }
    }    
    public void setData(){
    if(currentAccount.getRole().toString().equalsIgnoreCase("admin")){
        lblMaNhanVien.setText("Admin");
        lblHoTen.setText("Nguyễn Văn Admin");
        lblLuong.setVisible(false);
        lblNamSinh.setText("2000");
        lblSoDienThoai.setText("0916375645");
        lblDiaChi.setText("120 Công Chúa Ngọc Hân P12, Q11");
        lblLuong.setText("");
        lblTrangThai.setText("");
        lblCaLam.setText("");
        
        arrButton.add(cbxTongQuan);
        arrButton.add(cbxDonHang);
        arrButton.add(cbxSanPham);
        arrButton.add(cbxKhachHang);
        arrButton.add(cbxDoanhThu);
        arrButton.add(cbxThongKe);
        arrButton.add(cbxKhuyenMai);
        arrButton.add(cbxNhapHang);
        arrButton.add(cbxQuanLyNhanVien);
        arrButton.add(cbxQuanLyDanhMuc);
        radNam.setVisible(false);
        radNu.setVisible(false);
        
        for(int i=0;i<arrButton.size();i++){
            arrButton.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png")));
            arrButton.get(i).setEnabled(false);
        }
        
        
    }
    else{
    lblMaNhanVien.setText(currentNhanVien.getMaNhanVien());
    lblHoTen.setText(currentNhanVien.getHoTen());
    lblNamSinh.setText(currentNhanVien.getNamSinh());
    lblSoDienThoai.setText(currentNhanVien.getSoDienThoai());
    lblDiaChi.setText(currentNhanVien.getDiaChi());
    String luong = currency.changeCurrency(currentNhanVien.getLuong());
    lblLuong.setText(luong+"đ");
    lblTrangThai.setText(currentNhanVien.getTrangThai());
    lblCaLam.setText(currentNhanVien.getCaLam());
        arrButton.add(cbxTongQuan);
        arrButton.add(cbxDonHang);
        arrButton.add(cbxSanPham);
        arrButton.add(cbxKhachHang);
        arrButton.add(cbxDoanhThu);
        arrButton.add(cbxThongKe);
        arrButton.add(cbxKhuyenMai);
        arrButton.add(cbxNhapHang);
        arrButton.add(cbxQuanLyNhanVien);
        arrButton.add(cbxQuanLyDanhMuc);
        arrButton.add(radNam);
        arrButton.add(radNu);
        setRole(); 
        if (!FileExists(PATH_NHANVIEN + currentNhanVien.getImgSource())) {
            currentNhanVien.setImgSource("default.jpg");
        }
        
        Image imageScale = readImageFromFilePath(PATH_NHANVIEN + currentNhanVien.getImgSource(), 168, 238);
        imgAnhDaiDien = new ImageIcon(imageScale);
        lblAnh.setIcon(imgAnhDaiDien);   
    }
        

        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTin = new GUI.Rounded();
        lblTitleTrangThai = new javax.swing.JLabel();
        lblTitleLuong = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTitleCaLam = new javax.swing.JLabel();
        lblAddImage = new javax.swing.JLabel();
        lblTrangThai2 = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblTitleHoTen = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        txtTitleGioiTinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        lblNamSinh = new javax.swing.JLabel();
        lblTitleNamSinh = new javax.swing.JLabel();
        lblTitleSDT = new javax.swing.JLabel();
        lblTitleDiaChi = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDiaChi = new javax.swing.JTextArea();
        lblDonHang2 = new javax.swing.JLabel();
        lblDoiMatKhau = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblCaLam = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        pnlTacVu = new GUI.Rounded();
        cbxTongQuan = new javax.swing.JCheckBox();
        cbxDonHang = new javax.swing.JCheckBox();
        cbxSanPham = new javax.swing.JCheckBox();
        cbxKhachHang = new javax.swing.JCheckBox();
        cbxDoanhThu = new javax.swing.JCheckBox();
        cbxThongKe = new javax.swing.JCheckBox();
        cbxKhuyenMai = new javax.swing.JCheckBox();
        cbxNhapHang = new javax.swing.JCheckBox();
        cbxQuanLyNhanVien = new javax.swing.JCheckBox();
        cbxQuanLyDanhMuc = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlDangXuat = new GUI.Rounded();
        lblQuayVe2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 243, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlThongTin.setBackground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setForeground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleTrangThai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTitleTrangThai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTrangThai.setText("Trạng thái:");
        pnlThongTin.add(lblTitleTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 30));

        lblTitleLuong.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitleLuong.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleLuong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitleLuong.setText("Lương:");
        pnlThongTin.add(lblTitleLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 50, -1));

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPassword.setText("****************");
        pnlThongTin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, 30));

        lblTitleCaLam.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTitleCaLam.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleCaLam.setText("Ca làm:");
        pnlThongTin.add(lblTitleCaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, 30));

        lblAddImage.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 0, 14)); // NOI18N
        lblAddImage.setForeground(new java.awt.Color(0, 52, 102));
        lblAddImage.setText("Thêm ảnh mới");
        lblAddImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 52, 102)));
        lblAddImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblAddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddImageMouseClicked(evt);
            }
        });
        pnlThongTin.add(lblAddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, -1));

        lblTrangThai2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTrangThai2.setForeground(new java.awt.Color(0, 52, 102));
        lblTrangThai2.setText("Mã nhân viên:");
        pnlThongTin.add(lblTrangThai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));

        lblMaNhanVien.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(24, 24, 24));
        lblMaNhanVien.setText("NV1");
        pnlThongTin.add(lblMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 30));

        lblTitleHoTen.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTitleHoTen.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleHoTen.setText("Họ và tên:");
        pnlThongTin.add(lblTitleHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        lblLuong.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblLuong.setForeground(new java.awt.Color(24, 24, 24));
        lblLuong.setText("Phan Công Sơn");
        pnlThongTin.add(lblLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, 30));

        txtTitleGioiTinh.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTitleGioiTinh.setForeground(new java.awt.Color(0, 52, 102));
        txtTitleGioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTitleGioiTinh.setText("Giới tính:");
        pnlThongTin.add(txtTitleGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 20));

        radNam.setBackground(new java.awt.Color(255, 255, 255));
        radNam.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        radNam.setForeground(new java.awt.Color(24, 24, 24));
        radNam.setText("Nam");
        radNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlThongTin.add(radNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 67, -1));

        radNu.setBackground(new java.awt.Color(255, 255, 255));
        radNu.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        radNu.setForeground(new java.awt.Color(24, 24, 24));
        radNu.setText("Nữ");
        radNu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlThongTin.add(radNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        lblNamSinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNamSinh.setForeground(new java.awt.Color(24, 24, 24));
        pnlThongTin.add(lblNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        lblTitleNamSinh.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitleNamSinh.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleNamSinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitleNamSinh.setText("Năm sinh:");
        pnlThongTin.add(lblTitleNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        lblTitleSDT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitleSDT.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleSDT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitleSDT.setText("Số điện thoại:");
        pnlThongTin.add(lblTitleSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, -1));

        lblTitleDiaChi.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitleDiaChi.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitleDiaChi.setText("Địa chỉ:");
        pnlThongTin.add(lblTitleDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        lblSoDienThoai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSoDienThoai.setForeground(new java.awt.Color(24, 24, 24));
        pnlThongTin.add(lblSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(53, 55, 70));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblDiaChi.setColumns(20);
        lblDiaChi.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDiaChi.setLineWrap(true);
        lblDiaChi.setRows(5);
        lblDiaChi.setBorder(null);
        lblDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblDiaChi.setEnabled(false);
        jScrollPane1.setViewportView(lblDiaChi);

        pnlThongTin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, 60));

        lblDonHang2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDonHang2.setForeground(new java.awt.Color(0, 52, 102));
        lblDonHang2.setText("Mật khẩu:");
        pnlThongTin.add(lblDonHang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, 30));

        lblDoiMatKhau.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 0, 14)); // NOI18N
        lblDoiMatKhau.setForeground(new java.awt.Color(0, 146, 242));
        lblDoiMatKhau.setText("Đổi mật khẩu");
        lblDoiMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 146, 242)));
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseClicked(evt);
            }
        });
        pnlThongTin.add(lblDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, 20));

        lblHoTen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(24, 24, 24));
        lblHoTen.setText("Phan Công Sơn");
        pnlThongTin.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        lblTrangThai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(24, 24, 24));
        lblTrangThai.setText("Còn làm");
        pnlThongTin.add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 30));

        lblCaLam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCaLam.setForeground(new java.awt.Color(24, 24, 24));
        lblCaLam.setText("Phan Công Sơn");
        pnlThongTin.add(lblCaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, 30));

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setPreferredSize(new java.awt.Dimension(168, 238));
        pnlThongTin.add(lblAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 168, 238));

        add(pnlThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 973, 350));

        pnlTacVu.setBackground(new java.awt.Color(238, 243, 247));
        pnlTacVu.setForeground(new java.awt.Color(238, 243, 247));
        pnlTacVu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTongQuan.setBackground(new java.awt.Color(255, 255, 255));
        cbxTongQuan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxTongQuan.setForeground(new java.awt.Color(0, 52, 102));
        cbxTongQuan.setText("Tổng quan");
        cbxTongQuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxTongQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 134, 20));

        cbxDonHang.setBackground(new java.awt.Color(255, 255, 255));
        cbxDonHang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxDonHang.setForeground(new java.awt.Color(0, 52, 102));
        cbxDonHang.setText("Đơn hàng");
        cbxDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 20));

        cbxSanPham.setBackground(new java.awt.Color(255, 255, 255));
        cbxSanPham.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxSanPham.setForeground(new java.awt.Color(0, 52, 102));
        cbxSanPham.setText("Sản phẩm");
        cbxSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 132, 20));

        cbxKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        cbxKhachHang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxKhachHang.setForeground(new java.awt.Color(0, 52, 102));
        cbxKhachHang.setText("Khách hàng");
        cbxKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        cbxKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKhachHangActionPerformed(evt);
            }
        });
        pnlTacVu.add(cbxKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 20));

        cbxDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        cbxDoanhThu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxDoanhThu.setForeground(new java.awt.Color(0, 52, 102));
        cbxDoanhThu.setText("Doanh thu");
        cbxDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxDoanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 134, 20));

        cbxThongKe.setBackground(new java.awt.Color(255, 255, 255));
        cbxThongKe.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxThongKe.setForeground(new java.awt.Color(0, 52, 102));
        cbxThongKe.setText("Thống kê");
        cbxThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 20));

        cbxKhuyenMai.setBackground(new java.awt.Color(255, 255, 255));
        cbxKhuyenMai.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxKhuyenMai.setForeground(new java.awt.Color(0, 52, 102));
        cbxKhuyenMai.setText("Khuyến mãi");
        cbxKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 132, 20));

        cbxNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        cbxNhapHang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxNhapHang.setForeground(new java.awt.Color(0, 52, 102));
        cbxNhapHang.setText("Nhập hàng");
        cbxNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 132, 20));

        cbxQuanLyNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        cbxQuanLyNhanVien.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxQuanLyNhanVien.setForeground(new java.awt.Color(0, 52, 102));
        cbxQuanLyNhanVien.setText("Quản lí nhân viên");
        cbxQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        pnlTacVu.add(cbxQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, 20));

        cbxQuanLyDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        cbxQuanLyDanhMuc.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxQuanLyDanhMuc.setForeground(new java.awt.Color(0, 52, 102));
        cbxQuanLyDanhMuc.setText("Quản lí danh mục");
        cbxQuanLyDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unchecked.png"))); // NOI18N
        cbxQuanLyDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxQuanLyDanhMucActionPerformed(evt);
            }
        });
        pnlTacVu.add(cbxQuanLyDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 20));

        add(pnlTacVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 970, 100));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 52, 102));
        jLabel5.setText("Quyền:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 52, 102));
        jLabel4.setText("Thông tin cá nhân:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        pnlDangXuat.setBackground(new java.awt.Color(238, 243, 247));
        pnlDangXuat.setForeground(new java.awt.Color(0, 146, 242));
        pnlDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDangXuatMouseClicked(evt);
            }
        });

        lblQuayVe2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblQuayVe2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuayVe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        lblQuayVe2.setText("Đăng xuất");

        javax.swing.GroupLayout pnlDangXuatLayout = new javax.swing.GroupLayout(pnlDangXuat);
        pnlDangXuat.setLayout(pnlDangXuatLayout);
        pnlDangXuatLayout.setHorizontalGroup(
            pnlDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuayVe2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangXuatLayout.setVerticalGroup(
            pnlDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuayVe2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        add(pnlDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cbxKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKhachHangActionPerformed

    private void pnlDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDangXuatMouseClicked
        if(SwingUtilities.isLeftMouseButton(evt))
            ((javax.swing.JFrame) SwingUtilities.getWindowAncestor(quanlycuahangsach.quanlycuahangsach.bg)).dispose();
            new GUI.LoginJFrame().setVisible(true);
    }//GEN-LAST:event_pnlDangXuatMouseClicked

    private void lblAddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImageMouseClicked
if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                File file =  GUI.Sweet.SweetFileChooser.ImageFileChooser();
                if(file!=null)
                lblAnh.setIcon(resizeImage(ImageIO.read(file),168,238));
                currentNhanVien.setImgSource(saveImage(lblAnh.getIcon(),lblMaNhanVien.getText()));
                Image imageScale = readImageFromFilePath(PATH_NHANVIEN+currentNhanVien.getImgSource(),168,238);
                imgAnhDaiDien = new ImageIcon(imageScale);
                lblAnh.setIcon(imgAnhDaiDien);
                quanlycuahangsach.quanlycuahangsach.NhanVienBUS.edit(currentNhanVien);
                
            } catch (IOException ex) {
                Logger.getLogger(ThemTaiKhoanJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblAddImageMouseClicked

    private void lblDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseClicked
    if (SwingUtilities.isLeftMouseButton(evt)){
        System.out.println(currentNhanVien.getMaNhanVien());
        new DoiMatKhauJFrame(currentNhanVien.getMaNhanVien()).setVisible(true);
    }
    }//GEN-LAST:event_lblDoiMatKhauMouseClicked

    private void cbxQuanLyDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxQuanLyDanhMucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxQuanLyDanhMucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxDoanhThu;
    private javax.swing.JCheckBox cbxDonHang;
    private javax.swing.JCheckBox cbxKhachHang;
    private javax.swing.JCheckBox cbxKhuyenMai;
    private javax.swing.JCheckBox cbxNhapHang;
    private javax.swing.JCheckBox cbxQuanLyDanhMuc;
    private javax.swing.JCheckBox cbxQuanLyNhanVien;
    private javax.swing.JCheckBox cbxSanPham;
    private javax.swing.JCheckBox cbxThongKe;
    private javax.swing.JCheckBox cbxTongQuan;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddImage;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblCaLam;
    private javax.swing.JTextArea lblDiaChi;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblDonHang2;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblNamSinh;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuayVe2;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTitleCaLam;
    private javax.swing.JLabel lblTitleDiaChi;
    private javax.swing.JLabel lblTitleHoTen;
    private javax.swing.JLabel lblTitleLuong;
    private javax.swing.JLabel lblTitleNamSinh;
    private javax.swing.JLabel lblTitleSDT;
    private javax.swing.JLabel lblTitleTrangThai;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrangThai2;
    private GUI.Rounded pnlDangXuat;
    private GUI.Rounded pnlTacVu;
    private GUI.Rounded pnlThongTin;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JLabel txtTitleGioiTinh;
    // End of variables declaration//GEN-END:variables
}

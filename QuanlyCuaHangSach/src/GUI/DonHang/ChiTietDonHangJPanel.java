/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.DonHang;

import DTO.ChiTietDonHangDTO;
import DTO.KhachHangDTO;
import DTO.SanPhamDTO;
import GUI.DonHangJPanel;
import static GUI.DonHangJPanel.currentDonHang;
import GUI.Sweet.SweetFileChooser;
import GUI.SweetAlert.SweetAlert;
import GUI.Table.RenderTable;
import static GUI.TongQuanJPanel.customTable;
import static GUI.TongQuanJPanel.setJTableColumnsWidth;
import IO.PDF.HoaDonBanHangPDF;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import static quanlycuahangsach.Currency.changeCurrency;
import quanlycuahangsach.DateTime;

/**
 *
 * @author admin
 */
public class ChiTietDonHangJPanel extends javax.swing.JPanel {

    Object[] columnNames ={"Sản phẩm","Số lượng","Đơn giá","Tạm tính"};
    static DefaultTableModel listTableModel;
    /**
     * Creates new form SanPhamJPanel
     */
    public void setShadow(){
        pnlThongTin.setShadow(1);
    }    
    public void ShowTable(JTable table,Object[] columnName){
        
        table.setDefaultRenderer(Object.class, new RenderTable());
        listTableModel = new DefaultTableModel(columnNames,0);
        fetchAllSanPham();
    }     
    
    public static void fetchAllSanPham(){
    listTableModel.setRowCount(0);
        for(int i=0;i<GUI.DonHangJPanel.currentChiTietDonHangList.size();i++){
            Vector row = new Vector();
            SanPhamDTO sanpham = GUI.DonHangJPanel.currentSanPhamList.get(i);
            ChiTietDonHangDTO chitietdonhang = GUI.DonHangJPanel.currentChiTietDonHangList.get(i);
            row.add(sanpham.getTenSanPham());
            row.add(chitietdonhang.getSoLuong());
            row.add(changeCurrency(chitietdonhang.getDonGia())+"đ");
            row.add(changeCurrency(""+Double.parseDouble(chitietdonhang.getSoLuong())*Double.parseDouble(chitietdonhang.getDonGia()))+"đ");
            listTableModel.addRow(row);
        }
        tblSanPham.setModel(listTableModel);
    
    }
    public ChiTietDonHangJPanel() {
        initComponents();
        customTable(tblSanPham,scpSanPham);
        ShowTable(tblSanPham,columnNames);
        setShadow();
        setData();
        pnlQuayVe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnlXuatHoaDon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
             
    }
    public void setData(){
            lblHoTen.setText(GUI.DonHangJPanel.currentKhachHang.getHoTen());
            lblSoDienThoai.setText(GUI.DonHangJPanel.currentKhachHang.getSoDienThoai());
            lblEmail.setText(GUI.DonHangJPanel.currentKhachHang.getEmail());
            lblDiaChi.setText(GUI.DonHangJPanel.currentKhachHang.getDiaChi());
            lblMaDonHang.setText(GUI.DonHangJPanel.currentDonHang.getMaDonHang());
            lblNgayDat.setText(DateTime.TimestampToDateString(GUI.DonHangJPanel.currentDonHang.getNgayXuat(),0));
            lblTenNhanVien.setText(GUI.DonHangJPanel.currentDonHang.getMaNhanVien());
            lblTamTinh.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getTamTinh())+"đ");
            lblGiamGia.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getGiamGia())+"đ");
            lblPhiVanChuyen.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getPhiVanChuyen())+"đ");
            lblTongTien.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getTongTien())+"đ");
            lblMaNhanVien.setText(GUI.DonHangJPanel.currentNhanVien.getMaNhanVien());
            lblTenNhanVien.setText(GUI.DonHangJPanel.currentNhanVien.getHoTen());
            lblMaGiamGia.setText(GUI.DonHangJPanel.currentDonHang.getMaCode());
            lblTrangThai.setText(getGiaTriTrangThai());
    
    }
    
    public String getGiaTriTrangThai(){
        if(GUI.DonHangJPanel.currentDonHang.getTrangThai().equals("1")){
            return "Thành Công";
        } else return "Hủy";
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
        scpSanPham = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }

        };
        lblThongTinHoaDon1 = new javax.swing.JLabel();
        pnlTongTien = new javax.swing.JPanel();
        lblTitleTamTinh = new javax.swing.JLabel();
        lblTitleMaGiamGia = new javax.swing.JLabel();
        lblTitlePhiVanChuyen = new javax.swing.JLabel();
        lblTitleTong = new javax.swing.JLabel();
        lblTamTinh = new javax.swing.JLabel();
        lblGiamGia = new javax.swing.JLabel();
        lblPhiVanChuyen = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        pnlThongTinHoaDon = new javax.swing.JPanel();
        lblTitleNgayDat = new javax.swing.JLabel();
        lblTitleSoDienThoai = new javax.swing.JLabel();
        lblTitleDiaChi = new javax.swing.JLabel();
        lblTitleEmail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDiaChi = new javax.swing.JTextArea();
        lblTenNhanVien1 = new javax.swing.JLabel();
        lblNgayDat = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblTitleMaGiamGia2 = new javax.swing.JLabel();
        lblMaNhanVien1 = new javax.swing.JLabel();
        lblMaGiamGia = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblTitleHoTen = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblTitleMaDonHang = new javax.swing.JLabel();
        lblMaDonHang = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblTitleTrangThai = new javax.swing.JLabel();
        pnlQuayVe = new GUI.Rounded();
        lblQuayVe = new javax.swing.JLabel();
        pnlXuatHoaDon = new GUI.Rounded();
        lblXuatHoaDon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 243, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlThongTin.setBackground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setForeground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setPreferredSize(new java.awt.Dimension(920, 750));
        pnlThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scpSanPham.setForeground(new java.awt.Color(255, 255, 255));

        tblSanPham.setAutoCreateRowSorter(true);
        tblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSanPham.setFocusable(false);
        tblSanPham.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblSanPham.setRowHeight(25);
        tblSanPham.setSelectionBackground(new java.awt.Color(152, 210, 248));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        scpSanPham.setViewportView(tblSanPham);

        pnlThongTin.add(scpSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 993, 260));

        lblThongTinHoaDon1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblThongTinHoaDon1.setForeground(new java.awt.Color(0, 52, 102));
        lblThongTinHoaDon1.setText("Sản phẩm");
        pnlThongTin.add(lblThongTinHoaDon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 186, -1, -1));

        pnlTongTien.setBackground(new java.awt.Color(255, 255, 255));
        pnlTongTien.setForeground(new java.awt.Color(255, 255, 255));

        lblTitleTamTinh.setBackground(new java.awt.Color(192, 192, 192));
        lblTitleTamTinh.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleTamTinh.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTamTinh.setText("Tạm tính");

        lblTitleMaGiamGia.setBackground(new java.awt.Color(192, 192, 192));
        lblTitleMaGiamGia.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleMaGiamGia.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaGiamGia.setText("Mã giảm giá");

        lblTitlePhiVanChuyen.setBackground(new java.awt.Color(192, 192, 192));
        lblTitlePhiVanChuyen.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitlePhiVanChuyen.setForeground(new java.awt.Color(0, 52, 102));
        lblTitlePhiVanChuyen.setText("Phí vận chuyển");

        lblTitleTong.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleTong.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTong.setText("Tổng");

        lblTamTinh.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblTamTinh.setText("3.600.000đ");

        lblGiamGia.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblGiamGia.setText("3.600.000đ");

        lblPhiVanChuyen.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblPhiVanChuyen.setText("3.600.000đ");

        lblTongTien.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(210, 48, 44));
        lblTongTien.setText("3.600.000đ");

        javax.swing.GroupLayout pnlTongTienLayout = new javax.swing.GroupLayout(pnlTongTien);
        pnlTongTien.setLayout(pnlTongTienLayout);
        pnlTongTienLayout.setHorizontalGroup(
            pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongTienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleMaGiamGia)
                    .addComponent(lblTitlePhiVanChuyen)
                    .addComponent(lblTitleTong)
                    .addComponent(lblTitleTamTinh))
                .addGap(48, 48, 48)
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamTinh)
                    .addComponent(lblTongTien)
                    .addComponent(lblGiamGia)
                    .addComponent(lblPhiVanChuyen))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnlTongTienLayout.setVerticalGroup(
            pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongTienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleTamTinh)
                    .addComponent(lblTamTinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleMaGiamGia)
                    .addComponent(lblGiamGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitlePhiVanChuyen)
                    .addComponent(lblPhiVanChuyen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongTien)
                    .addComponent(lblTitleTong)))
        );

        pnlThongTin.add(pnlTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        pnlThongTinHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnlThongTinHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleNgayDat.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleNgayDat.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleNgayDat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleNgayDat.setText("Ngày đặt:");
        pnlThongTinHoaDon.add(lblTitleNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, -1));

        lblTitleSoDienThoai.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleSoDienThoai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleSoDienThoai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSoDienThoai.setText("Số điện thoại:");
        pnlThongTinHoaDon.add(lblTitleSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, -1, -1));

        lblTitleDiaChi.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleDiaChi.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleDiaChi.setText("Địa chỉ:");
        pnlThongTinHoaDon.add(lblTitleDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        lblTitleEmail.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleEmail.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleEmail.setText("Email:");
        pnlThongTinHoaDon.add(lblTitleEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, -1, -1));

        lblEmail.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(24, 24, 24));
        lblEmail.setText("abcxyz@gmail.com");
        pnlThongTinHoaDon.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 95, -1, -1));

        lblSoDienThoai.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblSoDienThoai.setForeground(new java.awt.Color(24, 24, 24));
        lblSoDienThoai.setText("0123456789");
        pnlThongTinHoaDon.add(lblSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(53, 55, 70));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblDiaChi.setColumns(20);
        lblDiaChi.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(24, 24, 24));
        lblDiaChi.setLineWrap(true);
        lblDiaChi.setRows(5);
        lblDiaChi.setText("120 Công Chúa Ngọc Hân, Phường 12\nQuận 11, TP Hồ Chí Minh\n");
        lblDiaChi.setBorder(null);
        lblDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblDiaChi.setEnabled(false);
        jScrollPane1.setViewportView(lblDiaChi);

        pnlThongTinHoaDon.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 50));

        lblTenNhanVien1.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTenNhanVien1.setForeground(new java.awt.Color(0, 52, 102));
        lblTenNhanVien1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenNhanVien1.setText("Tên nhân viên:");
        pnlThongTinHoaDon.add(lblTenNhanVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 95, 100, -1));

        lblNgayDat.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblNgayDat.setForeground(new java.awt.Color(24, 24, 24));
        lblNgayDat.setText("01/05/2000");
        pnlThongTinHoaDon.add(lblNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        lblTenNhanVien.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblTenNhanVien.setForeground(new java.awt.Color(210, 48, 44));
        lblTenNhanVien.setText("MAGIAMGIA2020");
        pnlThongTinHoaDon.add(lblTenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 95, -1, -1));

        lblTitleMaGiamGia2.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleMaGiamGia2.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaGiamGia2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaGiamGia2.setText("Mã giảm giá:");
        pnlThongTinHoaDon.add(lblTitleMaGiamGia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 45, 90, -1));

        lblMaNhanVien1.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblMaNhanVien1.setForeground(new java.awt.Color(0, 52, 102));
        lblMaNhanVien1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaNhanVien1.setText("Mã nhân viên:");
        pnlThongTinHoaDon.add(lblMaNhanVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 100, -1));

        lblMaGiamGia.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblMaGiamGia.setForeground(new java.awt.Color(210, 48, 44));
        lblMaGiamGia.setText("MAGIAMGIA2020");
        pnlThongTinHoaDon.add(lblMaGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 45, -1, -1));

        lblMaNhanVien.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(210, 48, 44));
        lblMaNhanVien.setText("MAGIAMGIA2020");
        pnlThongTinHoaDon.add(lblMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        lblTitleHoTen.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleHoTen.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleHoTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleHoTen.setText("Họ tên:");
        pnlThongTinHoaDon.add(lblTitleHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 50, -1));

        lblHoTen.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(24, 24, 24));
        lblHoTen.setText("Phan Công Sơn");
        pnlThongTinHoaDon.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 45, -1, -1));

        lblTitleMaDonHang.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleMaDonHang.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaDonHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaDonHang.setText("Mã đơn hàng:");
        pnlThongTinHoaDon.add(lblTitleMaDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, -1));

        lblMaDonHang.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblMaDonHang.setForeground(new java.awt.Color(24, 24, 24));
        lblMaDonHang.setText("12345");
        pnlThongTinHoaDon.add(lblMaDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        lblEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
        });
        pnlThongTinHoaDon.add(lblEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        lblTrangThai.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 14)); // NOI18N
        lblTrangThai.setText("Thành công");
        pnlThongTinHoaDon.add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        lblTitleTrangThai.setFont(new java.awt.Font("#9Slide03 Source Sans Pro", 1, 13)); // NOI18N
        lblTitleTrangThai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTrangThai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleTrangThai.setText("Trạng thái:");
        pnlThongTinHoaDon.add(lblTitleTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 100, -1));

        pnlThongTin.add(pnlThongTinHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 987, 180));

        add(pnlThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1010, 620));

        pnlQuayVe.setBackground(new java.awt.Color(238, 243, 247));
        pnlQuayVe.setForeground(new java.awt.Color(0, 146, 242));
        pnlQuayVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuayVeMouseClicked(evt);
            }
        });

        lblQuayVe.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblQuayVe.setForeground(new java.awt.Color(255, 255, 255));
        lblQuayVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-icon.png"))); // NOI18N
        lblQuayVe.setText("  Quay về");

        javax.swing.GroupLayout pnlQuayVeLayout = new javax.swing.GroupLayout(pnlQuayVe);
        pnlQuayVe.setLayout(pnlQuayVeLayout);
        pnlQuayVeLayout.setHorizontalGroup(
            pnlQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuayVeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuayVe, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlQuayVeLayout.setVerticalGroup(
            pnlQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuayVe, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        add(pnlQuayVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnlXuatHoaDon.setBackground(new java.awt.Color(238, 243, 247));
        pnlXuatHoaDon.setForeground(new java.awt.Color(0, 146, 242));
        pnlXuatHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlXuatHoaDonMouseClicked(evt);
            }
        });

        lblXuatHoaDon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblXuatHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblXuatHoaDon.setText("Xuất hóa đơn");

        javax.swing.GroupLayout pnlXuatHoaDonLayout = new javax.swing.GroupLayout(pnlXuatHoaDon);
        pnlXuatHoaDon.setLayout(pnlXuatHoaDonLayout);
        pnlXuatHoaDonLayout.setHorizontalGroup(
            pnlXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXuatHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblXuatHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlXuatHoaDonLayout.setVerticalGroup(
            pnlXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblXuatHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        add(pnlXuatHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
    if (SwingUtilities.isLeftMouseButton(evt)){ 
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new SuaDonHangJPanel());
        this.validate();
        this.repaint();
    }
    }//GEN-LAST:event_lblEditMouseClicked

    private void pnlQuayVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuayVeMouseClicked
     if (SwingUtilities.isLeftMouseButton(evt)){  
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new DonHangJPanel());
        this.validate();
        this.repaint();   
     }// TODO add your handling code here:
    }//GEN-LAST:event_pnlQuayVeMouseClicked

    private void pnlXuatHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlXuatHoaDonMouseClicked
        try {
            String path = SweetFileChooser.PDFFileChooser();
            if(path==null){
            SweetAlert.showSweetAlert(new JFrame(), "Lỗi", "Vui lòng chọn file phù hợp", 1);
                return;
            }
            HoaDonBanHangPDF.exportPdf(path, DonHangJPanel.currentDonHang, quanlycuahangsach.quanlycuahangsach.ChiTietDonHangBUS.getListChiTietByMaDonHang(currentDonHang.getMaDonHang()));
            SweetAlert.showSweetAlert(new JFrame(), "Hoàn tất", "Xuất dữ liệu thành công", 0);
        } catch (IOException ex) {
            Logger.getLogger(ChiTietDonHangJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlXuatHoaDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblDiaChi;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaDonHang;
    private javax.swing.JLabel lblMaGiamGia;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblMaNhanVien1;
    private javax.swing.JLabel lblNgayDat;
    private javax.swing.JLabel lblPhiVanChuyen;
    private javax.swing.JLabel lblQuayVe;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTamTinh;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTenNhanVien1;
    private javax.swing.JLabel lblThongTinHoaDon1;
    private javax.swing.JLabel lblTitleDiaChi;
    private javax.swing.JLabel lblTitleEmail;
    private javax.swing.JLabel lblTitleHoTen;
    private javax.swing.JLabel lblTitleMaDonHang;
    private javax.swing.JLabel lblTitleMaGiamGia;
    private javax.swing.JLabel lblTitleMaGiamGia2;
    private javax.swing.JLabel lblTitleNgayDat;
    private javax.swing.JLabel lblTitlePhiVanChuyen;
    private javax.swing.JLabel lblTitleSoDienThoai;
    private javax.swing.JLabel lblTitleTamTinh;
    private javax.swing.JLabel lblTitleTong;
    private javax.swing.JLabel lblTitleTrangThai;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblXuatHoaDon;
    private GUI.Rounded pnlQuayVe;
    private GUI.Rounded pnlThongTin;
    private javax.swing.JPanel pnlThongTinHoaDon;
    private javax.swing.JPanel pnlTongTien;
    private GUI.Rounded pnlXuatHoaDon;
    private javax.swing.JScrollPane scpSanPham;
    private static javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables
}

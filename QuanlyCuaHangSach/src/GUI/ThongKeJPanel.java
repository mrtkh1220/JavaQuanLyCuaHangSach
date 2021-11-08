/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GUI.ThongKe.DonHangJPanel;
import GUI.ThongKe.SanPhamJPanel;
import GUI.ThongKe.KhuyenMaiJPanel;
import GUI.ThongKe.PhieuNhapJPanel;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public void setShadow(){
        pnlDonHang.setShadow(1);
        pnlKhuyenMai.setShadow(1);
        pnlSanPham.setShadow(1);
        pnlPhieuNhapHang.setShadow(1);
    }    
    public ThongKeJPanel() {
        initComponents();
        setShadow();
        pnlDonHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
        pnlPhieuNhapHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnlSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
        pnlKhuyenMai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSanPham = new GUI.Rounded();
        jLabel2 = new javax.swing.JLabel();
        pnlDonHang = new GUI.Rounded();
        jLabel1 = new javax.swing.JLabel();
        pnlPhieuNhapHang = new GUI.Rounded();
        jLabel4 = new javax.swing.JLabel();
        pnlKhuyenMai = new GUI.Rounded();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 243, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSanPham.setBackground(new java.awt.Color(238, 243, 247));
        pnlSanPham.setForeground(new java.awt.Color(238, 243, 247));
        pnlSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSanPhamMouseClicked(evt);
            }
        });
        pnlSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke/sanpham.png"))); // NOI18N
        pnlSanPham.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        add(pnlSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 380, 260));

        pnlDonHang.setBackground(new java.awt.Color(238, 243, 247));
        pnlDonHang.setForeground(new java.awt.Color(238, 243, 247));
        pnlDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDonHangMouseClicked(evt);
            }
        });
        pnlDonHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke/donhang.png"))); // NOI18N
        pnlDonHang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        add(pnlDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 380, 260));

        pnlPhieuNhapHang.setBackground(new java.awt.Color(238, 243, 247));
        pnlPhieuNhapHang.setForeground(new java.awt.Color(238, 243, 247));
        pnlPhieuNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPhieuNhapHangMouseClicked(evt);
            }
        });
        pnlPhieuNhapHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke/phieunhap.png"))); // NOI18N
        pnlPhieuNhapHang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        add(pnlPhieuNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 347, 380, 260));

        pnlKhuyenMai.setBackground(new java.awt.Color(238, 243, 247));
        pnlKhuyenMai.setForeground(new java.awt.Color(238, 243, 247));
        pnlKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKhuyenMaiMouseClicked(evt);
            }
        });
        pnlKhuyenMai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke/khuyenmai.png"))); // NOI18N
        pnlKhuyenMai.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        add(pnlKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 347, 380, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDonHangMouseClicked
       if (SwingUtilities.isLeftMouseButton(evt)){ 
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new DonHangJPanel());
        this.validate();
        this.repaint();    
       }
    }//GEN-LAST:event_pnlDonHangMouseClicked

    private void pnlPhieuNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhieuNhapHangMouseClicked
       if (SwingUtilities.isLeftMouseButton(evt)){ 
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new PhieuNhapJPanel());
        this.validate();
        this.repaint();    
       }
    }//GEN-LAST:event_pnlPhieuNhapHangMouseClicked

    private void pnlKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhuyenMaiMouseClicked
       if (SwingUtilities.isLeftMouseButton(evt)){ 
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new KhuyenMaiJPanel());
        this.validate();
        this.repaint();    
       }
    }//GEN-LAST:event_pnlKhuyenMaiMouseClicked

    private void pnlSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSanPhamMouseClicked
       if (SwingUtilities.isLeftMouseButton(evt)){ 
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new SanPhamJPanel());
        this.validate();
        this.repaint();    
       }
    }//GEN-LAST:event_pnlSanPhamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private GUI.Rounded pnlDonHang;
    private GUI.Rounded pnlKhuyenMai;
    private GUI.Rounded pnlPhieuNhapHang;
    private GUI.Rounded pnlSanPham;
    // End of variables declaration//GEN-END:variables
}

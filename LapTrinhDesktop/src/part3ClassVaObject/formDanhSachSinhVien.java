/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang Vu
 */
public class formDanhSachSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form formDanhSachSinhVien
     */
    public formDanhSachSinhVien() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        btnDong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin tim kiem"));

        jLabel1.setText("Tu khoa:");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part3ClassVaObject/Images/timKiem.png"))); // NOI18N
        btnTimKiem.setText("Tim kiem");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTuKhoa)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSinhVien);

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part3ClassVaObject/Images/dong.png"))); // NOI18N
        btnDong.setText("Dong");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part3ClassVaObject/Images/xoa.gif"))); // NOI18N
        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part3ClassVaObject/Images/sua.gif"))); // NOI18N
        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part3ClassVaObject/Images/them.png"))); // NOI18N
        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // Goi ham hien thi danh sach
        hienThiDanhSachSinhVien();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        // Khai bao 1 doi tuong form
        formThemThongTinSinhVien formThem = new formThemThongTinSinhVien();
        formThem.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        int ketQua = JOptionPane.showConfirmDialog(rootPane,
                "Ban co chac chan muon dong chuong trinh khong?",
                "Thong bao", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (ketQua == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String maSV = "";
        
        // Lay thong tin ma sinh vien nguoi dung chon tren table
        int dongChon = tblSinhVien.getSelectedRow();
        maSV = "" + tblSinhVien.getValueAt(dongChon, 0);
        formThemThongTinSinhVien formSua = new formThemThongTinSinhVien();
        
        // Truyen ma sinh vien len form sua
        formSua.setMaSV(maSV);
        
        formSua.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ketQua = JOptionPane.showConfirmDialog(rootPane,
                "Ban co chac chan muon xoa sinh vien nay khong?",
                "Thong bao", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (ketQua == JOptionPane.YES_OPTION)
        {
            // Xu ly xoa
            String maSV = "";
            
            // Lay thong tin ma sinh vien nguoi dung chon tren table
            int dongChon = tblSinhVien.getSelectedRow();
            maSV = "" + tblSinhVien.getValueAt(dongChon, 0);

            boolean ketQuaXoa = DataProvider.QLSinhVien().xoaSinhVien(maSV);
            if (ketQuaXoa == true) {
                JOptionPane.showMessageDialog(rootPane, "Xoa thong tin sinh vien thanh cong");
            }
        }
        formDanhSachSinhVien.hienThiDanhSachSinhVien();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        /*
        // Tim kiem sinh vien them ma Sinh Vien
        String maSV = txtTuKhoa.getText();
        if(maSV.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Ban can nhap vao ma sinh vien");
            txtTuKhoa.requestFocus();
        }
        else
        {
            // Khai bao 1 mang chua tieu de
            String tieuDe[] = new String[]{"Ma SV", "Ho ten", "Dien thoai", "Email", "So CMT", "Dia chi"};
            
            // Khai bao 1 doi tuong de dua du lieu len table
            DefaultTableModel model = new DefaultTableModel(tieuDe, 0);
           
            // Khai bao doi tuong sinh vien tim duoc
            SinhVien sv = new DataProvider().QLSinhVien().timKiemTheoMaSV(maSV);
            
            if (sv != null)
            {
                Object row[] = new Object[6];
                row[0] = sv.getMaSV();
                row[1] = sv.getHoTen();
                //row[2] = sv.getGioiTinh();
                row[2] = sv.getDienThoai();
                row[3] = sv.getEmail();
                row[4] = sv.getSoCMT();
                row[5] = sv.getDiaChi();

                // Them vao model
                model.addRow(row);
                
                // Hien thi du lieu len table
                tblSinhVien.setModel(model);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Sinh vien khong ton tai");
                txtTuKhoa.requestFocus();
            }
        }
        */
        String tuKhoa = txtTuKhoa.getText();
        
        // Khai bao 1 mang chua tieu de
        String tieuDe[] = new String[]{"Ma SV", "Ho ten", "Dien thoai", "Email", "So CMT", "Dia chi"};
        
        // Khai bao 1 doi tuong de dua du lieu len table
        DefaultTableModel model = new DefaultTableModel(tieuDe, 0);
        
        List<SinhVien> lstTimKiem = DataProvider.QLSinhVien().timKiemSinhVien(tuKhoa);
        
        // Duyet danh sach de dua vao model
        Object row[];
        for (SinhVien sv : lstTimKiem)
        {
            row = new Object[6];
            row[0] = sv.getMaSV();
            row[1] = sv.getHoTen();
            //row[2] = sv.getGioiTinh();
            row[2] = sv.getDienThoai();
            row[3] = sv.getEmail();
            row[4] = sv.getSoCMT();
            row[5] = sv.getDiaChi();
            
            // Them vao model
            model.addRow(row);
        }
        
        // Hien thi du lieu len table
        tblSinhVien.setModel(model);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    public static void hienThiDanhSachSinhVien()
    {
        // Khai bao 1 mang chua tieu de
        String tieuDe[] = new String[]{"Ma SV", "Ho ten", "Dien thoai", "Email", "So CMT", "Dia chi"};
        
        // Khai bao 1 doi tuong de dua du lieu len table
        DefaultTableModel model = new DefaultTableModel(tieuDe, 0);
        
        // Lay danh sach
        List<SinhVien> lstSV = DataProvider.QLSinhVien().layDanhSachSinhVien();
        
        // Duyet danh sach de dua vao model
        Object row[];
        for (SinhVien sv : lstSV)
        {
            row = new Object[6];
            row[0] = sv.getMaSV();
            row[1] = sv.getHoTen();
            //row[2] = sv.getGioiTinh();
            row[2] = sv.getDienThoai();
            row[3] = sv.getEmail();
            row[4] = sv.getSoCMT();
            row[5] = sv.getDiaChi();
            
            // Them vao model
            model.addRow(row);
        }
        
        // Hien thi du lieu len table
        tblSinhVien.setModel(model);
    }
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
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDanhSachSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblSinhVien;
    private static javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}

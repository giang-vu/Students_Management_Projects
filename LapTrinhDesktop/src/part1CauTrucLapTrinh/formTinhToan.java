/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1CauTrucLapTrinh;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Truong Giang
 */
public class formTinhToan extends javax.swing.JFrame {

    /**
     * Creates new form formChuongTrinhTinhToan
     */
    public formTinhToan() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoA = new javax.swing.JTextField();
        txtSoB = new javax.swing.JTextField();
        cboPhepToan = new javax.swing.JComboBox();
        txtKetQua = new javax.swing.JTextField();
        btnTinhToan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tinh Toan");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin tinh toan"));

        jLabel1.setText("So a:");

        jLabel2.setText("Phep toan:");

        jLabel3.setText("Ket qua:");

        jLabel4.setText("So b:");

        cboPhepToan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cong", "Tru", "Nhan", "Chia" }));

        btnTinhToan.setText("Tinh toan");
        btnTinhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(53, 53, 53)
                            .addComponent(txtSoA, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSoB)
                                .addComponent(cboPhepToan, 0, 212, Short.MAX_VALUE)
                                .addComponent(txtKetQua)))
                        .addComponent(btnTinhToan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboPhepToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTinhToan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhToanActionPerformed
        // TODO add your handling code here:
        String strSoA = "", strSoB = "", strPhepTinh = "";
        double soA = 0, soB = 0, ketQua = 0;
        
        // Lay thong tin tren giao dien
        strSoA = txtSoA.getText();
        strSoB = txtSoB.getText();
        strPhepTinh = "" + cboPhepToan.getSelectedItem();
        
        if (strSoA.length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Ban phai nhap vao so a");
            txtSoA.requestFocus();
            return;
        }
        
        if (strSoB.length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Ban phai nhap vao so b");
            txtSoB.requestFocus();
            return;
        }
        
        // Chuyen thong tin ve dang so
        soA = Float.parseFloat(strSoA);
        soB = Float.parseFloat(strSoB);
        
        switch (strPhepTinh)
        {
            case "Cong": ketQua = soA + soB;
                break;
            case "Tru": ketQua = soA - soB;
                break;
            case "Nhan": ketQua = soA * soB;
                break;
            case "Chia":
                if (soB != 0)
                {
                     ketQua = soA / soB;
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "So b can phai khac 0");
                    txtSoB.requestFocus();
                    return;
                }
                break;
        }
        // Khai bao dinh dang
        DecimalFormat f = new DecimalFormat("###,###.##");
        //Hien thi ket qua
        txtKetQua.setText("" + f.format(ketQua));
    }//GEN-LAST:event_btnTinhToanActionPerformed

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
            java.util.logging.Logger.getLogger(formTinhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTinhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTinhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTinhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTinhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinhToan;
    private javax.swing.JComboBox cboPhepToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtKetQua;
    private javax.swing.JTextField txtSoA;
    private javax.swing.JTextField txtSoB;
    // End of variables declaration//GEN-END:variables
}

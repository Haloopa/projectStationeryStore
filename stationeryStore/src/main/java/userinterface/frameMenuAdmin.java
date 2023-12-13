/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

/**
 *
 * @author Septiancesare
 */
public class frameMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form frameMenuKasir
     */
    public frameMenuAdmin() {
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
        btnPembelian = new javax.swing.JButton();
        btnDataBarang = new javax.swing.JButton();
        btnRiwayatTransaksi = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnDataPegawai = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPembelian.setBackground(new java.awt.Color(132, 179, 132));
        btnPembelian.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPembelian.setForeground(new java.awt.Color(0, 51, 51));
        btnPembelian.setText("PEMBELIAN");
        btnPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembelianActionPerformed(evt);
            }
        });
        jPanel1.add(btnPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 210));

        btnDataBarang.setBackground(new java.awt.Color(132, 179, 132));
        btnDataBarang.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDataBarang.setForeground(new java.awt.Color(0, 51, 51));
        btnDataBarang.setText("DATA BARANG");
        btnDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBarangActionPerformed(evt);
            }
        });
        jPanel1.add(btnDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 210, 210));

        btnRiwayatTransaksi.setBackground(new java.awt.Color(132, 179, 132));
        btnRiwayatTransaksi.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnRiwayatTransaksi.setForeground(new java.awt.Color(0, 51, 51));
        btnRiwayatTransaksi.setText("RIWAYAT TRANSAKSI"); // NOI18N
        btnRiwayatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(btnRiwayatTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 210, 210));

        btnKeluar.setBackground(new java.awt.Color(102, 102, 102));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/btnLogout.png"))); // NOI18N
        btnKeluar.setText("  KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 650, 80));

        btnDataPegawai.setBackground(new java.awt.Color(132, 179, 132));
        btnDataPegawai.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDataPegawai.setForeground(new java.awt.Color(0, 51, 51));
        btnDataPegawai.setText("DATA PEGAWAI");
        btnDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 210, 210));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/menuAdmin.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        frameLoginAdmin loginAdmin = new frameLoginAdmin();
        loginAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBarangActionPerformed
        // TODO add your handling code here:
        frameDataBarang dataBarang = new frameDataBarang();
        dataBarang.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnDataBarangActionPerformed

    private void btnPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembelianActionPerformed
        // TODO add your handling code here:
        framePembelian pembelian = new framePembelian();
        pembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPembelianActionPerformed

    private void btnRiwayatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRiwayatTransaksiActionPerformed

    private void btnDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPegawaiActionPerformed
        // TODO add your handling code here:
        frameDataPegawai dataPegawai = new frameDataPegawai();
        dataPegawai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDataPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(frameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDataBarang;
    private javax.swing.JButton btnDataPegawai;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPembelian;
    private javax.swing.JButton btnRiwayatTransaksi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

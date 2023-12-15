/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

/**
 *
 * @author Septiancesare
 */
public class frameMenuKasir extends javax.swing.JFrame {

    /**
     * Creates new form frameMenuKasir
     */
    public frameMenuKasir() {
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
        btnTransaksi = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransaksi.setBackground(new java.awt.Color(132, 179, 132));
        btnTransaksi.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(0, 51, 51));
        btnTransaksi.setText("TRANSAKSI");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 310, 210));

        btnMember.setBackground(new java.awt.Color(132, 179, 132));
        btnMember.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnMember.setForeground(new java.awt.Color(0, 51, 51));
        btnMember.setText("DATA MEMBER");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        jPanel1.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 320, 210));

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

        btnRiwayat.setBackground(new java.awt.Color(132, 179, 132));
        btnRiwayat.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(0, 51, 51));
        btnRiwayat.setText("RIWAYAT TRANSAKSI");
        btnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatActionPerformed(evt);
            }
        });
        jPanel1.add(btnRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 320, 210));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/menuKasir.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        frameLoginKasir loginKasir = new frameLoginKasir();
        loginKasir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        // TODO add your handling code here:
        frameBill transaksi = new frameBill();
        transaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        frameDataMember dataMember = new frameDataMember();
        dataMember.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatActionPerformed
        // TODO add your handling code here:
        frameTransaksiJual riwayat = new frameTransaksiJual();
        riwayat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRiwayatActionPerformed

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
            java.util.logging.Logger.getLogger(frameMenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenuKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

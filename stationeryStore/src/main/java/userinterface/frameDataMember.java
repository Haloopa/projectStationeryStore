/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import com.mycompany.stationerystore.ConnectionDatabase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class frameDataMember extends javax.swing.JFrame {
    public frameDataMember() {
        initComponents();
        showData();
    }
    private void refreshForm(){
        inputIdMember.setText(null);
        inputNamaMember.setText(null);
        inputNomorHpMember.setText(null);
        inputEmailMember.setText(null);
        inputAlamatMember.setText(null);
    }
    private void showData(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Member");
        table.addColumn("Nama Member");
        table.addColumn("Nomor HP Member");
        table.addColumn("Email Member");
        table.addColumn("Alamat Member");
        tabelDataMember.setModel(table);
        
        try {
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datamember");

            while (rs.next()) {
                table.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                tabelDataMember.setModel(table);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        inputAlamatMember = new javax.swing.JTextField();
        inputEmailMember = new javax.swing.JTextField();
        inputNomorHpMember = new javax.swing.JTextField();
        inputNamaMember = new javax.swing.JTextField();
        inputIdMember = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataMember = new javax.swing.JTable();
        bgDataMember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputAlamatMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputAlamatMember.setBorder(null);
        inputAlamatMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlamatMemberActionPerformed(evt);
            }
        });
        getContentPane().add(inputAlamatMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 400, 30));

        inputEmailMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputEmailMember.setBorder(null);
        inputEmailMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailMemberActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmailMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 400, 30));

        inputNomorHpMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNomorHpMember.setBorder(null);
        inputNomorHpMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomorHpMemberActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomorHpMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 400, 30));

        inputNamaMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaMember.setBorder(null);
        inputNamaMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaMemberActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 30));

        inputIdMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputIdMember.setBorder(null);
        inputIdMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdMemberActionPerformed(evt);
            }
        });
        getContentPane().add(inputIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 400, 30));

        btnHapus.setBackground(java.awt.Color.lightGray);
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 110, 70));

        btnUbah.setBackground(java.awt.Color.lightGray);
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 110, 70));

        btnTambah.setBackground(java.awt.Color.lightGray);
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, 70));

        btnBack.setBackground(java.awt.Color.gray);
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/homebutton.png"))); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, 120, 40));

        tabelDataMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama Member", "Nomor HP", "Email", "Alamat "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDataMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataMember);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 670, 630));

        bgDataMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/pageDataMember.png"))); // NOI18N
        bgDataMember.setText("jLabel1");
        getContentPane().add(bgDataMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdMemberActionPerformed

    private void inputNamaMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaMemberActionPerformed

    private void inputNomorHpMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomorHpMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomorHpMemberActionPerformed

    private void inputEmailMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailMemberActionPerformed

    private void inputAlamatMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlamatMemberActionPerformed
    }//GEN-LAST:event_inputAlamatMemberActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try{
            String sql = "UPDATE datamember SET idMember = '" + inputIdMember.getText()
                    + "' , namaMember = '" + inputNamaMember.getText()
                    + "' , nomorHpMember = '" + inputNomorHpMember.getText()
                    + "' , emailMember = '" + inputEmailMember.getText()
                    + "' , alamatMember = '" + inputAlamatMember.getText()
                    + "' WHERE idMember = '" + inputIdMember.getText() + "'";
            
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Member Berhasil Diubah!");
            showData();
            refreshForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frameMenuAdmin menu = new frameMenuAdmin();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    String idMember = inputIdMember.getText();
    int confirmDialog = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data member?", "Yes", JOptionPane.YES_NO_OPTION);
    
    if (confirmDialog == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM datamember WHERE idMember = ?";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, idMember);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Member Berhasil Dihapus!");
            showData();
            refreshForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String sql = "INSERT INTO datamember VALUES (?, ?, ?, ?, ?)";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            
            ps.setString(1, inputIdMember.getText());
            ps.setString(2, inputNamaMember.getText());
            ps.setString(3, inputNomorHpMember.getText());
            ps.setString(4, inputEmailMember.getText());
            ps.setString(5, inputAlamatMember.getText());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Member Berhasil Ditambahkan!");
            showData();
            refreshForm();
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tabelDataMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMemberMouseClicked
        try {
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        int row = tabelDataMember.getSelectedRow();
        String idMember = (String) tabelDataMember.getValueAt(row, 0);
        inputIdMember.setText(idMember);

        String namaMember = (String) tabelDataMember.getValueAt(row, 1);
        inputNamaMember.setText(namaMember);

        String nomorHpMember = (String) tabelDataMember.getValueAt(row, 2);
        inputNomorHpMember.setText(nomorHpMember);

        String emailMember = (String) tabelDataMember.getValueAt(row, 3);
        inputEmailMember.setText(emailMember);
        
        String alamatMember = (String) tabelDataMember.getValueAt(row, 4);
        inputAlamatMember.setText(alamatMember);
       }//GEN-LAST:event_tabelDataMemberMouseClicked

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
            java.util.logging.Logger.getLogger(frameDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDataMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgDataMember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputAlamatMember;
    private javax.swing.JTextField inputEmailMember;
    private javax.swing.JTextField inputIdMember;
    private javax.swing.JTextField inputNamaMember;
    private javax.swing.JTextField inputNomorHpMember;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataMember;
    // End of variables declaration//GEN-END:variables
}

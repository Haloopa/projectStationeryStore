/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;
import com.mycompany.stationerystore.ConnectionDatabase;
import java.awt.Color;
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
public class frameDataPegawai extends javax.swing.JFrame {
    public frameDataPegawai() {
        initComponents();
                showData();
    }
    private void refreshForm(){
        inputIdPegawai.setText(null);
        inputNamaPegawai.setText(null);
        inputNomorHpPegawai.setText(null);
        inputEmailPegawai.setText(null);
        inputAlamatPegawai.setText(null);
        inputGender.setSelectedItem(null);
        inputPassword.setText(null);
        inputStatus.setSelectedItem(null);
    }
    private void showData(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Pegawai");
        table.addColumn("Nama Pegawai");
        table.addColumn("Nomor HP Pegawai");
        table.addColumn("Email Pegawai");
        table.addColumn("Alamat Pegawai");
        table.addColumn("Gender");
        table.addColumn("Password");
        table.addColumn("Status");
        tabelDataPegawai.setModel(table);
        
        try {
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datapegawai");

            while (rs.next()) {
                table.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
                tabelDataPegawai.setModel(table);
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

        inputIdPegawai = new javax.swing.JTextField();
        inputNamaPegawai = new javax.swing.JTextField();
        inputNomorHpPegawai = new javax.swing.JTextField();
        inputEmailPegawai = new javax.swing.JTextField();
        inputAlamatPegawai = new javax.swing.JTextField();
        inputGender = new javax.swing.JComboBox<>();
        inputPassword = new javax.swing.JTextField();
        inputStatus = new javax.swing.JComboBox<>();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataPegawai = new javax.swing.JTable();
        bgDataPegawai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputIdPegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputIdPegawai.setBorder(null);
        inputIdPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(inputIdPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 400, 30));

        inputNamaPegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaPegawai.setBorder(null);
        inputNamaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 400, 30));

        inputNomorHpPegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNomorHpPegawai.setBorder(null);
        inputNomorHpPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomorHpPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomorHpPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, 30));

        inputEmailPegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputEmailPegawai.setBorder(null);
        inputEmailPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmailPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 400, 30));

        inputAlamatPegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputAlamatPegawai.setBorder(null);
        inputAlamatPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlamatPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(inputAlamatPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 400, 30));

        inputGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Male", "Female" }));
        inputGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGenderActionPerformed(evt);
            }
        });
        getContentPane().add(inputGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 420, 40));

        inputPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputPassword.setBorder(null);
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 400, 30));

        inputStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "Kasir" }));
        getContentPane().add(inputStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 420, 40));

        btnHapus.setBackground(java.awt.Color.lightGray);
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 120, 70));

        btnUbah.setBackground(java.awt.Color.lightGray);
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 120, 70));

        btnTambah.setBackground(java.awt.Color.lightGray);
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 120, 70));

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

        tabelDataPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pegawai", "Nama Pegawai", "Nomor HP", "Email", "Alamat ", "Gender", "Password", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDataPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPegawai);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 660, 630));

        bgDataPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/pageDataPegawai.png"))); // NOI18N
        getContentPane().add(bgDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGenderActionPerformed

    private void inputAlamatPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlamatPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlamatPegawaiActionPerformed

    private void inputEmailPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailPegawaiActionPerformed

    private void inputNomorHpPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomorHpPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomorHpPegawaiActionPerformed

    private void inputIdPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdPegawaiActionPerformed

    private void inputNamaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaPegawaiActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try{
            String sql = "UPDATE datapegawai SET idPegawai = '" + inputIdPegawai.getText()
                    + "' , namaPegawai = '" + inputNamaPegawai.getText()
                    + "' , nomorHpPegawai = '" + inputNomorHpPegawai.getText()
                    + "' , emailPegawai = '" + inputEmailPegawai.getText()
                    + "' , alamatPegawai = '" + inputAlamatPegawai.getText()
                    + "' , gender = '" + inputGender.getSelectedItem()
                    + "' , password = '" + inputPassword.getText()
                    + "' , status = '" + inputStatus.getSelectedItem()
                    + "' WHERE idPegawai = '" + inputIdPegawai.getText() + "'";
            
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Pegawai Berhasil Diubah!");
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

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String sql = "INSERT INTO datapegawai VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            
            ps.setString(1, inputIdPegawai.getText());
            ps.setString(2, inputNamaPegawai.getText());
            ps.setString(3, inputNomorHpPegawai.getText());
            ps.setString(4, inputEmailPegawai.getText());
            ps.setString(5, inputAlamatPegawai.getText());
            ps.setString(6, inputGender.getSelectedItem().toString());
            ps.setString(7, inputPassword.getText());
            ps.setString(8, inputStatus.getSelectedItem().toString());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Pegawai Berhasil Ditambahkan!");
            showData();
            refreshForm();
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    String idPegawai = inputIdPegawai.getText();
    int confirmDialog = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data pegawai?", "Yes", JOptionPane.YES_NO_OPTION);
    
    if (confirmDialog == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM datapegawai WHERE idPegawai = ?";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, idPegawai);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Pegawai Berhasil Dihapus!");
            showData();
            refreshForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelDataPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPegawaiMouseClicked
        try {
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        int row = tabelDataPegawai.getSelectedRow();
        String idPegawai = (String) tabelDataPegawai.getValueAt(row, 0);
        inputIdPegawai.setText(idPegawai);

        String namaPegawai = (String) tabelDataPegawai.getValueAt(row, 1);
        inputNamaPegawai.setText(namaPegawai);

        String nomorHpPegawai = (String) tabelDataPegawai.getValueAt(row, 2);
        inputNomorHpPegawai.setText(nomorHpPegawai);

        String emailPegawai = (String) tabelDataPegawai.getValueAt(row, 3);
        inputEmailPegawai.setText(emailPegawai);
        
        String alamatPegawai = (String) tabelDataPegawai.getValueAt(row, 4);
        inputAlamatPegawai.setText(alamatPegawai);
        
        String gender = (String) tabelDataPegawai.getValueAt(row, 5);
        inputGender.setSelectedItem(gender);
        
        String password = (String) tabelDataPegawai.getValueAt(row, 6);
        inputPassword.setText(password);
        
        String status = (String) tabelDataPegawai.getValueAt(row, 7);
        inputStatus.setSelectedItem(status);
    }//GEN-LAST:event_tabelDataPegawaiMouseClicked

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
            java.util.logging.Logger.getLogger(frameDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDataPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgDataPegawai;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputAlamatPegawai;
    private javax.swing.JTextField inputEmailPegawai;
    private javax.swing.JComboBox<String> inputGender;
    private javax.swing.JTextField inputIdPegawai;
    private javax.swing.JTextField inputNamaPegawai;
    private javax.swing.JTextField inputNomorHpPegawai;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JComboBox<String> inputStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataPegawai;
    // End of variables declaration//GEN-END:variables
}

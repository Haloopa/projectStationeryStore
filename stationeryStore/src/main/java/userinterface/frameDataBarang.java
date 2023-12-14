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
public class frameDataBarang extends javax.swing.JFrame {
    public frameDataBarang() {
        initComponents();
        showData();
    }
        private void refreshForm(){
        inputIdBarang.setText(null);
        inputNamaBarang.setText(null);
        inputKategori.setSelectedItem(null);
        inputJumlahBarang.setText(null);
        inputHargaBeli.setText(null);
        inputHargaJual.setText(null);
        inputNamaSupplier.setText(null);
    }

    private void showData(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Barang");
        table.addColumn("Nama Barang");
        table.addColumn("Kategori Barang");
        table.addColumn("Jumlah Barang");
        table.addColumn("Harga Beli");
        table.addColumn("Harga Jual");
        table.addColumn("Nama Supplier");
        tabelDataBarang.setModel(table);
        
        try {
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM databarang");

            while (rs.next()) {
                table.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
                tabelDataBarang.setModel(table);
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

        inputIdBarang = new javax.swing.JTextField();
        inputNamaBarang = new javax.swing.JTextField();
        inputKategori = new javax.swing.JComboBox<>();
        inputJumlahBarang = new javax.swing.JTextField();
        inputHargaBeli = new javax.swing.JTextField();
        inputHargaJual = new javax.swing.JTextField();
        inputNamaSupplier = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataBarang = new javax.swing.JTable();
        bgDataBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputIdBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputIdBarang.setBorder(null);
        inputIdBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdBarangActionPerformed(evt);
            }
        });
        getContentPane().add(inputIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 400, 30));

        inputNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaBarang.setBorder(null);
        inputNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaBarangActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 400, 30));

        inputKategori.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Alat Tulis", "Alat Ukur", "Amplop ", "Buku ", "Cutter", "Gunting ", "Isolasi ", "Kertas", "Krayon ", "Lem ", "Map", "Penghapus", "Penjepit Kertas", "Pensil Warna", "Sampul", "Sticky Notes", "Tipe X ", " " }));
        getContentPane().add(inputKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 420, 40));

        inputJumlahBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputJumlahBarang.setBorder(null);
        inputJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJumlahBarangActionPerformed(evt);
            }
        });
        getContentPane().add(inputJumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 400, 30));

        inputHargaBeli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputHargaBeli.setBorder(null);
        inputHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaBeliActionPerformed(evt);
            }
        });
        getContentPane().add(inputHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 400, 30));

        inputHargaJual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputHargaJual.setBorder(null);
        inputHargaJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaJualActionPerformed(evt);
            }
        });
        getContentPane().add(inputHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 400, 30));

        inputNamaSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaSupplier.setBorder(null);
        inputNamaSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 400, 30));

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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 120, 40));

        btnTambah.setBackground(java.awt.Color.lightGray);
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 110, 70));

        btnUbah.setBackground(java.awt.Color.lightGray);
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 110, 70));

        btnHapus.setBackground(java.awt.Color.lightGray);
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 110, 70));

        tabelDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Kategori Barang", "Jumlah Barang", "Harga Beli", "Harga Jual", "Nama Supplier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 670, 630));

        bgDataBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/pageDataBarang.png"))); // NOI18N
        getContentPane().add(bgDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaSupplierActionPerformed

    private void inputHargaJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaJualActionPerformed

    private void inputHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaBeliActionPerformed

    private void inputJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJumlahBarangActionPerformed

    private void inputNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaBarangActionPerformed

    private void inputIdBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdBarangActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FrameLanding landing = new FrameLanding();
        landing.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try{
            String sql = "UPDATE datapegawai SET idBarang = '" + inputIdBarang.getText()
                    + "' , namaBarang = '" + inputNamaBarang.getText()
                    + "' , kategoriBarang = '" + inputKategori.getSelectedItem()
                    + "' , jumlahBarang = '" + inputJumlahBarang.getText()
                    + "' , hargaBeli = '" + inputHargaBeli.getText()
                    + "' , hargaJual = '" + inputHargaJual.getText()
                    + "' , namaSupplier = '" + inputNamaSupplier.getText()
                    + "' WHERE idBarang = '" + inputIdBarang.getText() + "'";
            
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Diubah!");
            showData();
            refreshForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String sql = "INSERT INTO databarang VALUES (?, ?, ?, ?, ?, ?, ?)";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);

            String idBarang = inputIdBarang.getText();
            String namaBarang = inputNamaBarang.getText();
            String kategoriBarang = inputKategori.getSelectedItem().toString();
            String jumlahBarang = inputJumlahBarang.getText();
            String hargaBeli = inputHargaBeli.getText();
            String namaSupplier = inputNamaSupplier.getText();

            double hargaBeliPerBox = Double.parseDouble(hargaBeli);
            int jumlahBarangPerPcs = Integer.parseInt(jumlahBarang);
            double hargaJual = (hargaBeliPerBox / jumlahBarangPerPcs) * 1.2; 

            ps.setString(1, idBarang);
            ps.setString(2, namaBarang);
            ps.setString(3, kategoriBarang);
            ps.setString(4, jumlahBarang);
            ps.setString(5, String.valueOf(hargaBeliPerBox)); 
            ps.setString(6, String.valueOf(hargaJual)); 
            ps.setString(7, namaSupplier);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Ditambahkan!");
            showData();
            refreshForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    String idBarang = inputIdBarang.getText();
    int confirmDialog = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data barang?", "Yes", JOptionPane.YES_NO_OPTION);
    
    if (confirmDialog == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM databarang WHERE idBarang = ?";
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, idBarang);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Dihapus!");
            showData();
            refreshForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelDataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataBarangMouseClicked
        try {
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        int row = tabelDataBarang.getSelectedRow();
        String idBarang = (String) tabelDataBarang.getValueAt(row, 0);
        inputIdBarang.setText(idBarang);

        String namaBarang = (String) tabelDataBarang.getValueAt(row, 1);
        inputNamaBarang.setText(namaBarang);

        String kategoriBarang = (String) tabelDataBarang.getValueAt(row, 2);
        inputKategori.setSelectedItem(kategoriBarang);

        String jumlahBarang = (String) tabelDataBarang.getValueAt(row, 3);
        inputJumlahBarang.setText(jumlahBarang);
        
        String hargaBeli = (String) tabelDataBarang.getValueAt(row, 4);
        inputHargaBeli.setText(hargaBeli);
        
        String hargaJual = (String) tabelDataBarang.getValueAt(row, 5);
        inputHargaJual.setText(hargaJual);
        
        String namaSupplier = (String) tabelDataBarang.getValueAt(row, 6);
        inputNamaSupplier.setText(namaSupplier);
    }//GEN-LAST:event_tabelDataBarangMouseClicked

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
            java.util.logging.Logger.getLogger(frameDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgDataBarang;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputHargaBeli;
    private javax.swing.JTextField inputHargaJual;
    private javax.swing.JTextField inputIdBarang;
    private javax.swing.JTextField inputJumlahBarang;
    private javax.swing.JComboBox<String> inputKategori;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JTextField inputNamaSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataBarang;
    // End of variables declaration//GEN-END:variables
}

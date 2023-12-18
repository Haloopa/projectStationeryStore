/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import com.mycompany.stationerystore.ConnectionDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;





/**
 *
 * @author user
 */
public class framePembelian extends javax.swing.JFrame {

    /**
     * Creates new form framePembelian
     */
    private DefaultTableModel tableModel;
    private static int urutan = 1;
    public framePembelian() {
        initComponents();
        
        tableModel = (DefaultTableModel) tabelPembelian.getModel();

       
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshTableData();
            }
        });
        timer.start();

        refreshTableData();
    }
    
    private void refreshTableData() {
        try {
            ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();

            // Mengambil data dari database
            String query = "SELECT * FROM pembelian";
            try (PreparedStatement statement = connect.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                // Clear existing data
                tableModel.setRowCount(0);

                // Populate data from the result set
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                // tambah baris
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    tableModel.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        labelIdPembelian = new javax.swing.JLabel();
        inputIdBarang = new javax.swing.JTextField();
        inputIdAdmin = new javax.swing.JTextField();
        btnCariBarang = new javax.swing.JButton();
        btnCariAdmin = new javax.swing.JButton();
        labelNamaAdmin = new javax.swing.JLabel();
        inputDistributor = new javax.swing.JTextField();
        labelNamaBarang = new javax.swing.JLabel();
        inputJumlah = new javax.swing.JTextField();
        inputIsiPerBox = new javax.swing.JTextField();
        inputHargaPerBox = new javax.swing.JTextField();
        labelRP = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPembelian = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        labelTanggal = new javax.swing.JLabel();
        inputIdPembelian = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelIdPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        inputIdBarang.setBorder(null);
        jPanel1.add(inputIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 250, 20));

        inputIdAdmin.setBorder(null);
        jPanel1.add(inputIdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 20));

        btnCariBarang.setBackground(new java.awt.Color(153, 255, 153));
        btnCariBarang.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCariBarang.setText("Cari");
        btnCariBarang.setBorder(null);
        btnCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBarangActionPerformed(evt);
            }
        });
        jPanel1.add(btnCariBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, 40));

        btnCariAdmin.setBackground(new java.awt.Color(153, 255, 153));
        btnCariAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCariAdmin.setText("Cari");
        btnCariAdmin.setBorder(null);
        btnCariAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnCariAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 100, 40));
        jPanel1.add(labelNamaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 326, 360, 30));

        inputDistributor.setBorder(null);
        jPanel1.add(inputDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 360, 20));
        jPanel1.add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 370, 40));

        inputJumlah.setBorder(null);
        jPanel1.add(inputJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 570, 150, 20));

        inputIsiPerBox.setBorder(null);
        jPanel1.add(inputIsiPerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 160, 20));

        inputHargaPerBox.setBorder(null);
        jPanel1.add(inputHargaPerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 360, 20));

        labelRP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        labelRP.setText("Rp");
        jPanel1.add(labelRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, -1, 50));

        labelTotalHarga.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jPanel1.add(labelTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 190, 50));

        btnHapus.setBackground(new java.awt.Color(219, 216, 216));
        btnHapus.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 120, 60));

        btnTambah.setBackground(new java.awt.Color(219, 216, 216));
        btnTambah.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 120, 60));

        btnUbah.setBackground(new java.awt.Color(219, 216, 216));
        btnUbah.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 120, 60));

        tabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pembelian", "Tgl", "Id Admin", "Nama Admin", "Distributor", "Id Barang", "Barang", "Jumlah(box)", "Isi /box", "Harga /box", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPembelianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPembelian);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 110, 680, 630));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 120, 40));
        jPanel1.add(labelTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 20));

        inputIdPembelian.setBorder(null);
        jPanel1.add(inputIdPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 340, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/pagePembelian.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String getIdPembelian(Date tglSekarang, int urutan) {
    if (tglSekarang == null) {
        throw new IllegalArgumentException("tglSekarang cannot be null");
    }

    SimpleDateFormat sdfid = new SimpleDateFormat("ddMM");
    String tglSekarangId = sdfid.format(tglSekarang);
    return "PL" + tglSekarangId + urutan;
}
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        LocalDateTime currentime = LocalDateTime.now();
    DateTimeFormatter formatt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String tanggalSekarang = currentime.format(formatt);
        labelTanggal.setText(tanggalSekarang);
        
        
        try {
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            
            
            String idPegawai = inputIdAdmin.getText();
            String namaAdmin = labelNamaAdmin.getText();
            String distributor = inputDistributor.getText();
            String idBarang = inputIdBarang.getText();
            String namaBarang = labelNamaBarang.getText();
            int jumlah = Integer.parseInt(inputJumlah.getText());
            int isi = Integer.parseInt(inputIsiPerBox.getText());
            int harga = Integer.parseInt(inputHargaPerBox.getText());
            int total = jumlah*harga;
            
            
            String tanggal = labelTanggal.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date tglSekarang = new Date(sdf.parse(tanggalSekarang).getTime());
        
        
        String idPembelian = getIdPembelian(tglSekarang, urutan);
        
        String query = "INSERT INTO pembelian (tanggal, idPembelian, idPegawai, namaPegawai, namaDistributor, idBarang, namaBarang, isiPerBox, jumlahBeli, hargaBeli, subTotal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connect.prepareStatement(query)) {
            ps.setDate(1, new java.sql.Date(tglSekarang.getTime()));
            ps.setString(2, idPembelian);
            ps.setString(3, idPegawai);
            ps.setString(4, namaAdmin);
            ps.setString(5, distributor);
            ps.setString(6, idBarang);
            ps.setString(7, namaBarang);
            ps.setInt(8, isi);
            ps.setInt(9, jumlah);
            ps.setInt(10, harga);
            ps.setInt(11, total);

      
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data Pengembalian Berhasil ditambahkan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                urutan++;
                inputIdPembelian.setText(idPembelian);
                labelTotalHarga.setText(String.valueOf(total));
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data ke tabel pengembalian", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCariAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAdminActionPerformed
        // TODO add your handling code here:
    String idPegawai = inputIdAdmin.getText();
    String statusPegawai = "admin";
    String query = "SELECT namaPegawai FROM datapegawai WHERE idPegawai = ? AND status = ?";
    String namaPegawai = null;

    try {
        ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
        Connection connect = koneksidatabase.getConnection();

        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, idPegawai);
            preparedStatement.setString(2, statusPegawai);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    namaPegawai = resultSet.getString("namaPegawai");
                }
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
    }

    if (namaPegawai != null) {
        labelNamaAdmin.setText(namaPegawai);
        JOptionPane.showMessageDialog(this, "Nama Pegawai dengan ID " + idPegawai + " dan status " + statusPegawai + ": " + namaPegawai);
    } else {
        JOptionPane.showMessageDialog(this, "Pegawai dengan ID " + idPegawai + " dan status " + statusPegawai + " tidak ditemukan.");
    }
    }//GEN-LAST:event_btnCariAdminActionPerformed
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frameMenuAdmin admin = new frameMenuAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBarangActionPerformed
        // TODO add your handling code here:
        String idBarang = inputIdBarang.getText();

    String query = "SELECT namaBarang FROM databarang WHERE idBarang = ?";
    String namaBarang = null;

    try {
        ConnectionDatabase koneksidatabase = ConnectionDatabase.getInstance();
        Connection connect = koneksidatabase.getConnection();

        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, idBarang);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    namaBarang = resultSet.getString("namaBarang");
                }
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
    }

    if (namaBarang != null) {
        labelNamaBarang.setText(namaBarang);
        JOptionPane.showMessageDialog(this, "Nama Barang dengan ID " + idBarang + " ditemukan!");
    } else {
        JOptionPane.showMessageDialog(this, "Barang dengan ID " + idBarang +  " tidak ditemukan.");
    }
    }//GEN-LAST:event_btnCariBarangActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            ConnectionDatabase koneksidatabase;
            koneksidatabase = ConnectionDatabase.getInstance();
            Connection connect = koneksidatabase.getConnection();
            
            String idPembelian = inputIdPembelian.getText();
            String query = "DELETE FROM pembelian WHERE idPembelian = ?";
            PreparedStatement statement = connect.prepareStatement(query);
            
             // Set nilai parameter idBuku pada query DELETE
            statement.setString(1, idPembelian);

            // Jalankan query DELETE
            int rowsAffected = statement.executeUpdate();

            // Periksa apakah baris berhasil dihapus
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Hapus Data gagal", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }

            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPembelianMouseClicked
        // TODO add your handling code here:
        int row = tabelPembelian.getSelectedRow();
        
        if (row == -1){
            return;
        
        }
        
        String idPembelian = (String) tabelPembelian.getValueAt(row, 0);
        inputIdPembelian.setText(idPembelian);
        
        if (tabelPembelian.getValueAt(row, 1) instanceof java.sql.Date) {
        java.sql.Date tanggalSql = (java.sql.Date) tabelPembelian.getValueAt(row, 1);

        String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(tanggalSql);
        labelTanggal.setText(tanggal);
    } else {
        
        System.err.println("Error: Tipe data kolom tanggal tidak sesuai.");
        labelTanggal.setText("");
    }
        
        String idAdmin = (String) tabelPembelian.getValueAt(row, 2);
        inputIdAdmin.setText(idAdmin);
        
        String admin = (String) tabelPembelian.getValueAt(row, 3);
        labelNamaAdmin.setText(admin);
        
        String distributor = (String) tabelPembelian.getValueAt(row, 4);
        inputDistributor.setText(distributor);
        
        String idBarang = (String) tabelPembelian.getValueAt(row, 5);
        inputIdBarang.setText(idBarang);
        
        String barang = (String) tabelPembelian.getValueAt(row, 6);
        labelNamaBarang.setText(barang);
        
        int jumlah = (int) tabelPembelian.getValueAt(row, 7);
        inputJumlah.setText(String.valueOf(jumlah));
        
        int isi = (int) tabelPembelian.getValueAt(row, 8);
        inputIsiPerBox.setText(String.valueOf(isi));
        
        int harga = (int) tabelPembelian.getValueAt(row, 9);
        inputHargaPerBox.setText(String.valueOf(harga));
        
    }//GEN-LAST:event_tabelPembelianMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try{
            ConnectionDatabase koneksidatabase;
        koneksidatabase = ConnectionDatabase.getInstance();
        Connection connect = koneksidatabase.getConnection();
        
        String idPembelian = inputIdPembelian.getText();
        String idPegawai = inputIdAdmin.getText();
            String namaAdmin = labelNamaAdmin.getText();
            String distributor = inputDistributor.getText();
            String idBarang = inputIdBarang.getText();
            String namaBarang = labelNamaBarang.getText();
            int jumlah = Integer.parseInt(inputJumlah.getText());
            int isi = Integer.parseInt(inputIsiPerBox.getText());
            int harga = Integer.parseInt(inputHargaPerBox.getText());
            int total = jumlah*harga;
            
    String query = "UPDATE pembelian SET idPegawai = ?, namaPegawai = ?, namaDistributor = ?, idBarang = ?, namaBarang = ?, isiPerBox = ?, jumlahBeli = ?, hargaBeli = ?, subTotal = ? WHERE idPembelian = ?";
        try (PreparedStatement st = connect.prepareStatement(query)) {
            st.setString(1, idPegawai);
            st.setString(2, namaAdmin);
            st.setString(3, distributor);
            st.setString(4, idBarang);
            st.setString(5, namaBarang);
            st.setInt(6, isi);
            st.setInt(7, jumlah);
            st.setInt(8, harga);
            st.setInt(9, total);
            st.setString(10, idPembelian);

            
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                JOptionPane.showMessageDialog(this, "Ubah Data gagal", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
        }catch (SQLException ex) {
            Logger.getLogger(framePembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

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
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCariAdmin;
    private javax.swing.JButton btnCariBarang;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputDistributor;
    private javax.swing.JTextField inputHargaPerBox;
    private javax.swing.JTextField inputIdAdmin;
    private javax.swing.JTextField inputIdBarang;
    private javax.swing.JTextField inputIdPembelian;
    private javax.swing.JTextField inputIsiPerBox;
    private javax.swing.JTextField inputJumlah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIdPembelian;
    private javax.swing.JLabel labelNamaAdmin;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelRP;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JTable tabelPembelian;
    // End of variables declaration//GEN-END:variables
}

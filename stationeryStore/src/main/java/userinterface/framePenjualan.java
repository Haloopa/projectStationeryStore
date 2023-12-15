/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;
import com.mycompany.stationerystore.ConnectionDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author acer
 */
public class framePenjualan extends javax.swing.JFrame {
    private JFrame frameMenuKasir; 
    public framePenjualan(JFrame frameMenuKasir) {
        this.frameMenuKasir = frameMenuKasir;
    }

    /**
     * Creates new form framePembelian
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public framePenjualan() {
        initComponents();
//        SimpleDateFormat.dFormat
//        IDBarang();
        Total();
        FinalHarga();
        
    }
    
    private void IDKasir() {
        inputIDPegawai.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String idPegawai;
                  idPegawai = (String) inputIDPegawai.getText();
                  Connection kon = null;
                  PreparedStatement ppst = null;
                  ResultSet rslt = null;
                  
                  try {
                      kon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemkasir", "username", "password");
                      ppst = kon.prepareStatement("SELECT namaPegawai FROM penjualan WHERE idPegawai");
                      ppst.setString(1, idPegawai);
                      rslt = ppst.executeQuery();
                  
                      if (rslt.next()) {
                          String ip = rslt.getString("idPegawai");
                          
                          inputIDPegawai.setText(ip);
                          
                        } else {
                            inputIDPegawai.setText("");
                        }
                      
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        } finally {
                            try {
                            if (rslt != null) rslt.close();
                            if (ppst != null) ppst.close();
                            if (kon != null) kon.close();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void IDMember() {
        inputIDMember.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String idMember;
                  idMember = (String) inputIDMember.getText();
                  Connection con = null;
                  PreparedStatement pps = null;
                  ResultSet rst = null;
                  
                  try {
                      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemkasir", "username", "password");
                      pps = con.prepareStatement("SELECT nama, noHP, email, alamat FROM datamember WHERE idMember");
                      pps.setString(1, idMember);
                      rst = pps.executeQuery();
                      
                      if (rst.next()) {
                          member.setSelected(true);
                          applyDiskonMember();
                      } else {
                          member.setSelected(false);
                          removeDiskonMember();
                      }
                  } catch (SQLException ex) {
                      ex.printStackTrace();
                  } finally {
                      try {
                          if (rst != null) rst.close();
                          if (pps != null) pps.close();
                          if (con != null) con.close();
                      } catch (SQLException ex) {
                          ex.printStackTrace();
                      }
                  }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void jmlTotalHarga() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          int subTotal = 0;
        for (int a = 0; a < tbPenjualan.getRowCount(); a++) {
            String cellValue = tbPenjualan.getValueAt(a, 6).toString();
            if (!cellValue.isEmpty()) {
                try {
                    subTotal += Integer.parseInt(cellValue);
                } catch (NumberFormatException ex) {
                    ex.printStackTrace(); 
                }
            }
    }
    txtTotalHarga.setText(nf.format(subTotal));
    }
    
    private void applyDiskonMember() {
      String inputText = txtTotalHarga.getText();
      if (!inputText.isEmpty()) {
        try {
            double hasil = Double.parseDouble(inputText);
            double dm = hasil * 0.1;
            hasilMember.setText(String.valueOf(dm));
            } catch (NumberFormatException ex) {
                ex.printStackTrace(); 
            }
        } else {
            
        }
    }
    
    private void removeDiskonMember() {
        String inputText = txtTotalHarga.getText();
        if (!inputText.isEmpty()) {
            try {
                double hasil = Double.parseDouble(inputText);
                double dm = hasil * 0;
                hasilMember.setText(String.valueOf(dm));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        } else {

        }
    }
    
    private void IDBarang() {
        inputIDBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String idBarang;
                  idBarang = (String) inputIDBarang.getText();
                  Connection conn = null;
                  PreparedStatement ps = null;
                  ResultSet rs = null;
                  
                  try {
                      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirtoko", "username", "password");
                      ps = conn.prepareStatement("SELECT namaBarang, hargaJual FROM databarang WHERE idBarang = ?");
                      ps.setString(1, idBarang);
                      rs = ps.executeQuery();
                      
                      if (rs.next()) {
                          String nb = rs.getString("namaBarang");
                          double hrg = rs.getDouble("hargaJual");
                          
                          txtNamaBarang.setText(nb);
                          txtHargaBarang.setText(nf.format(hrg));
                          
                          calculateHarga();
                        } else {
                            txtNamaBarang.setText("");
                            txtHargaBarang.setText("");
                        }
                  } catch (SQLException ex) {
                      ex.printStackTrace();
                  } finally {
                      try {
                          if (rs != null) rs.close();
                          if (ps != null) ps.close();
                          if (conn != null) conn.close();
                      } catch (SQLException ex) {
                          ex.printStackTrace();
                      }
                  }     
            }
            
            private void calculateHarga() {
                try {
                    double hj = Double.parseDouble(txtHargaBarang.getText().replace(",", ""));
                    int qty = Integer.parseInt(inputQTY.getText());
                    double db = Double.parseDouble(inputDiskonBarang.getText());
                    
                    double jh = (hj * qty) - (hj * db);
                    txtJumlahHarga.setText(nf.format(jh));
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void FinalHarga(){
            double totalAkhir;
            double th = Double.parseDouble(txtTotalHarga.getText());
            double hm = Double.parseDouble(hasilMember.getText());
            totalAkhir = th - hm;
            hasilHargaAkhir.setText(nf.format(totalAkhir));
            viewHarga.setText("Rp. " + nf.format(totalAkhir));
    }
    
    private void Total() {
        inputQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  try {
                      int hasil = 0; 
                      String qtyText = inputQTY.getText();
                      String hargaBarang = txtHargaBarang.getText().replace(".", "");
                      String diskonBarang = inputDiskonBarang.getText();
                              
                      if (!qtyText.isEmpty() && diskonBarang.matches("\\d+(\\.\\d+)?")) {
                        hasil = (int) (Integer.parseInt(qtyText) * Integer.parseInt(hargaBarang) * Double.parseDouble(diskonBarang));
                      }
                
                     txtJumlahHarga.setText(nf.format(hasil));
                
                    } catch (NumberFormatException e) {
                        e.printStackTrace(); // Tangani jika input bukan angka atau string kosong
                    }
             
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idPegawai = new javax.swing.JLabel();
        inputIDPegawai = new javax.swing.JTextField();
        idBarang = new javax.swing.JLabel();
        inputIDBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        inputQTY = new javax.swing.JTextField();
        txtHargaBarang = new javax.swing.JTextField();
        txtJumlahHarga = new javax.swing.JTextField();
        txtNamaKasir = new javax.swing.JTextField();
        idMember = new javax.swing.JLabel();
        inputIDMember = new javax.swing.JTextField();
        txtNamaMember = new javax.swing.JTextField();
        txtNoHP = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        inputDiskonBarang = new javax.swing.JTextField();
        idPenjualan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPenjualan = new javax.swing.JTable();
        pengembalian = new javax.swing.JLabel();
        txtPengembalian = new javax.swing.JTextField();
        hargaAkhir = new javax.swing.JLabel();
        hasilHargaAkhir = new javax.swing.JTextField();
        totalItem = new javax.swing.JLabel();
        hasilTotalItem = new javax.swing.JLabel();
        member = new javax.swing.JCheckBox();
        hasilMember = new javax.swing.JTextField();
        totalHarga = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        pembayaran = new javax.swing.JLabel();
        inputPembayaran = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 195, 174));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewHarga.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        viewHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewHarga.setText("Rp. ");
        getContentPane().add(viewHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 339, -1));

        jPanel1.setBackground(new java.awt.Color(166, 195, 174));

        idPegawai.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idPegawai.setText("ID Pegawai");

        inputIDPegawai.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputIDPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDPegawaiActionPerformed(evt);
            }
        });

        idBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idBarang.setText("ID Barang");

        inputIDBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtNamaBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        inputQTY.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQTYActionPerformed(evt);
            }
        });

        txtHargaBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtHargaBarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtJumlahHarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtJumlahHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJumlahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahHargaActionPerformed(evt);
            }
        });

        txtNamaKasir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNamaKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaKasirActionPerformed(evt);
            }
        });

        idMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idMember.setText("ID Member");

        inputIDMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputIDMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDMemberActionPerformed(evt);
            }
        });

        txtNamaMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtNoHP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNoHP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAlamat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAlamat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        inputDiskonBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputDiskonBarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputDiskonBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiskonBarangActionPerformed(evt);
            }
        });

        idPenjualan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idPegawai)
                    .addComponent(idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMember))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(inputDiskonBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(idPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPegawai)
                    .addComponent(inputIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idMember)
                    .addComponent(inputIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBarang)
                    .addComponent(inputIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDiskonBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 1288, -1));

        tbPenjualan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tbPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Barang", "Nama Barang", "Harga Barang", "Jumlah Barang", "Diskon", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tbPenjualan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1300, 270));

        pengembalian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pengembalian.setText("UANG KEMBALI");
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, -1, 20));

        txtPengembalian.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(txtPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 590, 200, -1));

        hargaAkhir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hargaAkhir.setText("HARGA AKHIR");
        getContentPane().add(hargaAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        hasilHargaAkhir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hasilHargaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilHargaAkhirActionPerformed(evt);
            }
        });
        getContentPane().add(hasilHargaAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 200, -1));

        totalItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        totalItem.setText("TOTAL ITEM ");
        getContentPane().add(totalItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 582, -1, -1));

        hasilTotalItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hasilTotalItem.setText("0");
        getContentPane().add(hasilTotalItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 582, 30, -1));

        member.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        member.setText("MEMBER 10%");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 112, -1));

        hasilMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hasilMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilMemberActionPerformed(evt);
            }
        });
        getContentPane().add(hasilMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 200, -1));

        totalHarga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        totalHarga.setText("TOTAL HARGA");
        getContentPane().add(totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        txtTotalHarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 200, -1));

        pembayaran.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pembayaran.setText("UANG PEMBAYARAN");
        getContentPane().add(pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, 20));

        inputPembayaran.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(inputPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 200, -1));

        print.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 650, -1, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reset.setText("RESET");
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 650, -1, -1));

        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, -1, -1));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 650, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/pagePenjualan.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1314, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDPegawaiActionPerformed

    private void txtJumlahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahHargaActionPerformed

    private void inputIDMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDMemberActionPerformed

    private void inputQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQTYActionPerformed
        // TODO add your handling code here:  
        if (inputQTY.getText().isEmpty()) {
        return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tbPenjualan.getModel();
            Object obj [] = new Object[7];
            obj [1] = inputIDBarang.getText();
            obj [2] = txtNamaBarang.getText();
            obj [3] = txtHargaBarang.getText();
            obj [4] = inputQTY.getText();
            obj [5] = inputDiskonBarang.getText();
            obj [6] = txtJumlahHarga.getText();

            model.addRow(obj);
            int baris = model.getRowCount();
            for (int a = 0; a < baris; a ++) {
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }

            tbPenjualan.setRowHeight(30);
            hasilTotalItem.setText(String.valueOf(baris));

            jmlTotalHarga();
            clear();
        }
    }//GEN-LAST:event_inputQTYActionPerformed

    private void inputDiskonBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDiskonBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDiskonBarangActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
        jmlTotalHarga();
    }//GEN-LAST:event_memberActionPerformed

    private void hasilMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilMemberActionPerformed

    private void hasilHargaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilHargaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilHargaAkhirActionPerformed

    private void txtNamaKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKasirActionPerformed

    private void idPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPenjualanActionPerformed
        // TODO add your handling code here:
        AtomicInteger counter = new AtomicInteger(0);
        String formattedNumber = String.format("%05d", counter.incrementAndGet());
        String id = "P" + formattedNumber;
        idPenjualan.setText(id);
    }//GEN-LAST:event_idPenjualanActionPerformed

    private void txtPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengembalianActionPerformed
        // TODO add your handling code here:
        try {
            String textHargaAkhir = hasilHargaAkhir.getText();
            String textPembayaran = inputPembayaran.getText();

            if (!textHargaAkhir.isEmpty() && !textPembayaran.isEmpty()) {
                double hargaAkhir = Double.parseDouble(textHargaAkhir);
                double pembayaran = Double.parseDouble(textPembayaran);

                double pengembalian = pembayaran - hargaAkhir;
                txtPengembalian.setText(String.valueOf(pengembalian));
            } else {
                JOptionPane.showMessageDialog(this, "Masukkan harga akhir dan pembayaran.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.");
        }
    }//GEN-LAST:event_txtPengembalianActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frameMenuKasir.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String id = idPenjualan.getText();
        try {
            ConnectionDatabase konek = new ConnectionDatabase();
        Connection koneksi = konek.getConnection();
        
        String query = "INSER INTO (idPenjualan) VALUES (?)";
        PreparedStatement ps = koneksi.prepareStatement(query);
        
        ps.setString(1, id);
        ps.executeUpdate();
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_addActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void inputPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPembayaranActionPerformed

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
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel hargaAkhir;
    private javax.swing.JTextField hasilHargaAkhir;
    private javax.swing.JTextField hasilMember;
    private javax.swing.JLabel hasilTotalItem;
    private javax.swing.JLabel idBarang;
    private javax.swing.JLabel idMember;
    private javax.swing.JLabel idPegawai;
    private javax.swing.JTextField idPenjualan;
    private javax.swing.JTextField inputDiskonBarang;
    private javax.swing.JTextField inputIDBarang;
    private javax.swing.JTextField inputIDMember;
    private javax.swing.JTextField inputIDPegawai;
    private javax.swing.JTextField inputPembayaran;
    private javax.swing.JTextField inputQTY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox member;
    private javax.swing.JLabel pembayaran;
    private javax.swing.JLabel pengembalian;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JTable tbPenjualan;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JLabel totalItem;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtJumlahHarga;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaKasir;
    private javax.swing.JTextField txtNamaMember;
    private javax.swing.JTextField txtNoHP;
    private javax.swing.JTextField txtPengembalian;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JLabel viewHarga;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        inputIDBarang.setText("");
        inputIDBarang.grabFocus();
        inputQTY.setText("");
        txtJumlahHarga.setText("");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author acer
 */
public class framePenjualan extends javax.swing.JFrame {

    /**
     * Creates new form framePembelian
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public framePenjualan() {
        initComponents();
        IDBarang();
        Total();
        FinalDiskon();
        
    }
    
    private void IDBarang() {
        inputIDBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String idBarang;
                  idBarang = (String) inputIDBarang.getText();
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
    
    private void FinalDiskon(){
            txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          
            int diskon, hasilDiskon;
            diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "")) / 100;
            hasilDiskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;
            
            txtHasilDiskon.setText(nf.format(diskon));
            
            //MEMBER
            int hasil_Member = 0;
            if (member.isSelected()) {
                hasil_Member = hasilDiskon * 10 / 100;
                hasilMember.setText(nf.format(hasil_Member));
            } else {
                hasil_Member = hasilDiskon * 0 / 100;
                hasilMember.setText(nf.format(hasil_Member));
            }

            //TOTAL HARGA
            int totalAkhir;
            totalAkhir = hasilDiskon - hasil_Member;
            viewHarga.setText("Rp. " + nf.format(totalAkhir));
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
    
    private void Total() {
        inputQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  try {
                      int hasil = 0; 
                      if (inputQTY.getText().equals("")) {
                          hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * 0;
                      } else {
                            hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * Integer.parseInt(inputQTY.getText());
                      }
                      txtTotalHarga.setText(nf.format(hasil));
                  } catch (NumberFormatException e) {
                      
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
        idKasir = new javax.swing.JLabel();
        inputIDKasir = new javax.swing.JTextField();
        idBarang = new javax.swing.JLabel();
        inputIDBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        inputQTY = new javax.swing.JTextField();
        txtHargaBarang = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        txtNamaKasir = new javax.swing.JTextField();
        idMember = new javax.swing.JLabel();
        inputIDMember = new javax.swing.JTextField();
        txtNamaMember = new javax.swing.JTextField();
        txtNoHP = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtDiskonBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPenjualan = new javax.swing.JTable();
        totalHarga = new javax.swing.JLabel();
        txtJumlahHarga = new javax.swing.JTextField();
        diskon = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        txtHasilDiskon = new javax.swing.JTextField();
        hargaAkhir = new javax.swing.JLabel();
        hasilHargaAkhir = new javax.swing.JTextField();
        totalItem = new javax.swing.JLabel();
        hasilTotalItem = new javax.swing.JLabel();
        member = new javax.swing.JCheckBox();
        hasilMember = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewHarga.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        viewHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewHarga.setText("Rp. ");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idKasir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idKasir.setText("ID Kasir");

        inputIDKasir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inputIDKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDKasirActionPerformed(evt);
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

        txtTotalHarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        txtNamaKasir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

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

        txtDiskonBarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiskonBarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiskonBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idKasir)
                    .addComponent(idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMember))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIDKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(txtDiskonBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idKasir)
                    .addComponent(inputIDKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiskonBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

        totalHarga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        totalHarga.setText("JUMLAH HARGA");

        txtJumlahHarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        diskon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        diskon.setText("DISKON");

        txtDiskon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        txtHasilDiskon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtHasilDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasilDiskonActionPerformed(evt);
            }
        });

        hargaAkhir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hargaAkhir.setText("HARGA AKHIR");

        hasilHargaAkhir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        totalItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        totalItem.setText("TOTAL ITEM ");

        hasilTotalItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hasilTotalItem.setText("0");

        member.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        member.setText("MEMBER 10%");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });

        hasilMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hasilMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalItem)
                        .addGap(18, 18, 18)
                        .addComponent(hasilTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalHarga)
                            .addComponent(diskon)
                            .addComponent(hargaAkhir))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hasilHargaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasilMember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(474, 474, 474))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(viewHarga)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHarga)
                    .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalItem)
                    .addComponent(hasilTotalItem))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diskon)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(member)
                    .addComponent(hasilMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaAkhir)
                    .addComponent(hasilHargaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1314, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDKasirActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void inputIDMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDMemberActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtHasilDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasilDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasilDiskonActionPerformed

    private void inputQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQTYActionPerformed
        // TODO add your handling code here:
        if (inputQTY.getText().equals("")) {
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tbPenjualan.getModel();
            Object obj [] = new Object[7];
            obj [1] = inputIDBarang.getText();
            obj [2] = txtNamaBarang.getText();
            obj [3] = txtHargaBarang.getText();
            obj [4] = inputQTY.getText();
            obj [5] = txtDiskonBarang.getText();
            obj [6] = txtTotalHarga.getText();
            
            model.addRow(obj);
            int baris = model.getRowCount();
            for (int a = 0; a < baris; a ++) {
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            
            tbPenjualan.setRowHeight(30);
            totalItem.setText(String.valueOf(baris));
            
            jmlTotalHarga();
            clear();
        }
    }//GEN-LAST:event_inputQTYActionPerformed

    private void txtDiskonBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonBarangActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
        jmlTotalHarga();
    }//GEN-LAST:event_memberActionPerformed

    private void hasilMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilMemberActionPerformed

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
    private javax.swing.JLabel diskon;
    private javax.swing.JLabel hargaAkhir;
    private javax.swing.JTextField hasilHargaAkhir;
    private javax.swing.JTextField hasilMember;
    private javax.swing.JLabel hasilTotalItem;
    private javax.swing.JLabel idBarang;
    private javax.swing.JLabel idKasir;
    private javax.swing.JLabel idMember;
    private javax.swing.JTextField inputIDBarang;
    private javax.swing.JTextField inputIDKasir;
    private javax.swing.JTextField inputIDMember;
    private javax.swing.JTextField inputQTY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox member;
    private javax.swing.JTable tbPenjualan;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JLabel totalItem;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtDiskonBarang;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtHasilDiskon;
    private javax.swing.JTextField txtJumlahHarga;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaKasir;
    private javax.swing.JTextField txtNamaMember;
    private javax.swing.JTextField txtNoHP;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JLabel viewHarga;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalHarga() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          int subTotal = 0;
          for (int a = 0; a < tbPenjualan.getRowCount(); a ++) {
              subTotal += Integer.parseInt((String) tbPenjualan.getValueAt(a, 6).toString());
          }
          
          txtJumlahHarga.setText(nf.format(subTotal));
          
          //DISKON
          int diskon, hasilDiskon;
          diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "")) / 100;
          hasilDiskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;
          
          //MEMBER
          int hasil_Member = 0;
          if (member.isSelected()) {
              hasil_Member = hasilDiskon * 10 / 100;
              hasilMember.setText(nf.format(hasil_Member));
          } else {
              hasil_Member = hasilDiskon * 0 / 100;
              hasilMember.setText(nf.format(hasil_Member));
          }
          
          //TOTAL HARGA
          int totalAkhir;
          totalAkhir = hasilDiskon - hasil_Member;
          viewHarga.setText("Rp. " + nf.format(totalAkhir));
    }

    private void clear() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        inputIDBarang.setText("");
        inputIDBarang.grabFocus();
        inputQTY.setText("");
        txtDiskonBarang.setText("");
        txtTotalHarga.setText("");
    }
}



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pongo
 */
public class PenghitungKataGUI extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataGUI
     */
    public PenghitungKataGUI() {
        initComponents();
    }

    private void hitungStatistik() {
    String teks = textInput.getText();
    int jumlahKata = teks.trim().isEmpty() ? 0 : teks.trim().split("\\s+").length;
    int jumlahKarakter = teks.length();
    int jumlahKalimat = teks.trim().isEmpty() ? 0 : teks.split("[.!?]").length;
    int jumlahParagraf = teks.trim().isEmpty() ? 0 : teks.split("\\n").length;

    txtJumlahKata.setText(String.valueOf(jumlahKata));
    txtJumlahKarakter.setText(String.valueOf(jumlahKarakter));
    txtJumlahKalimat.setText(String.valueOf(jumlahKalimat));
    txtJumlahParagraf.setText(String.valueOf(jumlahParagraf));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textInput = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtJumlahKata = new javax.swing.JTextField();
        txtJumlahKarakter = new javax.swing.JTextField();
        txtJumlahKalimat = new javax.swing.JTextField();
        txtJumlahParagraf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCariKata = new javax.swing.JTextField();
        btnCariKata = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jTextField5.setText("jTextField5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setForeground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI PENGHITUNG KATA");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 370, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("MASUKKAN TEKS");

        textInput.setColumns(20);
        textInput.setRows(5);
        textInput.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                textInputAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textInputAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textInputAncestorRemoved(evt);
            }
        });
        textInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textInputKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textInput);

        btnHitung.setBackground(new java.awt.Color(255, 51, 51));
        btnHitung.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("JUMLAH KATA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("JUMLAH KARAKTER");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("JUMLAH KALIMAT");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("JUMLAH PARAGRAF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("CARI KATA");

        btnCariKata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCariKata.setText("CARI");
        btnCariKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKataActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(0, 255, 255));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(btnHitung)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJumlahKata)
                                    .addComponent(txtJumlahKarakter)
                                    .addComponent(txtJumlahKalimat)
                                    .addComponent(txtJumlahParagraf, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnCariKata)
                                        .addGap(145, 145, 145))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCariKata, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHitung)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJumlahKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtJumlahKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJumlahKalimat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtJumlahParagraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCariKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCariKata)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
         // Ambil teks dari textInput
            String teks = textInput.getText();

            // Hitung jumlah kata
            int jumlahKata = teks.trim().isEmpty() ? 0 : teks.trim().split("\\s+").length;

            // Hitung jumlah karakter
            int jumlahKarakter = teks.length();

            // Hitung jumlah kalimat (diasumsikan dipisahkan oleh '.')
            int jumlahKalimat = teks.trim().isEmpty() ? 0 : teks.split("[.!?]").length;

            // Hitung jumlah paragraf (diasumsikan dipisahkan oleh '\n')
            int jumlahParagraf = teks.trim().isEmpty() ? 0 : teks.split("\\n").length;

            // Tampilkan hasil di text field
            txtJumlahKata.setText(String.valueOf(jumlahKata));
            txtJumlahKarakter.setText(String.valueOf(jumlahKarakter));
            txtJumlahKalimat.setText(String.valueOf(jumlahKalimat));
            txtJumlahParagraf.setText(String.valueOf(jumlahParagraf));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih lokasi untuk menyimpan file");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try {
            // Mendapatkan file yang dipilih
            java.io.File fileToSave = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(fileToSave)) {
                writer.write("Teks Input:\n" + textInput.getText() + "\n");
                writer.write("Jumlah Kata: " + txtJumlahKata.getText() + "\n");
                writer.write("Jumlah Karakter: " + txtJumlahKarakter.getText() + "\n");
                writer.write("Jumlah Kalimat: " + txtJumlahKalimat.getText() + "\n");
                writer.write("Jumlah Paragraf: " + txtJumlahParagraf.getText() + "\n");
                writer.write("Hasil Pencarian Kata:\n");
                writer.write("Kata yang dicari: " + txtCariKata.getText() + "\n");
                JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan ke file:\n" + fileToSave.getAbsolutePath());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Proses penyimpanan dibatalkan.");
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCariKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKataActionPerformed
          String teks = textInput.getText();
    String kataDicari = txtCariKata.getText();
    if (kataDicari.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari.");
        return;
    }
    int jumlahKataDitemukan = teks.split("\\b" + kataDicari + "\\b").length - 1;
    JOptionPane.showMessageDialog(this, "Kata \"" + kataDicari + "\" ditemukan sebanyak " + jumlahKataDitemukan + " kali.");
    }//GEN-LAST:event_btnCariKataActionPerformed

    private void textInputAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textInputAncestorAdded
         hitungStatistik();
    }//GEN-LAST:event_textInputAncestorAdded

    private void textInputAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textInputAncestorMoved
        hitungStatistik();
    }//GEN-LAST:event_textInputAncestorMoved

    private void textInputAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textInputAncestorRemoved
        hitungStatistik();
    }//GEN-LAST:event_textInputAncestorRemoved

    private void textInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textInputKeyTyped
        hitungStatistik();
    }//GEN-LAST:event_textInputKeyTyped

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
            java.util.logging.Logger.getLogger(PenghitungKataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariKata;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextArea textInput;
    private javax.swing.JTextField txtCariKata;
    private javax.swing.JTextField txtJumlahKalimat;
    private javax.swing.JTextField txtJumlahKarakter;
    private javax.swing.JTextField txtJumlahKata;
    private javax.swing.JTextField txtJumlahParagraf;
    // End of variables declaration//GEN-END:variables
}

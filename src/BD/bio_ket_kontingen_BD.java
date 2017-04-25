/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
    import Frame.koneksi;
    import java.awt.event.KeyEvent;
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
import java.text.SimpleDateFormat;
    import java.util.regex.Pattern;
    import javax.swing.JOptionPane;
    import javax.swing.RowFilter;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableRowSorter;
    import javax.swing.ImageIcon;
/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class bio_ket_kontingen_BD extends javax.swing.JFrame {
    Connection con = new koneksi().buka_koneksi();
    ResultSet res;
    Statement stat;
    DefaultTableModel tbm;
    String tanggal_lhr;
    /**
     * Creates new form bio_peserta
     */
    public bio_ket_kontingen_BD() {
        super("Data Ketua Kontingen Debat Bahasa - Register Lomba");
        
        initComponents();
        ImageIcon ico = new ImageIcon("src\\gambar1\\logo_dinas.png");
        setIconImage(ico.getImage());
        pilih_agama();
        kosong();      
        if(txt_nip.getText().length()==18){
            
        }
        setLocation(350, 80);
    }

    private void kosong(){
        txt_alamat_skolah.setText("");
        txt_unit_kerja.setText("");
        txt_kelas.setText("");        
        txt_nama.setText("");
        txt_nip.setText("");
        txt_no_hp.setText("");      
        txt_tlp_kantor.setText("");
        txt_t4lahir.setText("");
        alamat_rumah.setText("");
        txt_nip.requestFocus();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_kelas = new javax.swing.JTextField();
        txt_t4lahir = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamat_skolah = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txt_nip = new textlimit.text_limit();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_tlp_kantor = new textlimit.text_limit();
        jScrollPane3 = new javax.swing.JScrollPane();
        alamat_rumah = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txt_no_hp = new textlimit.text_limit();
        txt_lks = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_unit_kerja = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmb_agama = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmb_jenkel = new javax.swing.JComboBox();
        jtanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "ISI DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setText("Nama");

        jLabel2.setText("NIP");

        jLabel3.setText("Panggkat/Gol");

        jLabel4.setText("Tempat Lahir");

        jLabel7.setText("Alamat Kantor");

        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaKeyTyped(evt);
            }
        });

        txt_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelasActionPerformed(evt);
            }
        });
        txt_kelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kelasKeyTyped(evt);
            }
        });

        txt_alamat_skolah.setColumns(20);
        txt_alamat_skolah.setRows(5);
        jScrollPane2.setViewportView(txt_alamat_skolah);

        jLabel11.setText("Tgl Lahir");

        txt_nip.setmaxlength(18);
        txt_nip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nipKeyTyped(evt);
            }
        });

        jLabel8.setText("Telp Kantor");

        jLabel9.setText("Alamat Rumah");

        txt_tlp_kantor.setmaxlength(13);
        txt_tlp_kantor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tlp_kantorKeyTyped(evt);
            }
        });

        alamat_rumah.setColumns(20);
        alamat_rumah.setRows(5);
        jScrollPane3.setViewportView(alamat_rumah);

        jLabel10.setText("No HP Pribadi");

        txt_no_hp.setmaxlength(13);
        txt_no_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_hpActionPerformed(evt);
            }
        });
        txt_no_hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_no_hpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_no_hpKeyTyped(evt);
            }
        });

        txt_lks.setEditable(false);
        txt_lks.setText("Debat Bahasa");

        jLabel15.setText("Katagori");

        txt_unit_kerja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_unit_kerjaKeyTyped(evt);
            }
        });

        jLabel6.setText("Unit Kerja");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/pencil_edit.png"))); // NOI18N
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/check_2.png"))); // NOI18N
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_delete_2.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lks, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_no_hp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tlp_kantor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_unit_kerja, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_unit_kerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_tlp_kantor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_lks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_edit)
                    .addComponent(btn_simpan)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        jLabel5.setText("Agama");

        cmb_agama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_agamaActionPerformed(evt);
            }
        });

        jLabel12.setText("Jenis Kelamin");

        cmb_jenkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));

        jtanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtanggalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_t4lahir, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_agama, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_jenkel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_t4lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmb_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmb_jenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelasActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        simpan();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
         if (txt_nama.getText().equals("")
                || txt_nip.getText().equals("")
                || txt_kelas.getText().equals("")
                || txt_t4lahir.getText().equals("")
                || tanggal_lhr.equals("")                
                || txt_unit_kerja.getText().equals("")
                || txt_alamat_skolah.getText().equals("")
                || txt_tlp_kantor.getText().equals("")                
                || alamat_rumah.getText().equals("")
                || txt_no_hp.getText().equals("")) {
            
                JOptionPane.showMessageDialog(rootPane, "data belum di pilih");
                        
        } else {        
        try {
            String sql = "UPDATE tb_ketua_kontingen SET"
                    +" nama='"              +txt_nama.getText()                    
                    +"', pangkat='"           +txt_kelas.getText()
                    +"', tempat_lahir='"    +txt_t4lahir.getText()
                    +"', tgl_lahir='"       +tanggal_lhr
                    +"', agama='"           +cmb_agama.getSelectedItem()
                    +"', jenkel='"          +cmb_jenkel.getSelectedItem()
                    +"', unit_kerja='"    +txt_unit_kerja.getText()
                    +"', alamat_kantor='"  +txt_alamat_skolah.getText()
                    +"', telp_kantor='"    +txt_tlp_kantor.getText()                   
                    +"', alamat_rumah='"    +alamat_rumah.getText()
                    +"', no_hp='"      +txt_no_hp.getText()
                    +"', katagori='"        +txt_lks.getText()
                    +"'WHERE nip='"         +txt_nip.getText()
                    +"'";
            stat = con.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "data berhasil di ubah");
           
            kosong();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
                }
    }//GEN-LAST:event_btn_editActionPerformed

    private void cmb_agamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_agamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_agamaActionPerformed

    private void txt_namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyTyped

        if(txt_nama.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_txt_namaKeyTyped

    private void txt_kelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kelasKeyTyped
        if(txt_kelas.getText().length()==20){
            evt.consume();
        }
    }//GEN-LAST:event_txt_kelasKeyTyped

    private void txt_unit_kerjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unit_kerjaKeyTyped
        if(txt_unit_kerja.getText().length()==20){
            evt.consume();
        }
    }//GEN-LAST:event_txt_unit_kerjaKeyTyped

    private void txt_nipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nipKeyTyped
        angka(evt);
    }//GEN-LAST:event_txt_nipKeyTyped

    private void txt_no_hpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_no_hpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_hpKeyReleased

    private void txt_no_hpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_no_hpKeyTyped
        angka(evt);
    }//GEN-LAST:event_txt_no_hpKeyTyped

    private void txt_tlp_kantorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tlp_kantorKeyTyped
        angka(evt);      
    }//GEN-LAST:event_txt_tlp_kantorKeyTyped

    private void txt_no_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_hpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new beranda_BD_ketua().show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtanggalPropertyChange
        //mengatur JDate atau tanggal
        if (jtanggal.getDate()!=null) {  
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            tanggal_lhr = format.format(jtanggal.getDate());
        }
    }//GEN-LAST:event_jtanggalPropertyChange

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
            java.util.logging.Logger.getLogger(bio_ket_kontingen_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bio_ket_kontingen_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bio_ket_kontingen_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bio_ket_kontingen_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bio_ket_kontingen_BD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea alamat_rumah;
    public javax.swing.JButton btn_edit;
    public javax.swing.JButton btn_simpan;
    public javax.swing.JComboBox cmb_agama;
    public javax.swing.JComboBox cmb_jenkel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public com.toedter.calendar.JDateChooser jtanggal;
    public javax.swing.JTextArea txt_alamat_skolah;
    public javax.swing.JTextField txt_kelas;
    private javax.swing.JTextField txt_lks;
    public javax.swing.JTextField txt_nama;
    public textlimit.text_limit txt_nip;
    public textlimit.text_limit txt_no_hp;
    public javax.swing.JTextField txt_t4lahir;
    public textlimit.text_limit txt_tlp_kantor;
    public javax.swing.JTextField txt_unit_kerja;
    // End of variables declaration//GEN-END:variables

    private void simpan(){
        
        //dibawah ini untuk memberi tau jika ada data, masih ada yg kosong ketika akan simpan data
        if (txt_nama.getText().equals("")
                || txt_nip.getText().equals("")
                || txt_kelas.getText().equals("")
                || txt_t4lahir.getText().equals("")
                || txt_unit_kerja.getText().equals("")
                || txt_alamat_skolah.getText().equals("")
                || txt_alamat_skolah.getText().equals("")
                || txt_tlp_kantor.getText().equals("")               
                || alamat_rumah.getText().equals("")
                || txt_no_hp.getText().equals(""))
                {
            
                JOptionPane.showMessageDialog(rootPane, "masih ada data yang kosong");
                        
        } else {
        try {
            
            String sql = ("INSERT INTO tb_ketua_kontingen VALUES('"               
                    +txt_nip.getText()          +   "','"
                    +txt_nama.getText()         +   "','"                    
                    +txt_kelas.getText()        +   "','"
                    +txt_t4lahir.getText()      +   "','"
                    +tanggal_lhr                  +   "','" 
                    +cmb_agama.getSelectedItem()+   "','"
                    +cmb_jenkel.getSelectedItem()+  "','"
                    +txt_unit_kerja.getText()  +   "','"
                    +txt_alamat_skolah.getText()+   "','"
                    +txt_tlp_kantor.getText()  +   "','"                   
                    +alamat_rumah.getText()     +   "','"
                    +txt_no_hp.getText()        +   "','"
                    +txt_lks.getText()          +   "')");
            stat = con.createStatement();
            stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(rootPane, "berhasil");
            kosong();
            new beranda_BD_ketua().show();
            this.hide();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
    }
    
    private void pilih_agama(){
        Statement pilih_agama;
        try {
            String sql = "SELECT * FROM agama";
            pilih_agama = con.createStatement();
            res = pilih_agama.executeQuery(sql);
            while(res.next()){
                cmb_agama.addItem(res.getString("agama"));
            }
        } catch (Exception e) {
        }
    }
    
    void angka(KeyEvent a){
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "hanya bisa memasukan angka");
        }
    }
}

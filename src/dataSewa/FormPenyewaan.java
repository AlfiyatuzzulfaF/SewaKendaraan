/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dataSewa;

import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GAMING
 */
public class FormPenyewaan extends javax.swing.JFrame {

    /**
     * Creates new form FormPenyewaan
     */
    public FormPenyewaan() {
        initComponents();
        loadJenisKendaraan();
        loadDataPenyewaan();
        
        tblPenyewaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblPenyewaan.getSelectedRow();
                    if (row != -1) { // Cek apakah baris valid dipilih
                    // Ambil data dari tabel dan masukkan ke dalam form
                    String id = tblPenyewaan.getValueAt(row, 0).toString();
                    String nama = tblPenyewaan.getValueAt(row, 1).toString();
                    String jenisKendaraan = tblPenyewaan.getValueAt(row, 2).toString();
                    String tipeKendaraan = tblPenyewaan.getValueAt(row, 3).toString();
                    String platNomor = tblPenyewaan.getValueAt(row, 4).toString();
                    String tglSewa = tblPenyewaan.getValueAt(row, 5).toString();
                    String tglKembali = tblPenyewaan.getValueAt(row, 6).toString(); 
                    
                    // Masukkan data ke dalam form
                    txtNama.setText(nama);
                    cbJenisKendaraan.setSelectedItem(jenisKendaraan);
                    cbTipeKendaraan.setSelectedItem(tipeKendaraan);
                    txtTanggalSewa.setText(tglSewa);
                    txtTanggalKembali.setText(tglKembali);
            }
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

        jPanel1 = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblJenisKendaraan = new javax.swing.JLabel();
        lblTipeKendaraan = new javax.swing.JLabel();
        lblTanggalSewa = new javax.swing.JLabel();
        lblTanggalKembali = new javax.swing.JLabel();
        cbJenisKendaraan = new javax.swing.JComboBox<>();
        cbTipeKendaraan = new javax.swing.JComboBox<>();
        txtTanggalKembali = new javax.swing.JTextField();
        txtTanggalSewa = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenyewaan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(51, 51, 51));
        lblJudul.setText("Penyewaan Kendaraan");

        lblNama.setForeground(new java.awt.Color(51, 51, 51));
        lblNama.setText("Nama");

        lblJenisKendaraan.setForeground(new java.awt.Color(51, 51, 51));
        lblJenisKendaraan.setText("Jenis Kendaraan");

        lblTipeKendaraan.setForeground(new java.awt.Color(51, 51, 51));
        lblTipeKendaraan.setText("Tipe Kendaraan");

        lblTanggalSewa.setForeground(new java.awt.Color(51, 51, 51));
        lblTanggalSewa.setText("Tanggal Sewa");

        lblTanggalKembali.setForeground(new java.awt.Color(51, 51, 51));
        lblTanggalKembali.setText("Tanggal Kembali");

        cbJenisKendaraan.setBackground(new java.awt.Color(255, 255, 255));
        cbJenisKendaraan.setForeground(new java.awt.Color(51, 51, 51));

        cbTipeKendaraan.setBackground(new java.awt.Color(255, 255, 255));
        cbTipeKendaraan.setForeground(new java.awt.Color(51, 51, 51));
        cbTipeKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipeKendaraanActionPerformed(evt);
            }
        });

        txtTanggalKembali.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggalKembali.setForeground(new java.awt.Color(51, 51, 51));

        txtTanggalSewa.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggalSewa.setForeground(new java.awt.Color(51, 51, 51));

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setForeground(new java.awt.Color(51, 51, 51));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setForeground(new java.awt.Color(51, 51, 51));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setForeground(new java.awt.Color(51, 51, 51));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        tblPenyewaan.setBackground(new java.awt.Color(255, 255, 255));
        tblPenyewaan.setForeground(new java.awt.Color(51, 51, 51));
        tblPenyewaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Jenis Kendaraan", "Tipe Kendaraan", "Plat Nomor", "Tanggal Sewa", "Tanggal Kembali", "Total Biaya"
            }
        ));
        jScrollPane1.setViewportView(tblPenyewaan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJenisKendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipeKendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbJenisKendaraan, 0, 310, Short.MAX_VALUE)
                            .addComponent(cbTipeKendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTanggalKembali)
                            .addComponent(lblTanggalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggalSewa)
                            .addComponent(txtTanggalKembali)))
                    .addComponent(txtNama))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJudul)
                .addGap(379, 379, 379))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblJudul)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisKendaraan)
                    .addComponent(cbJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggalSewa)
                    .addComponent(txtTanggalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipeKendaraan)
                    .addComponent(cbTipeKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggalKembali)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(49, 49, 49)
                        .addComponent(btnEdit)
                        .addGap(56, 56, 56)
                        .addComponent(btnHapus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cbTipeKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipeKendaraanActionPerformed
       
    }//GEN-LAST:event_cbTipeKendaraanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String namaCustomer = txtNama.getText();
            String jenisKendaraan = (String) cbJenisKendaraan.getSelectedItem();
            String tipeKendaraan = (String) cbTipeKendaraan.getSelectedItem();
            String platNomor = "";
            String tglSewaString = txtTanggalSewa.getText();
            String tglKembaliString = txtTanggalKembali.getText();
            
            Date startDate = convertToDate(tglSewaString);
            Date endDate = convertToDate(tglKembaliString);
            
            if (namaCustomer.isEmpty() || jenisKendaraan.isEmpty() || tipeKendaraan.isEmpty() || tglSewaString.isEmpty() || tglKembaliString.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon lengkapi semua data!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Hitung durasi dan biaya
            long durasi = calculateDurasi(startDate, endDate);
            double totalBiaya = calculateTotalBiaya(tipeKendaraan, durasi);
            
            String queryPlat = "SELECT plat_nomor from kendaraan where tipe_kendaraan = ?";
            try(Connection conn = DatabaseSewa.getConnection();
                    PreparedStatement ps = conn.prepareStatement(queryPlat)) {
                ps.setString(1, tipeKendaraan);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    platNomor = rs.getString("plat_nomor");
                
                } 
            }
            
             String insertQuery = "INSERT INTO penyewaan (nama_customer, jenis_kendaraan, tipe_kendaraan, plat_nomor, tanggal_sewa, tanggal_kembali, total_biaya) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (Connection conn = DatabaseSewa.getConnection();
             PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            ps.setString(1, namaCustomer);
            ps.setString(2, jenisKendaraan);
            ps.setString(3, tipeKendaraan);
            ps.setString(4, platNomor);
            ps.setDate(5, new java.sql.Date(startDate.getTime()));
            ps.setDate(6, new java.sql.Date(endDate.getTime()));
            ps.setDouble(7, totalBiaya);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data penyewaan berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Format tanggal salah! Gunakan format dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String idPenyewaan = tblPenyewaan.getValueAt(tblPenyewaan.getSelectedRow(), 0).toString(); // Ambil ID penyewaan dari baris yang dipilih
        String namaCustomer = txtNama.getText();
        String jenisKendaraan = (String) cbJenisKendaraan.getSelectedItem();
        String tipeKendaraan = (String) cbTipeKendaraan.getSelectedItem();
        String platNomor = "";
        String tglSewaString = txtTanggalSewa.getText();
        String tglKembaliString = txtTanggalKembali.getText();

        try {
            Date startDate = convertToDate(tglSewaString);
            Date endDate = convertToDate(tglKembaliString);

            if (namaCustomer.isEmpty() || jenisKendaraan.isEmpty() || tipeKendaraan.isEmpty() || tglSewaString.isEmpty() || tglKembaliString.isEmpty()) {
                JOptionPane.showMessageDialog(FormPenyewaan.this, "Mohon lengkapi semua data!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hitung durasi dan biaya
            long durasi = calculateDurasi(startDate, endDate);
            double totalBiaya = calculateTotalBiaya(tipeKendaraan, durasi);

            String queryPlat = "SELECT plat_nomor FROM kendaraan WHERE tipe_kendaraan = ?";
            try (Connection conn = DatabaseSewa.getConnection();
                 PreparedStatement ps = conn.prepareStatement(queryPlat)) {
                ps.setString(1, tipeKendaraan);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    platNomor = rs.getString("plat_nomor");
                }
            }

            // Update data penyewaan di database
            String updateQuery = "UPDATE penyewaan SET nama_customer = ?, jenis_kendaraan = ?, tipe_kendaraan = ?, plat_nomor = ?, tanggal_sewa = ?, tanggal_kembali = ?, total_biaya = ? WHERE id = ?";
            try (Connection conn = DatabaseSewa.getConnection();
                 PreparedStatement ps = conn.prepareStatement(updateQuery)) {
                ps.setString(1, namaCustomer);
                ps.setString(2, jenisKendaraan);
                ps.setString(3, tipeKendaraan);
                ps.setString(4, platNomor);
                ps.setDate(5, new java.sql.Date(startDate.getTime()));
                ps.setDate(6, new java.sql.Date(endDate.getTime()));
                ps.setDouble(7, totalBiaya);
                ps.setString(8, idPenyewaan); // Update berdasarkan ID
                ps.executeUpdate();

                // Menampilkan pesan sukses
                JOptionPane.showMessageDialog(FormPenyewaan.this, "Data penyewaan berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                loadDataPenyewaan(); // Reload data penyewaan setelah update
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(FormPenyewaan.this, "Format tanggal salah! Gunakan format dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(FormPenyewaan.this, "Error menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    int[] selectedRow = new int[1];
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (selectedRow[0] == -1) {
            JOptionPane.showMessageDialog(FormPenyewaan.this, "Pilih baris yang ingin dihapus terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ambil ID penyewaan dari baris yang dipilih
        String idPenyewaan = tblPenyewaan.getValueAt(selectedRow[0], 0).toString();

        // Konfirmasi penghapusan
        int confirmation = JOptionPane.showConfirmDialog(FormPenyewaan.this, 
            "Apakah Anda yakin ingin menghapus data penyewaan ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            // Hapus data dari database
            String deleteQuery = "DELETE FROM penyewaan WHERE id = ?";
            try (Connection conn = DatabaseSewa.getConnection();
                 PreparedStatement ps = conn.prepareStatement(deleteQuery)) {
                ps.setString(1, idPenyewaan);
                ps.executeUpdate();

                // Menampilkan pesan sukses
                JOptionPane.showMessageDialog(FormPenyewaan.this, "Data penyewaan berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                loadDataPenyewaan();
                kosongkanForm();// Reload data setelah penghapusan
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(FormPenyewaan.this, "Error menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FormPenyewaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPenyewaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPenyewaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPenyewaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPenyewaan().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenisKendaraan;
    private javax.swing.JComboBox<String> cbTipeKendaraan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJenisKendaraan;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTanggalKembali;
    private javax.swing.JLabel lblTanggalSewa;
    private javax.swing.JLabel lblTipeKendaraan;
    private javax.swing.JTable tblPenyewaan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalSewa;
    // End of variables declaration//GEN-END:variables

    
    private void loadJenisKendaraan() {
        String[] jenisKendaraan = {"", "Motor", "Mobil"};
        cbJenisKendaraan.setModel(new DefaultComboBoxModel<>(jenisKendaraan));

        // Menambahkan ItemListener untuk memperbarui tipe kendaraan secara otomatis
        cbJenisKendaraan.addItemListener((java.awt.event.ItemEvent evt) -> {
            // Panggil updateTipeKendaraan hanya jika jenis kendaraan dipilih
            String jenisKendaraan1 = (String) cbJenisKendaraan.getSelectedItem();
            if (jenisKendaraan1 != null && !jenisKendaraan1.trim().isEmpty()) {
                updateTipeKendaraan(jenisKendaraan1);
            }
        });   
    }
    
    private void updateTipeKendaraan(String jenisKendaraan) {
        DefaultComboBoxModel<String> tipeModel = new DefaultComboBoxModel<>();
    
        String query = "SELECT tipe_kendaraan FROM kendaraan WHERE jenis_kendaraan = ?";

        try (Connection conn = DatabaseSewa.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, jenisKendaraan);
            ResultSet rs = ps.executeQuery();

            // Cek apakah query mengembalikan hasil
            boolean dataFound = false;
            while (rs.next()) {
                dataFound = true;
                String tipeKendaraan = rs.getString("tipe_kendaraan");
                tipeModel.addElement(tipeKendaraan);
            }

            // Jika tidak ada data ditemukan
            if (!dataFound) {
                JOptionPane.showMessageDialog(this, "Tidak ada tipe kendaraan untuk jenis ini.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            // Update combo box
            SwingUtilities.invokeLater(() -> cbTipeKendaraan.setModel(tipeModel));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                    "Terjadi kesalahan saat mengambil data tipe kendaraan.\n" + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private long calculateDurasi(Date startDate, Date endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date start = startDate;
        Date end = endDate;
        long diff = end.getTime() - start.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Konversi ke hari
    }

    private double calculateTotalBiaya(String tipeKendaraan, long durasi) {
        double biayaPerHari = 0;
        String query = "SELECT biaya FROM kendaraan WHERE tipe_kendaraan = ?";
        try (Connection conn = DatabaseSewa.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, tipeKendaraan);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                biayaPerHari = rs.getDouble("biaya");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error calculating biaya: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return biayaPerHari * durasi;
    }
    
    public Date convertToDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy"); // Example format
        try {
            return dateFormat.parse(dateStr); // Convert the string to Date
        } catch (ParseException e) {
            e.printStackTrace(); // Handle exception if the string is not in the correct format
            return null; // Return null if the parsing fails
        }
    }
    private void loadDataPenyewaan() {
        // Model tabel untuk tblPenyewaan
        DefaultTableModel model = (DefaultTableModel) tblPenyewaan.getModel();

        // Menghapus data sebelumnya di tabel
        model.setRowCount(0);

        String query = "SELECT id, nama_customer, jenis_kendaraan, tipe_kendaraan, plat_nomor, tanggal_sewa, tanggal_kembali, total_biaya FROM penyewaan";

        try (Connection conn = DatabaseSewa.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            // Loop untuk memasukkan data ke dalam tabel
            while (rs.next()) {
                // Ambil data dari hasil query
                int id = rs.getInt("id");
                String namaCustomer = rs.getString("nama_customer");
                String jenisKendaraan = rs.getString("jenis_kendaraan");
                String tipeKendaraan = rs.getString("tipe_kendaraan");
                String platNomor = rs.getString("plat_nomor");
                Date tglSewa = rs.getDate("tanggal_sewa");
                Date tglKembali = rs.getDate("tanggal_kembali");
                double totalBiaya = rs.getDouble("total_biaya");

                // Format tanggal ke format yang diinginkan (misalnya dd/MM/yyyy)
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String tglSewaStr = dateFormat.format(tglSewa);
                String tglKembaliStr = dateFormat.format(tglKembali);

                // Tambahkan data ke dalam model tabel
                model.addRow(new Object[] {
                    id, namaCustomer, jenisKendaraan, tipeKendaraan, platNomor, tglSewaStr, tglKembaliStr, totalBiaya
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data penyewaan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void kosongkanForm() {
    // Mengosongkan semua field input
        txtNama.setText("");
        cbJenisKendaraan.setSelectedIndex(0); // Reset ComboBox ke pilihan pertama
        cbTipeKendaraan.setSelectedIndex(0);  // Reset ComboBox ke pilihan pertama
        txtTanggalSewa.setText("");
        txtTanggalKembali.setText("");
}
}

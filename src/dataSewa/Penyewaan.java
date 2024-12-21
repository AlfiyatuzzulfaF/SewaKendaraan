/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

/**
 *
 * @author MSI GAMING
 */
public class Penyewaan {
    private String namaCustomer;
    private String jenisKendaraan;
    private String tipeKendaraan;
    private String platNomor;
    private double biaya;
    private String tanggalSewa;
    private String tanggalKembali;
    private double totalBiaya;
    
    // Constructor
    public Penyewaan(String namaCustomer, String jenisKendaraan, String tipeKendaraan,
                     String platNomor, String tanggalSewa, String tanggalKembali, double biayaPerHari) {
        this.namaCustomer = namaCustomer;
        this.jenisKendaraan = jenisKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.platNomor = platNomor;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public double getBiaya() {
        return biaya;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public String getTanggalSewa() {
        return tanggalSewa;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public void setTanggalSewa(String tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void TotalBiaya(int durasi) {
        totalBiaya = biaya * durasi;
    }
}

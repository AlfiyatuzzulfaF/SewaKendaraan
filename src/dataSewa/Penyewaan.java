/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

import java.util.Date;
/**
 *
 * @author MSI GAMING
 */
public class Penyewaan {
    private int idSewa;
    private int idCustomer;
    private int idKendaraan;
    private Date tanggalSewa;
    private Date tanggalKembali;
    private double totalBiaya;
    
    public Penyewaan(int idSewa, int idCustomer, int idKendaraan, Date tanggalSewa, Date tanggalKembali, double totalBiaya) {
        this.idSewa = idSewa;
        this.idCustomer = idCustomer;
        this.idKendaraan = idKendaraan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        this.totalBiaya = totalBiaya;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
}

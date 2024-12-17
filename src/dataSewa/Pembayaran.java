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
public class Pembayaran {
    private int idPembayaran;
    private int idSewa;
    private String metodePembayaran;
    private Date tanggalPembayaran;
    private double jumlahPembayaran;
    
    public Pembayaran(int idPembayaran, int idSewa, String metodePembayaran, Date tanggalPembayaran, double jumlahPembayaran) {
        this.idPembayaran = idPembayaran;
        this.idSewa = idSewa;
        this.metodePembayaran = metodePembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public Date getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setTanggalPembayaran(Date tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }
}

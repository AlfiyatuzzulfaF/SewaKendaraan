/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

/**
 *
 * @author MSI GAMING
 */
public class Mobil extends Kendaraan{
    private String tipeMobil;
    private int kapasitasPenumpang;

    public Mobil(int idKendaraan, String namaKendaraan, String jenisKendaraan, double hargaSewa, String status, String tipeMobil, int kapasitasPenumpang) {
        super(idKendaraan, namaKendaraan, jenisKendaraan, hargaSewa, status);
        this.tipeMobil = tipeMobil;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setTipeMobil(String tipeMobil) {
        this.tipeMobil = tipeMobil;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

/**
 *
 * @author MSI GAMING
 */
public class Kendaraan {
    private int idKendaraan;
    private String namaKendaraan;
    private String jenisKendaraan;
    private double hargaSewa;
    private String status;
    
    public Kendaraan(int idKendaraan, String namaKendaraan, String jenisKendaraan, double hargaSewa, String status) {
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getStatus() {
        return status;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

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
    private String tipeKendaraan;
    private double biaya;
    
    // Constructor
    public Mobil(int id, String platNomor, String tipeKendaraan, double biaya) {
        super(id, platNomor);
        this.tipeKendaraan = tipeKendaraan;
        this.biaya = biaya;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
}

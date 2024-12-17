/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

/**
 *
 * @author MSI GAMING
 */
public class Motor extends Kendaraan{
    private String tipeMotor;
    private int kapasitasMesin;
    
    public Motor(int idKendaraan, String namaKendaraan, String jenisKendaraan, double hargaSewa, String status, String tipeMotor, int kapasitasMesin) {
        super(idKendaraan, namaKendaraan, jenisKendaraan, hargaSewa, status);
        this.tipeMotor = tipeMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
}

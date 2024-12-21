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
    private int id;
    private String platNomor;
    
    // Constructor
    public Kendaraan(int id, String platNomor) {
        this.id = id;
        this.platNomor = platNomor;
    }

    public int getId() {
        return id;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
}
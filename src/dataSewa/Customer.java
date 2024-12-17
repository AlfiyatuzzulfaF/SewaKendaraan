/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSewa;

/**
 *
 * @author MSI GAMING
 */
public class Customer {
    private int idCustomer;
    private String namaCustomer;
    private char jenisKelamin;
    private String noHP;
    
    public Customer(int idCustomer, String namaCustomer, char jenisKelamin, String noHp) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.jenisKelamin = jenisKelamin;
        this.noHP = noHp;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}

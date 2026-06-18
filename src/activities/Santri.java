/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activities;

public class Santri {
    private int induk;
    private String nama;
    private String alamat;
    private String kamar;

    // Konstruktor Default
    public Santri() {}

    // Konstruktor Berparameter
    public Santri(int induk, String nama, String alamat, String kamar) {
        this.induk = induk;
        this.nama = nama;
        this.alamat = alamat;
        this.kamar = kamar;
    }

    // Getter dan Setter
    public int getInduk() { return induk; }
    public void setInduk(int induk) { this.induk = induk; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getKamar() { return kamar; }
    public void setKamar(String kamar) { this.kamar = kamar; }

    // Metode Tampil Data
    public void tampilkanDataSantri() {
        System.out.println("=== Data Santri ===");
        System.out.println("No Induk : " + induk);
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("Kamar    : " + kamar);
    }
}



/**
 *
 * @author ASUS
 */

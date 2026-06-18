/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activities;

public class Pembayaran {
    private String kode;
    private String jenis;
    private int total;
    private int bulan;

    // Konstruktor Default
    public Pembayaran() {}

    // Konstruktor Berparameter
    public Pembayaran(String kode, String jenis, int total, int bulan) {
        this.kode = kode;
        this.jenis = jenis;
        this.total = total;
        this.bulan = bulan;
    }

    // Getter dan Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    public int getBulan() { return bulan; }
    public void setBulan(int bulan) { this.bulan = bulan; }

    // Metode Tampil Detail
    public void tampilkanInfoBayar() {
        System.out.println("=== Detail Pembayaran ===");
        System.out.println("Kode Transaksi : " + kode);
        System.out.println("Jenis Bayar    : " + jenis);
        System.out.println("Total          : Rp " + total);
        System.out.println("Bulan ke-      : " + bulan);
    }
}

/**
 *
 * @author ASUS
 */

 

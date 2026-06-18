/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drivers;

import activities.Santri;
import activities.Pembayaran;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    // Membuat array list menjadi variabel global agar bisa dibaca oleh semua JFrame
    public static ArrayList<Santri> daftarSantri = new ArrayList<>();
    public static ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

    public static void main(String[] args) {
        // --- INPUT DATA BAWAAN ---
        // daftarSantri.add(new Santri(100, "Muhammad Iman Hidayat", "Jl.A.Yani,Km 29", "Kamar 3"));
        // daftarSantri.add(new Santri(101, "Ahmad Fauzi", "Jl. Gatot Subroto No. 12", "Kamar 5"));

        Pembayaran p1 = new Pembayaran();
        p1.setKode("20180109085027");
        p1.setJenis("SPP");
        p1.setTotal(350000);
        p1.setBulan(1);
        daftarPembayaran.add(p1);

        daftarPembayaran.add(new Pembayaran("20180109085028", "Uang Buku", 150000, 1));

        // --- MEMBUKA WINDOW UTAMA GUI ---
        java.awt.EventQueue.invokeLater(() -> {
            new frame.FrameUtama().setVisible(true);
        });
    }

    // Fungsi mencari urutan (indeks) posisi santri berdasarkan nama
    public static int dapatkanUrutanSantri(String namaMasing) {
        int index = -1;
        for (int i = 0; i < daftarSantri.size(); i++) {
            if (daftarSantri.get(i).getNama().equalsIgnoreCase(namaMasing)) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data santri tidak ditemukan!");
        }
        return index;
    }

    // Fungsi untuk mengambil data spesifik lalu menampilkannya ke Pop-up layar
    public static void cariDanTampilkanSantri(String namaMasing) {
        int i = dapatkanUrutanSantri(namaMasing);
        if (i >= 0) {
            String nama = daftarSantri.get(i).getNama();
            int induk = daftarSantri.get(i).getInduk();
            String kamar = daftarSantri.get(i).getKamar();

            String pesan = "Nama Santri : " + nama + "\n" +
                           "No Induk    : " + induk + "\n" +
                           "Kamar       : " + kamar;

            JOptionPane.showMessageDialog(null, pesan);
        }
    }
    // Fungsi untuk mengubah data santri yang sudah ada di dalam list
public static void ubahDataSantri(int index, int induk, String nama, String alamat, String kamar) {
    // Validasi: memastikan baris/index yang dipilih memang ada di dalam list
    if (index >= 0 && index < daftarSantri.size()) {
        // Mengambil objek santri pada urutan (index) tertentu, lalu mengganti datanya dengan yang baru
        daftarSantri.get(index).setInduk(induk);
        daftarSantri.get(index).setNama(nama);
        daftarSantri.get(index).setAlamat(alamat);
        daftarSantri.get(index).setKamar(kamar);
        
        // Memunculkan pesan sukses di layar
        JOptionPane.showMessageDialog(null, "Data Santri Berhasil Diubah!");
    }
}

// Fungsi untuk menghapus data santri dari list
public static void hapusDataSantri(int index) {
    // Validasi: memastikan baris/index yang dipilih memang ada
    if (index >= 0 && index < daftarSantri.size()) {
        // Menghapus objek santri dari ArrayList berdasarkan posisinya
        daftarSantri.remove(index);
        
        // Memunculkan pesan sukses di layar
        JOptionPane.showMessageDialog(null, "Data Santri Berhasil Dihapus!");
    }
}
}

/**
 *
 * @author ASUS
 */

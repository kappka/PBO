/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Teti
 */
class Nilai {
       String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    void Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen * 0.10;
        this.nilaiTugas = nilaiTugas * 0.20;
        this.nilaiUTS = nilaiUTS * 0.30;
        this.nilaiUAS = nilaiUAS * 0.40;
        this.nilaiAkhir = this.nilaiAbsen + this.nilaiTugas + this.nilaiUTS + this.nilaiUAS;
    }

    void CetakNilai() {
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Nilai Absen [10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS   [30%]: " + nilaiUTS);
        System.out.println("Nilai UAS   [40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
    }
    
}

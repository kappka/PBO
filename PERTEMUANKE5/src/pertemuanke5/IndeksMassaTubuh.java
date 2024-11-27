/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanke5;
import java.util.Scanner;

/**
 *
 * @author Fahru Rizz
 */
public class IndeksMassaTubuh {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // INPUT DATA MAHASISWA & NILAI MAHASISWA
        System.out.println("-------------- INDEKS MASSA TUBUH --------------");
        
        System.out.print("BERAT BADAN                   : "); // INPUT BERAT BADAN
        double beratBadan = input.nextDouble();
        System.out.print("TINGGI BADAN                  : "); // INPUT TINGGI BADAN
        double tinggiBadan = input.nextDouble();
       
        // MENGHITUNG INDEKS MASSA TUBUH
        double indeksMassa = beratBadan / (tinggiBadan * tinggiBadan);
        
        // MENENTUKAN INDEKS MASSA TUBUH DENGAN MENYESUAIKAN TINGGI BADAN & BERAT BADAN
        String kriteria;
        if (indeksMassa < 18.4){ 
            kriteria = "BERAT BADAN KURANG"; }  // JIKA IMT KURANG DARI 18.4 MENDAPATKAN KETERANGAN "BERAT BADAN KURANG"
        else if (indeksMassa >= 18.5 && indeksMassa <= 24.9){
            kriteria = "BERAT BADAN IDEAL"; }   // JIKA IMT 18.5 - 24.9 MENDAPATKAN KETERANGAN "BERAT BADAN IDEAL" 
        else if (indeksMassa >= 25 && indeksMassa <= 29.9){
            kriteria = "BERAT BADAN LEBIH"; }   // JIKA IMT 25 - 29.9 MENDAPATKAN KETERANGAN "BERAT BADAN LEBIH
        else if (indeksMassa >= 30 && indeksMassa <= 39.9){
            kriteria = "GEMUK"; }               // JIKA IMT 30 - 29.9 MENDAPATKAN KETERANGAN "GEMUK"
        else if (indeksMassa >= 40){
            kriteria = "SANGAT GEMUK"; }        // JIKA IMT LEBIH DARI 40 MENDAPATKAN KETERANGAN "SANGAT GEMUK"
        else { kriteria = "NILAI YANG ANDA INPUT TIDAK VALID"; } // NILAI YANG ANDA INPUT TIDAK VALID
        
        System.out.println("NILAI INDEKS MASSA TUBUH ANDA : " + indeksMassa);   // OUTPUT NILAI IMT
        System.out.println("KRITERIA DARI NILAI IMT       : " + kriteria);      // OUTPUT KRITERIA NILAI IMT
    }
}

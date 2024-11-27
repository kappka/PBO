/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke5;
import java.util.Scanner;

/**
 *
 * @author Fahru Rizz
 */
public class IndeksPrestasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // INPUT DATA MAHASISWA & NILAI MAHASISWA
        System.out.println("----------------- INPUT ------------------");
        
        System.out.print("NPM             : "); // INPUT NPM
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa  : "); // INPUT NAMA
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : "); // INPUT NILAI KEHADIRAN
        double absen = input.nextDouble();
        System.out.print("Nilai Tugas     : "); // INPUT NILAI TUGAS
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS       : "); // INPUT NILAI UTS
        double uts = input.nextDouble();
        System.out.print("Nilai UAS       : "); // INPUT NILAI UAS
        double uas = input.nextDouble();
        
        System.out.println("------------------------------------------");
        
        // MENGHITUNG NILAI AKHIR ATAU RATA - RATA
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        // MENENTUKAN GRADE 
        char grade;
        if (nilaiAkhir > 75 && nilaiAkhir < 101) { grade = 'A'; } // JIKA NILAI 76 - 100 MENDAPATKAN GRADE A
        else if (nilaiAkhir > 65 && nilaiAkhir < 76) { grade = 'B'; } // JIKA NILAI 66 - 75 MENDAPATKAN GRADE "B"
        else if (nilaiAkhir > 55 && nilaiAkhir < 66) { grade = 'C'; } // JIKA NILAI 56 - 65 MENDAPATKAN GRADE "C"
        else if (nilaiAkhir > 45 && nilaiAkhir < 56) { grade = 'D'; } // JIKA NILAI 46-55 MENDAPATKAN GRADE "D"
        else if (nilaiAkhir >= 0 && nilaiAkhir < 46) { grade = 'E'; } // JIKA NILAI 0-45 MENDAPATKAN GRADE "E"
        else if (nilaiAkhir > 100 && nilaiAkhir < 0) { grade = '?'; } // NILAI YANG ANDA INPUT TIDAK VALID
        else { grade = '?'; } // NILAI YANG DIINPUT TIDAK VALID
        
        // MENENTUKAN KETERANGAN DENGAN MENYESUAIKAN NILAI AKHIR
        String keterangan;
        if (nilaiAkhir > 75 && nilaiAkhir < 101) { keterangan = "ISTIMEWA"; } // JIKA NILAI 76-100 MENDAPATKAN KETERANGAN "ISTIMEWA"
        else if (nilaiAkhir > 65 && nilaiAkhir < 76) { keterangan = "BAIK"; } // JIKA NILAI 66-75 MENDAPATKAN KETERANGAN "BAIK"
        else if (nilaiAkhir > 55 && nilaiAkhir < 66) { keterangan = "CUKUP"; } // JIKA NILAI 56-65 MENDAPATKAN KETERANGAN "CUKUP"
        else if (nilaiAkhir > 45 && nilaiAkhir < 56) { keterangan = "KURANG"; } // JIKA NILAI 46-55 MENDAPATKAN KETERANGAN "KURANG"
        else if (nilaiAkhir >= 0 && nilaiAkhir < 46) { keterangan = "KURANG SEKALI"; } // JIKA NILAI 0-45 MENDAPATKAN KETERANGAN "KURANG SEKALI"
        else { keterangan = "NILAI YANG ANDA INPUT TIDAK VALID, HARUS ANTARA 0 - 100"; } // NILAI YANG ANDA INPUT TIDAK VALID
   
        // OUTPUT
        System.out.println("\n\n----------------- OUTPUT -----------------");
        System.out.println("NPM Mahasiswa   : " + npm);         // OUTPUT NPM
        System.out.println("Nama Mahasiswa  : " + nama);        // OUTPUT NAMA
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);  // OUTPUT NILAI AKHIR
        System.out.println("Grade           : " + grade);       // OUTPUT GRADE
        System.out.println("Keterangan      : " + keterangan);  // OUTPUT KETERANGAN
        System.out.println("------------------------------------------");
    }  
}

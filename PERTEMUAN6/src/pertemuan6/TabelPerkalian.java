/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Teti
 */
public class TabelPerkalian {
    public static void main(String[] args) {
        int n = 10; // nilai "10" bisa diganti sesuai keinginan dan Pastikan n tidak lebih dari "10" sesuai modul      
                    
        if (n > 10) {
            System.out.println("Nilai n terlalu besar, maksimal adalah 10.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t"); // mengkali dan memberi tab
            }
            System.out.println(); // buat ganti baris atau println
        }
    }
}

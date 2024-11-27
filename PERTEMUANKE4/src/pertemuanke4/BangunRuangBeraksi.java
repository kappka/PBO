/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke4;

/**
 *
 * @author Fahru Rizz
 */
public class BangunRuangBeraksi {
    public static void main(String[] args) {
        BangunRuang operasi = new BangunRuang();
        
        System.out.println("\nDIKETAHUI BALOK MEMILIKI");
        System.out.println("- Panjang = 10 cm \n- Lebar   = 15 cm \n- Tinggi  = 20 cm");
        System.out.println("VOLUME BALOK ------- = " + operasi.volume(10, 15, 20) + " cm");
        System.out.println("LUAS PERMUKAAN BALOK = " + operasi.luasPermukaan(10, 15, 20) + " cm");
        
        System.out.println("\n\nDIKETAHUI KUBUS MEMILIKI");
        System.out.println("- Sisi    = 15 cm");
        System.out.println("VOLUME KUBUS ------- = " + operasi.volume (15) + " cm");
        System.out.println("LUAS PERMUKAAN KUBUS = " + operasi.luasPermukaan (15) + " cm");
        
        System.out.println("");
        
    }
    
}

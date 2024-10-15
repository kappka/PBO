/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Teti
 */

//pengulangan for
public class DeretPrima {
    public static void main(String[] args) {
        System.out.println("Deret Bilangan Prima dan Bukan Prima dari 0–20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " bukan bilangan prima.");
            }
        }
    }

    // Fungsi untuk mengecek bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

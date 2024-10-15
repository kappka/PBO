/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Teti
 */
public class AnakAyam {
    public static void main(String[] args) {
        int N = 10; // Nilai n sesuai keinginan 
        System.out.println("Lagu Anak Ayam Turun " + N + ":");
        for (int i = N; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Teti
 */

//pengulangan do while
public class HurufZKeA {
    public static void main(String[] args) {
        char huruf = 'Z'; //dibuat dari z karena akan melakukan hitung mundur
        System.out.println("Huruf dari Z ke A:");
        do {
            System.out.print(huruf + " ");
            huruf--; //eksekusi agar Z mundur hingga huruf A
        } while (huruf >= 'A');
    }
}
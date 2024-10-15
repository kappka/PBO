/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Teti
 */


//Pengulangan While
public class DeretGanjilGenap {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Deret Bilangan Ganjil dan Genap dari 0–20:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                System.out.println(i + " adalah bilangan ganjil.");
            }
            i++;
        }
    }
}
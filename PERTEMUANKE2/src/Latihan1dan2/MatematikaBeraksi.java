/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1dan2;

/**
 * @author FRizal
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class
        Matematika matematika = new Matematika();

        // Hasilnya
        System.out.println("Pertambahan: 20 + 10 = " + matematika.pertambahan(20, 10));
        System.out.println("Pengurangan: 10 - 5 = " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 3 = " + matematika.perkalian(10, 3));
        System.out.println("Pembagian: 21 / 2= " + matematika.pembagian(21, 2));
    }
}

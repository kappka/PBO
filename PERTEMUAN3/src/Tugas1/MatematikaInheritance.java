/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Teti
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika2
        Matematika2 mat = new Matematika2();
        
        // Memanggil method-method dari class Matematika (Parent Class)
        System.out.println("Pertambahan 10 + 5 = " + mat.pertambahan(10, 5));
        System.out.println("Pengurangan 10 - 5 = " + mat.pengurangan(10, 5));
        System.out.println("Perkalian 10 * 5 = " + mat.perkalian(10, 5));
        System.out.println("Pembagian 10 / 5 = " + mat.pembagian(10, 5));

        // Memanggil method modulus dari class Matematika2 (Child Class)
        System.out.println("Modulus 10 % 5 = " + mat.modulus(10, 5));
    }
}
    
}

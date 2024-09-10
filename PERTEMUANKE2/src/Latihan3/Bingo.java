/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 * @author FRizal
 */
public class Bingo {
    // Konstruktor untuk mencetak lagu Bingo
    public Bingo() {
        cetakLagu();
    }

    // Metode untuk mencetak lagu
    public void cetakLagu() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        for (int i = 0; i <= bingo.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            // Cetak bagian B-I-N-G-O dengan tepukan yang bertambah
            for (int j = 0; j < bingo.length; j++) {
                if (j < i) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j < bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();
            // Ulangi baris B-I-N-G-O
            for (int j = 0; j < bingo.length; j++) {
                if (j < i) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j < bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();
            System.out.println("And Bingo was his name-o.");
            System.out.println();
        }
    }
}

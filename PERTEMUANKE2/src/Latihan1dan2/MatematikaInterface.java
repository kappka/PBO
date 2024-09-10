/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1dan2;

/**
 * @author  FRizal 
 */
interface MatematikaInterface {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

// Kelas Matematika yang mengimplementasikan interface Matematika
class Matematika implements MatematikaInterface {
    // Implementasi metode pertambahan
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Implementasi metode pengurangan
    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Implementasi metode perkalian
    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Implementasi metode pembagian
    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }
}
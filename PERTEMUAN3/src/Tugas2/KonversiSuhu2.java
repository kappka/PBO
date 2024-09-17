/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Teti
 */
class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengonversi suhu dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;  // Konversi dari Fahrenheit ke Celcius
        return celcius * 4/5;  // Kemudian konversi dari Celcius ke Reamur
    }
}

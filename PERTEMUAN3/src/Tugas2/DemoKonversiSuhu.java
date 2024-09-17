/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Teti
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // Membuat objek dari class KonversiSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        // Nilai contoh suhu dalam Celcius dan Fahrenheit
        double suhuCelcius = 100.0;
        double suhuFahrenheit = 212.0;
        
        // Memanggil method dari class KonversiSuhu (Parent Class)
        System.out.println(suhuCelcius + " Celcius ke Fahrenheit = " + konversi.celciusToFahrenheit(suhuCelcius));
        System.out.println(suhuCelcius + " Celcius ke Reamur = " + konversi.celciusToReamur(suhuCelcius));
        
        // Memanggil method dari class KonversiSuhu2 (Child Class)
        System.out.println(suhuFahrenheit + " Fahrenheit ke Reamur = " + konversi.fahrenheitToReamur(suhuFahrenheit));
    }
}

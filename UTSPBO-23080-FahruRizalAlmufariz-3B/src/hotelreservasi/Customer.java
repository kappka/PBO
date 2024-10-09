/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;
import java.util.Scanner;
/**
 *
 * @author Fahru
 */
public class Customer implements User {
    private String username;
    private String password;
    private String namaPemesan = "-";
    private String noHp = "-";
    private Reservation reservasi;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public String getNamaPemesan() {
        return namaPemesan;
    }
    public String getNoHp() {
        return noHp;
    }
    public Reservation getReservation() {
        return reservasi;
    }
    
    //transaksinya
    public void transaksi() {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Selamat Datang Di Fahru's Hotel 27 -----");
        System.out.println("Silahkan melakukan transaksi terlebih dahulu ");
        System.out.print("Masukkan nama pemesan: ");
        this.namaPemesan = input.nextLine();
        System.out.print("Masukkan nomor handphone: ");
        this.noHp = input.nextLine();

        
        System.out.print("Masukkan tanggal Check-In (format: DD/MM/YYYY): ");
        String tanggalCheckIn = input.nextLine();

        System.out.println("Pilih Kamar:");
        System.out.println("1. Grade A - Rp 700.000");
        System.out.println("2. Grade B - Rp 625.000");
        System.out.println("3. Grade C - Rp 500.000");
        int pilihanKamar = input.nextInt();

        System.out.println("Pilih Kasur:");
        System.out.println("1. Single Bed - Free");
        System.out.println("2. Twin Bed - + Rp 100.000");
        System.out.println("3. Queen Bed - + Rp 150.000");
        System.out.println("4. King Bed - + Rp 200.000");
        int pilihanKasur = input.nextInt();

        System.out.println("Apakah ingin sarapan pagi? (+ Rp 75.000)");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        int pilihanSarapan = input.nextInt();

        // Membuat reservasi
        reservasi = new Reservation(namaPemesan, noHp, pilihanKamar, pilihanKasur, pilihanSarapan, tanggalCheckIn);
        reservasi.hitungTotal();
        reservasi.detailPesanan();
    }
}
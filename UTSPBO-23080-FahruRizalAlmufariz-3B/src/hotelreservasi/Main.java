/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservasi;
import java.util.Scanner;

/**
 *
 * @author Fahru
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User loggedInUser = null;  // Menyimpan pengguna yang sudah login (Admin / Customer)
        Admin admin = new Admin("Fahru080", "123");
        Customer customer = new Customer("Rizal080", "123");

        boolean isRunning = true;

        while (isRunning) {
            if (loggedInUser == null) {
                System.out.println("Selamat Datang di Reservasi Fahru's Hotel 27!");
                System.out.println("Silahkan Login Terlebih Dahulu");

                System.out.print("Username: ");
                String username = input.next();

                System.out.print("Password: ");
                String password = input.next();

                if (admin.login(username, password)) {
                    System.out.println("Login berhasil sebagai Admin.");
                    loggedInUser = admin;  // Simpan admin yang sudah log in
                } else if (customer.login(username, password)) {
                    System.out.println("Login berhasil sebagai Customer.");
                    loggedInUser = customer;  // Simpan user customer juga
                } else {
                    System.out.println("Username atau password salah!");
                    continue;  // Kembali ke awal loop buat login ulang
                }
            }
           
            if (loggedInUser instanceof Admin) {
                ((Admin) loggedInUser).lihatRiwayatTransaksi(customer);
            } else if (loggedInUser instanceof Customer) {
                ((Customer) loggedInUser).transaksi();
            }

            
            // Menampilkan pilihan mau keluar, lanjutkan, atau login ulang
            System.out.println("Apakah Anda ingin keluar dari aplikasi?");
            System.out.println("1. Ya (Keluar)");
            System.out.println("2. Tidak (Lanjutkan)");

            
            int pilihanKeluar = input.nextInt();
            if (pilihanKeluar == 1) {
                isRunning = false;
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa! >///< ");
            } else {
                // Jika user memilih untuk tidak keluar
                if (loggedInUser instanceof Customer) {
                    // Tawarkan pilihan untuk customer
                    System.out.println("Apakah Anda ingin:");
                    System.out.println("1. Lanjut memesan");
                    System.out.println("2. Login kembali dengan akun lain");

                    
                    int pilihan = input.nextInt();
                    if (pilihan == 1) {
                        // Lanjut memesan, loop akan berjalan lagi tanpa login ulang
                        continue;
                    } else if (pilihan == 2) {
                        // Login kembali, set `loggedInUser` ke null supaya login ulang
                        loggedInUser = null;
                    }
                    
                } else if (loggedInUser instanceof Admin) {
                    // Admin cuma dikasih opsi login kembali
                    System.out.println("Apakah Anda ingin login kembali dengan akun lain? (1. Ya / 2. Tidak)");
                    int pilihan = input.nextInt();
                    if (pilihan == 1) {
                        loggedInUser = null;  // Login ulang
                    }
                }
            }
        }
    }
}

//Buat login bang
//Admin: Username:"Fahru80", Pass:"123"
//Customer: Username:"Rizal080", Pass:"123"

//Rekomendasi check, pesen pake akun customer
//lanjut jangan keluar dari aplikasi, pilih login lagi terus pake akun admin
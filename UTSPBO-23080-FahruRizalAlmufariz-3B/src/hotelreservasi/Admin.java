/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Fahru
 */
public class Admin implements User {
    private String username;
    private String password;

    
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    
    public void lihatRiwayatTransaksi(Customer customer) {
        System.out.println("--------- Riwayat Transaksi Pemesanan ---------");
        
        if (customer.getNamaPemesan().equals("-") && customer.getNoHp().equals("-")) {
            System.out.println("Belum ada transaksi yang dilakukan oleh customer.");
        } else {
            System.out.println("Nama Pemesan: " + customer.getNamaPemesan());
            System.out.println("Nomor Handphone: " + customer.getNoHp());
            Reservation reservasi = customer.getReservation();
            if (reservasi != null) {
                System.out.println("Tanggal Check-In: " + reservasi.getTanggalCheckIn());
                // Hapus tampilan tanggal check-out
                System.out.println("Grade Kamar: " + reservasi.getGradeKamar());
                System.out.println("Tipe Kasur: " + reservasi.getTipeKasur());
                System.out.println("Sarapan: " + (reservasi.getSarapan() == 1 ? "Ya" : "Tidak"));
                System.out.println("Total Harga: Rp " + reservasi.getTotalHarga());
            } else {
                System.out.println("Belum ada reservasi yang dilakukan.");
            }
        }
    }
}
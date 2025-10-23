package jobsheet5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Perpustakaan & Akses WiFi Kampus ===");
        System.out.print("Apakah Anda sudah menjadi anggota perpustakaan? (true/false): ");
        boolean anggota = sc.nextBoolean();

        if (anggota) {
            System.out.print("Apakah Anda sudah mengembalikan semua buku yang dipinjam? (true/false): ");
            boolean bukuKembali = sc.nextBoolean();

            if (bukuKembali) {
                System.out.print("Apakah Anda sudah membayar UKT? (true/false): ");
                boolean uktLunas = sc.nextBoolean();

                if (uktLunas) {
                    System.out.println(" Anda dapat mengakses WiFi dan meminjam buku baru di perpustakaan.");
                } else {
                    System.out.println(" Anda belum bisa mengakses WiFi. Silakan lunasi UKT terlebih dahulu.");
                }

            } else {
                System.out.println(" Anda belum bisa meminjam buku baru. Kembalikan buku sebelumnya dahulu.");
            }

        } else {
            System.out.println(" Anda belum terdaftar sebagai anggota perpustakaan. Silakan daftar terlebih dahulu.");
        }

        sc.close();
    }
}
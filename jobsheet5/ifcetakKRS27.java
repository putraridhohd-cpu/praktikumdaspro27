package jobsheet5;

import java.util.Scanner;

public class ifcetakKRS27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Cetak KRS ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        String hasil = (uktLunas) 
            ? "Pembayaran UKT terverifikasi"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println("\n=== Versi Ternary Operator ===");
        System.out.println(hasil);

        input.close();
    }
}
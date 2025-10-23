package jobsheet5;

import java.util.Scanner;

public class ifcetakKRS27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Cetak KRS ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
        } else {
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA.");
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

        input.close();
    }
}
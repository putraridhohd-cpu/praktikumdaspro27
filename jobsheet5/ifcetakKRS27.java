package jobsheet5;

import java.util.Scanner;

public class ifcetakKRS27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Cetak KRS ===");
        System.out.println("apakah UKT udah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();
        if (uktLunas) {
            System.out.println("pembayaran UKT terverifikasi");
        } else {
            System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
        
        }
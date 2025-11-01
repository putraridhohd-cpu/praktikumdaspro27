package jobsheet8;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka untuk kotak kiri (>=3): ");
        int kiri = sc.nextInt();
        System.out.print("Masukkan angka untuk kotak kanan (>=3): ");
        int kanan = sc.nextInt();
        if (kiri < 3 || kanan < 3) {
            System.out.println("Kedua angka harus >= 3");
            return;
        }
        int tinggiMaks = Math.max(kiri, kanan);
        for (int i = 0; i < tinggiMaks; i++) {
            if (i < kiri) {
                for (int j = 0; j < kiri; j++) {
                    if (i == 0 || i == kiri - 1) {
                        System.out.print(kiri + " ");
                    } else {
                        if (j == 0 || j == kiri - 1) {
                            System.out.print(kiri + " ");
                        } else {
                            System.out.print("  "); 
                        }
                    }
                }
            } else {
                for (int j = 0; j < kiri; j++) {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            if (i < kanan) {
                for (int j = 0; j < kanan; j++) {
                    if (i == 0 || i == kanan - 1) {
                        System.out.print(kanan + " ");
                    } else {
                        if (j == 0 || j == kanan - 1) {
                            System.out.print(kanan + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

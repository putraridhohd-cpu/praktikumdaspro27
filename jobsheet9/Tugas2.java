package jobsheet9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ":");
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Harga: ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine();
        }

        double totalBiaya = 0;
        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("=======================");
        System.out.println("Total Biaya: Rp " + totalBiaya);

        input.close();
    }
}

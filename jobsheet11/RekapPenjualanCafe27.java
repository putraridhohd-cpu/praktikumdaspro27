package jobsheet11;
import java.util.Scanner;

public class RekapPenjualanCafe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMenu = {
            "Kopi Hitam",
            "Espresso",
            "Cappuccino",
            "Mie Goreng",
            "Nasi Goreng",
            "Roti Bakar",
            "Teh Manis",
            "Jus Alpukat"
        };

        int[] hargaMenu = {
            10000,
            15000,
            18000,
            12000,
            15000,
            12000,
            8000,
            17000
        };

        System.out.println("===== DAFTAR MENU KAFE =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;

        System.out.println();
        System.out.println("===== RINCIAN PESANAN =====");

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.print("Masukkan nomor menu ke-" + i + ": ");
            int nomorMenu = sc.nextInt();

            System.out.print("Jumlah pesanan menu tersebut: ");
            int qty = sc.nextInt();

            String nama = namaMenu[nomorMenu - 1];
            int harga = hargaMenu[nomorMenu - 1];
            int subtotal = harga * qty;

            System.out.println("Menu   : " + nama);
            System.out.println("Harga  : Rp " + harga);
            System.out.println("Jumlah : " + qty);
            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println();

            totalKeseluruhan += subtotal;
        }

        System.out.println("===== TOTAL AKHIR =====");
        System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
    }
}

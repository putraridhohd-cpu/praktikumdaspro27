package jobsheet11;
import java.util.Scanner;

public class Kafe27 {

    public static void Menu() {
        System.out.println("=== DAFTAR MENU KAFE ===");
        System.out.println("1. Kopi Hitam    - Rp 15000");
        System.out.println("2. Cappuccino    - Rp 20000");
        System.out.println("3. Latte         - Rp 22000");
        System.out.println("4. Teh Manis     - Rp 12000");
        System.out.println("5. Air Mineral   - Rp 10000");
        System.out.println("6. Coklat Panas  - Rp 18000");
        System.out.println("=========================");
    }

    public static int hitungTotalHargaNoPresensi(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalHarga * 0.5;
            System.out.println("Diskon 50%: -Rp " + (int) diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = totalHarga * 0.3;
            System.out.println("Diskon 30%: -Rp " + (int) diskon);
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo invalid (tidak ada diskon).");
        }

        return (int) (totalHarga - diskon);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalSeluruhPesanan = 0;

        Menu();

        System.out.print("Berapa jenis menu yang ingin dipesan? ");
        int jumlahJenis = sc.nextInt();

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Pilih menu (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Jumlah pesanan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (DISKON50/DISKON30/NONE): ");
            String kodePromo = sc.next();

            int totalPerMenu = hitungTotalHargaNoPresensi(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total untuk menu ini: Rp " + totalPerMenu);

            totalSeluruhPesanan += totalPerMenu;
        }

        System.out.println("\n==============================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalSeluruhPesanan);
        System.out.println("==============================");
    }
}

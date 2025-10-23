import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double totalPendapatan = 0;
        final int hargaTiket = 50000; // Harga tetap

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Ketik 0 untuk mengakhiri input.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            // Jika pengguna memasukkan 0 → berhenti
            if (jumlahTiket == 0) {
                break;
            }

            // Jika input tidak valid (negatif)
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                continue;
            }

            // Hitung harga total berdasarkan jumlah tiket
            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            // Tentukan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            // Hitung harga setelah diskon
            totalHarga -= totalHarga * diskon;

            // Tambahkan ke total penjualan harian
            totalPendapatan += totalHarga;
            totalTiket += jumlahTiket;

            // Tampilkan rincian
            System.out.println("Diskon yang diterapkan: " + (diskon * 100) + "%");
            System.out.println("Total harga untuk pelanggan ini: Rp " + (int) totalHarga + "\n");
        }

        // Tampilkan hasil akhir
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + (int) totalPendapatan);

        sc.close();
    }
}
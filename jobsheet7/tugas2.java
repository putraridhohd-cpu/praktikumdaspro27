import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0; // total pendapatan parkir

        System.out.println("=== Program Perhitungan Parkir ===");

        do {
            System.out.print("\nMasukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500; // tarif tetap bila durasi > 5 jam
                } else if (jenis == 1) {
                    total += durasi * 3000; // tarif mobil
                } else if (jenis == 2) {
                    total += durasi * 2000; // tarif motor
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid! Masukkan lagi.");
            }

        } while (jenis != 0); // berhenti jika pengguna memasukkan 0

        System.out.println("\nTotal pendapatan parkir hari ini: Rp " + total);

        sc.close();
    }
}
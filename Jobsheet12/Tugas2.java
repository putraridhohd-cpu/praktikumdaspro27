package Jobsheet12;
import java.util.Scanner;

public class Tugas2 {

    // Fungsi rekursif untuk penjumlahan 1 sampai n
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        return n + penjumlahanRekursif(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        // Menampilkan deret penjumlahan
        for (int i = 1; i <= f; i++) {
            System.out.print(i);
            if (i < f) {
                System.out.print("+");
            }
        }

        int hasil = penjumlahanRekursif(f);
        System.out.println(" = " + hasil);

        sc.close();
    }
}

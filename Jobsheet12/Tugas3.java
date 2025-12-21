package Jobsheet12;
import java.util.Scanner;

public class Tugas3 {
     // Fungsi rekursif Fibonacci
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-: ");
        int bulan = sc.nextInt();

        int jumlahPasangan = fibonacci(bulan);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-"
                + bulan + " adalah: " + jumlahPasangan);

        sc.close();
    }
}

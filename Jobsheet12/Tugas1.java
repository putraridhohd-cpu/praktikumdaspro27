package Jobsheet12;
import java.util.Scanner;

public class Tugas1 {
 // Fungsi rekursif
    static void descendingRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        descendingRekursif(n - 1);
    }

    // Fungsi iteratif
    static void descendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("\nDeret Descending Rekursif:");
        descendingRekursif(n);

        System.out.println("\n\nDeret Descending Iteratif:");
        descendingIteratif(n);

        sc.close();
    }
}

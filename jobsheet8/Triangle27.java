package jobsheet8;
import java.util.Scanner;

public class Triangle27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // pindah baris setelah mencetak bintang
            i++;
        }

        sc.close();
    }
}
package jobsheet11;
import java.util.Scanner;

public class NilaiMahasiswa27 {

    static void isianArray(double[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }
    }

    static void tampilArray(double[] nilai) {
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
    }

    static double hitTot(double[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        double[] nilaiMhs = new double[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        double total = hitTot(nilaiMhs);
        System.out.println("Total nilai seluruh mahasiswa: " + total);
    }
}

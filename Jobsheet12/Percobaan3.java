package Jobsheet12;
import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: ");
        double saldoawal = sc.nextDouble();
        System.out.print("lama nya investasi (tahun) ");
        int tahun = sc.nextInt();
        System.out.print("jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoawal, tahun));
        sc.close();
    }
}

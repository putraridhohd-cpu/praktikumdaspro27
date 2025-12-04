package jobsheet11;
import java.util.Scanner;

public class Kubus27 {

    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        System.out.println("Volume kubus: " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
    }
}

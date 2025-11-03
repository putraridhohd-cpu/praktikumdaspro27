package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        double rataTertinggi = 0;
        String kelompokTertinggi = "";

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            int totalnilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
                int nilai = sc.nextInt();
                totalnilai += nilai;
            }

            double ratanilai = totalnilai / 5.0;
            System.out.printf("Rata-rata nilai kelompok %d: %.2f%n%n", i, ratanilai);

            if (ratanilai > rataTertinggi) {
                rataTertinggi = ratanilai;
                kelompokTertinggi = "Kelompok " + i;
            } else if (ratanilai == rataTertinggi) {
                kelompokTertinggi += " dan Kelompok " + i;
            }

            i++;
        }
        System.out.println("=================================");
        System.out.printf("Kelompok dengan rata-rata tertinggi adalah %s dengan nilai rata-rata %.2f%n",
                          kelompokTertinggi, rataTertinggi);

        sc.close();
    }
}

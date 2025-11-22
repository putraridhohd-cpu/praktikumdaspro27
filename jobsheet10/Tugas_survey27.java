package jobsheet10;
import java.util.Scanner;

public class Tugas_survey27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== INPUT NILAI SURVEI (1 sampe 5) ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden " + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                while (true) {
                    System.out.print("nilai pertanyaan " + (j + 1) + " : ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        survey[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Masukkan nilai 1-5 aja woy");
                    }
                }
            }
        }

        System.out.println("\n===============================");
        System.out.println("RATA-RATA SETIAP RESPONDEN");
        System.out.println("===============================");

        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / jumlahPertanyaan;
            System.out.printf("Responden %d : %.2f\n", (i + 1), rata);
        }

        System.out.println("\n===============================");
        System.out.println("RATA-RATA SETIAP PERTANYAAN");
        System.out.println("===============================");

        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / jumlahResponden;
            System.out.printf("Pertanyaan %d : %.2f\n", (j + 1), rata);
        }

        System.out.println("\n===============================");
        System.out.println("RATA-RATA KESELURUHAN");
        System.out.println("===============================");

        int totalSemua = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("Rata-rata keseluruhan : %.2f\n", rataKeseluruhan);

        sc.close();
    }
}
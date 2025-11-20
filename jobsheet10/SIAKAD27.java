package jobsheet10;
import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan jumlah mahasiwa");
        int jumlahmahasiswa = sc.nextInt();
        System.out.println("masukan jumlah mata kuliah?");
        int jumlahmatkul = sc.nextInt();


        int [][] nilai = new int[jumlahmahasiswa][jumlahmatkul];
       

        for (int i = 0; i < jumlahmahasiswa; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i + 1));
            double totalpersiswa = 0;
            
            for (int j = 0; j < jumlahmatkul; j++) {
                System.out.print("nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalpersiswa / jumlahmatkul));
    }
         System.out.println("\n=====================================");
         System.out.println("Rata rata nilai setiap mata kuliah: ");

         for (int j = 0; j < jumlahmatkul; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < jumlahmahasiswa; i++) {
                totalpermatkul += nilai [i][j];
            
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalpermatkul / 4);

         }
}
}

package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
while (i <= 6) {
    System.out.println("kelompok" + i);
    int totalnilai = 0;
    for (int j = 1; j <= 5; j++) {
        System.out.println("nilai dari kelompok penilai" + j + ": ");
        int nilai = sc.nextInt();
        totalnilai += nilai;
    }
    int ratanilai = totalnilai / 5;
    System.out.println("Rata-rata nilai kelompok " + i + ": " + ratanilai);
    i++;
    
}
sc.close();
}
}

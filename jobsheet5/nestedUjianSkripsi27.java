package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebaskompen = sc.nextLine();
        System.out.println("masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        if (bebaskompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "gagal!, jumlah log bimbingan pembimbing 1 dan pembimbing 2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "gagal!, log bimbingan pembimbing 1 kurang dari 8 kali";
            } else {
                pesan = "gagal!, log bimbingan pembimbing 2 kurang dari 4 kali";
            }
        } else {
            pesan = "gagal!, mahasiswa memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
}
}

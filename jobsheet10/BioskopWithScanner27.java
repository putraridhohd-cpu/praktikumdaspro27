package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.println("masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.println("masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.println("masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak valid!");
                            continue;
                        }
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("pilih kursi lain oy,disini udah ada yang nempatin");
                            continue;
                        }
                        break;
                    }
                    penonton[baris-1][kolom-1] = nama;

                    System.out.println("input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
for (int i = 0; i < penonton.length; i++) {
    for (int j = 0; j < penonton[i].length; j++) {
        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
        System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + isi);
    }
}
System.out.println("=== Akhir dari daftar penonton ===");
                System.out.println("Terima kasih!");
                break;
            }
        }
    }
}

import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaroti = 20000;
        int totalharga;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input.nextInt();
            System.out.print("Jumlah teh: ");
            teh = input.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input.nextInt();
            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total harga yang harus dibayar : Rp " + totalharga);
            input.nextLine(); // Clear the input buffer
        } while (true);
        System.out.println("semua transaksi selesai");
        input.close();
    }
    
}

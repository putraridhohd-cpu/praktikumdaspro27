package jobsheet11;

public class PengunjungCafe27 {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

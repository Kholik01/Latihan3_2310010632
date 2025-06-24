package latihan3susulan;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class BangunDatar
        BangunDatar bangun = new BangunDatar();

        // Mengisi atribut
        bangun.alas = 10;
        bangun.tinggi = 6;
        bangun.jariJari = 7;

        // Menjalankan method menghitung luas segitiga dan menampilkan hasil
        bangun.hitungLuasSegitiga();
        System.out.println("Hasil luas segitiga (via accessor): " + bangun.getHasil());

        // Menjalankan method menghitung luas lingkaran dan menampilkan hasil
        bangun.hitungLuasLingkaran();
        System.out.println("Hasil luas lingkaran (via accessor): " + bangun.getHasil());
    }
}
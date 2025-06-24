package latihan3susulan;

public class BangunDatar {
    // Nama: Abdi Rahman Kholik
    // NPM: 2310010632
    // Kelas: 4A

    // Atribut
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Constructor
    public BangunDatar() {
        alas = 0;
        tinggi = 0;
        jariJari = 0;
        hasil = 0;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }

    // Method untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil);
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran = " + hasil);
    }

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.alas = 6;
        bd.tinggi = 8;
        bd.hitungLuasSegitiga();
        System.out.println("Nilai hasil (akses melalui accessor): " + bd.getHasil());

        bd.jariJari = 10;
        bd.hitungLuasLingkaran();
        System.out.println("Nilai hasil (akses melalui accessor): " + bd.getHasil());
    }
}
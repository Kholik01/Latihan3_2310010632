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
        
        bd.alas = 5;
        bd.tinggi = 4;
        bd.hitungLuasSegitiga();
        
        bd.jariJari = 7;
        bd.hitungLuasLingkaran();
    }
}
//abdi rahman kholik


package Latihan3;

public class RumusBeraksi {

    public static void main(String[] args) {
        // Membuat objek dari class Rumus
        Rumus abdi = new Rumus();

        // Mengatur nilai atribut
        abdi.sisi = 5;
        abdi.panjang = 7;
        abdi.lebar = 4;

        // Menghitung luas persegi
        abdi.luasPersegiAbdi();
        System.out.println("Luas Persegi: " + abdi.getHasilAbdi());

        // Menghitung luas persegi panjang
        abdi.luasPersegiPanjangAbdi();
        System.out.println("Luas Persegi Panjang: " + abdi.getHasilAbdi());
    }
}

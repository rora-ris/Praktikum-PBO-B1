/* File : Garis.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 19 Februari 2025 */

public class Garis {
    /* States/Atribut */
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /* Behavior/Method */

    // Konstruktor
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor
    Titik getTitikAwal(){
        return titikAwal;
    }

    Titik getTitikAkhir(){
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Mendapatkan panjang garis
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mendapatkan gradien garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan titik tengah garis
    Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // Mengecek apakah garis sejajar dengan garis lain
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tegak lurus dengan garis lain
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Titik awal (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik akhir (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis
    void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}
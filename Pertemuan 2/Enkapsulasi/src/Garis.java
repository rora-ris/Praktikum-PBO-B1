/* File : Garis.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class Garis {
    /* States/Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /* Behavior/Method */

    // Konstruktor
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Mendapatkan panjang garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mendapatkan gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // Mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Titik awal (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik akhir (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis
    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}
/* File : Lingkaran.java */
/* NIM : 24060123130065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 18 Maret 2025 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}

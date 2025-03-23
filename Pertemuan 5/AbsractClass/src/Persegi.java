/* File : Persegi.java */
/* NIM : 24060123130065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 18 Maret 2025 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border) {
        // super(4, warna, border);
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Diagonal : " + getDiagonal());
    }
}

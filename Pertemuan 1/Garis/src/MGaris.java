/* File : MGaris.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 19 Februari 2025 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Garis==========");
        // Membuat garis G1
        System.out.println("Garis G1 :");
        Garis G1 = new Garis();
        G1.getTitikAwal().setAbsis(3);
        G1.getTitikAwal().setOrdinat(4);
        G1.getTitikAkhir().setAbsis(5);
        G1.getTitikAkhir().setOrdinat(6);
        G1.printGaris();
        G1.printPersamaanGaris();
        System.out.println("Panjang garis G1 : " + G1.getPanjang());
        System.out.println("Gradien garis G1 : " + G1.getGradien());
        System.out.println("Titik tengah garis G1 : ");
        G1.getTitikTengah().printTitik();

        // Membuat garis G2
        System.out.println("Garis G2 :");
        Garis G2 = new Garis(new Titik(-2,0), new Titik(0,4));
        G2.printGaris();
        G2.printPersamaanGaris();
        System.out.println("Panjang garis G2 : " + G2.getPanjang());
        System.out.println("Gradien garis G2 : " + G2.getGradien());
        System.out.println("Titik tengah garis G2 : ");
        G2.getTitikTengah().printTitik();

        // Pengecekan Garis G1 dan G2
        System.out.println("Garis G1 sejajar dengan garis G2 : " + G1.isSejajar(G2));
        System.out.println("Garis G1 tegak lurus dengan garis G2 : " + G1.isTegakLurus(G2));

        // Static method
        System.out.println("Jumlah objek garis : " + Garis.getCounterGaris());
    }
}

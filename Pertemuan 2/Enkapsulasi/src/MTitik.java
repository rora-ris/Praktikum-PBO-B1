/* File : MTitik.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1 :");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        // Membuat titik T2
        System.out.println("Titik T2 :");
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(4);
        T1.setOrdinat(3);
        T2.printTitik();

        // Membuat titik T3
        System.out.println("Titik T3 :");
        Titik T3 = new Titik(5, 3);
        T3.printTitik();

        // getKuadran
        System.out.println("Kuadran T1: " + T1.getKuadran() + " dengan titik");
        T1.printTitik();

        // getJarakPusat
        System.out.println("Jarak T1 ke pusat(0,0): " + T1.getJarakPusat());

        // getJarak
        System.out.println("Jarak T1 ke T3: " + T1.getJarak(T3));

        // refleksiX
        System.out.println("Titik T1 sebelum direfleksi terhadap sumbu x: ");
        T1.printTitik();
        T1.refleksiX();
        System.out.println("Titik T1 setelah direfleksi terhadap sumbu x: ");
        T1.printTitik();

        // refleksiY
        System.out.println("Titik T3 sebelum direfleksi terhadap sumbu y: ");
        T3.printTitik();
        T3.refleksiY();
        System.out.println("Titik T3 setelah direfleksi terhadap sumbu y: ");
        T3.printTitik();

        // getRefleksiX
        System.out.println("Titik hasil refleksi T1 terhadap sumbu x (T4): ");
        Titik T4 = T1.getRefleksiX();
        T4.printTitik();

        // getRefleksiY
        System.out.println("Titik hasil refleksi T3 terhadap sumbu y (T5): ");
        Titik T5 = T3.getRefleksiY();
        T5.printTitik();

        // print counterTitik
        System.out.println("Jumlah titik yang telah dibuat: " + Titik.getCounterTitik()); // 2 karena T1 dan T3, sedangkan T2 hanya referensi dari T1
    }
}
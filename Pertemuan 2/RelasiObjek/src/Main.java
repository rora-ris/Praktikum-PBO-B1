/* File : Mahasiswa.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class Main {
    public static void main(String[] args){
        System.out.println("==========Membuat Objek Mahasiswa==========");
        // Mata Kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        // Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika", null, null, null);

        // Dosen
        Dosen D1 = new Dosen("123", "Andi" , "Informatika");

        // Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");

        // Mutator
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // Method lain
        System.out.println("Mahasiswa 1 :");
        M1.printMhs();
        System.out.println("Jumlah Mata Kuliah : " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah : " + M1.getJumlahSKS());
        System.out.println("===Data Mahasiswa===");
        M1.printDetailMhs();
    }
}

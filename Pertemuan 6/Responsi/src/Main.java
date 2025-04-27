public class Main {
    public static void main(String[] args) throws Exception {
        // Class
        Mahasiswa m1 = new Mahasiswa("Budi", "Budi@gmail.com", "12345678", 3, new Fakultas("Sains", 5000000.0, 5000000.0, new CivitasAkademika()));
        Dosen d1 = new Dosen("Dr. Hasan", "Hasan@gmail.com", "3716976197", 7, new Fakultas("Teknik", 7000000.0, 5000000.0, new CivitasAkademika()));
        TenagaKependidikan tn1 = new TenagaKependidikan("Janida", "Janida@gmail.com", "253915391", 1);
        Fakultas f1 = new Fakultas("Teknik", 7000000.0, 5000000.0, new CivitasAkademika());
        Universitas u1 = new Universitas("Diponegoro", f1);

        // Info
        System.out.println("\t UNIVERSITAS \t");
        u1.printInfo();
        System.out.println("\t FAKULTAS \t");
        f1.printInfo();
        System.out.println("\t MAHASISWA \t");
        m1.printInfo();
        System.out.println("\t DOSEN \t");
        d1.printInfo();
        System.out.println("\t TENDIK \t");
        tn1.printInfo();
        System.err.println("\n");

        // Counter
        System.out.println("Jumlah Universitas: " + Universitas.getCounterUniversitas());
        System.out.println("Jumlah Fakultas: " + Fakultas.getCounterFakultas());
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMahasiswa());
        System.out.println("Jumlah Dosen: " + Dosen.getCounterDosen());
        System.out.println("Jumlah Tenaga Kependidikan: " + TenagaKependidikan.getCounterTenagaKependidikan());
    }
}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("12345", "Dr. Budi Setyawan", LocalDate.of(1970, 5, 10), LocalDate.of(2000, 8, 1), 5000000, "Sains dan Matematika", "0011223344");
        DosenTamu dosenTamu = new DosenTamu("67890", "Prof. Ani Irawanti", LocalDate.of(1980, 3, 15), LocalDate.of(2010, 2, 1), 6000000, "Ekonomi dan Bisnis", "5566778899", LocalDate.of(2025, 12, 31));
        Tendik tendik = new Tendik("54321", "Aranda Wibawa", LocalDate.of(1975, 7, 20), LocalDate.of(2005, 1, 1), 4000000, "Akademik");

        System.out.println("------------------------------");
        System.out.println("Dosen Tetap");
        System.out.println("------------------------------");
        dosenTetap.printInfo();
        System.out.println("------------------------------");
        System.out.println("Dosen Tamu");
        System.out.println("------------------------------");
        dosenTamu.printInfo();
        System.out.println("------------------------------");
        System.out.println("Tenaga Kependidikan");
        System.out.println("------------------------------");
        tendik.printInfo();
        System.out.println("------------------------------");
    }
}

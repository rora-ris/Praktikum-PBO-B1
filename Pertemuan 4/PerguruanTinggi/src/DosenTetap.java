import java.time.LocalDate;

public class DosenTetap extends Dosen {
    // atribut
    private String nidn;
    private static final int BUP = 65;

    // method
    public DosenTetap(){
        super();
        this.nidn = "";
    }
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtBekerja, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidn = nidn;
    }
 
    public String getNidn() {
        return nidn;
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("BUP : " + hitungBUP().getDayOfMonth() + " " + hitungBUP().getMonth() + " " + hitungBUP().getYear());
        System.out.println("NIDN: " + nidn);
        System.out.println("Tunjangan : 2%  x " + hitungMasaKerja().getYears() + " x Rp." + getGajiPokok() + " = Rp." + hitungTunjangan());
    }
}

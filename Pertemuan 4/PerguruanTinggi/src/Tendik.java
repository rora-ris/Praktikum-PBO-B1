import java.time.LocalDate;

public class Tendik extends Pegawai {
    // atribut
    private String bidang;
    private static final int BUP = 55;

    // method
    public Tendik(){
        super();
        this.bidang = "";
    }
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtBekerja, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("BUP : " + hitungBUP().getDayOfMonth() + " " + hitungBUP().getMonth() + " " + hitungBUP().getYear());
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan : 1%  x " + hitungMasaKerja().getYears() + " x Rp." + getGajiPokok() + " = Rp." + hitungTunjangan());
    }
}

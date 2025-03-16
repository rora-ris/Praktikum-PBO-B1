import java.time.LocalDate;

public class DosenTamu extends Dosen {
    // atribut
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    // method
    public DosenTamu(){
        super();
        this.nidk = "";
        this.tanggalBerakhirKontrak = LocalDate.now();
    }
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtBekerja, double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("NIDK: " + nidk);
        System.out.println("Tanggal Berakhir Kontrak: " + tanggalBerakhirKontrak.getDayOfMonth() + " " + tanggalBerakhirKontrak.getMonth() + " " + tanggalBerakhirKontrak.getYear());
        System.out.println("Tunjangan : 2,5%  x Rp." + getGajiPokok() + " = Rp." + hitungTunjangan());
    }
}

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    // atribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmtBekerja;
    protected double gajiPokok;

    // method
    public Pegawai(){
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.tmtBekerja = LocalDate.now();
        this.gajiPokok = 0.0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtBekerja, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmtBekerja = tmtBekerja;
        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmtBekerja() {
        return tmtBekerja;
    }

    public void setTmtBekerja(LocalDate tmtBekerja) {
        this.tmtBekerja = tmtBekerja;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmtBekerja, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.getDayOfMonth() + " " + tanggalLahir.getMonth() + " " + tanggalLahir.getYear());
        System.out.println("TMT Bekerja: " + tmtBekerja.getDayOfMonth() + " " + tmtBekerja.getMonth() + " " + tmtBekerja.getYear());
        System.out.println("Masa Kerja: " + hitungMasaKerja().getYears() + " Tahun " + hitungMasaKerja().getMonths() + " Bulan");
        System.out.println("Gaji Pokok: Rp." + gajiPokok);
    }
}

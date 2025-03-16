import java.time.LocalDate;

public class Dosen extends Pegawai {
    // atribut
    protected String fakultas;

    // method
    public Dosen(){
        super();
        this.fakultas = "";
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtBekerja, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }
}

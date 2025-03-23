import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    // atribut
    private String nip;
    private static int counterPNS;

    // method
    PNS(){
        super();
        this.nip = "";
        counterPNS++;
    }

    PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("Pajak: %.1f%n", hitungPajak());
        System.out.println("NIP: " + nip);
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 5;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * getPendapatan();
    }
}

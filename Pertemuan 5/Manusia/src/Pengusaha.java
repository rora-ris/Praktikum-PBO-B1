import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    // atribut
    private String npwp;
    private static int counterPengusaha;

    // method
    public Pengusaha(){
        super();
        this.npwp = "";
        counterMns++;
    }

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public static void setCounterPengusaha(int counterPengusaha) {
        Pengusaha.counterPengusaha = counterPengusaha;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("Pajak: %.1f%n", hitungPajak());
        System.out.println("NPWP: " + npwp);
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 6;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }
}

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    // atribut
    private String asalKota;
    private static int counterPetani;

    // method
    public Petani(){
        super();
        this.asalKota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("Pajak: %.1f%n", hitungPajak());
        System.out.println("Kota: " + asalKota);
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0.0;
    }
}

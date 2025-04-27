public class TenagaKependidikan extends Karyawan{
    // atribut
    private final double gajiPokok = 4000000.0;
    private static int couterTenagaKependidikan;

    // method
    public TenagaKependidikan(){
        super();
        couterTenagaKependidikan++;
    }

    public TenagaKependidikan(String nama, String email, String nip, int masaKerja){
        super(nama, email, nip, masaKerja);
        couterTenagaKependidikan++;
    }

    public double hitungGaji(){
        return gajiPokok + (getMasaKerja()* 0.1 *gajiPokok);
    }

    public static int getCounterTenagaKependidikan(){
        return couterTenagaKependidikan;
    }

    public void printInfo(){
        super.printInfo();
    }
}

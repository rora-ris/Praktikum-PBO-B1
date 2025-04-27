public abstract class Karyawan extends CivitasAkademika{
    // atribut
    protected String nip;
    protected int masaKerja;
    private static int counterKaryawan;

    // method
    public Karyawan(){
        super();
        this.nip = "";
        this.masaKerja = 0;
        counterKaryawan++;
    }

    public Karyawan(String nama, String email, String nip, int masaKerja){
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        counterKaryawan++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    public static int getCounterKaryawan() {
        return counterKaryawan;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + masaKerja + " Tahun");
        System.out.println("Gaji: " + hitungGaji());
    }
}

import java.time.LocalDate;

public abstract class Manusia {
    // atribut
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    // method
    Manusia(){
        this.nama = "";
        this.tglMulaiKerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.printf("Pendapatan: %.1f%n", pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }

    public abstract int hitungMasaKerja();
}

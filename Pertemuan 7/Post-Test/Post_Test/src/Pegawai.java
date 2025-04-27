public class Pegawai {
    // atribut
    private String nama;
    private int gajiPokok = 5000000;

    // method
    public Pegawai(){
        this.nama = " ";
    }
    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gajiPokok;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}

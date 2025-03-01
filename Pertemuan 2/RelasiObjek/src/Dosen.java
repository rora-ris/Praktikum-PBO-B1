/* File : Dosen.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class Dosen {
     /* States/Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /* Behavior/Method */

    // Konstruktor
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Menampilkan detail Dosen
    public void printDosen(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}

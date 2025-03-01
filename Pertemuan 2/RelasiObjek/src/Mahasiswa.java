/* File : Mahasiswa.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

import java.util.ArrayList;

public class Mahasiswa {
    /* States/Atribut */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
 
     /* Behavior/Method */
    
     // Konstruktor
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        this.listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi,MataKuliah newMataKuliah, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.listMatKul.add(newMataKuliah);
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        listMatKul = new ArrayList<>();

    }
   
     // Selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getMatKul(){
        return listMatKul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

     // Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setMatKul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Menambahkan Mata Kuliah
    public void addMatKul(MataKuliah newMataKuliah){
        listMatKul.add(newMataKuliah);
    }

    // Mengembalikan jumlah SKS Mahasiswa
    public int getJumlahSKS(){
        int jumlahSKS = 0;
        for(MataKuliah matKul : listMatKul){
            jumlahSKS += matKul.getSks();
        }
        return jumlahSKS;
    }

    // Mengembalikan Jumlah Mata Kuliah yang diambil Mahasiswa
    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    // Menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // Menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mata Kuliah : ");
        for (int i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen wali : ");
        dosenWali.printDosen();
        System.out.println("Kendaraan : ");
        kendaraan.printKendaraan();
    }
}

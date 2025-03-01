/* File : MataKuliah.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class MataKuliah {
     /* States/Atribut */
    private String idMatKul;
    private String nama;
    private int sks;
 
     /* Behavior/Method */
 
     // Konstruktor
    public MataKuliah(){
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }
 
     // Selektor
    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }
     // Mutator
     public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}

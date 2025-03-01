/* File : Kendaraan.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class Kendaraan {
     /* States/Atribut */
    private String noPlat;
    private String jenis;
 
     /* Behavior/Method */
 
     // Konstruktor
    Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    Kendaraan(String noPlat, String jenis){
       this.noPlat = noPlat;
       this.jenis = jenis;
    }
    
     // Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

     // Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    // menampilkan detail kedaraan
    public void printKendaraan(){
        System.out.println("Nomor Kendaraan : " + noPlat);
        System.out.println("Jenis Kendaraan : " + jenis);
    }
}

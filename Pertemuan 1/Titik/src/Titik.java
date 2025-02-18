/* File : Titik.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 18 Februari 2025 */

public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    Titik() {
        this(0,0);
        counterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mendapatkan kuadran 
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Menghitung jarak titik ke titik origin
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }    
    
    // Menghitung jarak titik ke titik lain
    double getJarak(Titik T){
        return Math.sqrt((absis-T.absis)*(absis-T.absis) + (ordinat-T.ordinat)*(ordinat-T.ordinat));
    }

    // Refleksi terhadap sumbu x
    void refleksiX(){
        ordinat = -1*ordinat;
    }

    // Refleksi terhadap sumbu Y
    void refleksiY(){
        absis = -1*absis;
    }

    // Mendapatkan titik hasil refleksi terhadap sumbu x
    Titik getRefleksiX(){
        return new Titik(absis, -1*ordinat);
    }

    // Mendapatkan titik hasil refleksi terhadap sumbu y
    Titik getRefleksiY(){
        return  new Titik(-1*absis, ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
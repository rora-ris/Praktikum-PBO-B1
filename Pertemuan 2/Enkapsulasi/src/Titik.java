/* File : Titik.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 25 Februari 2025 */

public class Titik {
    /* States/Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    public Titik() {
        this(0,0);
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // Mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mendapatkan kuadran 
    public int getKuadran() {
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
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }    
    
    // Menghitung jarak titik ke titik lain
    public double getJarak(Titik T){
        return Math.sqrt((absis-T.absis)*(absis-T.absis) + (ordinat-T.ordinat)*(ordinat-T.ordinat));
    }

    // Refleksi terhadap sumbu x
    public void refleksiX(){
        ordinat = -1*ordinat;
    }

    // Refleksi terhadap sumbu Y
    public void refleksiY(){
        absis = -1*absis;
    }

    // Mendapatkan titik hasil refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        return new Titik(absis, -1*ordinat);
    }

    // Mendapatkan titik hasil refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        return  new Titik(-1*absis, ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
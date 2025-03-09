/* File : Asersi2.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 4 Maret 2025 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!!";
        Lingkaran ling = new Lingkaran(jariJari);
        double kelilingLingkarang = ling.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + kelilingLingkarang);
    }
}

// Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
// Jawaban : Jika jariJari bernilai 0, program tetap akan membuat objek Lingkaran dan menghitung kelilingnya, meskipun hasilnya tidak valid (keliling akan bernilai 0). Ini tidak sesuai dengan tujuan program, yaitu menolak input yang tidak valid. Seharusnya program memberikan pesan kesalahan jika jariJari bernilai 0. 
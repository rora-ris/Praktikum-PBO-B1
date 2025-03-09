/* File : AngkaSial.java */
/* NIM : 240601231310065 */
/* Nama : Erzachel Senna Rizky Farezi */
/* Tanggal : 4 Maret 2025 */

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");

        }
    }
}

// Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// Jawab : Tidak, baris 12 tidak akan dieksekusi ketika eksepsi terjadi. Baris 12 akan dilewati dan program akan melanjutkan eksekusi ke blok catch.

// Pertanyaan : Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawab : Ya, baris 21 akan dieksekusi ketika eksepsi terjadi. Baris 21 akan mencetak pesan kesalahan yang dihasilkan oleh eksepsi.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Medium;

/**
 *
 * @author LENOVO YOGA
 */
public class KontrolSenjata{
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()) {
            for(int i = 0; i < jumlah; i++) {
               if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi()); // Cetak suara senjata
                    senjata.setPeluru(senjata.getPeluru()-1); // Kurangi peluru sebanyak 1
                } else {
                    System.out.println("Gagal tembak, Peluru habis!");
                } 
            }
            System.out.println(">> Peluru sisa : " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
        
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Berhasil pasang Bayonet");
    }
}

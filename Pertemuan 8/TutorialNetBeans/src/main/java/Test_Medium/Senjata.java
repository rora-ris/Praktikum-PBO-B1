/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Medium;

/**
 *
 * @author LENOVO YOGA
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0; // Inisialisasi peluru ke 0
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() { // Ubah dari private ke public
        return peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
        
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) { // Ubah dari private ke public
        this.peluru = peluru;
    }

}

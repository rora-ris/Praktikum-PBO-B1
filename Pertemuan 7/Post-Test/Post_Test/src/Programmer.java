public class Programmer extends Pegawai {
    // atribut
    private int bonus = 450000;

    // method
    public Programmer() {
        super();
    }
    public Programmer(String nama) {
        super(nama);
    }

    public int getBonus(){
        return bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

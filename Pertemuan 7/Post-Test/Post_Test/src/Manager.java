public class Manager extends Pegawai{
    // atribut
    private int tunjangan = 700000;

    // method
    public Manager() {
        super();
    }

    public Manager(String nama) {
        super(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}

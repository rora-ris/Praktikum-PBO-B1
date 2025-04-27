public class Dosen extends Karyawan{
    // atribut
    private Fakultas fakultas;
    private static int counterDosen;

    // method
    public Dosen(){
        super();
        this.fakultas = new Fakultas();
        counterDosen++;
    }

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas){
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungGaji(){
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.1 * fakultas.getGajiPokok());
    }
    public static int getCounterDosen() {
        return counterDosen;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
    }
}

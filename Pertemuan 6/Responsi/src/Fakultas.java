import java.util.ArrayList;

public class Fakultas {
    // atribut
    private String nama;
    private double tarifUkt;
    private double gajiPokok;
    private ArrayList<CivitasAkademika> listCivitasAkademika;
    private static int counterFakultas;
    
    // method
    public Fakultas(){
        this.nama = "";
        this.tarifUkt = 0.0;
        this.gajiPokok = 0.0;
        this.listCivitasAkademika = new ArrayList<>();
        counterFakultas++;
    }

    public Fakultas(String nama, double tarifUkt, double gajiPokok, CivitasAkademika newCivitasAkademika){
        this.nama = nama;
        this.tarifUkt = tarifUkt;
        this.gajiPokok = gajiPokok;
        this.listCivitasAkademika = new ArrayList<>();
        this.listCivitasAkademika.add(newCivitasAkademika);
        counterFakultas++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUkt() {
        return tarifUkt;
    }

    public void setTarifUkt(double tarifUkt) {
        this.tarifUkt = tarifUkt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public ArrayList<CivitasAkademika> getListCivitasAkademika() {
        return listCivitasAkademika;
    }

    public void setListCivitasAkademika(ArrayList<CivitasAkademika> listCivitasAkademika) {
        this.listCivitasAkademika = listCivitasAkademika;
    }
    
    public void tambahCivitasAkademika(CivitasAkademika newCivitasAkademika){
        listCivitasAkademika.add(newCivitasAkademika);
    }

    public static int getCounterFakultas() {
        return counterFakultas;
    }

    public static void setCounterFakultas(int counterFakultas) {
        Fakultas.counterFakultas = counterFakultas;
    }

    public void printInfo(){
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Tarif UKT: " + tarifUkt);
        System.out.println("Gaji pokok: " + gajiPokok);
        for (int i = 0; i < listCivitasAkademika.size(); i++){
            System.out.println(listCivitasAkademika.get(i).getNama());
        }
    }
}

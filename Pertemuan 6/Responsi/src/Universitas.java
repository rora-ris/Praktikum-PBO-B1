import java.util.ArrayList;

public class Universitas {
    // atribut
    private String nama;
    private ArrayList<Fakultas> listFakultas;
    private static int counterUniversitas;

    // method
    public Universitas(){
        this.nama = "";
        this.listFakultas = new ArrayList<>();
        counterUniversitas++;
    }

    public Universitas(String nama, Fakultas newFakultas){
        this.nama = "";
        this.listFakultas = new ArrayList<>();
        this.listFakultas.add(newFakultas);
        counterUniversitas++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Fakultas> getListFakultas() {
        return listFakultas;
    }

    public void setListFakultas(ArrayList<Fakultas> listFakultas) {
        this.listFakultas = listFakultas;
    }

    public void tambahFakultas(Fakultas newFakultas){
        listFakultas.add(newFakultas);
    }

    public static int getCounterUniversitas() {
        return counterUniversitas;
    }

    public void printInfo(){
        System.out.println("Nama Universitas: " + nama);
        for (int i = 0; i < listFakultas.size(); i++){
            System.out.println(listFakultas.get(i).getNama());
        }
    }
}

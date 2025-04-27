import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // membuat objek anabul
        Anabul anabul1 = new Kucing("Mimi");
        Anabul anabul2 = new Anjing("Stella");
        Anabul anabul3 = new Burung("Chirpy");

        // membuat array
        ArrayList<Anabul> anabuls = new ArrayList<Anabul>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        // print data
        for(Anabul anabul : anabuls){
            System.out.println("===================================");
            System.out.println(anabul.getNama());
            System.out.println(anabul.getClass().getSimpleName());
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println("===================================");
        }
    }
}

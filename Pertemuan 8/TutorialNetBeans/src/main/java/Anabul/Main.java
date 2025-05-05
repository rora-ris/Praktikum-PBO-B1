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
        
        System.out.println("===================================");        
        System.out.println("Generik");
        System.out.println("==================================="); 
        // Generik
        Datum<Anabul> dtAnabul = new Datum<>();
        ContohMetodeGenerik data = new ContohMetodeGenerik();
        
        System.out.println("==================================="); 
        dtAnabul.setIsi(anabul1);
        data.metode(dtAnabul).Bersuara();
        data.metode(dtAnabul).Gerak();
        System.out.println("==================================="); 
        
        System.out.println("==================================="); 
        dtAnabul.setIsi(anabul2);
        data.metode(dtAnabul).Bersuara();
        data.metode(dtAnabul).Gerak();
        System.out.println("==================================="); 
        
        System.out.println("==================================="); 
        dtAnabul.setIsi(anabul3);
        data.metode(dtAnabul).Bersuara();
        data.metode(dtAnabul).Gerak();
        System.out.println("==================================="); 
    }
}

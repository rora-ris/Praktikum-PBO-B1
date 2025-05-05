public class Burung extends Anabul{
    // atribut

    // method
    public Burung(){
        super();
    }

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("Cuit");
    }
}
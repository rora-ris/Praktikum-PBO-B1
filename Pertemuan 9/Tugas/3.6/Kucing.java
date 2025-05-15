public class Kucing extends Anabul{
    // atribut

    // method
    public Kucing(){
        super();
    }

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Meong");
    }
}
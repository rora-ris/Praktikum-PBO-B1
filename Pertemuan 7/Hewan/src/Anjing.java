public class Anjing extends Anabul{
    // atribut

    // method
    public Anjing(){
        super();
    }

    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Guk-guk");
    }
}

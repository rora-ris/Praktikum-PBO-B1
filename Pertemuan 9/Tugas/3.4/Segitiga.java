public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling(){
        return alas + 2*(Math.sqrt((alas/2)*(alas/2) + tinggi*tinggi));
    }

    @Override 
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
}

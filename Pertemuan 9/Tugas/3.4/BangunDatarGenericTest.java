public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> ling = new BangunDatarGeneric<Lingkaran>();
        
        ling.set(l);
        System.out.println("=========================");
        System.out.println("tipe generic : " + ling.get().getClass().getName());
        System.out.println("keliling lingkaran : " + ling.hitungKeliling());
        System.out.println("luas lingkaran : " + ling.hitungLuas());
        System.out.println("=========================");
        
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> pers = new BangunDatarGeneric<Persegi>();

        pers.set(p);
        System.out.println("=========================");
        System.out.println("tipe generic : " + pers.get().getClass().getName());
        System.out.println("keliling persegi : " + pers.hitungKeliling());
        System.out.println("luas persegi : " + pers.hitungLuas());
        System.out.println("=========================");

        PersegiPanjang pj = new PersegiPanjang(4,5);
        BangunDatarGeneric<PersegiPanjang> pjg = new BangunDatarGeneric<PersegiPanjang>();

        pjg.set(pj);
        System.out.println("=========================");
        System.out.println("tipe generic : " + pjg.get().getClass().getName());
        System.out.println("keliling persegi panjang : " + pjg.hitungKeliling());
        System.out.println("luas persegi panjang : " + pjg.hitungLuas());
        System.out.println("=========================");

        Segitiga s = new Segitiga(3, 4);
        BangunDatarGeneric<Segitiga> sgt = new BangunDatarGeneric<Segitiga>();

        sgt.set(s);
        System.out.println("=========================");
        System.out.println("tipe generic : " + sgt.get().getClass().getName());
        System.out.println("keliling persegi : " + sgt.hitungKeliling());
        System.out.println("luas persegi : " + sgt.hitungLuas());
        System.out.println("=========================");

    }
}
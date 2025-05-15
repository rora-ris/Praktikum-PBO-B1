public class Main {
    public static void main(String[] args) {
        // Test the Koleksi class
        Koleksi koleksi = new Koleksi(10);
        koleksi.add("A");
        koleksi.add("B");
        koleksi.add("C");
        koleksi.add("D");
        koleksi.add("E");
        koleksi.add("F");
        koleksi.add("G");
        koleksi.add("H");
        koleksi.add("I");
        koleksi.add("J");
        koleksi.showAll();
        
        System.out.println("Hapus index 1");
        System.out.println("Hapus : " + koleksi.delete(1));
        koleksi.showAll();
        
        System.out.println("Update index 0 dengan X");
        koleksi.setIsi(0, "X");
        koleksi.showAll();
        
        System.out.println("Isi index 0 : " + koleksi.getIsi(0));
    }
}

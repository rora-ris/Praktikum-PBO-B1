public class CivitasAkademika {
    // atribut
    protected String nama;
    protected String email;
    private static int counterCivitasAkademika;

    // method
    public CivitasAkademika(){
        this.nama = "";
        this.email = "";
        counterCivitasAkademika++;
    }

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
        counterCivitasAkademika++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounterCivitasAkademika() {
        return counterCivitasAkademika;
    }

    public  void printInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}

public class Mahasiswa extends CivitasAkademika{
    // atribut
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa;

    // method
    public Mahasiswa(){
        super();
        this.nim = "";
        this.semester = 0;
        this.fakultas = new Fakultas();
        counterMahasiswa++;
    }

    public Mahasiswa(String nama,String email, String nim, int semester, Fakultas fakultas){
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUkt(){
        return fakultas.getTarifUkt() * (1-(0.5*semester));
    }

    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
    }
}

package ch02;
public class ObjectFakultas {
    public static void main(String[] args) {
        Fakultas x = new Fakultas();
        Fakultas y = new Fakultas();

        x.nama = "Sains dan Teknologi";
        x.jumlahMahasiswa = 4300;

        y.nama = "Dakwah dan Komunikasi";
        y.jumlahMahasiswa = 2002;

        System.out.println("Fakultas " + x.getNama() + " : " + x.getJumlahMahasiswa());
        System.out.println("Fakultas " + y.getNama() + " : " + y.getJumlahMahasiswa());
    }
}

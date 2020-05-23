package ch02;
import java.util.Date;
public class ObjectObat {
    public static void main(String[] args) {
        Obat x1 = new Obat();
        x1.barcode = "123456789";
        x1.nama = "Panadol";
        x1.tanggalKadaluarsa = new Date (2019,12,02);
        x1.harga = 1000;

        Obat x2 = new Obat();
        x2.barcode = "987654321";
        x2.nama = "Procold";
        x2.tanggalKadaluarsa = new Date (2020,01,10);
        x2.harga = 2500;

        System.out.println(x1.nama + " (" + x1.barcode + " ) " );
        System.out.println("Harga : Rp " + x1.harga);
        System.out.println("Exp : " + x1.tanggalKadaluarsa.toString());

        System.out.println("====================");

        System.out.println(x2.nama + " (" + x2.barcode + " ) " );
        System.out.println("Harga : Rp " + x2.harga);
        System.out.println("Exp : " + x2.tanggalKadaluarsa.toString());

    }
}

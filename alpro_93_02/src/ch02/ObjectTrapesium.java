package ch02;
public class ObjectTrapesium {
    public static void main(String[] args) {
        Trapesium trapesium = new Trapesium();
        trapesium.alasBawah =4;
        trapesium.alasAtas =3;
        trapesium.tinggi =2;
        System.out.println("Luas = " + trapesium.luas());
    }
}

import java.util.Scanner;
package ch03;
public class MenentukanBilanganPembagiTerkecilSelain1dan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan :");
        int bil = input.nextInt();

        if (bil > 0 && bil <= 4 ) {
            System.out.println("Pembagi terkecil dari " + bil + "adalah" + bil);
        }else{
            for (int i = 3; i <= bil; i ++){
                if (bil %i == 0){
                    System.out.println(" Pembagi terkecil dari  " + bil + " adalah");
                            break;
                }
            }
        }
        }



    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int Yıl = girdi.nextInt();


        if (Yıl % 100 == 0) {

            if (Yıl % 400 != 0) {
                System.out.println(Yıl + " Artık yıl değildir.");
            } else {
                System.out.println(Yıl + " Artık yıldır.");
            }
        } else {
            if (Yıl % 4 == 0) {
                System.out.println(Yıl + " Artık yıldır.");
            }
            else {
                System.out.println(Yıl + " Artık yıldır.");
            }
        }
    }
}

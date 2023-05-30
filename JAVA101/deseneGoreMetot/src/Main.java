import java.util.Scanner;

public class Main {

    static void DeseneGoreMetot() {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz.");
        int sayi = input.nextInt();
        int sonDeger = 0;


        for (int i = sayi; i > -5; i = i - 5) {

            System.out.print(i + " ");
            sonDeger = i;
        }

        for (int j = sonDeger + 5; j <= sayi; j = j + 5) {
            System.out.print(j + " ");
        }



    }


    public static void main(String[] args) {

        DeseneGoreMetot();
    }
}
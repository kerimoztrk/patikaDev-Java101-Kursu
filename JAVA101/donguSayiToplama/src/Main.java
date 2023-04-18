import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int toplam = 0;

        int sayi;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Sayi giriniz.");
            sayi = input.nextInt();

            if (sayi%4==0){
                toplam = toplam + sayi;

            } else if (sayi%2!=0) {
                break;
            }


        }
        while (sayi%2==0);

        System.out.println("Girilen 4 ün katları toplam değer =  "+toplam);




    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int ilkSayi=input.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int ikinciSayi=input.nextInt();
        int sayac=1;
        int ebob=0;

        if (ilkSayi<ikinciSayi){

            while (sayac<=ilkSayi){

                if (ilkSayi%sayac==0 && ikinciSayi%sayac==0){

                    ebob=sayac;

                }
                sayac++;
            }
            System.out.println("girilen sayıların ebob değeri =  "+ebob);


        }
        else {

            while (sayac<=ikinciSayi){

                if (ilkSayi%sayac==0 && ikinciSayi%sayac==0){

                    ebob=sayac;

                }
                sayac++;
            }
            System.out.println("girilen sayıların ebob değeri =  "+ebob);


        }

        int ekok = ilkSayi*ikinciSayi/ebob;
        System.out.println("girilen sayıların ekok değeri = "+ekok);






    }
}
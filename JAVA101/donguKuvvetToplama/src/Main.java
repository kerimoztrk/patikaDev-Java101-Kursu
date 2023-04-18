import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Girilen sayıya kadar kuvvet yazdıralacak sayiyi giriniz");
        Scanner input =new Scanner(System.in);

        int sayi=input.nextInt();
        int j=0;
        for (int i= 1; i<=sayi;i*=4){

            System.out.println("4'ün " +j+".katı= "+i);
            j=j+1;
        }
        int k=0;
        for (int i= 1; i<=sayi;i*=5){

            System.out.println("5'ün " +k+".katı= "+i);
            k=k+1;
        }
    }
}
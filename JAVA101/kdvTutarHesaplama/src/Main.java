import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner paraDegeri= new Scanner(System.in);
        System.out.println(" Hesaplanacak Para Değerini Giriniz.");
        double para= paraDegeri.nextDouble();

        System.out.println("Kdv'siz Para Miktarı: "+para);
        Hesapla hesap=new Hesapla();
        hesap.kdvHesapla(para);
        hesap.kdvOran(para);



    }
    }


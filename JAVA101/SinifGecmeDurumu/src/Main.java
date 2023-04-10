import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Matematik Dersinde Aldığınız Notu Giriniz.");
        Scanner input=new Scanner(System.in);
        int mat=input.nextInt();
        System.out.println("Fizik Dersinde Aldığınız Notu Giriniz.");
        int fiz=input.nextInt();
        System.out.println("Türkçe Dersinde Aldığınız Notu Giriniz.");
        int TR=input.nextInt();
        System.out.println("Kimya Dersinde Aldığınız Notu Giriniz.");
        int kim=input.nextInt();
        System.out.println("Muzik Dersinde Aldığınız Notu Giriniz.");
        int muz=input.nextInt();

        int ToplamNot=(mat+kim+fiz+TR+muz)/5;

        Hesaplama hesap =new Hesaplama();
        hesap.gecmeDurumu(ToplamNot);
    }
}
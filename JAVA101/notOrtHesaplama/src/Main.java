import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Matematik notunu giriniz");
        Matematik= girdi.nextInt();

        System.out.println("Fizik notunu giriniz");
        Fizik=girdi.nextInt();

        System.out.println("Kimya notunu giriniz");
        Kimya= girdi.nextInt();

        System.out.println("Türkçe notunu giriniz");
        Turkce= girdi.nextInt();

        System.out.println("Tarih notunu giriniz");
        Tarih=girdi.nextInt();

        System.out.println("Müzik notunu giriniz");
        Muzik=girdi.nextInt();


        float sonuc= ((Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6);
        System.out.println(sonuc);

        String gecmeKalma = ((sonuc>=60)?"geçti":"Kaldı");
        System.out.println(gecmeKalma);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manava Hoşgeldiniz...");

        System.out.println("Kaç kilo armut aldınız ?");
        Scanner input=new Scanner(System.in);
        double armut=input.nextDouble();
        System.out.println("Kaç kilo elma aldınız ?");
        double elma=input.nextDouble();
        System.out.println("Kaç kilo domates aldınız ?");
        double domates=input.nextDouble();
        System.out.println("Kaç kilo muz aldınız ?");
        double muz=input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız ?");
        double patlıcan=input.nextDouble();

        Hesaplar hesap= new Hesaplar();
        hesap.hesapla(armut,elma,domates,muz,patlıcan);


    }

}
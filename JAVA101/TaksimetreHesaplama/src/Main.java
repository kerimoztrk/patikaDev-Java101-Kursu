import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gidilecek mesafeyi KM cinsinden ifade ediniz.");
        Scanner km =new Scanner(System.in);

        int mesafe=km.nextInt();

        TutarHesapla fiyat =new TutarHesapla();
        fiyat.tutarHesapla(mesafe);




    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hesaplanacak ilk sayıyı giriniz.");
        Scanner input = new Scanner(System.in);
        double ilkSayi = input.nextDouble();
        System.out.println("Hesaplanacak ikinci sayıyı giriniz.");
        double ikinciSayi = input.nextDouble();
        System.out.println("Yapılacak işlemi seçiniz: \n 1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        int secilenIslem = input.nextInt();

        System.out.println("İşlem sonucu: \n");
        if (secilenIslem == 1) {
            System.out.println(ikinciSayi + ilkSayi);
        } else if (secilenIslem == 2) {
            System.out.println(ilkSayi - ikinciSayi);
        } else if (secilenIslem == 3) {
            System.out.println(ilkSayi * ikinciSayi);
        } else if (secilenIslem == 4) {
            System.out.println((ilkSayi / ikinciSayi));
        } else {
            System.out.println("HATALI GİRİŞ");
        }

        System.out.println("\n Şimdi Switchle olana göz atalım. \n");

        //switchle yazılan

        switch (secilenIslem) {
            case 1:
                System.out.println(ilkSayi + ikinciSayi);
                break;
            case 2:
                System.out.println(ilkSayi - ikinciSayi);
                break;
            case 3:
                System.out.println(ilkSayi * ikinciSayi);
                break;
            case 4:
                System.out.println(ilkSayi / ikinciSayi);
                break;
            default:
                System.out.println("HATALI GİRİŞ");
        }

    }
}

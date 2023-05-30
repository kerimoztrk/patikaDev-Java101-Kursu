import java.util.Scanner;

public class Main {

    static int asalSayi() {
        Scanner input = new Scanner(System.in);
        System.out.println("kontrol edilecek sayıyı giriniz");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam++;
            }
        }
        if (toplam == 0) {
            System.out.println(sayi + " sayısı Asal Sayıdır!");
        } else {
            System.out.println(sayi + " sayısı Asal Sayı değildir!");
        }
        return toplam;
    }






    public static void main(String[] args) {

        System.out.println(asalSayi());
    }
}
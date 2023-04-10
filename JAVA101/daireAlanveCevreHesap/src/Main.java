import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Alanı ve çevresi hesaplanacak dairenin yarı çapını giriniz...");
        Scanner input =new Scanner(System.in);
        int yarıcap=input.nextInt();
        System.out.println("Merkez açısına göre alan bulmak için merkez açısını giriniz...");
        int merkezAcı=input.nextInt();

        Hesapla hesap=new Hesapla();

        hesap.alanHesapla(yarıcap);
        hesap.cevreHesapla(yarıcap);
        hesap.merkezAcısınaGoreAlanHesapla(yarıcap,merkezAcı);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Üçgenin hesaplanacak dik kenar uzunluklarını girin\n");

        System.out.println("ilk kenar uzunluğu : ");
        Scanner koseler =new Scanner(System.in);

        int ilkKenar=koseler.nextInt();
        System.out.println("ilk kenar uzunluğu : ");
        int ikinciKenar=koseler.nextInt();

        Hesaplar hesap =new Hesaplar();


        double hipotenus=hesap.hipotenusHesapla(ilkKenar,ikinciKenar);
        System.out.println("Üçgenin Hipotenüs Değeri: " +hipotenus);

        hesap.alanHesapla(ilkKenar,ikinciKenar,hipotenus);





    }
}
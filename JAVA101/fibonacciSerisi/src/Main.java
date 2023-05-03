import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Kaç elemanlı fibonacci serisi yazdırmak istiyorsunu? ");
        Scanner input = new Scanner(System.in);

        int sayi = input.nextInt();
        int ilk_sonuc = 1;
        int ilk_deger=0;
        int sonuc=0;
        List<Integer> Seri=new ArrayList<Integer>();
        for (int i = 1; i <= sayi; i++) {

            sonuc=ilk_deger+ilk_sonuc;
            ilk_deger=ilk_sonuc;
            ilk_sonuc=sonuc;

            Seri.add(sonuc);


        }

        System.out.println(sayi+" Elemanlı Fibonacci Serisi :"+ Seri);






    }
}

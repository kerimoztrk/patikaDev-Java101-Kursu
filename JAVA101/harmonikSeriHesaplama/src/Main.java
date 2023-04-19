import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("kaçıncı dizine kadar gidilecek");

        Scanner input = new Scanner(System.in);

        double sayi = input.nextInt();

        double toplam=0;

        double deger = 0;
        for (double n = 1; n <= sayi; n++) {
            deger = (1 / n);
            toplam += (deger);
        }
        System.out.println(toplam);


    }
}
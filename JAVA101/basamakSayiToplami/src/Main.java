import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int toplam=0;




        while (number!=0){
         int   kalan=number%10;
         number=number/10;
         toplam+=kalan;

        }
        System.out.println("Girilen sayiların basamak değer toplamı => "+toplam);

    }
}
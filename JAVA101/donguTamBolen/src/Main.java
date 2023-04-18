import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Java döngüler ile 0'dan girilen sayıya kadar olan
        // sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.


        Scanner input = new Scanner(System.in);

        int sayi=input.nextInt();

        for (int i =0;i<=sayi;i++){

            if (i%3==0 && i%4==0){
                System.out.println(i);
            }

        }
    }
}
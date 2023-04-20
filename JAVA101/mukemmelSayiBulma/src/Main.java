import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam=0;
        System.out.println("Bir sayi giriniz.");
        Scanner input=new Scanner(System.in);


        int sayi=input.nextInt();

        for (int i=1 ; i<sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }

        }
        if (toplam==sayi){
            System.out.println(sayi+"  Bir Mükkemmel Sayıdır.");
        }else {System.out.println(sayi+" Bir Mükkemmel Sayı Değildir.");}

    }
}
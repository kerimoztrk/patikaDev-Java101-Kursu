import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sayi;
        System.out.println("Kaç adet sayı giriceksiniz?");
        Scanner input=new Scanner(System.in);

        int N=input.nextInt();

        for (int i=1;i<=N;i++){
            System.out.println(i+".Sayıyı giriniz.");
            sayi=input.nextInt();
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min || sayi==0){
                min=sayi;
            }

        }


        System.out.println("Girilen sayılardan en büyüğü= "+max);
        System.out.println("Girilen sayılardan en küçüğü= "+min);
    }
}
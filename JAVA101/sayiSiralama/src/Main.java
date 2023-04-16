import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sıralanmak üzere 3 adet sayı giriniz.\n");
        Scanner input=new Scanner(System.in);
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();


        if (sayi1<sayi3 && sayi2<sayi3){
            if (sayi1<sayi2){System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi3+" "+sayi2+" "+sayi1);}
            else{System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi3+" "+sayi1+" "+sayi2);}
        }
        else if (sayi2<sayi1 && sayi3<sayi1) {
            if (sayi2<sayi3){System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi1+" "+sayi3+" "+sayi2);}
            else{System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi1+" "+sayi2+" "+sayi3);}

        }
        else {
            if (sayi1<sayi3){System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi2+" "+sayi3+" "+sayi1);}
            else{System.out.println("Büyükten küçüğe sırayla sayilar: "+sayi2+" "+sayi1+" "+sayi3);}
        }
    }
}
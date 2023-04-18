import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("taban değerini giriniz.");
        int taban =input.nextInt();
        System.out.println("üs değerini giriniz.");
        int us=input.nextInt();

        int toplam= 1;

        for (int i=1;i<=us;i++){
            toplam *= taban;

        }
        System.out.println(toplam);

    }
}
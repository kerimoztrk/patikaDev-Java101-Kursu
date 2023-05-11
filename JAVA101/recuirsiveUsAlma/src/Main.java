import java.util.Scanner;


public class Main {


    static int usAlma(){

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int taban =input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int usDeger =input.nextInt();



        int result=1;
        for (int i=1;i<=usDeger;i++){
            result *=taban;
        }

        return result;


    }
    public static void main(String[] args) {

        System.out.println("Girilen değerlerin sonucu : "+ usAlma());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz.");
        Scanner input=new Scanner(System.in);
        double boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz.");
        double kilo=input.nextDouble();

        double vki =kilo/(boy*boy);
        System.out.println(vki);
    }
}
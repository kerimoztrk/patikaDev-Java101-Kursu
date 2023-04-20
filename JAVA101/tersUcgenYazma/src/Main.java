import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kaç Satır girilsin");
        Scanner input = new Scanner(System.in);
        int satirSayisi = input.nextInt();

        for (int i = 0 ; i<=(satirSayisi);i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int m=1;m<=2*(satirSayisi-i)-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
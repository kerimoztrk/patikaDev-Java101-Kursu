import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kaç Satır girilsin");
        Scanner input = new Scanner(System.in);
        int satirSayisi = input.nextInt();


        for (int i = 1; i <= satirSayisi; i++) {

            for (int j = 1; j <= (satirSayisi - i); j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();




        }

        for (int m =1; m<=satirSayisi-1; m++) {

            for (int bosluk=1;bosluk<=m;bosluk++){
                System.out.print(" ");
            }

            for (int l = 1; l <= 2 * (satirSayisi - m) - 1; l++) {
                System.out.print("*");
            }
            System.out.println("");





        }

    }
}
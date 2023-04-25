import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 aralığındaki asal sayılar : \n");


        int i, j;
        boolean asalControl;
        for (i = 2; i <= 100; i++) {
            asalControl = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalControl = false;
                    break;
                }
            }
            if (asalControl == true) {
                System.out.print(i + " ");
            }
        }



    }
}
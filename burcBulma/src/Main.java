import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum ayınını giriniz (1-12): ");
        int ay = scanner.nextInt();
        System.out.print("Doğum gününüzü giriniz (1-31): ");
        int gun = scanner.nextInt();

        switch (ay) {
            case 1:
                if (gun < 22) {
                    System.out.println("Oğlak burcusunuz");
                    break;
                } else {
                    System.out.println("Kova burcusunuz.");
                    break;
                }

            case 2:
                if (gun < 19) {
                    System.out.println("Kova burcusunuz");
                    break;
                } else {
                    System.out.println("Balık burcusunuz.");
                    break;
                }
            case 3:
                if (gun < 21) {
                    System.out.println("Balık burcusunuz");
                    break;
                } else {
                    System.out.println("Koç burcusunuz.");
                    break;
                }
            case 4:
                if (gun < 21) {
                    System.out.println("Koç burcusunuz");
                    break;
                } else {
                    System.out.println("Boğa burcusunuz.");
                    break;
                }
            case 5:
                if (gun < 22) {
                    System.out.println("Boğa burcusunuz");
                    break;
                } else {
                    System.out.println("İkizler burcusunuz.");
                    break;
                }
            case 6:
                if (gun < 23) {
                    System.out.println("İkizler burcusunuz");
                    break;
                } else {
                    System.out.println("Yengeç burcusunuz.");
                    break;
                }
            case 7:
                if (gun < 23) {
                    System.out.println("Yengeç burcusunuz");
                    break;
                } else {
                    System.out.println("Aslan burcusunuz.");
                    break;
                }
            case 8:
                if (gun < 23) {
                    System.out.println("Aslan burcusunuz");
                    break;
                } else {
                    System.out.println("Başak burcusunuz.");
                    break;
                }
            case 9:
                if (gun < 23) {
                    System.out.println("Başak burcusunuz");
                    break;
                } else {
                    System.out.println("Terazi burcusunuz.");
                    break;
                }
            case 10:
                if (gun < 23) {
                    System.out.println("Terazi burcusunuz");
                    break;
                } else {
                    System.out.println("Akrep burcusunuz.");
                    break;
                }
            case 11:
                if (gun < 22) {
                    System.out.println("Akrep burcusunuz");
                    break;
                } else {
                    System.out.println("Yay burcusunuz.");
                    break;
                }
            case 12:
                if (gun < 22) {
                    System.out.println("Yay burcusunuz");
                    break;
                } else {
                    System.out.println("Oğlak burcusunuz.");
                    break;
                }


        }
    }
}
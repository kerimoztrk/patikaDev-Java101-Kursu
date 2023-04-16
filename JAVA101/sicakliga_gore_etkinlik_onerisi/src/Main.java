import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    Scanner input = new Scanner(System.in);

    System.out.println("Hava sıcaklıgı girin.");

    int girilenHavaSicakligi=input.nextInt();

    if (girilenHavaSicakligi<=5){System.out.println("Kayak yapabilirsin.");}
    else if (girilenHavaSicakligi<=15 && girilenHavaSicakligi>5){System.out.println("Sinemaya gidebilirsin.");}
    else if (girilenHavaSicakligi>15 && girilenHavaSicakligi<=25) {System.out.println("Pikniğe gidebilirsin.");}
    else{System.out.println("Yüzmeye gidebilirsin");}




    }
}
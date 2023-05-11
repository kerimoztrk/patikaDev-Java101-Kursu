import java.util.Scanner;

public class Main {

    static  int top(int n1,int n2){
        int result=n1+n2;
        return result;
    }
    static  int cik(int n1,int n2){
        int result=n1-n2;
        return result;
    }
    static int cap(int n1,int n2){
        int result=n2*n1;
        return result;
    }
    static double bol(double n1,double n2){
        if (n2!=0){
            double  result =n1/n2;
            return result;
        }else {
            return 0;
        }
    }
    static int ust(int n1,int n2){
        int result=1;
        for (int i=1;i<=n2;i++){
            result *=n1;
        }
        return result;
    }
    static int mod(int n1,int n2){
        int result=n1%n2;
        return result;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int n1= input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int n2= input.nextInt();
        System.out.println(
                "        1- Toplama İşlemi\n" +
                        "        2- Çıkarma İşlemi\n" +
                        "        3- Çarpma İşlemi\n" +
                        "        4- Bölme işlemi\n" +
                        "        5- Üslü Sayı Hesaplama\n" +
                        "        6- Faktoriyel Hesaplama\n" +
                        "        7- Mod Alma\n" +
                        "        8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.print("BIR SECENEK SECINIZ :");
        int sec= input.nextInt();
        switch (sec){
            case 1:
                System.out.println( "TOPLAM:"+top(n1,n2));
                break;
            case 2:
                System.out.println("CIKARMA:"+cik(n1,n2));
                break;
            case 3:
                System.out.println("CARPMA:"+cap(n1,n2));
                break;
            case 4:
                System.out.println("BOLME"+bol(n1,n2));
                if (n2 == 0){
                    System.out.println("Hatalı bölüm ");
                }
                break;
            case 5:
                System.out.println("Üs ALMA:"+ust(n1,n2));

                break;
            case 6:
                System.out.println("mod alma:"+mod(n1,n2));
                break;
            default:{
                System.out.println("Hatalı giriş yaptınız.");
            }

        }


        System.out.println("GÜLE GÜLE");

    }
}

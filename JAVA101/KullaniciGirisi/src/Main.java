import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kullanıcı Adınızı Giriniz!");
        Scanner input = new Scanner(System.in);
        String kullaniciAdi = input.nextLine();
        System.out.println("Şifrenizi Giriniz!");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("Kerimozturk") && sifre.equals("Ordu")) {
            System.out.println("Kullaıcı adı ve şifre doğru giriş başarılı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış giriş yapılamadı.\n");
        }
        System.out.println("Şifrenizi sıfırlamak istiyor musunuz? \n  1- Evet \n2-Hayır");
        int sıfırla = input.nextInt();

        if (sıfırla == 1) {
            System.out.println("Yeni şifrenizi girin");
            Scanner inp = new Scanner(System.in);
            String yeniSifre = inp.nextLine();
            if (sifre.equals(yeniSifre)) {
                System.out.println("Girilen değer önceki değer ile aynı olamaz!");

            } else {
                sifre = yeniSifre;
                System.out.println("Şifre değişti. Şifreniz artık= " + sifre);
            }
        } else if (sıfırla == 2) {
            System.out.println("Herhangi bir işlem yapılmadı ana ekrana yönlendiriliyorsunuz.");
        } else {
            System.out.println("Hatalı giriş");
        }
    }

}



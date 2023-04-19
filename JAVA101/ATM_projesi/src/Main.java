import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password;
        int hakSayisi = 3;
        int secim, fiyat, bakiye=0;

        while (hakSayisi > 0) {
            System.out.println("\nKullanıcı Adınız :");
            userName = input.nextLine();

            System.out.println("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("admin") && password.equals("12345")) {

                System.out.println("Kullanıcı adı ve şifre girişi doğru sisteme başarıyla giriş yaptınız.");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("Yatırılacak para miktarını giriniz:");
                            fiyat = input.nextInt();
                            bakiye += fiyat;
                            System.out.println("Para yatırıldı yeni bakiye = " + bakiye);
                            break;

                        case 2:
                            System.out.println("Çekilecek para miktarını giriniz:");
                            fiyat = input.nextInt();
                            if (fiyat <= bakiye) {
                                bakiye -= fiyat;
                                System.out.println("Para çekildi yeni bakiye = " + bakiye);

                            } else {
                                System.out.println("Çekilmek istenen para için bakiyeniz yeterli değildir.");
                            }
                            break;
                        case 3:
                            System.out.println("Hesap bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("\nÇıkış yapıldı. Teşekkür ederiz...");
                            break;


                    }

                }while (secim != 4);
                    break;
            } else {
                --hakSayisi;
                if (hakSayisi == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kullanıcı adı veya şifreniz yanlış lütfen tekrar deneyiniz. Kalan giriş hakkınız= " + hakSayisi);


                }
            }
        }

    }
}
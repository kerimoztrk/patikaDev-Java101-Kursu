import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            Scanner input =new Scanner(System.in);

            System.out.println("Gidilecek mesafeyi KM türünden veriniz.");
            int mesafe = input.nextInt();
            System.out.println("Yaşınızı giriniz.");
            int yas= input.nextInt();
            System.out.println("Yolculuk tipinizi seçiniz\n Tek yön => 1    Gidiş Dönüş => 2");
            int yolculukTipi=input.nextInt();

            double toplamFiyat=mesafe*0.10;

      /*  Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
            if (mesafe<0 || yas<0 || yolculukTipi<1 || yolculukTipi>2){
                System.out.println("Hatalı Veri Girdiniz !");
            }
            else if ( yas<12){
                toplamFiyat=toplamFiyat-(toplamFiyat*50/100);
                System.out.println("12'den küçükler için yaş indiriminden faydalandınız. ");
            }
            else if (yas<=24) {
                toplamFiyat=toplamFiyat-(toplamFiyat*10/100);
                System.out.println("12-24 yaş indiriminden faydalandınız." );
            }
            else if (yas>=65) {
                toplamFiyat=toplamFiyat-(toplamFiyat*30/100);
                System.out.println("65 yaş indiriminden faydalandınız.");

            }
            else {
                System.out.println("Herhangi bir yaş indirimi uygulanmadı. ");
            }

            if (yolculukTipi==2){
                toplamFiyat=toplamFiyat-(toplamFiyat*20/100);
                System.out.println("Gidiş-Dönüş tarifesi indiriminden faydalandınız.");
                toplamFiyat=toplamFiyat*2;
            }

            System.out.println("Bütün indirim hesaplamalarından sonra ödenecek toplam tutarınız =>  "+ toplamFiyat);




    }
}
public class Hesapla {

    //KDV ORANI %18 ALINDI

    public void kdvHesapla(double s){
        double sonuc=s+((s*18)/100);
        System.out.println("KDV'li Fiyat: "+sonuc);

    }
    public void kdvOran(double s){
        double tutar=((s*18)/100);
        System.out.println("KDV tutarı: "+ tutar);
    }

}

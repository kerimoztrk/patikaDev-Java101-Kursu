

public class Hesapla {

    public void alanHesapla(int r){
        double pi=3.14;
        double alan= pi*r*r;
        System.out.println("Dairenin alanı: "+alan);
    }

    public void cevreHesapla(int r){
        double pi=3.14;
        double cevre= pi*2*r;
        System.out.println("Dairenin çevresi: "+cevre);
    }
    public void merkezAcısınaGoreAlanHesapla(int r,int merkezAcı){
        double pi=3.14;
        double alan= (pi*(r*r)*merkezAcı)/360;
        System.out.println("Dairenin merkez açısına göre alanı: "+alan);
    }
}

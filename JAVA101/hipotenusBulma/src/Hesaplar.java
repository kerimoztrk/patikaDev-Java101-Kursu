public class Hesaplar {



    public int hipotenusHesapla(int ilkKenar, int ikinciKenar) {

        int hipotenus = (int) Math.sqrt((Math.pow(ilkKenar,2)) + (Math.pow(ikinciKenar,2)));



        return hipotenus;
    }


    public void alanHesapla(double ilkKenar,double ikinciKenar,double hipotenus){
        double cevre = ikinciKenar+ilkKenar+hipotenus;
        double u =cevre/2;

        double alanKaresi=   (u*(u-ilkKenar)*(u-ikinciKenar)*(u-hipotenus)) ;
        int alan=(int) Math.sqrt(alanKaresi);

        System.out.println("Üçgenin Alan Değeri: " +alan);
    }


}

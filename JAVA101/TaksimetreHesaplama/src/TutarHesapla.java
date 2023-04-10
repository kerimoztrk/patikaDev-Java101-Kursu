public class TutarHesapla {


    public void tutarHesapla(int mesafe){

        if(mesafe<5){
            System.out.println("5 km'den az mesafe olduğundan 20 TL altı mesafelere sabit fiyat politikası gereği tutar 20 TL 'dir.");

        }
        else{
            int baslangıcTutarı=10;
            double tutar=(baslangıcTutarı+( mesafe*2.20));
            System.out.println("Gidilecek mesafeye göre ödenecek tutar: "+tutar);
        }
    }
}

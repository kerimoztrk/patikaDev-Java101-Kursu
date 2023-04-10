// Geçme notu 55 olarak belirlenmiş.

public class Hesaplama {

    public void gecmeDurumu(int not) {

        if (not >= 55 && not < 100) {
            System.out.println("Geçtiniz...");
        } else if (not > 0 && not < 55) {
            System.out.println("Kaldınız...");
        } else {
            System.out.println("hatalı giriş");
        }
    }
}

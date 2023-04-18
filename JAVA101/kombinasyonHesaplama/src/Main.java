import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("N değerini giriniz.");
        int N =input.nextInt();
        System.out.println("r değerini giriniz.");
        int r=input.nextInt();
        int Nfaktoriyel=1;
        int rFaktoriyel=1;
        int NrFarkı=N-r;
        int farkFaktoriyel=1;

        for (int i=1;i<=N;i++)
        {
            Nfaktoriyel=Nfaktoriyel*i;
        }
        for (int i=1;i<=r;i++)
        {
            rFaktoriyel=rFaktoriyel*i;
        }
        for (int i=1;i<=NrFarkı;i++)
        {
            farkFaktoriyel=farkFaktoriyel*i;
        }


        int kombinasyoHesabı= (Nfaktoriyel/(rFaktoriyel*(farkFaktoriyel)));

        System.out.println("C(" + N + "," + r + ") = "+ kombinasyoHesabı);
    }

    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
    kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

}
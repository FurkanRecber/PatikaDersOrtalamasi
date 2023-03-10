import java.util.Scanner;

public class PatikaDersOrtalamasi {
    //mat,fizik,kimya,türkçe,tarih,müzik
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        int mat = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = inp.nextInt();

        int toplam = (mat*6)+(turkce*5)+(kimya*4)+(fizik*4)+(tarih*2)+(muzik*2);
        double sonuc = toplam / 23.0;

        String a= sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.printf("\nOrtalamanız:" +"%.2f" + "\n" + a,sonuc);
    }
}

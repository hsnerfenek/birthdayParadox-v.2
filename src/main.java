
import java.util.Scanner;


/**
 * Created by Hasan on 20.10.2016.
 */
public class main {

    public static void main(String[] args) {
        menuGoster();
    }
    static void menuGoster() {
        birthday b1 = new birthday();
        Scanner s2 = new Scanner(System.in);
        System.out.println("\tANA MENÜ");
        System.out.println("1-Genel İstatistik Görüntüle");
        System.out.println("2-Simülasyon Hazırla");
        System.out.println("3-Çıkış");
        System.out.print("Seçiminizi giriniz: ");
        int secim = s2.nextInt();
        switch (secim) {
            case 1:
                System.out.println("\n\t\t\t  100\t 500\t1000");
                int[] istatikselCakismaSayilari = new int[3];
                for (int i = 1; i <= 10; i++) {

                    b1.dogumGunuOlustur(100);
                    System.out.print("\t"+i + ".deney    " + b1.cakismaSayisi);
                    istatikselCakismaSayilari[0] += b1.cakismaSayisi;
                    b1.dogumGunleriniSifirla();
                    b1.dogumGunuOlustur(500);
                    System.out.print("\t " + b1.cakismaSayisi);
                    istatikselCakismaSayilari[1] += b1.cakismaSayisi;
                    b1.dogumGunleriniSifirla();
                    b1.dogumGunuOlustur(1000);
                    System.out.print("\t " + b1.cakismaSayisi);
                    istatikselCakismaSayilari[2] += b1.cakismaSayisi;
                    b1.dogumGunleriniSifirla();
                    System.out.println();
                }
                float ort1 = (float)istatikselCakismaSayilari[0]/10;
                float ort2 = (float)istatikselCakismaSayilari[1]/10;
                float ort3 = (float)istatikselCakismaSayilari[2]/10;
                System.out.print("Ortalamalar:   "+ort1+"  "+ort2+"   "+ort3+"\n\n");
                menuGoster();
            case 2:
                System.out.print("Kişi sayısını giriniz:");
                int kisiSayisi = s2.nextInt();
                System.out.println();
                for (int i = 1; i <= 10; i++) {
                    b1.dogumGunuOlustur(kisiSayisi);
                    b1.ayrintiliIstatistik();
                    b1.dogumGunleriniSifirla();
                    System.out.print("Devam etmek için bir tuşa basınız..");
                    String a = s2.nextLine();
                    System.out.println();

                }
                float ortalama = (float) b1.toplamCakismaSayisi / 10;
                System.out.print("Ortalama çakışma sayısı: " + ortalama+"\n\n");
                menuGoster();
            case 3:
                break;
            default:
                break;
        }
    }
}

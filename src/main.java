import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        menuGoster();
    }
    static void menuGoster() {
        Birthday birthday = new Birthday();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tANA MENÜ");
        System.out.println("1-Yıllık Genel İstatistik Görüntüle");
        System.out.println("2-Haziran-Temmuz-Ağustos Ayları için Genel İstetistik Görüntüle");
        System.out.println("3-Simülasyon Hazırla");
        System.out.println("4-Çıkış");
        System.out.print("Seçiminizi giriniz: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.println("\n\t\t\t  100\t 500\t1000");
                int[] istatikselCakismaSayilari = new int[3];
                for (int deneySayisi = 1; deneySayisi <= 10; deneySayisi++) {

                    birthday.dogumGunuOlustur(100);
                    System.out.print("\t"+deneySayisi + ".deney    " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[0] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    birthday.dogumGunuOlustur(500);
                    System.out.print("\t " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[1] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    birthday.dogumGunuOlustur(1000);
                    System.out.print("\t " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[2] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    System.out.println();
                }
                float ort1 = (float)istatikselCakismaSayilari[0]/10;
                float ort2 = (float)istatikselCakismaSayilari[1]/10;
                float ort3 = (float)istatikselCakismaSayilari[2]/10;
                System.out.print("Ortalamalar:   "+ort1+"  "+ort2+"   "+ort3+"\n\n");
                menuGoster();
            case 2:
                System.out.println("\n\t\t\t  100\t 500\t1000");
                istatikselCakismaSayilari = new int[3];
                for (int deneySayisi = 1; deneySayisi <= 10; deneySayisi++) {
                    birthday.yazAylariDogumGunuOlustur(100);
                    System.out.print("\t"+deneySayisi + ".deney    " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[0] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    birthday.yazAylariDogumGunuOlustur(500);
                    System.out.print("\t " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[1] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    birthday.yazAylariDogumGunuOlustur(1000);
                    System.out.print("\t " + birthday.getCakismaSayisi());
                    istatikselCakismaSayilari[2] += birthday.getCakismaSayisi();
                    birthday.dogumGunleriniSifirla();
                    System.out.println();
                }
                ort1 = (float)istatikselCakismaSayilari[0]/10;
                ort2 = (float)istatikselCakismaSayilari[1]/10;
                ort3 = (float)istatikselCakismaSayilari[2]/10;
                System.out.print("Ortalamalar:   "+ort1+"  "+ort2+"   "+ort3+"\n\n");
                menuGoster();
            case 3:
                System.out.print("Kişi sayısını giriniz:");
                int kisiSayisi = scanner.nextInt();
                System.out.println();
                for (int deneySayisi = 1; deneySayisi <= 10; deneySayisi++) {
                    System.out.println(deneySayisi+". Deney:");
                    birthday.dogumGunuOlustur(kisiSayisi);
                    birthday.ayrintiliIstatistik();
                    birthday.dogumGunleriniSifirla();
                    System.out.println("Devam etmek için \"Enter\" tuşuna basınız..");
                    String devamEtmekIcın = scanner.nextLine();
                }
                float ortalama = (float) birthday.getToplamCakismaSayisi() / 10;
                System.out.print("Ortalama çakışma sayısı: " + ortalama+"\n\n");
                menuGoster();
            default:
                System.exit(0);
        }
    }
}

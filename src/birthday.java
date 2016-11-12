import java.util.Random;
enum aylar{Ocak,Şubat,Mart,Nisan,Mayıs,Haziran,Temmuz,Ağustos,Eylül,Ekim,Kasım,Aralık}
public class Birthday {
    Random rand = new Random();
    private int[][] dogumTarihleri = {new int[31],
            new int[28],
            new int[31],
            new int[30],
            new int[31],
            new int[30],
            new int[31],
            new int[31],
            new int[30],
            new int[31],
            new int[30],
            new int[31]};

    private int cakismaSayisi = 0;
    private int toplamCakismaSayisi = 0;

    public int getCakismaSayisi() {
        return cakismaSayisi;
    }

    public int getToplamCakismaSayisi() {
        return toplamCakismaSayisi;
    }

    public void dogumGunuOlustur(int n) // parametresini aldığı n sayıda doğum gününü oluşturur.
    {
        int aySayisi;
        int gunsayisi;
        for(int sayac=1; sayac<=n; sayac++)
        {
            aySayisi =  rand.nextInt(12)+1;
            gunsayisi = (rand.nextInt(dogumTarihleri[aySayisi-1].length)+1);
            if(dogumTarihleri[aySayisi-1][gunsayisi-1] >= 1)
                cakismaSayisi++;
            dogumTarihleri[aySayisi-1][gunsayisi-1] ++;
        }
        toplamCakismaSayisi += cakismaSayisi;
    }
    public void dogumGunleriniSifirla() //dogum günlerinin tutuldugu matisi ve çakışma sayısını sıfırlar.
    {
        for(int satir=0; satir<12; satir++)
        {
            for(int sutun=0; sutun<dogumTarihleri[satir].length; sutun++)
                dogumTarihleri[satir][sutun] = 0;
        }
        cakismaSayisi = 0;
    }

    public void yazAylariDogumGunuOlustur(int n) // Haziran- Temmuz - Ağustos ayları için doğum günü oluşturur.
    {
        Random rand = new Random();
        int aySayisi;
        int gunsayisi;
        for(int sayac=1;sayac<=n;sayac++)
        {
            aySayisi =  rand.nextInt(3)+6;
            gunsayisi = (rand.nextInt(dogumTarihleri[aySayisi-1].length)+1);
            if(dogumTarihleri[aySayisi-1][gunsayisi-1] >= 1)
                cakismaSayisi++;
            dogumTarihleri[aySayisi-1][gunsayisi-1]++;
        }
        toplamCakismaSayisi += cakismaSayisi;
    }

    public void ayrintiliIstatistik() // bir yıldaki tüm çakışmaları ay-gün tablosu şeklinde ekrana yazdırır. Altta çakışma sayısını verir.
    {
        System.out.println("Ay/Gün\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19\t20\t21\t22\t23\t24\t25\t26\t27\t28\t29\t30\t31");
        for (int satir=0; satir<=11; satir++)
        {
            System.out.print(aylar.values()[satir]);
            for (int sutun=0; sutun<dogumTarihleri[satir].length; sutun++)
            {
                System.out.print("\t"+dogumTarihleri[satir][sutun]);
            }
            System.out.println("");
        }
        System.out.println("Çakışma Sayısı: "+cakismaSayisi);
    }

}

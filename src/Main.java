/*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double kdv, fiyat, kdvli, kdvtutar;

        System.out.print("Para tutarını giriniz:");
        fiyat = inp.nextDouble();

        kdv = (fiyat >= 0 && fiyat <= 1000) ? 0.18 : 0.08;

        kdvli = (fiyat * kdv) + fiyat;
        System.out.println("KDV'li Tutar:" + kdvli);

        kdvtutar = kdvli - fiyat;
        System.out.println("KDV Tutarı:" + kdvtutar);

        System.out.print("KDV Oranı:" + kdv);
    }
}

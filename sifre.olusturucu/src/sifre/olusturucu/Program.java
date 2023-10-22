package sifre.olusturucu;

import java.util.Random;
import java.util.Scanner;

// adınızı, soyadınızı isteyecek
// doğum tarihi isteyecek
// programın içinde alfanumerik karakterler içeren bir dizisi olacak : ["!","?","+","/"];

// ad, soyad, doğum tarihi, dizi verileri içindeki harf,rakam, ve alfanumerik karakterler 
// rastgele kullanılarak
// en az 8 karakterli ve içinde en az bir büyük harf, bir küçük harf, bir sayı ve
// bir alfanumerik karakter barındıran şifre oluştursun.

// kullanıcıdan ver isteme bölümü main metodu içinde olacak.
// şifre oluşturma işi başka bir metod tarafından gerçekleştirilip
// main metodundan çağrıldığında String olarak şifre geri dönülecek
public class Program {

	public static void main(String[] args) {

		Scanner girdi = new Scanner(System.in);

		System.out.print("Adınız : ");

		String ad = girdi.next();

		ad = ad.trim();

		System.out.print("Soyadınız : ");

		String soyad = girdi.next();

		soyad = soyad.trim();

		System.out.print("Doğum Tarihiniz(gg.aa.yyyy) : ");

		String dogumTarihi = girdi.next();
		// 10.02.2000 > 10022000
		dogumTarihi = dogumTarihi.replace(".", "");// sadece sayılar elimde kalsın diye noktaları tarihten sildik

		String sifre = sifreOlustur(ad, soyad, dogumTarihi);

		System.out.println(sifre);
	}

	static String sifreOlustur(String ad, String soyad, String dogumTarihi) {

		// İzzetBozoğlu
		String adSoyad = ad + soyad;

		String[] alfaNumerikKarakterler = { "!", "?", "+", "/" };

		String sifre = "";

		Random rastgeleSayiUretici = new Random();

		for (int i = 0; i < 2; i++) {

			int buyukHarfIcinRastgeleIndex = rastgeleSayiUretici.nextInt(0, adSoyad.length());

			Character buyukKarakter = adSoyad.charAt(buyukHarfIcinRastgeleIndex);

			String buyukHarf = buyukKarakter.toString().toUpperCase();// method chaining

			int kucukHarfIcinRastgeleIndex = rastgeleSayiUretici.nextInt(0, adSoyad.length());

			Character kucukKarakter = adSoyad.charAt(kucukHarfIcinRastgeleIndex);

			String kucukHarf = kucukKarakter.toString().toLowerCase();

			Integer sayi = Integer.valueOf(dogumTarihi) * 23589;

			String strSayi = sayi.toString();

			int sayiIcinRastgeleIndex = rastgeleSayiUretici.nextInt(0, strSayi.length());

			int sifreSayisi = strSayi.charAt(sayiIcinRastgeleIndex); // dönüş değeri char olması nedeniyle ascii
																		// tablosundaki karşılığı almış olduk

			int alfaNumerikKarakterIcinRastgeleIndex = rastgeleSayiUretici.nextInt(0, alfaNumerikKarakterler.length);

			String alfaNumerikKarakter = alfaNumerikKarakterler[alfaNumerikKarakterIcinRastgeleIndex];

			sifre += buyukHarf + kucukHarf + sifreSayisi + alfaNumerikKarakter;

		}

		return sifre;

	}

}

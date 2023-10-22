package string.metodlari;

import java.time.LocalDate;
import java.util.Scanner;

import string.metodlari.model.Personel;

public class Program {

	// split fonksiyonun yaptığını substring metodu yardımıyla yapan bir metod
	// yazabilir misiniz

	static String[] split(String metin, String ayrac) {

		String[] arr = new String[9];

		while (metin.contains(";")) {

			int ayracIndex = metin.indexOf(";");

			String altMetin = metin.substring(0, ayracIndex);

			arr[0] = altMetin;

		}
		return arr;
	}

	public static void main(String[] args) {

		String txtForSplit = "12345678902;Ali;Veli;11.9.2000;50000.78";

		String[] arr = split(txtForSplit, ";");

		int x = 5;
		char c = 'a';

		String mesaj = "Merhaba.Hoş geldiniz.";

		// String subMesaj = mesaj.substring(8); // başlangıç index verdik
		String subMesaj = mesaj.substring(8, 11);

		System.out.println(subMesaj);

		// char char = 'c';
		// String veri tipi char ilkel veri tipinin dizisidir.
		// dolayısıyla dizi konusunda öğrendiğimiz çoğu kavramı String için
		// kullanabiliriz.
		String text = "metinleri yazmak okumak için";

		String String = ""; // java keyword olmayan bütün kelimeler değişken adı olabilir

		System.out.println("Metin giriniz : ");

		Scanner input = new Scanner(System.in);

		String metin = input.nextLine();// input.next(); // next() metodu sadece ilk boşluk karakterine kadar okuma
										// yapar.

		// String veri tipindeki değişkenin değeri değiştirilemez
		// immutable veri tipidir
		String yeniMetin = metin.trim(); // metnin başındaki ve sonundaki boşlukları kesip at
		System.out.println(metin);
		System.out.println(yeniMetin);

		char ilkKarakter = yeniMetin.charAt(0);// metin[0];

		System.out.println("Girilen metnin ilk karakteri: " + ilkKarakter);

		char sonKarakter = yeniMetin.charAt(yeniMetin.length() - 1);

		System.out.println("Girilen metnin son karakteri: " + sonKarakter);

		System.out.println("Metin içinde aramak istediğiniz karakter veya kelimeyi giriniz :");

		String aranacakIbare = input.nextLine();

		// bir referans veri tipine ait birden fazla metodun arka arkaya
		// çağrılmasına metod zincirlemesi (method chaining) denir.
		int arananIbareIlkIndex = yeniMetin.trim().toUpperCase().indexOf(aranacakIbare.toUpperCase());

		int arananIbareSonIndex = yeniMetin.trim().toUpperCase().lastIndexOf(aranacakIbare.toUpperCase());

		if (arananIbareIlkIndex == -1) {
			System.out.println("aranan ibare bulunamadı");
		} else {
			System.out.println("aranan ibare mevcut. Metin içinde " + (arananIbareIlkIndex + 1) + " .karakter");
		}

		if (arananIbareIlkIndex == arananIbareSonIndex) {
			System.out.println("Aranan ibare metin içinde tekrar etmiyor");
		} else {
			System.out.println("Aranan ibare metin içinde tekrar ediyor");
		}

		// ismin içinde ikinci ad veya ikinci soyad var mı?
		// İzzet Bozoğlu
		int boslukKarakteriIlkIndex = yeniMetin.indexOf(" ");
		int boslukKarakteriSonIndex = yeniMetin.lastIndexOf(" ");

		if (boslukKarakteriIlkIndex != boslukKarakteriSonIndex) {
			System.out.println("Birden fazla ad veya soyad var");
		} else {
			System.out.println("Bir ad ve bir soyad var");
		}

		// String hatasizMetin = yeniMetin.replace("de", " de").replace("da", " da");

		String hatasizMetin = yeniMetin.toUpperCase().replace("Mirosoft".toUpperCase(), "Microsoft")
				.replace("Orale".toUpperCase(), "Oracle");

		System.out.println(hatasizMetin);

		// ternary operator : üçlü operator / tek satır içinde kısa bir if/else yazmak
		// yerine kullanılabilir
		// "?" if deyimini temsil eder
		// ":" else deyimini temsil eder
		String varYokMesaji = yeniMetin.contains(aranacakIbare) ? "Var" : "Yok";
		System.out.println(varYokMesaji);

		if (yeniMetin.contains(aranacakIbare)) {
			System.out.println("Var");
		} else {
			System.out.println("Yok");
		}

		// İzzet Cemil Bozoğlu
		String[] kelimeler = yeniMetin.split(" "); // girilen metni boğluklardan ayırarak kelime bazlı bir dizi
													// oluşturur.

		for (String kelime : kelimeler) {
			System.out.println(kelime);
		}

		// CSV (comma separated values): dosya formatı
		// csv formatında serileştirilmiş veri
		String baslik = "TC Kimlik No;Ad;Soyad;DoğumTarihi;Maaş;Doğum Yeri";
		String csvOrnekVeriSeti = "12345678902;Ali;Veli;10.09.2000;50000.78;İstanbul";

		String[] kisiVerileri = csvOrnekVeriSeti.split(";");

		int y = 2;

		String str = String.valueOf(y); // convert

		// csv formatında serileştirilmiş veriyi tersine serileştirip java
		// değişkenlerine atadık (DESERIALIZE)
		long tcKimlikNo = Long.valueOf(kisiVerileri[0]); // String bir değeri sayısal bir değere çevirebilmek için
															// Wrapper sınıflar kullanılır.
		String ad = kisiVerileri[1];
		String soyad = kisiVerileri[2];

		// String verisinden tarih verisine dönüş yaptırıyoruz:
		String strDogumTarihi = kisiVerileri[3];
		strDogumTarihi = strDogumTarihi.replace(".", ";");

		String[] tarihBolumleri = strDogumTarihi.split(";");
		int gun = Integer.valueOf(tarihBolumleri[0]);
		int ay = Integer.valueOf(tarihBolumleri[1]);
		int yil = Integer.valueOf(tarihBolumleri[2]);
		LocalDate dogumTarihi = LocalDate.of(yil, ay, gun);
		///////////////////////////////////////////////

		double maas = Double.valueOf(kisiVerileri[4]);
		String dogumYeri = kisiVerileri[5];

		// CSV formatındaki veriyi Java nesnesine deserialize ettik.
		Personel personel = new Personel(tcKimlikNo, ad, soyad, dogumTarihi, maas, dogumYeri);
		System.out.println(personel);

		// %s (string) %d(sayılar) %.2f(noktalı sayılar)
		// System.out.format("T.C. Kimlik No : %d \nAd : %s \nSoyad : %s ", tcKimlikNo,
		// ad, soyad);

		// Personel p = new Personel();

//		for (int i = 0; i < kelimeler.length; i++) {
//			System.out.println(kelimeler[i]);
//		}

//		int[] arr = {1,2,3};
//		int sayi = arr.length;

	}

}

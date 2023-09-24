package com.bilgeadam.java.ders3;

// Arrays
public class Diziler {

	int i;// ilk değere 0
	String s; // ilk değeri null

	public static void main(String[] args) {

		// haftanın günleri
		String ptesi = "Pazartesi";
		String sali = "Salı";

		// Ay isimleri
		String ocak = "Ocak";
		String şubat = "Şubat";

		// Bir sınıftaki öğrencilerin karne notu

		float alininKarneNotu = 80.55F;
		float velininKarneNotu = 50.88F;

		// Aynı veritipindeki veri grubunun tek bir isimle saklanmasını, erişilmesini
		// ve verilerin değiştiriebilmesini sağlar
		String[] haftaninGunleri = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

		System.out.println("Haftada kaç gün var? " + haftaninGunleri.length); // length : dizinin eleman sayısı
		System.out.println(haftaninGunleri[0]);

		// dizinin son elemanını bulmak
		System.out.println(haftaninGunleri[haftaninGunleri.length - 1]);

		// dizinin bütün elemanlarını döngü ile yazdırmak:
		for (int i = 0; i < haftaninGunleri.length; i++) {
			System.out.println(haftaninGunleri[i]);
		}

		// bir dizi oluştururken kaç elemanlı olacağı en başta belirlenmesi şarttır.

		// diziler içindeki her bir primitive veri tipi için ilk değer atamasını
		// yaparlar.
		double[] sinifinNotOrtalamalari = new double[50];

		sinifinNotOrtalamalari[0] = 70;
		sinifinNotOrtalamalari[1] = 80;
		sinifinNotOrtalamalari[2] = 60;
		sinifinNotOrtalamalari[3] = 65;
		sinifinNotOrtalamalari[4] = 85;

		// String s = new String();

		String[] ogrenciler = new String[50];

		ogrenciler[0] = "Ali Veli";
		ogrenciler[1] = "Fatma Şen";
		ogrenciler[2] = "Mehmet Tan";
		ogrenciler[3] = "Gül Fen";
		ogrenciler[4] = "Faik Öz";

		for (int i = 0; i < ogrenciler.length; i++) {

			if (ogrenciler[i] != null) {
				System.out.println(ogrenciler[i] + " not ortalaması : " + sinifinNotOrtalamalari[i]);
			}
		}

		int[] sayilar = { 2, 3, 5, 9, 8, 4 };

		// sayılar dizisi içinde tek sayıları yazdıralım

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] % 2 == 1) {
				System.out.println(sayilar[i]);
			}

		}

		// dizi elemanlarını dizideki sıralarının tersinden yazdıralım

		for (int i = sayilar.length - 1; i > -1; i--) {

			System.out.println(sayilar[i]);

		}
		
		
		// dizideki sayıların ortalaması
		
		///önce dizi içindeki sayıların toplamını bulucam
		/// arkasından bulduğum toplamı dizinin eleman sayısına bölerek ortalamayı bulacağım.
		
		double toplam = 0.0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		
		double ortalama = toplam / sayilar.length;
		
		System.out.println("dizideki sayıların ortalaması : " + ortalama);
		
		// dizinin ortalamasına en yakın dizi içindeki sayı nedir?
		
		Math.abs(ortalama);
		
		double fark = 2000_000_000;
		int ortalamayaEnYakinsayi = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if( Math.abs(ortalama - sayilar[i]) < fark) {
				ortalamayaEnYakinsayi = sayilar[i];
				fark = ortalama - sayilar[i]; 
			}
		}
		
		System.out.println("ortlamaya en yakın sayı : " + ortalamayaEnYakinsayi);
		
		
		// dizi içindeki en büyük sayıyı buldurun
		
		int[] sayilar2 = { -2, -3, -5, -9, -8,-4 };
		int enBuyukSayi = sayilar[0]; // hipotez
		
		// doğrulama
		for (int i = 1; i < sayilar2.length; i++) {
			
			if(sayilar2[i] > enBuyukSayi) {
				enBuyukSayi = sayilar2[i];
			}
		}
		
		System.out.println("dizinin en büyük sayısı :" + enBuyukSayi);
		
		System.out.println(haftaninGunleri);
		System.out.println(sayilar.hashCode());

	}

}

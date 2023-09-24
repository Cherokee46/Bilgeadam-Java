package com.bilgeadam.java.ders1;

import java.util.Scanner;

public class Main {
	/*
	 * birden fazla
	 * yorum
	 * satırı
	 */

	// main metodu java projelerinin başlangıç noktasıdır
	// f(x)
	// entry point
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {//inline comment
		//api
		byte _byte = 1;
		//byte public = 9;
		
		// camel case
		byte ankaraPlakaKodu = 6;
		byte istanbulPlakaKodu = 34; // -128...0...127 // 1 byte
		
		short cankayaIlceKodu = 234; // -32768 .... 0 ... 32767
		
		int turkiyeninNufusu = 80_000_000;// bir tam sayı yazıldığında veri tipi 
		// varsayılan olarak int kabul edilir.
		
		turkiyeninNufusu = 80_000_001;// case sensitive
		
		long dunyaNufusu = 8_000_000_000L;// case insensitive
		
		
		double _double = 1.2;// bir noktalı sayı yazıldığında veri tipi 
		// varsayılan olarak double kabul edilir.
		
		float alininMatOrtalamasi = 1.2F;
		
		boolean evliMi = true;// false
		
		char aHarfi = 'a';
		char bHarfi = 98;
		
		int cHarfi = 'c';
		
		//System.out.println(aHarfi + 1); // a1
		
		double pi = 3.14; // değişken
		pi = 3;
		
		// sabit
		final double PI_SAYISI = 3.14;
		
		//PI_SAYISI = 3;
		
		final double KATMA_DEGER_VERGISI = .18; // 0.18
		
		
		double vizeFinalToplam = 40 + 85;
		double ortalama = vizeFinalToplam / 2; // veri kaybı
		// üssteki işlemde sonuç double bekleniyor işleme girec sayı double
		// dolayısıyla 2 olan tam sayı compiler tarafından double olarak 
		// tür dönüşümüne tabii tutulur
		// bu yapılan tür dönüşümüne : implicitly conversion (bilinçsiz tür dönüşümü)
		
		// bu işin tamtersi bilinçli olarak yapılan tür dönüşümüne 
		// explicitly conversion denir.
		byte x = (byte)200; // casting. burada veri kaybı yaşanır
		
		System.out.println(x);
		
		
		System.out.println(ortalama);
		
		
		
		
		//Scanner scanner = new Scanner(System.in); // input
		//System.out.println("Adınız : ");
		
		//System.out.println("Merhaba " + scanner.next());// output
		
	}
}

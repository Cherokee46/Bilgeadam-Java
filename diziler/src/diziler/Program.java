package diziler;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// dizi tanımı yapılırken elemanları belliyse
		int[] sayilar = { 5, 6, 3, 4, 8, 9 };
		
		System.out.print("1-10 arasında bir sayı giriniz: ");
		
		Scanner girdi = new Scanner(System.in);
		
		int kullanicininGirdigiDeger = girdi.nextInt();
		
		boolean diziIcindeSayiVar = false;
		
		// bir dizi içerisinde belli bir sayıyı aratma algoritması
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == kullanicininGirdigiDeger) {
				diziIcindeSayiVar = true;
				System.out.println("Girilen sayı dizi içerinsde mevcut");
				break;
			}
			//else
				//System.out.println("Girilen sayı dizi içerisinde yok");
		}
		
		if(diziIcindeSayiVar == false) {
			System.out.println("Girilen sayı dizi içerisinde yok");
		}
		

		int sayilar4[] = { 4, 5, 9, 8 };

		// dizi tanımı yapılırken elemanları belli değil ama kaç elemanı olacağı
		// belliyse
		int[] sayilar2 = new int[10];

		// dizi tanımı yapılırken elemanları belliyse, daha çok testlerde veya
		// mülakatlarda
		int[] sayilar3 = new int[] { 2, 5, 9, 7 }; // sorular bu şekilde gelir

		// 25 öğrencili bir sınıf için not ortalamaları
		// int primitive veri tipi olması nedeniyle null değer alamaz
		// dizi içindeki sıfır değerler yerine null koyabilmek için
		// primitive int veri tipi yerine wrapper veri tipi olan Integer kullanmak
		// gerekir.
		Integer[] notOrtalamalari = new Integer[25];

		int y = 3;
		Integer x = 5;

		Long _long = 2L;

		Character c = 'a';
		
		notOrtalamalari[0] = 60;
		notOrtalamalari[1] = 65;
		notOrtalamalari[2] = 55;
		notOrtalamalari[3] = 45;
		notOrtalamalari[4] = 70;

		for (int i = 0; i < notOrtalamalari.length; i++) {
			if (notOrtalamalari[i] != null)
				System.out.println(notOrtalamalari[i]);
			else
				System.out.println("Belli değil");
		}

	}
}

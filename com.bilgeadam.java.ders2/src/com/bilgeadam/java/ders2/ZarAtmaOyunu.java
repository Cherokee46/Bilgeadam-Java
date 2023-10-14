package com.bilgeadam.java.ders2;

import java.util.Random;

public class ZarAtmaOyunu {

	// Ödev : 
	// 1. aşama : zorunlu
	//bu oyun en fazla 10 kere oynanabilsin
	// oyun 10 kere oyanandıktan sonra 
	// kapanırken bilgisayar kaç kere kazandı.
	// oyuncu kaç kere kazandı raporlasın.
	
	// 2. aşama isteyen yapabilir
	// oyuncu her 3 kere oynadığında çımak isteyip istemediği sorularak 
	// çıkmak istiyorsa oyun dan çıkılsısın.
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int oyuncuZari = random.nextInt(1,7); // ikinci sayı sınır dışında bırakılacağı için 1 fazlasını veriyoruz

		int bilgisayarZari = random.nextInt(1,7);
		
		if(oyuncuZari > bilgisayarZari) {
			System.out.println("Oyuncu kazandı.");
		} else if(bilgisayarZari > oyuncuZari) {
			System.out.println("Bilgisayar kazandı.");
		} else {
			System.out.println("Beraberlik");
		}
		
		System.out.println("Oyuncu zarı : " + oyuncuZari);
		System.out.println("Bilgisayar zarı : " + bilgisayarZari);
	}

}

package tic.tac.toe;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// seçimlik ödev : bilgisayar hamle yaparken oyuncunun kazanacak pozisyonu varsa engellesin
public class Oyun {

	static String[] oyunTahtasi = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static final String OYUNCU_KAZANAN_DIZISI = "XXX";
	static final String BILGISAYAR_KAZANAN_DIZISI = "OOO";
	static final String OYUNCU_KAZANMAYA_YAKIN = "XX"; // X 2 X 
	

	public static void main(String[] args) {

		boolean kazananVar = false;

		while (true) {

			oyunTahtasiGoster();

			kazananVar = kazananKontroluYap(BILGISAYAR_KAZANAN_DIZISI);

			if (kazananVar == true) {
				System.out.println("Oyun bitti");
				break;
			}

			oyuncuHamlesi();

			oyunTahtasiGoster();

			kazananVar = kazananKontroluYap(OYUNCU_KAZANAN_DIZISI);

			if (kazananVar == true) {
				System.out.println("Oyun bitti");
				break;
			}

			bilgisayarHamlesi();
		}
	}

	static boolean kazananKontroluYap(String kontrolEdilecekHamle) {

		boolean kazananVar = false;
		// 2. ödev : for döngüsü yazarak sadeleştirin
		for (int i = 0; i < 3 ; i++) {
			if(kontrolEdilecekHamle.equals(oyunTahtasi[i*3] + oyunTahtasi[i*3+1] + oyunTahtasi[i*3+2])||
					kontrolEdilecekHamle.equals(oyunTahtasi[i] + oyunTahtasi[i+3] + oyunTahtasi[i+6]) ||
					kontrolEdilecekHamle.equals(oyunTahtasi[0] + oyunTahtasi[4] + oyunTahtasi[8])     ||
					kontrolEdilecekHamle.equals(oyunTahtasi[2] + oyunTahtasi[4] + oyunTahtasi[6])) {
				if (kontrolEdilecekHamle.equals(OYUNCU_KAZANAN_DIZISI)) {
					System.out.println("Oyuncu kazandı");
				} else {
					System.out.println("Bilgisayar kazandı");
				}
			}
			
		}
		
		if (kontrolEdilecekHamle.equals(oyunTahtasi[0] + oyunTahtasi[1] + oyunTahtasi[2])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[3] + oyunTahtasi[4] + oyunTahtasi[5])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[6] + oyunTahtasi[7] + oyunTahtasi[8])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[0] + oyunTahtasi[3] + oyunTahtasi[6])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[1] + oyunTahtasi[4] + oyunTahtasi[7])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[2] + oyunTahtasi[5] + oyunTahtasi[8])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[0] + oyunTahtasi[4] + oyunTahtasi[8])
				|| kontrolEdilecekHamle.equals(oyunTahtasi[2] + oyunTahtasi[4] + oyunTahtasi[6])) {

			if (kontrolEdilecekHamle.equals(OYUNCU_KAZANAN_DIZISI)) {
				System.out.println("Oyuncu kazandı");
			} else {
				System.out.println("Bilgisayar kazandı");
			}

			kazananVar = true;
		}

		return kazananVar;
	}

	static void bilgisayarHamlesi() {
		Random rastgeleSayiUretici = new Random();

		while (true) {// bilgisayar daha önce hamle yapılmamış bir yer bulana kadar döngü iççinde
						// dönecek ve
			// ve rastgele yeni bir index oluşturacak
			int bilsayarSecilenIndex = rastgeleSayiUretici.nextInt(0, 9);
			if (oyunTahtasi[bilsayarSecilenIndex] != "X" && oyunTahtasi[bilsayarSecilenIndex] != "O") {
				oyunTahtasi[bilsayarSecilenIndex] = "O";
				break;
			}
		}

	}

	static void oyuncuHamlesi() {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Oyun Tahtasından sayı seçiniz : ");

			byte secilenSayi = input.nextByte();

			byte secilenSayiIcinIndex = (byte) (secilenSayi - 1); // casting

			if (oyunTahtasi[secilenSayiIcinIndex] != "X" && oyunTahtasi[secilenSayiIcinIndex] != "O") {
				oyunTahtasi[secilenSayiIcinIndex] = "X";
				break;
			} else {
				System.out.println("Hatalı hamle. Daha önce aynı yere hamle yapılmış.");
			}

		}

	}

	// code reuse : aynı kodları tekrar kullanmak
	static void oyunTahtasiGoster() {
		//1. ödev : for döngüsü ile sadeleştirin
		
		//int satirSayisi = (int)Math.sqrt(oyunTahtasi.length);
		System.out.println("-------------");
		
		for (int i = 0; i < oyunTahtasi.length ; i+=3) {
			System.out.println("| " + oyunTahtasi[i] + " | " + oyunTahtasi[i + 1] + " | " + oyunTahtasi[i + 2] + " |");
			System.out.println("-------------");
		}
		

		
//		System.out.println("| " + oyunTahtasi[0] + " | " + oyunTahtasi[1] + " | " + oyunTahtasi[2] + " |");
//		System.out.println("-------------");
//		System.out.println("| " + oyunTahtasi[3] + " | " + oyunTahtasi[4] + " | " + oyunTahtasi[5] + " |");
//		System.out.println("-------------");
//		System.out.println("| " + oyunTahtasi[6] + " | " + oyunTahtasi[7] + " | " + oyunTahtasi[8] + " |");
		

		System.out.println();
		System.out.println("#############");
		System.out.println();
	}
}

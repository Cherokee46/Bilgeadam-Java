package com.bilgeadam.java.ders2;

import java.util.Scanner;

public class CiftSayiTekSayi {

	// program kullanıcının girdiği sayıları çift veya tek olarak ekrana yazdıracak.
	// kullanıcı 3 kez programı kullandıktan sonra
	// kullanıcıya çıkıp çıkmak istemediği sorulacak
	public static void main(String[] args) {

		int sayac = 0;

		while (true) { // kapsam/ kod bloğu

			System.out.print("Bir sayı giriniz :");

			Scanner input = new Scanner(System.in);

			int sayi = input.nextInt();

			if (sayi % 2 == 0) {// % : mod / remainder
				System.out.println(sayi + " Çift Sayıdır.");
			} else {
				System.out.println(sayi + " Tek Sayıdır");
			}

			sayac++; // kullanıcı programı her kullandıktan sonra sayacı 1 arttırıyorum
			//if (sayac >= 3) {
			if (sayac % 3 == 0) { // kullanıcı her 3 sefer oynadıktan sonra çıkıp çıkmayacağını sormak için
				System.out.print("Devam etmek için d, çıkmak için x tuşuna basınız : ");

				String kullaniciCikisTercihi = input.next();

				if (kullaniciCikisTercihi.equals("x")) {
					System.out.println("Tekrar görüşmek üzere. Güle güle.");
					break;
				}
			}

		}
	}

}

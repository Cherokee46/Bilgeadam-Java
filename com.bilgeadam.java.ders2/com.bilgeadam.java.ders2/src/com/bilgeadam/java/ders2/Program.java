package com.bilgeadam.java.ders2;

import java.time.LocalDate;
import java.util.Scanner;

// Kullanıcıdan doğum yılını alarak  yaş hesaplayan programı yazınız.
public class Program {

	public static void main(String[] args) {

		int guncelYil = LocalDate.now().getYear();
		
		while (true) // sonsuz döngü(endless loop) >> kilitler (dead lock)
		{
			System.out.print("Doğum Yılınız :");

			Scanner input = new Scanner(System.in);

			// Exception Handling: istinai durum yönetimi
			try {
				short dogumYili = input.nextShort();
				
				if(dogumYili < 1900 || dogumYili > guncelYil) {// parantezler içindeki önerme true döner if kod bloğu içine
					// devam edilir, önerme false dönerse if kod bloğu içine girilmez.
					System.out.println("Hatalı giriş yaptınız. Lütfen sadece doğum yılı giriniz.");
					continue;
				}
				
//				if(dogumYili > guncelYil) {
//					System.out.println("Hatalı giriş yaptınız. Lütfen sadece doğum yılı giriniz.");
//					continue;
//				}
				
				byte yas = (byte) (guncelYil - dogumYili);// bilinçli tür dönüşümü

				System.out.println("Yaşınız : " + yas);
				
				break; // while döngüsünden çıkılmasını
			} catch (Exception e) {
				System.out.println("Hatalı giriş yaptınız. Lütfen sadece doğum yılı giriniz.");
			}

		}

	}

}

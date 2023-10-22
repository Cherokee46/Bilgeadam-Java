package katmanli.mimari.presentation.layer;

import java.time.LocalDate;
import java.util.Scanner;

import katmanli.mimari.business.logic.layer.PersonelManager;
import katmanli.mimari.model.Personel;

public class Program {
	public static void main(String[] args) {
		System.out.println("PERSONEL YÖNETİM SİSTEMİ");
		
		System.out.println("Yeni personel için veri girişi yapınız.");
		System.out.print("TC Kimlik No : ");

		Scanner girdi = new Scanner(System.in);

		long tcKimlikNo = girdi.nextLong();

		System.out.print("Ad : ");
		String ad = girdi.next();

		System.out.print("Soyad : ");
		String soyad = girdi.next();

		System.out.print("Doğum Tarihi(yıl-ay-gün) :");
		String strDogumTarihi = girdi.next();
		LocalDate dogumTarihi = LocalDate.parse(strDogumTarihi); // String veri tipinden Localdate veri tipine

		Personel personel = new Personel(tcKimlikNo, ad, soyad, dogumTarihi);
		
		System.out.println("Presentation Layer : " + personel);
		
		PersonelManager manager = new PersonelManager();
		manager.kaydet(personel);// iki nesne arasında mesajlaşma nesne metodları ve parametreleri ile yapılır.
		
	}
}

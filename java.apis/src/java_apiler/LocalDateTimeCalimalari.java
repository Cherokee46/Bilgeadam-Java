package java_apiler;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeCalimalari {

	public static void main(String[] args) {
		
		LocalDate simdi = LocalDate.now();
		
		System.out.println(simdi);
		System.out.println(simdi.withYear(2050));
		System.out.println(simdi.withMonth(1));
		System.out.println(simdi.withDayOfMonth(31));
		
		System.out.println(simdi.plusWeeks(1));
		System.out.println(simdi.plusDays(3));
		System.out.println(simdi.plusMonths(1));
		System.out.println(simdi.plusYears(10));
		
	
		System.out.println(simdi.plusDays(-10));
		System.out.println(simdi.minusDays(-10));
		
		
		System.out.println(simdi.getYear());
		System.out.println(simdi.getMonthValue());
		System.out.println(simdi.getMonth());
		System.out.println("haftanın günü : " + simdi.getDayOfWeek());
		System.out.println("ayın günü : " + simdi.getDayOfMonth());
		System.out.println("yılın günü : " + simdi.getDayOfYear());
		
		//tarih bilgisi içinden alınan ayı türkçe olarak yazdırmak istiyorum
		String[] turkceAylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
		
		int aySaymaSayisi = simdi.getMonthValue();
		
		int ayIndex =  aySaymaSayisi - 1;
		
		String turkceAyAdi = turkceAylar[ayIndex];
		
		System.out.printf("İçinde bulunduğumuz ay : %s", turkceAyAdi);
		
		System.out.println();
		// Yukarıdaki 4 satır kod yerine aşağıdaki tek satır ile yazılabilir
		System.out.printf("İçinde bulunduğumuz ay : %s", turkceAylar[simdi.getMonthValue()-1]);
		
		System.out.println();
		
		LocalDate yeniTarih = LocalDate.of(2000, 02, 07);
		System.out.println(yeniTarih);
		
		yeniTarih = LocalDate.of(2000, Month.FEBRUARY, 07);
		System.out.println(yeniTarih);
		
		ZoneId istanbul = ZoneId.of("Europe/Istanbul");
		System.out.println(ZonedDateTime.now(istanbul));
		
		// Japonyada tarih/saat kaç?
		System.out.println(ZonedDateTime.now(ZoneId.of("Japan")));

	}

}

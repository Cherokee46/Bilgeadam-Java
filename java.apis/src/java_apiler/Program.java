package java_apiler;

import java.util.Random;

// boiler-plate code
public class Program {

	public static void main(String[] args) {
		
		// arkadaşlarımın yaşları
		int ali = 23, veli = 25, fatma = 24, ahmet = 19;
		
		String s1 = "Arkadaşlarım "+ ali + ", " + veli + ", " + fatma + ", " + ahmet + " yaşındalar";
		// % işaretiyle başlayan ifadeler yer tutucudur : placeholder
		String s2 = String.format("Arkadaşlarım %d, %d, %d, %d yaşındalar.", ali, veli, fatma, ahmet);
		
		System.out.println(s2);
		
		System.out.printf("Arkadaşlarım %d, %d, %d, %d yaşındalar.\n", ali, veli, fatma, ahmet);
		
		float sayi = 1.23456789F;
		
		System.out.printf("sayı : %.2f \n", sayi);
		
		String adSoyad = "Ali Veli";
		
		System.out.printf("%s 50 yaşındadır \n", "Ali Veli");
		
		int faturaNo = 3;
		
		System.out.printf("Fatura no : %d", faturaNo);	
		System.out.println();
		
		System.out.printf("Fatura no : %7d", faturaNo);
		
		System.out.println();
		
		System.out.printf("Fatura no : %07d", faturaNo);
		
		System.out.println();
		
		System.out.printf("Fatura no : %7d", faturaNo);
		
		System.out.println();
		
		int x = 123_456_789;
		double d = 123_456_789.12;
		
		System.out.printf("tam sayı : %,d - noktalı sayı : %,.2f", x, d); // virgül sayı okumayracı eklemek istediğimizi gösteriyor
		// ayraç seçimi işletim sistemi ayarlarından alınıyor
		
		int positiveNumber = 123;
		int negativeNumber = -456;
		
		String pNumber = String.format("% d", positiveNumber); // sayı positive ise boşluk karakteri
		String nNumber = String.format("% d", negativeNumber); // sayı negative ise eksi işareti gelir
		System.out.println();
		System.out.println(pNumber);
		System.out.println(nNumber);
		
		pNumber = String.format("%+d", positiveNumber);
		nNumber = String.format("%+d", negativeNumber);
		System.out.println();
		System.out.println(pNumber);
		System.out.println(nNumber);
		
		
		pNumber = String.format("%(d", positiveNumber);
		nNumber = String.format("%(d", negativeNumber);
		System.out.println();
		System.out.println(pNumber);
		System.out.println(nNumber);
		
		
		System.out.println();
		
		
		String ad = "İzzet";
		String ikinciAd = "Cemil";
		String soyad = "Bozoğlu";
		
		System.out.printf("%s %s %s", ad, ikinciAd, soyad); // İzzet Cemil Bozoğlu
		System.out.println();
		System.out.printf("%3$s, %1s %2$s", ad, ikinciAd, soyad); // Bozoğlu, İzzet Cemil
		System.out.println();
		System.out.printf("%3$s, %<s %2$s", ad, ikinciAd, soyad); // Bozoğlu, Bozoğlu Cemil
		System.out.println();
		
		String str = "Ali"; // Ali (bellekte ref edilmeyen veri olarak kaldı. çünkü String immutable veri tipi)
		str += " Veli"; // Ali Veli
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ali"); // Ali (StringBuilder murable bir sınıf olduğu için Ali verisi havada kalmaz.)
		sb.append(" Veli"); // Ali Veli(veriler ram bölgesi genişletilerek yazılır)
		
		System.out.println(sb);// java.lang.StringBuilder
		
		Random random = new Random();
		
		System.out.println(random);
		
		int[] arr = new int[2];
		
		System.out.println(arr);

	}

}

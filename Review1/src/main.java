

import java.util.Scanner;

//analiz : kullanıcıdan iki sayı isteyip
		// alınan iki sayıyla sırasıyla toplama, çıkarma,çarpma ve bölme
		// yaparak sonucu aşağıdaki örnek gibi console ekranına yazan uygulamayı geliştirin:
		// Örnek : 5 + 4 = 9
		// 
		// yeni müşteri talebi: kullanıcı 4 işlem birden görmek istemiyor
		// hangi işlemi görmek istediğini kendi seçmek istiyor
		
		// yazılım teste giden uygulama test sonucunda hatalı bir menü seçildiğinde kullanıcı 
		// menüye dönüp doğru bir seçim yapması gerekiyor uyarısında bulunuldu

public class main {
	
	static final String ESITTIR = " = ";
	static final String ARTI = " + ";
	static final String EKSI = " - ";
	static final String CARPI = " x ";
	static final String BOLU = " / ";
	static final String TOPLAMA_MENU = "T";
	static final String CIKARMA_MENU = "Ç";
	static final String CARPMA_MENU = "X";
	static final String BOLME_MENU = "B";
	
	// entry point : başlangıç noktası
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz :");
		
		int sayi1 = girdi.nextInt();
		
		System.out.print("İkinci sayıyı giriniz :");
		
		int sayi2 = girdi.nextInt();
		
		// '\' karakteri escape character çift tırnak içinde 
		// çift tırnak yazmak istersen kullanılır:
		// \n : new line : yeni satıra geç
		
		while(true) {// sonuc değişkeninin değeri 0 olduğu sürece döngü dönmeye devam etsin
							// döngü içerisinde sonuc değişkeninin değeri değişirse döngüden çıkılması sağlanır
			System.out.print("İşlem seçenekleri : \n"
					+ "toplama için \""+ TOPLAMA_MENU +"\"" +
					"\n"+
					"çıkarma için \""+ CIKARMA_MENU+"\""+
					"\n"+
					"çarpma için \""+ CARPMA_MENU +"\""+
					"\n"+
					"bölme için \""+ BOLME_MENU+"\" yazınız :");
			
			String kullaniciTercihi = girdi.next();
			
			// Buraya kadar main metodunu işi
			// bundan sonrası ayrı bir metoda görev olarak verilmeli :
			
			boolean hataYok = islemYap(kullaniciTercihi, sayi1, sayi2);
			
			if(hataYok == true) {
				break;
			}
		}
	}
	// metod tanımı, çalışması için başka bir metoddan çağrılması gerekir.
	public static boolean islemYap(String kullaniciTercihi, int sayi1, int sayi2 ) {
		int sonuc = 0;
		boolean hataYok = true;
		
		if(kullaniciTercihi.equalsIgnoreCase("t")) { // equalsIgnoreCase metodu harfin küçük veya büyük omasını göz ardı ederek eşitliği değerlendirir
			topla(sayi1,sayi2);
		} else if(kullaniciTercihi.equalsIgnoreCase("ç")) { // equalsIgnoreCase metodu harfin küçük veya büyük omasını göz ardı ederek eşitliği değerlendirir
			cikar(sayi1, sayi2);
		} else if(kullaniciTercihi.equalsIgnoreCase("x")) { // equalsIgnoreCase metodu harfin küçük veya büyük omasını göz ardı ederek eşitliği değerlendirir
			carp(sayi1, sayi2);
		} else if(kullaniciTercihi.equalsIgnoreCase("b")) { // equalsIgnoreCase metodu harfin küçük veya büyük omasını göz ardı ederek eşitliği değerlendirir
			bol(sayi1, sayi2);
		} else {
			hataYok = false;
			System.out.println("###############\nHatalı bir seçim yaptınız.\n###############");
		}
		
		return hataYok;
	}
	
	public static void topla(int sayi1, int sayi2) {
		System.out.println(sayi1 + ARTI + sayi2 + ESITTIR + (sayi1 + sayi2));
	}
	
	public static void cikar(int sayi1, int sayi2) {
		System.out.println(sayi1 + EKSI + sayi2 + ESITTIR + (sayi1 - sayi2));
	}
	
	public static void carp(int sayi1, int sayi2) {
		System.out.println(sayi1 + CARPI + sayi2 + ESITTIR + (sayi1 * sayi2));
	}
	
	public static void bol(int sayi1, int sayi2) {
		System.out.println(sayi1 + BOLU + sayi2 + ESITTIR + (sayi1 / sayi2));
		System.out.println("Kalan : " + (sayi1 % sayi2));
	}
	
}

package com.bilgeadam.java.ders2;

public class Main {

	// f(x)
	// f(y)
	public static void main(String[] izzet) {

		// byte, short, int, long
		// double,float
		// boolean
		// char

		char c = 'c';

		// System.out.println(c + 1);

		long buyukSayi = 5_000_000_000L;
		float noktaliSayi = 2.3F;

		int x = 3; // bir değeişkende değer atadık / initial value assignment
		int y = 5;

		// x ve y değişkenlerinin tuttuğu değerler yer değiştirsin
		// çözümü için basit bir algoritma yazın
		// int z = x; // z = 3 // buffer: geçici saklama alanı

		// x = y; // x = 5
		// y = z; // y = 3

		// x ve y değişkenlerinin tuttuğu değerleri 3. değişken kullanmadan yer
		// değiştirin

		x = x + y; // x = 8
		y = x - y; // y = 3
		x = x - y; // x = 5

//		System.out.println(x == y);
//		System.out.println(x != y);
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);

		// p = 1, q = 0 için p V q = 1, p ^ q = 0, p' = 0
		// 0 : false, 1: true

		// ve : &&, veya : ||, değil : !

		int sayi = 5;

		sayi = sayi + 1; // sayi = 5 + 1 // 6

		System.out.println(sayi);

		sayi++; // sayi değişkeninin değeri 1 artar

		System.out.println(sayi);

		int a = sayi++;// önce sayi değişkenin değerini a değişkenine ver.
		// sonra sayi değişkeninin değerini 1 arttır

		System.out.println("a: " + a);
		System.out.println("sayi: " + sayi);

		int b = ++sayi;// önce sayi değişkeninin değerini 1 arttrı sonra
		// b değişkenine ver

		System.out.println("b: " + b); // bilinçsiz tür dönüşümü "b: " + "9" > "b: 9"
		System.out.println("sayi: " + sayi);

		sayi--;
		--sayi;
		System.out.println("sayi: " + sayi);                                                                 
                                                                                                             
		// Referans veri tipleri                                                                             
                                                                                                             
		String ad = "Ali";// 'A','l','i'                                                                     
                                                                                                             
		System.out.println(ad);                                                                              
                                                                                                             
		// int long = 2;                                                                                     
		int String = 1;                                                                                      
                                                                                                             
		String adSoyad = "Ali " + "Veli";// concat                                                           
                                                                                                             
		System.out.println(adSoyad);                                                                         
                                                                                                             
		// ad = ad + " Veli";                                                                                
		ad += " Veli";// += operatörü kaçınmanız gereken bir operatör                                        
		// String veri tipi ile oluşturlan metinler immutable : değiştirilemez                               
		System.out.println(ad);                                                                              
                                                                                                             
		System.out.println(1 + 2 + " Ali");
		System.out.println("Ali" + 1 + 2);

	}

}

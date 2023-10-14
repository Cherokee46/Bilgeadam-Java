package com.bilgeadam.java.ders3;

public class Program {// class kapsamı bu parantezle başlar

	static int a,b=7,c; //sınıf değişkenlerine JVM varsayılan değer verir.
	// tam sayılar için default değer  : 0
	// noktalı sayıla için : 0.0
	// boolean için : false
	// char için : ''
	
	static boolean _boolean;
	
	// entry point : giriş noktası: başlangıç noktası
	// static bir metoddan ancak static olan değişkenler kullanılabilir
	public static void main(String[] args) { // main metodu kapsamı bu parantezle başlar
		// scope / code block
		// local variable : yerel değişken / 
		//yerel değişkenlere ilk değer ataması kullanılmadan önce yapılması şarttır.
		int x, y = 3, z;
		x = 1; // ilk değer ataması
		
		System.out.println("x : " + x);
		System.out.println("a : " + a);
		System.out.println("_boolean değeri  : " + _boolean);

	}// main metodu kapsamı bu parantezle biter
	
	// GSM : 0533 139 75 34

}// class kapsamı bu parantezle biter

package com.bilgeadam.java.ders3;

public class Program2 {

	static int i = 33;
	
	public static void main(String[] args) {
		
		byte k = 1; // byte i = 1; // metodun üst kapsamında olan bir değişkeni alt kapsamda kullanamazsınız
		
		while(k <=10) {
			System.out.println(k);
			k += 1; // i = i + 1; / i++;
		}
		
		for(int i = 0; i <=10;i++) {// metodun farklı alt kapsamlarda aynı değişken adı kullanılabilir.
			System.out.println(i);
		}
		
		for(int i = 0; i <=100;i+=5) {
			System.out.println(i);
		}
		
		for(char i = 100 ; i >0; i-=5) {
			System.out.println((int)i);
		}
		
		System.out.println(i);

	}

}

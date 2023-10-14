package oop.polymorphism;

import oop.polymorphism.model.*; // * : ALL (Hepsi)

public class Program {

	public static void main(String[] args) {

		String ses = Kedi.SES; // bir sınıfın static ile tanımlanmış öğelerine sınıf üzerinden direkt olarak
		// erişilebilir. Nesne oluştrumaya gerek kalmaz. Best practice sınıf üzerinden erişmektir.
		
		Kedi kedi = new Kedi();
		kedi.setFamilya("Kedigiller");
		kedi.setBoy(.8);
		kedi.setKilo(7.0);
		kedi.setKuyrukUzunlugu(.1);
		
		kedi.sesVer();
		
		ses = kedi.SES; // sınıfın sabit üyesine nesneleri üzerinden erişebilebilir. Fakat bu yöntem tavsiye
		//edilmez.
		
		Kopek kopek = new Kopek();
		
		kopek.setFamilya("Kopekgiller");
		kopek.setBoy(1.1);
		kopek.setKilo(12.6);
		
		kopek.sesVer();
		
		Zurafa zurafa = new Zurafa();
		
		zurafa.setBoy(4.1);
		zurafa.setFamilya("Atgiller");
		zurafa.setBoyunUzunlugu(2.3);
		zurafa.setKilo(180);
		
		Hayvan[] hayvanlar = new Hayvan[5];
		// kedi is-a Hayvan
		hayvanlar[0] = kedi; //polymorphism : Inheritance
		hayvanlar[1] = kopek;
		hayvanlar[2] = zurafa;
		
		hayvanSesleri(hayvanlar);
		
	}
	
	private static void hayvanSesleri(Hayvan[] hayvanlar) {
		
		final String A_DEGERI = "a";
		
		String s = "a";
		
		s = null;
		
		if("a".equals(s)) {
			
		}
		
		// polymorphism : method overrriding
		for (int i = 0; i < hayvanlar.length; i++) {
			if(hayvanlar[i] != null) {
				hayvanlar[i].sesVer();
			}
		}
		
	}

}

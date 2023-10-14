package oop.polymorphism.model;

public class Kedi extends Hayvan {
	
	// bu sınıftan oluşturulacak bütün nesneler için ortak bir tanım yapacaksak
	// static kelimesi kullanılır.
	//class member/variable
	public static final String SES =  "Miyav";
	
	//instance(nesne) variable
	private double kuyrukUzunlugu;

	public double getKuyrukUzunlugu() {
		return kuyrukUzunlugu;
	}

	public void setKuyrukUzunlugu(double kuyrukUzunlugu) {
		this.kuyrukUzunlugu = kuyrukUzunlugu;
	}
	
	@Override
	public void sesVer() { // eğer superclass da yazılan metod static değilse override eden metodda static olamaz
		// static yapılırsa override edilemez.
		System.out.println(SES);
	}

	// sesVer overloaded
	//@Override
	public void sesVer(int kacKere) {// static kelimesi metodun imzasına dahil değildir.
		for (int i = 0; i < 3; i++) {
			sesVer();
		}
	}
	
	//@Override
	public void tırmala() {
		System.out.println("tırmalıyor");
	}
	
	
}

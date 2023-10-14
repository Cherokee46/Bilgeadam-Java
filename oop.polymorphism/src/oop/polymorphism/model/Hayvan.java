package oop.polymorphism.model;

// Java bean standartı gereklerinden getter/setter metodlarına sahip olmalı
public class Hayvan {
	// field
	private double kilo;
	private double boy;
	
	// bu sınıftan extend edecek sınıflarda bu metodu override etmeyecekse static olabilir
	public void sesVer() {
		System.out.println("Hayvan sesi");
	}
	
	public static void nefesAl() {
		System.out.println("Nefes aldı");
	}
	
	// field + getter/setter = attribute / property
	private String familya;
	public String getFamilya() {
		return familya;
	}

	public void setFamilya(String familya) {
		this.familya = familya;
	}
	/////////////////////////////////////////////
	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}
	
	
	
	
}

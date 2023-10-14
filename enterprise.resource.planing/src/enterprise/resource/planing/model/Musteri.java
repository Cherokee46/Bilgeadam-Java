package enterprise.resource.planing.model;

import java.time.LocalDate;

public class Musteri extends Kisi{

	private double borcu;
	
	public void alisverisYap() {
		System.out.println("Müşteri alışveriş yaptı");
	}
	
	public void borcOde(double odemeMiktari) {
		//this.borcu = this.borcu - odemeMiktari;
		this.borcu -= odemeMiktari;
		System.out.println("Müşteri "+ odemeMiktari+ " kadar borcunu ödedi yaptı");
	}
}

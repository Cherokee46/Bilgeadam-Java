package oop.polymorphism.model;

public class Kopek extends Hayvan {
	
	public static final String SES =  "Hav";
	
	@Override
	public void sesVer() {
		System.out.println(SES);
	}
}

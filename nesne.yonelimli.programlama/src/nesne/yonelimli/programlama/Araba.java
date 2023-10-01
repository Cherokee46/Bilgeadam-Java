package nesne.yonelimli.programlama;

// DRY : Dont repeat yourself
// MotorluTasit sınıfı Araba sınıfı için parent, super class, base
// Araba sınıfı MotorluTasit sınıfı için sub class, child
public class Araba extends MotorluTasit{ // extends kelimesi sınıfımız için inheritance(devralma) sağladı. 
// yani Motorlu taşıt sınıfının bütün özelliklerini ve metodlarını Araba sınıfına vermiş oldum
	
	private byte koltukSayisi;

	private byte kapiSayisi;
	
	public byte getKoltukSayisi() {
		return koltukSayisi;
	}
	public byte getKapiSayisi() {
		return kapiSayisi;
	}
	public void setKoltukSayisi(byte koltukSayisi) {
		this.koltukSayisi = koltukSayisi;
	}
	public void setKapiSayisi(byte kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}
	

	
}

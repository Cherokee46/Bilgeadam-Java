package nesneyeYönelim;

//DRY : dont repeat yourself
//MotorluTasıt sınıfı Araba sınıfı için parent, superclass, base
// Araba sınıfı MotorluTasıt sınıfı için sub-class, child..

public class Araba extends MotorluTasıt{  // extends ile sınıfımız için inhereitance sağlamaktadır , devralma sağlandı..
// yani Motorlu Tasıt sınıfının tüm özellikler araba sınıfına devredilmiş olur..
	
	private byte koltukSayısı;
	private byte kapıSayısı;
	
	public byte getKoltukSayısı() {
		return koltukSayısı;
	}
	public void setKoltukSayısı(byte koltukSayısı) {
		this.koltukSayısı = koltukSayısı;
	}
	public byte getKapıSayısı() {
		return kapıSayısı;
	}
	public void setKapıSayısı(byte kapıSayısı) {
		this.kapıSayısı = kapıSayısı;
	}
	

	
}

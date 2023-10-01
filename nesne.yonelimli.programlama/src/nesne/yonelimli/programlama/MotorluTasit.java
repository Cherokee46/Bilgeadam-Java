package nesne.yonelimli.programlama;

import java.time.LocalDate;

public class MotorluTasit {

	// constructor metodu bir sınıftan nesne oluşturulmasını sağlayan özel metoddur.
	// Diğer metodlardan iki yönüyle ayrılır:
	// 1. constructor metodu içinde bulunduğu sınıfın adını alır
	// constructor metodunun dönüş tipi olmaz, yoktur
	// sınıf içerisinde yazılmasa bile constructor compiler tarafından var kabul
	// edilir.
	// public MotorluTasit() {
	// TODO Auto-generated constructor stub
	// }

	// data / model : veri
	private String marka;// field : alan // field + getter/setter : property / attribute
	private String model;
	private double motorgucu;
	private String seriNo;
	private LocalDate uretimTarihi;
	
	// marka için ilk değer atanmasını ve sonra da değerinin değiştirlebilmesini sağlar
	// setter method
	public void setMarka(String marka) {
		this.marka = marka; // this kelimesi bu sınıf anlamına gelir
		// yazılan ifade bu sınıfın markasına metod parametresi olan marka değeri ata anlamına gelir
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMotorgucu() {
		return motorgucu;
	}

	public void setMotorgucu(double motorgucu) {
		this.motorgucu = motorgucu;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public LocalDate getUretimTarihi() {
		return uretimTarihi;
	}

	public void setUretimTarihi(LocalDate uretimTarihi) {
		this.uretimTarihi = uretimTarihi;
	}

	// getter method
	public String getMarka() {
		return this.marka;
	}
	
	// behavior: metod
	public void calis() {
		System.out.println(marka + " " + model + " çalıştı");
	}

	public void dur() {
		System.out.println(marka + " " + model + " durdu");
	}
	
	// kendisine ait bir field ı olmayan ve diğer fieldları kullanarak hesaplamalarla veri sunan 
	// metoda computed/calculated property
	public byte getYas() {
		
		int guncelYil = LocalDate.now().getYear();
		int uretimYili = uretimTarihi.getYear();
		
		return (byte)( guncelYil - uretimYili );
	}
}

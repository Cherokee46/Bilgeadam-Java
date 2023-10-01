package nesneyeYönelim;

import java.time.LocalDate;
import java.util.function.LongUnaryOperator;

public class MotorluTasıt {

	// constructor metodu bir sınıftan nesne oluşturulmasını sağlayan method dur..
	// diğer method lardan ikii yönüyle ayrılır ; 
	// 1. constructor methodu içinde bulunduğu sınıftan adını alır
	// 2. constructor methodunun dönüş tipi yoktur, olmaz.
	// sınıf içerisinde yazılmasa bile Constructor compiler tarafından var kabul edilir..
	
	public MotorluTasıt() {
		
	}
	
	//data/model : veri
	private static String marka; // field : alan
	
	 // to provide encapsulation  by setter/ getter methods..
	//setter methodu.. marka için ilk değer atanmasını ve sonrada değerinin değiştirelebilmesini sağlar..
	public void setMarka(String marka) {
		this.marka=marka;  // this kelimesi bu sınıf anlamına gelir.. yazılan ifade bu sınıfın markasına method parametresi olan marka değerini ata..
	}
	// getter methodu ..
	public String getMarka(String marka) {
		this.getMarka(marka);  
	}
	
	public static String getModel() {
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

	public LocalDate getUretimTarihi() {
		return uretimTarihi;
	}

	public void setUretimTarihi(LocalDate uretimTarihi) {
		this.uretimTarihi = uretimTarihi;
	}

	public static String getMarka() {
		return marka;
	}

	
	private static String model;
	private double motorgucu;
	private LocalDate uretimTarihi;
	
	void calıs() {
		System.out.println(marka + " " + model + " "+ motorgucu + " çalıştı" );
	}
	
	void dur() {
		System.out.println(marka + " " + model + " "+ motorgucu + " durdu" );
	}
	
	
	// kendisine air bir field ı olmayan ve diğer fieldları kullanrak hesaplamalarla veri sunan methoda computed property denir..
	private byte getYas() {
		
		int guncelYıl = LocalDate.now().getYear();
		int uretimYılı = uretimTarihi.getYear();
		
		return (byte) (guncelYıl - uretimYılı);
	}
	
	
}

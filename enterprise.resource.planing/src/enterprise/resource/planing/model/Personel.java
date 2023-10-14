package enterprise.resource.planing.model;

import java.time.LocalDate;

public class Personel extends Kisi {
	// members : fields + methods
	// fields
	private long tcKimlikNo;
	private String ad;
	private String soyad;
	private boolean evliMi;
	private LocalDate emeklilikTarihi;

	public long getTcKimlikNo() {
		this.tcKimlikNo = 1;
		super.tcKimlikNo = 2;
		return tcKimlikNo;
	}

	public void setTcKimlikNo(long tcKimlikNo) {
		// 11 basamaklı sayı değilse
		//if(tcKimlikNo >= 10000000000L &&  tcKimlikNo < 99999999999L)
		// T.C. Kimlik no  algoritması konrtol ettirilip
		// Kullanıcıya hatalı T.C. kimlik no giridği bilgisi verilecek
		// Algoirtma : ilk 10 basamağın toplanın birler basamağı 11. rakamı verir
		if (tcKimlikNo < 10000000000L || tcKimlikNo > 99999999999L) {
			throw new IllegalArgumentException("T.C. Kimlik No 11 basamaklı olmalıdır.");
		}
		
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public boolean isEvliMi() {
		return evliMi;
	}

	public void setEvliMi(boolean evliMi) {
		this.evliMi = evliMi;
	}

	public LocalDate getEmeklilikTarihi() {
		return emeklilikTarihi;
	}

	public void setEmeklilikTarihi(LocalDate emeklilikTarihi) {
		this.emeklilikTarihi = emeklilikTarihi;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	private LocalDate dogumTarihi;
	private byte cocukSayisi;
	private byte yas; // yaş verisini doğumTarihi özelliğinden hesaplayarak çıkardığım için gereke
						// kalmadı

	// nesnenin verilerini kullanarak yapılan işleler sonrasında
	// başka bir veri üreten metodlara computed/calculated property/attribute denir
	public byte getYas() {
		// yas = (byte) (LocalDate.now().getYear() - dogumTarihi.getYear());
		// return yas;

		return (byte) (LocalDate.now().getYear() - dogumTarihi.getYear());
	}

	// elimizde personelin doğum tarihi olması nedeiyle yaşın set edilmesine izin
	// verilmez
	private void setYas(byte yas) {
		this.yas = yas;
	}

	// setter : set + field adi (ilk harf büyük)
	// veri ataması ve değiştirmesi
	public void setCocukSayi(byte cocukSayisi) {
		if (cocukSayisi < 0 || cocukSayisi > 20) {
			throw new IllegalArgumentException("Çocuk sayısı 0 dan az olmaz!");
		}
		this.cocukSayisi = cocukSayisi; // this: bu sınıfın kendisi anlamına geliyor
	}

	// getter : get + field adi (ilk harf büyük)
	// veri okuma
	public byte getCocukSayisi() {
		return this.cocukSayisi;
	}

}

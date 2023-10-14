package okul.yonetim.sistemi.model;

import java.time.LocalDate;

public class Ogrenci extends Kisi {

	// varsayılan constructor kayboldu, paramtresiz constructor kullanamayız artık
	public Ogrenci(long tcKimlikNo, String ad, String soyad, int okulNo, LocalDate dogumTarihi, float notOrtalamasi) {
		
		this.setTcKimlikNo(tcKimlikNo);
		this.setAd(ad);
		this.setSoyad(soyad);
		this.okulNo = okulNo;
		this.dogumTarihi = dogumTarihi;
		this.notOrtalamasi = notOrtalamasi;
	}
	
	private int okulNo;
	private LocalDate dogumTarihi;
	private float notOrtalamasi;
	
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public float getNotOrtalamasi() {
		return notOrtalamasi;
	}
	public void setNotOrtalamasi(float notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

}

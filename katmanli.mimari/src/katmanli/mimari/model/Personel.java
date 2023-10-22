package katmanli.mimari.model;

import java.time.LocalDate;

public class Personel {
	
	private long tcKimlikNo;
	private String ad;
	private String soyad;
	private LocalDate dogumTarihi;
	
	public String toCSVString() {
		return tcKimlikNo + ";" + ad + ";"+ soyad + ";" + dogumTarihi.getDayOfMonth() + "." + 
				dogumTarihi.getMonthValue() + "." + dogumTarihi.getYear();
	}
	
	public Personel() {}
	
	public Personel(long tcKimlikNo, String ad, String soyad, LocalDate dogumTarihi) {
		//super(); Object sınıfının constructor metodu
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Personel [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	//computed / calculated property
	public byte getYas() {
		return (byte)(LocalDate.now().getYear() - dogumTarihi.getYear());
	}
	
	public long getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(long tcKimlikNo) {
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
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
}

package personel.yonetim.sistemi.model;

import java.time.LocalDate;
// immutable class
// sınıf final olarak etiketlendiği için inheritance yapılamaz
public final class Personel /*extends Object*/{
	@Override
	public String toString() {
		return "Personel [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi
				+ ", maas=" + maas + "]";
	}
	
	public String toCSVString() {
		return tcKimlikNo + ";" + ad + ";"+ soyad + ";" + dogumTarihi.getDayOfMonth() + "." + 
				dogumTarihi.getMonthValue() + "." + dogumTarihi.getYear()+ ";" + maas;
	}

	// field
	private final long tcKimlikNo;
	private final String ad;
	private final String soyad;
	private final LocalDate dogumTarihi;
	private final double maas;
	
	public Personel(long tcKimlikNo, String ad, String soyad, LocalDate dogumTarihi, double maas) {
		//super();// parent = base = super
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.maas = maas;
	}
	// getter methods
	public long getTcKimlikNo() {
		return tcKimlikNo;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public double getMaas() {
		return maas;
	}
	
}

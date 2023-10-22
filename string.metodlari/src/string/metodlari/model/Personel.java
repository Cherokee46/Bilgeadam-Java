package string.metodlari.model;
import java.lang.*;
import java.time.LocalDate;

public class Personel extends Object{

	private long tcKimlikNo;
	private String ad ;
	private String soyad;
	private LocalDate dogumTarihi;
	private double maas;
	private String dogumYeri;
	

	// Eğer default ctor dan başka bir parametreli ctor yazılırsa def. ctor compiler tarafından yazılmaz
	// gerekli görüyorsak biz yazabiliriz.
//	public Personel() {
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public String toString() {
		return "Personel [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi
				+ ", maas=" + maas + ", dogumYeri=" + dogumYeri + "]";
	}
	

	public Personel(long tcKimlikNo, String ad, String soyad, LocalDate dogumTarihi, double maas, String dogumYeri) {
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.maas = maas;
		this.dogumYeri = dogumYeri;
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
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	
	
}

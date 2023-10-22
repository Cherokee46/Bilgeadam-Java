package enterprise.resource.planing;
import java.time.LocalDate;
//import java.lang.*; temel java kütüphanesi
//import java.util.*; // * : ALL(hepsi)
import enterprise.resource.planing.model.Personel;// Ctrl + Shift + O : import kısayolu

public class Program {

	// input is evil : kullanıcı girdisi beladır. her yazılımcının bu belayı profesyone lşekilde savaması gerekir.
	// Validation : veri doğrulama yaparak kullanıcı girdisi doğrulanmalıdır.
	public static void main(String[] args) {
		
		// ilk "Personel" sınıf adı ikinci "Personel" constructor metodu
		Personel personel = new Personel(); // default constructor (compile default constructor ın olduğunu varsayar)
		int i;
		// populate(nesne oluşturduktan sonra attribute larına değer atanmasına) 
		// değer atama işleminden sonra object state oluşur.
//		personel.tcKimlikNo = 98745632102L;
//		personel.ad = "Seyfi";
//		personel.soyad = "Veli";
//		personel.dogumTarihi = LocalDate.of(2001, 8, 7);
//		personel.cocukSayisi = -1;
		personel.setTcKimlikNo(123456789029L);
		personel.setCocukSayi((byte)5);
		
		System.out.println(personel.getCocukSayisi());
		
		
		// Personel
		long tcKimlikNo;
		String ad;
		String soyad;
		LocalDate dogumTarihi;
		boolean evliMi;
		LocalDate emeklilikTarihi;
		byte cocukSayisi;
		
		cocukSayisi = -1;
		
		if(cocukSayisi < 0) {
			cocukSayisi = 0;
		}
		
		tcKimlikNo = 12345678902L;
		ad= "This tutorial will help you understand the basics of object-oriented analysis and design along with its associated terminologies.\r\n"
				+ "\r\n"
				+ "Audience\r\n"
				+ "This tutorial has been designed to help beginners. After completing this tutorial, you will find yourself at a moderate level of expertise from where you can take yourself to next levels.\r\n"
				+ "\r\n"
				+ "Prerequisites\r\n"
				+ "Before you start proceeding with this tutorial, it is assumed that you have basic understanding of computer programming and related programming paradigms.";
		soyad = "Veli";
		dogumTarihi = LocalDate.of(2000, 1, 15);
		evliMi = false;
		
		calis(tcKimlikNo, ad, soyad);

	}
	
	public static void calis(long tcKimlikNo, String ad, String soyad) {
		
		System.out.println(tcKimlikNo + " " + ad + " "+ soyad + " çalışıyor.");
		
	}

}

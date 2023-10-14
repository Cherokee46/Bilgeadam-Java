package okul.yonetim.sistemi;

import java.time.LocalDate;

import okul.yonetim.sistemi.model.Ogrenci;

public class Program {

	public static void main(String[] args) {
		// constructor metoduna parametreler tanımlayarak setter metotlarını tek tek yazmaktan kurtarmış olduk.
		// All arguments constructor
		Ogrenci ogrenci = new Ogrenci(12345678901L,"Ali","Veli",123, LocalDate.now(),3.5F);
		//ogrenci.setAd(null);
		//ogrenci.setDogumTarihi(null);
		

	}

}

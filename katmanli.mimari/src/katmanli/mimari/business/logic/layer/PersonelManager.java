package katmanli.mimari.business.logic.layer;

import katmanli.mimari.model.Personel;
import katmanli.mimari.persistence.layer.PersonelDAL;

public class PersonelManager {
	
	private final byte PERSONEL_YAS_ALT_SINIR = 18;
	private final byte PERSONEL_YAS_UST_SINIR = 65;
	// nesnenin durumunu(object state) değiştiren metodlar kural olarak void dönerler
	public void kaydet(Personel personel) {
		
		// bu if iş kuralı içindir ve buradki 18 ve 65  gibi sınırlar değişebilir
		if(personel.getYas() < PERSONEL_YAS_ALT_SINIR 
				|| personel.getYas() > PERSONEL_YAS_UST_SINIR) {
			System.out.println("Personel yaşı 18'den küçük, 65'ten büyük olamaz!");
			System.out.println("Personel verisi kaydedilemedi");
			return;// metod buraya kadar çalışır ve metoddan çıkılır 
			//yani bu satırdan sonraki kodlar çalışmaz.
		}
		
		System.out.println("Business Logic Layer : " + personel);
		System.out.println("Personel verisi iş kurallarına göre denetlendi");
		System.out.println("Personel verisinde hata bulunamadı");
		
		PersonelDAL dal = new PersonelDAL();
		dal.veriKaydet(personel);
	}

}

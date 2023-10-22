package katmanli.mimari.persistence.layer;

import java.io.FileWriter;
import java.io.IOException;

import katmanli.mimari.model.Personel;

public class PersonelDAL {
	
	static final String PERSONELLER_DOSYA_ADI = "personeller.csv";
	
	public void veriKaydet(Personel personel) {
		System.out.println("Persistence Layer : " + personel);
		
		try {
			// FileWriter neznesinin iki ayrı modu var:
			// 1. default mode: dosyadaki herşeyi silip sıfırdan istediğiniz metni yazar.
			// 2. append mod : bu modda dosya içeriği silinmez, dosyanın en alt satırana
			// ekleme yapılır.
			FileWriter dosyaYazici = new FileWriter(PERSONELLER_DOSYA_ADI, true);// true yazarak yazıcı nesnemizi ekelme
																					// moduna çekiyoruz

			// personel nesnesini csv formatına serileştirdik
			String csvPersonel = personel.toCSVString();
			// KISS keep it simple stupid
			dosyaYazici.write("\n");// dosyada yeni satıra geçmek için
			dosyaYazici.write(csvPersonel);
			dosyaYazici.close();// dış kaynak bağlantısı ile işimiz bitince kaynak kapatılmalı

			System.out.println("Yeni personel başarılı şekilde dosyaya eklendi.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		System.out.println("Yeni personel veri kaynağına kaydedildi.");
	}

}

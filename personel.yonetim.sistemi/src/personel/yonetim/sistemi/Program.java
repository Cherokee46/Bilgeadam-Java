package personel.yonetim.sistemi;

import java.io.File; // io = input output
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

import personel.yonetim.sistemi.model.Personel;

public class Program {

	static final String PERSONELLER_DOSYA_ADI = "personeller.csv";

	public static void main(String[] args) {

		File personellerDosyasi = new File(PERSONELLER_DOSYA_ADI);
		// java projesinin dışında dosya, veritabanı, dış servis gibi kaynaklara
		// erişileceği zaman bu kaynakların hala aynı konumda ve aynı isimde olduğunu
		// java
		// garanti edemeyeceği için java dışındaki kaynaklara erişilirken
		// NotFoundException ortaya çıkaması durumuna tedbir olarak
		// dış kaynağa erişemeye çalışan kod try catch bloğunda yazılır:
		try {
			Scanner reader = new Scanner(personellerDosyasi);

			int i = 0;

			while (reader.hasNextLine()) { // her satırdan sonra sonraki satır varsa okumaya devam et yoksa döngüyü
											// sonlandır
				String satir = reader.nextLine();
				String[] veriler = satir.split(";");

				if (i > 0) {
					
					long tcKimlikNo = Long.valueOf(veriler[0]);
					String ad = veriler[1];
					String soyad = veriler[2];
					
					String strDogumTarihi =  veriler[3];// 10.12.2000 
					strDogumTarihi = strDogumTarihi.replace(".", ";"); // 10;12;2000
					
					String[] tarihBolumleri = strDogumTarihi.split(";");
					int gun = Integer.valueOf(tarihBolumleri[0]);
					int ay = Integer.valueOf(tarihBolumleri[1]);
					int yil = Integer.valueOf(tarihBolumleri[2]);
					LocalDate dogumTarihi = LocalDate.of(yil, ay, gun);
					///////////////////////////////////////////////
					
					double maas = Double.valueOf(veriler[4]);
					//deserialize işlemi yani csv formatındaki veri java nesnesine çevrildi.
					Personel personel = new Personel(tcKimlikNo, ad, soyad, dogumTarihi, maas);
					
					System.out.println(personel);
				}

				i++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// dosyadan okunan veriyi Personel nesnesine çeviren kodları başka bir metod aktarıp oradan çalıştırın

}

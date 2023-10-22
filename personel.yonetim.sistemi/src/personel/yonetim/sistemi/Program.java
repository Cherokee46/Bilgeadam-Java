package personel.yonetim.sistemi;

import java.io.File; // io = input output
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import personel.yonetim.sistemi.model.Personel;

public class Program {

	static final String PERSONELLER_DOSYA_ADI = "personeller.csv";

	public static void main(String[] args) {

		dosyadanPersonelVerileriniOku();

		// yeniPersoneliDosyayaEkle();
		System.out.println("Silmek istediğiniz personelin TC Kmilik No bilgisini giriniz.");
		System.out.print("TC Kimlik No : ");

		Scanner girdi = new Scanner(System.in);

		long tcKimlikNo = girdi.nextLong();

		File personellerDosyasi = new File(PERSONELLER_DOSYA_ADI);

		Personel[] personeller = new Personel[20];

		try {

			Scanner reader = new Scanner(personellerDosyasi);

			int i = 0;

			while (reader.hasNextLine()) { // her satırdan sonra sonraki satır varsa okumaya devam et yoksa döngüyü
											// sonlandır
				String satir = reader.nextLine();
				String[] veriler = satir.split(";");

				if (i > 0) {

					Personel personel = veriyiPersonelNesnesineDonustur(veriler);

					personeller[i - 1] = personel;
				}
				i++;
			}
			reader.close();

			// dosya içeriğini tamemen siliyoruz
			FileWriter dosyaYazici = new FileWriter(PERSONELLER_DOSYA_ADI);//
			dosyaYazici.write("");
			dosyaYazici.close();
			
			// yukarıdaki döngüde dosya içerisindeki verileri dizi içine atmıştık
			// aşağıda tekrar dizi içinde dönerek dosyaya verileri yazıyoruz
			// yazarken kullanıcının silmek istediği TC Kmilik no kaydına gelince yazma işlemi
			// yapılmadığı için kayıt dosyadan silinmiş oluyor
			FileWriter dosyaYazici2 = new FileWriter(PERSONELLER_DOSYA_ADI, true);//
			dosyaYazici2.write("TC Kimlik No;Ad;Soyad;DoğumTarihi;Maaş;Doğum Yeri");
			for (int j = 0; j < personeller.length; j++) {
				// kısa devre : short circuit
				if (personeller[j] != null && personeller[j].getTcKimlikNo() != tcKimlikNo) {
					dosyaYazici2.write("\n");// dosyada yeni satıra geçmek için
					dosyaYazici2.write(personeller[j].toCSVString());
				}
			}
			
			dosyaYazici2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dosyadanPersonelVerileriniOku();

	}

	static void yeniPersoneliDosyayaEkle() {
		// veri setleriyle uğraşırken yapmak isteyeceğiniz 4 işlem olacaktır :
		// veri ekleme, veri okuma, veri güncelleme, veri silme,
		// CRUD : Create, Read, Update, Delete

		// Dosyaya yeni personel verisi ekleyeceğiz:
		System.out.println("Yeni personel için veri girişi yapınız.");
		System.out.print("TC Kimlik No : ");

		Scanner girdi = new Scanner(System.in);

		long tcKimlikNo = girdi.nextLong();

		System.out.print("Ad : ");
		String ad = girdi.next();

		System.out.print("Soyad : ");
		String soyad = girdi.next();

		System.out.print("Doğum Tarihi(yıl-ay-gün) :");
		String strDogumTarihi = girdi.next();
		LocalDate dogumTarihi = LocalDate.parse(strDogumTarihi); // String veri tipinden Localdate veri tipine

		System.out.print("Maaş : ");
		double maas = girdi.nextDouble();

		Personel yeniPersonel = new Personel(tcKimlikNo, ad, soyad, dogumTarihi, maas);
		girdi.close();

		try {
			// FileWriter neznesinin iki ayrı modu var:
			// 1. default mode: dosyadaki herşeyi silip sıfırdan istediğiniz metni yazar.
			// 2. append mod : bu modda dosya içeriği silinmez, dosyanın en alt satırana
			// ekleme yapılır.
			FileWriter dosyaYazici = new FileWriter(PERSONELLER_DOSYA_ADI, true);// true yazarak yazıcı nesnemizi ekelme
																					// moduna çekiyoruz

			// personel nesnesini csv formatına serileştirdik
			String csvPersonel = yeniPersonel.toCSVString();
			// KISS keep it simple stupid
			dosyaYazici.write("\n");// dosyada yeni satıra geçmek için
			dosyaYazici.write(csvPersonel);
			dosyaYazici.close();// dış kaynak bağlantısı ile işimiz bitince kaynak kapatılmalı

			System.out.println("Yeni personel başarılı şekilde dosyaya eklendi.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void dosyadanPersonelVerileriniOku() {
		// dosya adresini javanın File sınıfı ile bir java nesnesine çevirmiş oluyoruz.
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
					veriyiPersonelNesnesineDonustur(veriler);
				}

				i++;
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// dosyadan okunan veriyi Personel nesnesine çeviren kodları başka bir metod
	// aktarıp oradan çalıştırın

	static Personel veriyiPersonelNesnesineDonustur(String[] veriler) {
		long tcKimlikNo = Long.valueOf(veriler[0]);
		String ad = veriler[1];
		String soyad = veriler[2];

		String strDogumTarihi = veriler[3];// 10.12.2000
		strDogumTarihi = strDogumTarihi.replace(".", ";"); // 10;12;2000

		String[] tarihBolumleri = strDogumTarihi.split(";");
		int gun = Integer.valueOf(tarihBolumleri[0]);
		int ay = Integer.valueOf(tarihBolumleri[1]);
		int yil = Integer.valueOf(tarihBolumleri[2]);
		LocalDate dogumTarihi = LocalDate.of(yil, ay, gun);
		///////////////////////////////////////////////

		double maas = Double.valueOf(veriler[4]);
		// deserialize işlemi yani csv formatındaki veri java nesnesine çevrildi.
		Personel personel = new Personel(tcKimlikNo, ad, soyad, dogumTarihi, maas);

		System.out.println(personel);

		return personel;
	}
}

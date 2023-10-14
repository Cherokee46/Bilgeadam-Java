package nesne.yonelimli.programlama;

import java.util.Random;

public class Program {
	// nesne oluşması için programın çalışması lazım
	// program çlışırken oluşan nesneler
	// program kapatılınca bellekten silinir
	// ama sınıflar dosyalarında kalır
	
	public static void main(String[] args) {
		
		int[] sayilar = new int[3];
		
		sayilar[0] = 1;
		//sayilar[1] = false;
		
		Araba araba = new Araba();
		// MotorluTasit sınıfından devraldığı özellik
		araba.setMarka("BMW");
		araba.setModel("X5");
		araba.setMotorgucu(2.5);
		araba.setSeriNo("BMWX12343204flsdfls");
		// arabaya ait özellikler
		araba.setKapiSayisi((byte)5);
		araba.setKoltukSayisi((byte)5);
		
		araba.calis();
		araba.dur();
		
		MotorluTasit[] tasitlar = new MotorluTasit[5];
	
		
		Random random = new Random();
		
		tasitlar[0] = araba; // araba nesnesi MotoroluTasit sınıfından kalıtım yoluyla oluşturulduğu için
		// şekil değiştirip MotorluTasit gibi davranabilir. 
		// Araba sınıfı aynı zamanda MotorluTasit tir diyebiliriz
		// Araba is-a MotorluTasit
	
		//tasitlar[1] = random;
		
		// bir nesne oluşturmak için yazılması gereken kod
		MotorluTasit motorluTasit = new MotorluTasit(); // MotorluTasit() constructor metodu
		
		//motorluTasit.marka = "Volvo";
		motorluTasit.setMarka("Volvo");
		motorluTasit.setModel("V8");
		motorluTasit.setMotorgucu(1.6);
		motorluTasit.setSeriNo("V0947543095chsdjkl");
		
		motorluTasit.calis();
		motorluTasit.dur();
		
		Araba[] arabalar = new Araba[3];
		//arabalar[0] = motorluTasit;
		
		MotorluTasit ucak = new MotorluTasit();
		
		ucak.setMarka("Boeing");
		ucak.setModel("Airbus");
		ucak.setMotorgucu(500.0);
		ucak.setSeriNo("BAq30432jskdlfhds");
		
		ucak.calis();
		ucak.dur();
		
		System.out.println("Özet Rapor:");
		System.out.println("Marka\tModel");
		System.out.println(motorluTasit.getMarka() + "\t" + motorluTasit.getModel());
		System.out.println(ucak.getMarka() + "\t" + ucak.getModel());
		
		motorluTasitBilgileriniYaz(motorluTasit);
		motorluTasitBilgileriniYaz(araba);
		motorluTasitBilgileriniYaz(ucak);
	//	motorluTasitBilgileriniYaz(random);
	
	}
	
	static void motorluTasitBilgileriniYaz(MotorluTasit tasit) {
		
		System.out.println("Marka :\t" + tasit.getMarka() + "\n" +
						   "Model: \t" + tasit.getModel() + "\n" +
						   "Motor Gücü: " + tasit.getMotorgucu());
		
	}
	


}

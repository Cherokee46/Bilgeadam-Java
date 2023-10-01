package nesneyeYönelim;

import nesneyeYönelim.Program.motorluTasıt;

public class Program {
	
	public class motorluTasıt extends MotorluTasıt {

	}

	public static void main(String[] args) {
	 
		int [] sayılar = new int [3]; 
		
//		sayılar[0]=1;
//		sayılar[1]= false;
		
		MotorluTasıt[] tasıtlar = new MotorluTasıt[5];
//		Araba[] arabalar = new Araba[3];
//		arabalar[0] = motorluTasıt;
		
		//motorluTasıt sınıfından devralınan özellikler // inheritance..
		Araba araba = new Araba();
		araba.setMarka("BMW");
		araba.setModel("X5");
		araba.setMotorgucu(3.0d);
		
		//arabaya ait özellikler  
		araba.setKapıSayısı((byte) 5);
		araba.setKoltukSayısı((byte) 5);
		
		araba.calıs();
		araba.dur();
		System.out.println("Marka \t Model");
		System.out.println(motorluTasıt.getMarka() + "\t" + motorluTasıt.getModel());
		System.out.println(araba.getMarka() + "\t" + araba.getModel());
		
		tasıtlar[0] = araba; 
		//araba nesnesi MotorluTasıtlar sınıfıdan kalıtım yoluyla olusturuldugu ıcın şekil degıstırıp MotorluTasıt gıbı davranabilir..
		//Araba sınıfı aynı zamanda MotorluTasıt olarak davranabilir.. "extends" ile kalıtıldıgı ıcın.. 
		
	//	tasıtlar[1]=random;
		
		MotorluTasıt motorluTasıt = new MotorluTasıt();   // ilk nesnemiz  // MotorluTasıt() constructoe metodu..
		
		//motorluTasıt.marka="Volvo";
		//motorluTasıt.model="V8";
		motorluTasıt.setMarka("Volvo");
		motorluTasıt.setModel("V8");
	
		
		motorluTasıt.calıs();
		motorluTasıt.dur();
		
		MotorluTasıt ucak = new MotorluTasıt();   // ilk nesnemiz  // MotorluTasıt() constructoe metodu..
		ucak.setMarka("Boeing");
		ucak.setModel("737");
		
		ucak.calıs();
		ucak.dur();
		
		System.out.println("Marka \t Model");
		System.out.println(motorluTasıt.getMarka() + "\t" + motorluTasıt.getModel());
		System.out.println(ucak.getMarka() + "\t" + ucak.getModel());		
	
		// polymorphısm.. 	
		motorluTasıtBilgileriniYaz(motorluTasıt);
		motorluTasıtBilgileriniYaz(araba);
		motorluTasıtBilgileriniYaz(ucak);
	}
	
	static void motorluTasıtBilgileriniYaz(MotorluTasıt tasıt) {
		
		System.out.println("Marka:\t" + tasıt.getMarka() + "\n" + 
		"Model : \t" + tasıt.getModel() + 
		"Motorgucu : \t" + tasıt.getMotorgucu());
	
		
	}
	
}

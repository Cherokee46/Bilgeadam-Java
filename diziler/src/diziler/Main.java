package diziler;

public class Main {

	public static void main(String[] args) {

		int sayilar[] = { 1, 2, 6, 5, 4, 2 };

		// dizi içerisinde tekrar eden sayı var mı :
		boolean tekrarEdenSayiBulundu = false;

		for (int i = 0; i < sayilar.length; i++) {

			int siradakiSayi = sayilar[i]; // 1

			for (int j = i + 1; j < sayilar.length; j++) {
				if (siradakiSayi == sayilar[j]) {
					System.out.println(siradakiSayi + " dizi içerisinde tekrar eden sayıdır.");
					tekrarEdenSayiBulundu = true;
					break;
				}
			}

			if (tekrarEdenSayiBulundu == true) {
				break;
			}
		}

		// dizi içerisinde kaç adet tekrar eden sayı var
		// ödev : 2 den fazla tekrar ettiğinde tekrar eden sayı fazla görünüyor
		// bu durum nasıl düzeltilir :
		int numbers[] = { 8, 6, 3, 8, 2, 1, 6, 9, 3, 8 };
		
		byte tekrarEdenSayiSayaci = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int siradakiSayi = numbers[i];
			
			for (int j = i + 1; j < numbers.length; j++) {
				
				if(siradakiSayi == numbers[j]) {
					tekrarEdenSayiSayaci++;
					break;
				}
			}
		}
		
		System.out.println("Dizi içinde tekrar eden " + tekrarEdenSayiSayaci + " sayı var.");

	}

}

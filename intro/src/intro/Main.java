package intro;

import javax.sound.midi.SysexMessage;

public class Main {

	public static void main(String[] args) {
System.out.println("Hello World!");
		
		//javada değişken isimlendirmeleri camelCase yazılır
		String ortaMetin ="İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun= 18.7;
		double dolarBugun= 18.7;
		
		
		boolean dolarDustuMu= true;
		
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {//true
			okYonu="down.svg";
			System.out.println(okYonu);
			
		}else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
			
			String[] krediler = {"İhtiyaç kredisi","Konut kredisi","Araç kredisi"};
			
			
			
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
				
				//ctrl+shift+f yazımı düzenler, ctrl+f11 terminali(console) çalıştırır.
				
			}
			
		}

	}

}

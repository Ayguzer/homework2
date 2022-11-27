package classes;

public class Main {

	public static void main(String[] args) {
		// reference type

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar = { 15, 25, 35 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar2 = sayilar;
		sayilar[0] = 45;
		System.out.println(sayilar[0]);
	}

}

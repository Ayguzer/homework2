
public class Main {

	public static void main(String[] args) {
		sayıBulma();
	}

	public static void sayıBulma() {
		int[] sayılar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 4;
		boolean sayiVarMı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				sayiVarMı = true;
				break;
			}
		}
		String mesaj = " ";
		if (sayiVarMı) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

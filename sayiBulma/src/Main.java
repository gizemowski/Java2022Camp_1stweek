
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int numbertoFind = 3;
		boolean isthereanumber = false;
		for (int number : numbers) {

			if (numbertoFind == number) {
				isthereanumber = true;
				break;
			}
		}
		if (isthereanumber) {
			System.out.println(numbertoFind + " sayısı dizinin içindedir.");
		} else {
			System.out.println(numbertoFind + " sayı dizinin içerisinde bulunmamaktadır.");
		}

	}

}

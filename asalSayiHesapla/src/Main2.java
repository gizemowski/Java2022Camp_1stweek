import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//		Scanner girdi=new Scanner(System.in);
//		System.out.println("Hangi sayıyı merak ediyorsun?");
//		int number= girdi.nextInt();
//		
		
		int number = -1;
		// int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;
		if(number==1){
            System.out.println("1 den buyuk sayilar, asal sayi olabilir");
            return;
           
		}
		if(number<1){
            System.out.println("Geçersiz sayı girdiniz");
            return;
           
		}
       
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			}
		}
		if (isPrime) {
			System.out.println(number +" sayısı asaldır.");
		} else {
			System.out.println(number +" sayısı asal değildir.");
		}

	}
	
}

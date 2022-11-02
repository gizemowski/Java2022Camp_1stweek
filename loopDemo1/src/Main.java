
public class Main {

	public static void main(String[] args) {
		//for
		for(int i=0;i<11;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		//while
		int i=10;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		//do-while
		int j=100;
		do{
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
	}

}

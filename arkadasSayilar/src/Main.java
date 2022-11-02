
public class Main {

	public static void main(String[] args) {
	//220-284	
		int number1=110;
		int number2=284;
		
		int total=0;
		int total2=0;
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				total=total+i;
			}
		}
		for(int j=1;j<number2;j++) {
			if(number2%j==0) {
				total2=total2+j;
				
			}}
			if((number1==total2)&&(number2==total)) {
				System.out.println("Bu sayılar arkadaş sayılardır.");}
			else {
				System.out.println("Bu sayılar arkadaş değildir.");
			}
			
		
		
	}

}

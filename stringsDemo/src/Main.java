import javax.naming.ldap.SortResponseControl;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		/*
		 * System.out.println("Karakter sayısı ="+mesaj.length());//eleman sayisi
		 * System.out.println("5.eleman    : "+mesaj.charAt(4)); //istediğin elemanın index
		 * System.out.println(mesaj.concat(" Yaşasın!")); System.out.println(mesaj);//iki metni birleştir ilkine ekle
		 * System.out.println(mesaj.startsWith("B"));//metnin ilk harfi ne? B ile mi?
		 * System.out.println(mesaj.endsWith("!")); ! ile mi
		 * char[] karakterler = new char[5]; 
		
		 * mesaj.getChars(0 , 4, karakterler, 0); 
		 * mesaj.getChars(srcBegin:0,srcEnd 4, 
		 * karakterler,dstBegin: 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("av")); //aradığım harf kaçıncı index
		 * System.out.println(mesaj.lastIndexOf("a")); // aradığım harf sondan kaçıncı
		 */
		String yeniMesaj = mesaj.replace(' ', '-'); // boşlukları - karakter ile değiştir.
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj.replace('ü', 'u')); 
		System.out.println(mesaj.substring(2,5)); // belirli kısma kadar al
		//System.out.println(mesaj.split(yeniMesaj))
		for(String kelime:mesaj.split(" ")) { //bosluklara göre böl
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//kucuk harf
		System.out.println(mesaj.toUpperCase());//buyuk harf cevir
		System.out.println(mesaj.trim());//boslukları sil
	
	}

}

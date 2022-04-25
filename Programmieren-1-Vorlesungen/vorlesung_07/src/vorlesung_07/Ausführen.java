/**
 * 
 */
package vorlesung_07;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class Ausführen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Konto kontoObj2 = new Konto("Max Mustermann", 6000);
		kontoObj2.einzahlen();
		System.out.println(kontoObj2.getBesitzer());
		System.out.println(kontoObj2.getKontostand());
		//		Konto kontoObj = new Konto("John Doe",5000);
//		kontoObj.einzahlen(3000);
		
//		Konto meinKonto = new Konto("Jannik Hoefener", 3000);
//		meinKonto.einzahlen(3000);
//		System.out.println(meinKonto.besitzer);
//		System.out.println(meinKonto.kontostand);
		
		//Konto bankAccount = new Konto();
//		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Bitte geben Sie ihren Namen ein: ");
		//bankAccount.besitzer = sc.nextLine();
		
		//System.out.println("Geben Sie ihren Kontostand an: ");
		//bankAccount.kontostand = sc.nextInt();
		
		//sc.close();
		
		//System.out.printf("Der Besitzer dieses Kontos ist: %s, der Kontostand beträgt: %d", bankAccount.besitzer, bankAccount.kontostand);
		//System.out.printf("Der Besitzer dieses Kontos ist: %s, der Kontostand beträgt: %d", kontoObj.besitzer, kontoObj.kontostand);

	}

}

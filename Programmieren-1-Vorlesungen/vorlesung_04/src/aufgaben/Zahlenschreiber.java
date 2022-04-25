/**
 * 
 */
package aufgaben;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class Zahlenschreiber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner zahlScanner = new Scanner(System.in);
		System.out.println("Bitte Tippen Sie eine beliebige ganze Zahl zwischen 1 und 5 ein: ");
		int zahl = zahlScanner.nextInt();
		zahlScanner.close();
		
		if(zahl == 1) {
			System.out.printf("Eins");
		}
		else if(zahl == 2) {
			System.out.printf("zwei");
		}
		else if(zahl == 3) {
			System.out.printf("drei");
		}
		else if(zahl == 4) {
			System.out.printf("vier");
		}
		else if(zahl == 5) {
			System.out.printf("fünf");
		}
		//nicht im Bereich
		else {
			System.out.printf("Zahl nicht im Bereich");
		}
	}

}

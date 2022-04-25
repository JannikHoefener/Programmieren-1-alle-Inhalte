/**
 * 
 */
package aufgaben;

import java.util.Scanner;

public class IntervallChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Bitte Tippen Sie eine beliebige ganze Zahl zwischen 10 und 20 ein: ");
		int zahl = meinScanner.nextInt();
		meinScanner.close();
		
		if(zahl <= 20 && zahl >= 10) {
			System.out.printf(zahl + " liegt im Intervall [10,20]");
		}
		
		else{
				System.out.printf(zahl + " liegt nicht im Intervall [10,20]");
		}
		
	}

}

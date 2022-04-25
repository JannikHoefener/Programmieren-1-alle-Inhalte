/**
 * 
 */
package aufgaben;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class NotenChecker {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zahlScanner = new Scanner(System.in);
		System.out.println("Bitte Tippen Sie Ihre Note zwischen 1 und 5 ein: ");
		int zahl = zahlScanner.nextInt();
		zahlScanner.close();
		
		switch (zahl) {
			case 1:
				System.out.println("Sie haben bestanden");
				break;
		
			case 2:
				System.out.println("Sie haben bestanden");
				break;
			
			case 3:
				System.out.println("Sie haben bestanden");
				break;
				
			case 4:
				System.out.println("Sie haben bestanden");
				break;
			
			default:
				System.out.println("Sie haben nicht bestanden");
				
		}
		
	}

}

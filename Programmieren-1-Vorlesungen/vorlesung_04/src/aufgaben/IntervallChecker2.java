/**
 * 
 */
package aufgaben;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class IntervallChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Bitte Tippen Sie eine beliebige ganze Zahl zwischen 10 und 20 ein: ");
		int zahl = meinScanner.nextInt();
		meinScanner.close();
		
		//unterhalb 10
		if(zahl < 10) {
			System.out.printf("%d liegt unterhalb des Intervalls [10,20]", zahl);
		}
		//oberhalb 20
		else if(zahl > 20) {
			System.out.printf("%d liegt oberhalb des Intervalls [10,20]", zahl);
		}
		//innerhalb 10 und 20
		else {
			System.out.printf("%d liegt innerhalb des Intervalls [10,20]", zahl);
		}
		
	}

}

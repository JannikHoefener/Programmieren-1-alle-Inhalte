/**
 * 
 */
package aufgaben;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class Willkommen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Geben Sie ihren Vor- und Nachnamen ein.");
Scanner meinScanner = new Scanner(System.in);
String vorName = meinScanner.next();
String nachName = meinScanner.next();
System.out.println("Herzlich Willkommen " +vorName+ " " +nachName+ ".");
meinScanner.close();


}

}

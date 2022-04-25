/**
 * 
 */
package aufgaben;

import java.util.Scanner;

/**
 * @author janni
 *
 */
public class Begrüßung {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vornameScanner = new Scanner(System.in);
		Scanner nachnameScanner = new Scanner(System.in);
		Scanner geschlechtScanner = new Scanner(System.in);
		Scanner formScanner = new Scanner(System.in);
		
		//Vorname
		System.out.println("Bitte geben Sie ihr Vorname ein");
		int vorname = vornameScanner.nextInt();
		vornameScanner.close();
		//Nachname
		System.out.println("Bitte geben Sie ihr Nachname ein");
		int vorname = nachnameScanner.nextInt();
		nachnameScanner.close();
		//Geschlecht
		System.out.println("Bitte geben Sie ihr Geschlecht ein. Mann/Frau");
		int vorname = geschlechtScanner.nextInt();
		geschlechtScanner.close();
		//Du/Sie?
		System.out.println("Darf ich Sie duzen? Ja/Nein?");
		int vorname = formScanner.nextInt();
		formScanner.close();
		
		//Abfrage duzen
		if(formScanner.equals("Nein")) {
			System.out.println("Guten Tag" + nachname + ", ic");
		}
		// duzen
		else {
			System.out.printf("%d liegt innerhalb des Intervalls [10,20]", zahl);
		}
	}

}

/**
 * 
 */
package vorlesung_05;

import java.util.Scanner;

public class Fakult�t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fakZahl;
		int fakZahlErgebnis = 1;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Geben Sie eine Zahl ein f�r die die Fakult�t berechnet werden soll:");
		fakZahl = eingabe.nextInt();
		
		for (int counter = 0; counter < fakZahl; counter ++) {
			fakZahlErgebnis *= fakZahl - counter;
		}
		
		System.out.println("Die Fakult�t der Zahl: " + fakZahl + " betr�gt " + fakZahlErgebnis);
		
	}

}

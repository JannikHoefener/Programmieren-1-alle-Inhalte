/**
 * 
 */
package vorlesung_05;

import java.util.Scanner;

public class Fakultät {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fakZahl;
		int fakZahlErgebnis = 1;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Geben Sie eine Zahl ein für die die Fakultät berechnet werden soll:");
		fakZahl = eingabe.nextInt();
		
		for (int counter = 0; counter < fakZahl; counter ++) {
			fakZahlErgebnis *= fakZahl - counter;
		}
		
		System.out.println("Die Fakultät der Zahl: " + fakZahl + " beträgt " + fakZahlErgebnis);
		
	}

}

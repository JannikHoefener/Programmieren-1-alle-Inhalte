/**
 * 
 */
package vorlesung_05;

import java.util.Scanner;

public class Passwortabfrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Passwort = "Programmieren";
	int versuche = 0;
	Scanner eingabe = new Scanner(System.in);
	String eingabeText;
	
	do {
		System.out.println("Bitte geben Sie das Passwort ein - " + versuche + ". Versuch:");
		eingabeText = eingabe.next();
		if (eingabeText.equals(Passwort)) {
			System.out.println("Zutritt gewährt!");
			break;
		}
		if (versuche == 3) {
			System.out.println("Zutritt verweigert");
	}
	} while (versuche ++ < 3);
	
	}

}

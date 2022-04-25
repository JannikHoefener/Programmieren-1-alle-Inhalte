package Polymorphie;

public class Main {

	public static void main(String[] args) {
		
		// Polymorphie = Vielgestaltigkeit / Vielfalt
		
		// Warum ist das wichtig?
		// Die Polymorphie wird dann wichtig, wenn es erst zur Laufzeit des Programes klar ist welches Fortbewegungsmittel es sein soll!
		// Beispielweise gibt es eine Programm wo der Nutzer sich für ein Fortbewegungsmittel entscheiden musss.
		
		Longboard longboard1 = new Longboard();
		longboard1.sichFortbewegen();
		
		Auto auto1 = new Auto();
		auto1.sichFortbewegen();
		
		Flugzeug flugzeug1 = new Flugzeug();
		flugzeug1.sichFortbewegen();

		//Polimorphie
		System.out.println("\n!!! Jetzt folgt die ausgabe druch Polomorphie !!!\n");
		
		FortbewegungsMittel neuesFortbewegunsmittel1 = new Longboard(); 	
		neuesFortbewegunsmittel1.sichFortbewegen();
		// Es muss also nicht mehr die Klasse für die wir ein objekt erstellen wollen genannt werden sonder nur noch die Vater-Klasse(SuperKlasse)
		// über den Konstruktor weiß die Compailer welches Objekt angelegt werden muss.
		
		FortbewegungsMittel neuesFortbewegunsmittel2 = new Flugzeug();
		neuesFortbewegunsmittel2.sichFortbewegen();
		
		FortbewegungsMittel neuesFortbewegunsmittel3 = new Auto();
		neuesFortbewegunsmittel3.sichFortbewegen();
		
	}

}

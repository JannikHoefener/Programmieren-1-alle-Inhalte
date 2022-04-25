package GenerischeProgrammierung;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Normale Ausf�hrung 
		IntSpeicherklasse intMemory = new IntSpeicherklasse(123);
		intMemory.setInhalt(123456);
		System.out.println(intMemory.getInhalt());

		System.out.println("\n!Ab hier folgt die Ausgabe generischer Klassen!\n");
		// Generische Ausf�hrung 
		// GenericsSpeicherklasse<T> genMemory = new GenericsSpeicherklasse<T> ();
		// F�r T k�nnen wir nun unseren Beliebigen Datentyp eingeben aber Achtung!!!
		// F�r T d�rfen keine primitiven Datentypen angegeben werden. (also nur komplexe Datentypen)
		// wenn wir also ein int speichern wollen m�ssen wir auif die Wrapper Klassen zur�ckgreifen ...
		// int = Integer
		
		GenericsSpeicherklasse<String> genMemory = new GenericsSpeicherklasse<String> ("Hallo Welt");
		genMemory.setInhalt("Hallo sch�ne Welt");
		System.out.println(genMemory.getInhalt());
		
		//man kann aber die zweite Datentyp zuweisung sich sparen und nur <> schreiben
		GenericsSpeicherklasse<Integer> genMemory2 = new GenericsSpeicherklasse<> (321);
		genMemory2.setInhalt(654321);
		System.out.println(genMemory2.getInhalt());
		
		GenericsSpeicherklasse<Double> genMemory3 = new GenericsSpeicherklasse<> (1.2);
		genMemory3.setInhalt(79.5);
		System.out.println(genMemory3.getInhalt() + 4.8);
		
		ArrayList<Integer> list = new ArrayList<Integer>();

	}

}

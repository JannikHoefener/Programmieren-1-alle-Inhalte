
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Eine Wrapper Klasse konvertiert einen primitiven Datentyp zu einen Komplexen-Datentyp (Quasi zu einen Objekt/ Klasse)
		
	//primitive Datentypen 
		int intTest = 5;

		
	// Wrapper Klassen
		// In-Boxing
		Integer intWrapper = Integer.valueOf(intTest);
		// Un-Boxing
		System.out.println(intWrapper.intValue());
		
		
	//primitive Datentypen 
		int meinInteger = 10;
		
	// Wrapper Klassen
		// Autoboxing = Automatische Umwandlung eines elementaren Datentyps in seine Wrapper Klasse.
		Integer meinWrapper = meinInteger;
		// Autounboxing = Automatische Umwandlung eine Wrapper Klasse in seinen elementaren Datentyp.
		meinInteger = meinWrapper;
		
	}

}

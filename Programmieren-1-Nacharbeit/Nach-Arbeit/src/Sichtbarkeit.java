
public class Sichtbarkeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl1 = 23;
		
		System.out.println(zahl1);
		System.out.println(zahl2); //zahl2 ist noch nicht bekannt
		
		{ //neuer innerer Block
			int zahl2 = 50;
			
			System.out.println(zahl1); // variable zahl1 wird aus dem Äußeren blöck erkannt
			System.out.println(zahl2); //output: 50
		}
		
		System.out.println(zahl2); 	// Variable zahl2 wird nicht mehr erkannt, 
									// da diese im inneren Blocj nur exestiert
		
		int zahl2 = 55; // da zahl2 nur im inneren Block exestierte, der aber quasi hier erledigt ist, 
						// kann wieder die Variable neu inizialisiert werden
		
		System.out.println(zahl1); //output: 23
		System.out.println(zahl2); //output: 55
		
		/*
		 *  dess Weiteren gibt es 4 weitere Sichtbarkeits-Modifizierer
		 *  Die Modifizierer verhalten sich über all gleich. 
		 *  Egal ob sie vor einer variable, methode, klasse etc. stehen
		 *  
		 *  1. public
		 *   - man kann von Überall im Programm darauf zugreifen egal wo etwas steht
		 *  
		 *  2. protected
		 *   - nur noch für das Paket in dem es sich befindet sichtbar + unterklassen
		 *  
		 *  3. paketsicher (standart = also wenn kein Modifier davor steht)
		 *   - es kann nur vom eigenen paket zu gegriffen werden
		 *  
		 *  4. private 
		 *   - wenn ich zb. eine variable private setzte kann nur die eigene Klasse drauf zugreifen
		 *     Daher verwenden wir getter und setter um auch anders drauf "zugriff" zu erhalten
		 */
	}

}

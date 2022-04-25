
public class Enum {
		
		//Wir wollen z.b eine "Aufz�hlung" von Farben machen...
		
		String rot = "rot";
		String blau = "blau";
		String gruen = "gr�n";
		String gelb = "gelb";
		String lila = "lila";
		// ...
		
		// Strings kosten recht viel Speicher, bei sehr vielen Aufz�hlungen w�re dies sehr uneffizient
		
		int red = 1;
		int blue = 2;
		int green = 3;
		int yellow = 4;
		int pruple = 5;
		// ...
		
		// Die Farben einer Zahl zu zuordnen ist recht Sparsam f�r den Speicher.
		// Jedoch wird dies auch sehr un�bersichtlich bei vielen Farben.
		
		// Enums 
		// Enums vereinen beide oben genannten Speicher-M�glichkeiten
		
		enum Farben {
		//   0     1     2      3       4      5       6
			Rot, Blau, Gruen, Orange, Grau, Schwarz, Wei�
		}
		public static void main(String[] args) {
			Farben f = Farben.Schwarz;
			
			System.out.println(f.ordinal());
		}

	}



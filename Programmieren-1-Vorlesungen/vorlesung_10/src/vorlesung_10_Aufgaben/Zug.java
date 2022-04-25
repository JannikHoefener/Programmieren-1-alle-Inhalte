/**
 * 
 */
package vorlesung_10_Aufgaben;

import java.util.*;

public class Zug {
	// private PersonenWagen[] wagen = new PersonenWagen[2];
	private Lokomotive lok;

	List<PersonenWagen> wagenListe;

	public Zug(Lokomotive lok) {
		this.lok = lok;
		this.wagenListe = new ArrayList<PersonenWagen>();
	}

	public void addWagen(PersonenWagen p) {
		wagenListe.add(p);
	}

	public int getSitzplätze() {
		int plätze = 0;
		for (int i = 0; i< wagenListe.size(); i++) {
			plätze = plätze + wagenListe.get(i).getSitzplaetze();
		}
		
		return plätze;
	}
}

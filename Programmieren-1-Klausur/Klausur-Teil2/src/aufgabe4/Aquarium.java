// Jannik Hoefener
// 257497

package aufgabe4;

import java.util.ArrayList;

public class Aquarium {
	private ArrayList<Fisch> fische = new ArrayList<Fisch>();
	
	private int volumen;
	
	public Aquarium (int volumen) {
		this.volumen = volumen;
	}
	
	public void reinSetzten(Fisch fisch) {
		fische.add(fisch);
	}
	
	public void alleSchwimmen() {
		for (Fisch fisch : fische) {
			fisch.rumSchwimmen();
		}
	}
	public void alleBlubbern() {
		for (Fisch fisch : fische) {
			fisch.blubbern();
		}
	}

}

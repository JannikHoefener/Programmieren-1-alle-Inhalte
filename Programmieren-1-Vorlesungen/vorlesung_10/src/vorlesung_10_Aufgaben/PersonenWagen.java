/**
 * 
 */
package vorlesung_10_Aufgaben;

public class PersonenWagen {
	private int sitzPl�tze;
	private int stehPl�tze;

	// public static void main(String[] args) {}
	public PersonenWagen(int sitzen , int stehen) {
		sitzPl�tze = sitzen;
		stehPl�tze = stehen;
	}
	
	public int getSitzplaetze() {
		return sitzPl�tze;
	}
	public int getStehPl�tze () {
		return stehPl�tze;
	}
}

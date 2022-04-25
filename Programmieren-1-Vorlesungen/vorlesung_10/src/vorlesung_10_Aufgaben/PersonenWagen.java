/**
 * 
 */
package vorlesung_10_Aufgaben;

public class PersonenWagen {
	private int sitzPlätze;
	private int stehPlätze;

	// public static void main(String[] args) {}
	public PersonenWagen(int sitzen , int stehen) {
		sitzPlätze = sitzen;
		stehPlätze = stehen;
	}
	
	public int getSitzplaetze() {
		return sitzPlätze;
	}
	public int getStehPlätze () {
		return stehPlätze;
	}
}

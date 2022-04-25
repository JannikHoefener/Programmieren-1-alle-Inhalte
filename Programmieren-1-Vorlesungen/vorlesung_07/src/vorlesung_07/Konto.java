/**
 * 
 */
package vorlesung_07;

import java.util.Scanner;

/**
 * @author jannik
 *
 */
public class Konto {

	String besitzer;
	int kontostand;
	public Konto (String bs, int ks) {
		besitzer = bs;
		kontostand = ks;
	}
	void einzahlen (int betrag) {
		kontostand = kontostand + betrag;
	}
	void einzahlen () {
		Scanner scKontoStand = new Scanner(System.in);
		System.out.println("Wie viel wollen Sie einzahlen?: x €");
		kontostand = kontostand + scKontoStand.nextInt();
		scKontoStand.close();
	}
	/**
	 * @return the besitzer
	 */
	public String getBesitzer() {
		return besitzer;
	}
	/**
	 * @param besitzer the besitzer to set
	 */
	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
	/**
	 * @return the kontostand
	 */
	public int getKontostand() {
		return kontostand;
	}
	/**
	 * @param kontostand the kontostand to set
	 */
	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}
	public String toString() {
		return besitzer + kontostand;
	}
}

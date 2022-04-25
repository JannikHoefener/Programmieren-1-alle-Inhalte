
package aufgabe_12_1;

public class Motorrad {

	// Attribute
	enum MotorType {
		SPORTLER, CHOPPER, CRUISER, ENDURO
	}
	enum MotorColor {
		SCHWARZ, ROT, BLAU, SILBER
	}

	MotorType typ;
	MotorColor farbe;
	int hubraum;

	// Konstruktor
	public Motorrad() {
		this.typ = MotorType.SPORTLER;
		this.farbe = MotorColor.ROT;
		this.hubraum = 850;
	}

	public Motorrad(MotorType typ, MotorColor farbe, int hubraum) {
		this.typ = typ;
		this.farbe = farbe;
		if (hubraum >= 125 && hubraum <= 1300) {
			this.hubraum = hubraum;
		} else
			System.out.println("Hubraum kann nur zwischen 125 und 1300 ccm liegen");
	}

	// Methoden
	void schreibeinfos() {
		System.out.println("Typ: " + typ);
		System.out.println("Farbe: " + farbe);
		System.out.println("Hubraum: " + hubraum + "ccm");
		// System.out.println("Steuern: " + steuern + "€");
	}

	double berechneSteuer() {
		double steuern = (hubraum / 25) * 18.4;
		System.out.println("Die Steuern pro Jahr betragen " + steuern + "€");
		return steuern;
	}
}

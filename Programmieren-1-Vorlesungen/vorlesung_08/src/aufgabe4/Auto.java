package aufgabe4;

public class Auto extends Fahrzeug {
	private String autoTyp;
	private int gr��eTank;
	private int f�llstand;

	public Auto() {
		super("Auto");
	}

	public void setGr��eTank(int tankGr��e) {
		this.gr��eTank = tankGr��e;
	}

	public int getGr��eTank() {
		return this.gr��eTank;
	}

	public void setAutotyp(String typAuto) {
		this.autoTyp = typAuto;
	}

	public String getAutotyp() {
		return this.autoTyp;
	}

	public int getF�llstand() {
		return f�llstand;
	}

	public void setF�llstand(int f�llstand) {
		this.f�llstand = f�llstand;
	}

	public void bremsen() {
		System.out.println("Auto bremst");
	}

	public void fahren() {
		System.out.println("Auto f�hrt los");
	}

	public void auftanken(int i) {
		this.gr��eTank += i;
		System.out.printf("Tank um %dl aufgef�llt", i);
	}

}

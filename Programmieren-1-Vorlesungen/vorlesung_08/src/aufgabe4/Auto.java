package aufgabe4;

public class Auto extends Fahrzeug {
	private String autoTyp;
	private int größeTank;
	private int füllstand;

	public Auto() {
		super("Auto");
	}

	public void setGrößeTank(int tankGröße) {
		this.größeTank = tankGröße;
	}

	public int getGrößeTank() {
		return this.größeTank;
	}

	public void setAutotyp(String typAuto) {
		this.autoTyp = typAuto;
	}

	public String getAutotyp() {
		return this.autoTyp;
	}

	public int getFüllstand() {
		return füllstand;
	}

	public void setFüllstand(int füllstand) {
		this.füllstand = füllstand;
	}

	public void bremsen() {
		System.out.println("Auto bremst");
	}

	public void fahren() {
		System.out.println("Auto fährt los");
	}

	public void auftanken(int i) {
		this.größeTank += i;
		System.out.printf("Tank um %dl aufgefüllt", i);
	}

}

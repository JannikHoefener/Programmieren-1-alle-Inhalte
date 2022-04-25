package aufgabe4;

public class Fahrzeug {
	private String fahrzeugtyp;

	public Fahrzeug(String fahrzeugtyp) { //Konstruktor
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public String getFahrzeugtyp() {
		return this.fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) {
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public void bremsen() {
	}

	public void fahren() {
	}

	public String toString() {
		return String.format("Fahrzeug Typ: %s", this.getFahrzeugtyp());
	}

}

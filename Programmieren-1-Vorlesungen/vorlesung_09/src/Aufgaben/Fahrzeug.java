/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class Fahrzeug {

	private String fahrzeugtyp;
	
	public Fahrzeug(String fahrzeugtyp) {
		this.fahrzeugtyp = fahrzeugtyp;
	}
	
	public String getFahrzeugtyp() {
		return this.fahrzeugtyp;		
	}
	
	public void setFahrzeugtyp(String s) {
		this.fahrzeugtyp = s;		
	}
	
	public void bremsen() {
		
	}
	
	public void fahren() {
		
	}
	
	public String toString() {
		return String.format("Fahrzeugtyp: %s", this.fahrzeugtyp);
	}

	

}

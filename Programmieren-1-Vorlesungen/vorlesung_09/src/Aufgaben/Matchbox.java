/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class Matchbox extends Auto {
	private String autotyp;
	
	public Matchbox() {
		this.autotyp = "Matchbox";
	}
	
	public void bremsen() {
		
	}
	
	public void fahren() {
		System.out.println("Ein spielzeugauto kann nicht fahren.");
	}
	
	public void auftanken(int i) {
		
	}
	
}

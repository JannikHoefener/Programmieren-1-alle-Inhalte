/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class Auto extends Fahrzeug {
	
	private String autotyp;
	private int größeTank;
	private int füllstand;
	
	public Auto(){
		super ("Auto");
		
	}
	
	public void setGrößeTank(int i) {
		this.größeTank = i;
		
	}
	
	public int getGrößeTank() {
		return this.größeTank;
		
	}
	
	public void setFüllStand(int i) {
		this.füllstand = i;
		
	}
	
	public int getFüllStand() {
		return this.füllstand;
		
	}
	
	public void setAutoTyp(String s) {
		this.autotyp = s;
		
	}
	
	public String getAutoTyp() {
		return this.autotyp;
		
	}
	
	public void bremsen() {
		
	}
	
	public void fahren() {
		System.out.println("Das Auto fährt.");
		
	}
	
	public void auftanken(int i) {
		setFüllStand(getFüllStand() + i);
		System.out.println("Das Auto wurde mit " + i + "Litern befüllt.");	
	}
	
	public void auftanken() {
		System.out.println(this);
		int i = getGrößeTank() - getFüllStand();
		setFüllStand(getGrößeTank());
		System.out.printf("Das Auto wurde mit %d Litern befüllt\n" , i);
		
	}
}

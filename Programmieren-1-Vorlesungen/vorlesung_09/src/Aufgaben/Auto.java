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
	private int gr��eTank;
	private int f�llstand;
	
	public Auto(){
		super ("Auto");
		
	}
	
	public void setGr��eTank(int i) {
		this.gr��eTank = i;
		
	}
	
	public int getGr��eTank() {
		return this.gr��eTank;
		
	}
	
	public void setF�llStand(int i) {
		this.f�llstand = i;
		
	}
	
	public int getF�llStand() {
		return this.f�llstand;
		
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
		System.out.println("Das Auto f�hrt.");
		
	}
	
	public void auftanken(int i) {
		setF�llStand(getF�llStand() + i);
		System.out.println("Das Auto wurde mit " + i + "Litern bef�llt.");	
	}
	
	public void auftanken() {
		System.out.println(this);
		int i = getGr��eTank() - getF�llStand();
		setF�llStand(getGr��eTank());
		System.out.printf("Das Auto wurde mit %d Litern bef�llt\n" , i);
		
	}
}

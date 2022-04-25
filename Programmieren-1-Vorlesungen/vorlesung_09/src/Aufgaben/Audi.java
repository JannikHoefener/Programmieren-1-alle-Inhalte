/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class Audi extends Auto{
	
	private String autotyp;
	private int größeTank;
	
	public Audi(int tankGröße) {
		this.autotyp = "Audi";
		this.größeTank = tankGröße;
		
	}
	public void bremsen() {	
	}
	public void fahren() {	
	}
	public void auftanken() {	
		System.out.println("Der Audi wird betankt.");
		if (getFüllStand() < größeTank) {
			super.auftanken(größeTank - getFüllStand());
		}
		
	}
	public String toString() {
		return super.toString() + "\nAutotyp: " +  this.autotyp + "\nTankgröße: " + this.größeTank + "Liter";
	}

}

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
	private int gr��eTank;
	
	public Audi(int tankGr��e) {
		this.autotyp = "Audi";
		this.gr��eTank = tankGr��e;
		
	}
	public void bremsen() {	
	}
	public void fahren() {	
	}
	public void auftanken() {	
		System.out.println("Der Audi wird betankt.");
		if (getF�llStand() < gr��eTank) {
			super.auftanken(gr��eTank - getF�llStand());
		}
		
	}
	public String toString() {
		return super.toString() + "\nAutotyp: " +  this.autotyp + "\nTankgr��e: " + this.gr��eTank + "Liter";
	}

}

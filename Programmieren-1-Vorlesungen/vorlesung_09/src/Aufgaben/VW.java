/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class VW extends Auto{
	private String autotyp;
	private int gr��eTank;
	
	public VW() {
		
	}
	
	public void bremsen() {
		
	}
	
	public void fahren() {
		
	}
	
	public void auftanken() {
		System.out.println("Der VW wird betankt.");
		super.auftanken(gr��eTank - super.getF�llStand());
	}
}

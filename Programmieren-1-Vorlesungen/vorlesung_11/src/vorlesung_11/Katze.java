/**
 * 
 */
package vorlesung_11;

public class Katze extends Tier{

	public Katze(String name, int alter, String geräusch) {
		super(name, alter, geräusch);
		// TODO Auto-generated constructor stub
	}

	public void zeigen() {
		super.zeigen();
		System.out.println("Es ist eine Katze mit dem Namen: " + name + " \nSie ist " + alter + " Jahre alt. \nSie macht: '" + geräusch + "'\n");
	}


	public void geräuscheMachen() {
		super.geräuscheMachen();
	}

}

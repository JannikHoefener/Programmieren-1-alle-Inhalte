/**
 * 
 */
package vorlesung_11;

public class Katze extends Tier{

	public Katze(String name, int alter, String ger�usch) {
		super(name, alter, ger�usch);
		// TODO Auto-generated constructor stub
	}

	public void zeigen() {
		super.zeigen();
		System.out.println("Es ist eine Katze mit dem Namen: " + name + " \nSie ist " + alter + " Jahre alt. \nSie macht: '" + ger�usch + "'\n");
	}


	public void ger�uscheMachen() {
		super.ger�uscheMachen();
	}

}

/**
 * 
 */
package vorlesung_11;

public class Dackel extends Tier{

	public Dackel(String name, int alter, String ger�usch) {
		super(name, alter, ger�usch);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zeigen() {
		super.zeigen();
		System.out.println("Es ist ein Dackel mit dem Namen: " + name + " \nEr ist " + alter + " Jahre alt. \nEr macht: '" + ger�usch + "'\n");

	}

	@Override
	public void ger�uscheMachen() {
		super.ger�uscheMachen();
	}


	

}

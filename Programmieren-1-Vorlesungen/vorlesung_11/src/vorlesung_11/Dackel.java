/**
 * 
 */
package vorlesung_11;

public class Dackel extends Tier{

	public Dackel(String name, int alter, String geräusch) {
		super(name, alter, geräusch);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zeigen() {
		super.zeigen();
		System.out.println("Es ist ein Dackel mit dem Namen: " + name + " \nEr ist " + alter + " Jahre alt. \nEr macht: '" + geräusch + "'\n");

	}

	@Override
	public void geräuscheMachen() {
		super.geräuscheMachen();
	}


	

}

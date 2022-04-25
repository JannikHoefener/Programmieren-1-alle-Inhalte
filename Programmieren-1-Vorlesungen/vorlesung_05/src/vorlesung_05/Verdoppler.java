package vorlesung_05;
/**
 * 
 */

/**
 * @author janni
 *
 */
public class Verdoppler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl = 1;
		String text ="";
		while (zahl <= 256) {
			System.out.println(zahl);
			text += zahl+",";
			zahl *= 2; //zahl = zahl *2;
			

		}
		System.out.println(text);
	}

}

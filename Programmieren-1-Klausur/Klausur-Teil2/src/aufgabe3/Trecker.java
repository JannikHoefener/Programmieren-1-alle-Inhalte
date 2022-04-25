// Jannik Hoefener
// 257497

package aufgabe3;

/**
 * @author janni
 *
 */
public class Trecker implements IMotorisiert  {

	public void fahren() {
		System.out.println("Brumm Brumm");
	}
	public void abfahrt(IMotorisiert typ) {
		fahren();
	}

}

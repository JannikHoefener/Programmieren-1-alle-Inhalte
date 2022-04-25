/**
 * 
 */
package vorlesung_03;
import java.util.Scanner;
/**
 * @author janni
 *
 */
public class StringGleichheitsChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String erstesWort;
		String zweitesWort;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben sie ein Wort ein: ");
		erstesWort=sc.next();
		System.out.println("Bitte geben sie ein Wort ein: ");
		zweitesWort=sc.next();
		
		boolean vergleich = erstesWort.equals(zweitesWort);
		System.out.println("Die Wörter sind beide gleich " + vergleich );
	}

}

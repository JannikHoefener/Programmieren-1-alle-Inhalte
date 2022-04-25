/**
 * 
 */
package vorlesung_03;
import java.util.Scanner;
/**
 * @author jannik
 *
 */
public class StringBuilderNutzung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String vorname;
		String nachname;
		String geburtsdatum;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Geben Sie Ihren Vornamen ein: ");
		vorname = sc.next();
		sb.append(vorname);
		sb.append(" ");
		System.out.println(sb);
		
		System.out.println("Geben Sie Ihren Nachnamen ein: ");
		nachname = sc.next();
		sb.append(nachname);
		sb.append("; ");
		System.out.println(sb);
		
		System.out.println("Geben Sie Ihr Geburtsdatum wie folgt ein: tt.mm.jjjj");
		geburtsdatum = sc.next();
		sb.append(geburtsdatum);
		sb.append("; ");
		System.out.println(sb);

		//System.out.println(sb);
	}

}

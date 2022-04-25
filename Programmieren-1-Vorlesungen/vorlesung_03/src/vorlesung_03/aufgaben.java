/**
 * 
 */
package vorlesung_03;
import java.util.Scanner;
/**
 * @author janni
 *
 */
public class aufgaben {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ersteZahl;
		int zweiteZahl;
		
		System.out.print("bitte geben Sie eine ganze Zahl ein:");
		ersteZahl = sc.nextInt();
		System.out.print("bitte geben Sie eine weitere Zahl ein:");
		zweiteZahl = sc.nextInt();
		sc.close();
	
		int abs1 = Math.abs(ersteZahl);
		int	abs2 = Math.abs(zweiteZahl);
		System.out.println("Die absolut werte sind: " + abs1 + " und " + abs2);
		
	}

}

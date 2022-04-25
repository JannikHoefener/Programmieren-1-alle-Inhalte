/**
 * 
 */
package vorlesung_03;

import java.util.Scanner;

/**
 * @author jannik
 *
 */
public class geradeZahl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int geradeZahl;
		Scanner sc = new Scanner(System.in);

		System.out.print("bitte geben Sie eine gerade Zahl ein:");
		geradeZahl = sc.nextInt();
		System.out.print(geradeZahl%2==0);
	}

}

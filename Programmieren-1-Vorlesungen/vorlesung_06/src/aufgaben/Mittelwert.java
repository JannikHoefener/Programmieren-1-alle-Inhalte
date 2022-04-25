/**
 * 
 */
package aufgaben;

import java.util.Scanner;

public class Mittelwert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Bitte Tippen Sie eine beliebige Zahl ein ");
		int anzZahlen = meinScanner.nextInt();

		double[] arr = new double[anzZahlen];
		System.out.println("Geben Sie nun nach einander Ihre gewünschten Komma-Zahlen an: ");		
		
		for (int i=0; i<anzZahlen; i++) {
			arr[i] = meinScanner.nextDouble();
		}
		meinScanner.close();
		
		double mw=0.0;
		for (double i: arr) {
			mw += i;
		}
		mw /= anzZahlen;
		System.out.printf("Mittelwert: %.2f",mw);		

	}

}

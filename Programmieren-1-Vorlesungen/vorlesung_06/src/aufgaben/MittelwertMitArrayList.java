/**
 * 
 */
package aufgaben;

import java.util.Scanner;
import java.util.ArrayList;

public class MittelwertMitArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meinScanner = new Scanner(System.in);
		ArrayList<Float> mittelliste = new ArrayList<Float>();
		boolean Weiter = true;
		float mittelwert = 0;
		while (Weiter == true)
		{
			System.out.print("Eine Zahl bitte: ");
			float zahl = meinScanner.nextFloat();
			mittelliste.add(zahl);
			mittelwert += zahl;
			mittelwert /= mittelliste.size();
			System.out.println(mittelliste);
			System.out.println(mittelwert);
			System.out.println(zahl);
		}
//		List<Double> mwlist = new ArrayList<Double>();
//		Scanner sc = new Scanner(System.in);
//		boolean b = true;
//
//		while (b) {​​
//			double mw = 0;
//			System.out.println();
//			System.out.println("Geben sie einen Messwert ein: ");
//			mwlist.add(sc.nextDouble());
//			for(double zahl: mwlist) {​​
//				System.out.print(zahl+" ");
//				mw += zahl;
//			}​​
//			mw /= mwlist.size();
//			System.out.printf(" Mittelwert: %.2f ",mw);
//		}
		
	}

}

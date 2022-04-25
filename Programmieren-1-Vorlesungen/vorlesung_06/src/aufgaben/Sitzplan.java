/**
 * 
 */
package aufgaben;

import java.util.Scanner;

public class Sitzplan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] kinoPlätze = new int[5][10];
		Scanner platzWahl = new Scanner(System.in);
		
		System.out.println("In welcher Reihe möchten Sie sitzen? (1-5)");
		int reihe = platzWahl.nextInt();
		
		System.out.println("In welcher Reihe möchten Sie sitzen? (1-10)");
		int platz = platzWahl.nextInt();
		platzWahl.close();
		
		kinoPlätze[reihe-1][platz-1]=1;
		
		for(int i=0; i<5;i++) {
			for (int k=0;k<10;k++) {
				System.out.print(kinoPlätze[i][k]+" ");
			}
			System.out.println();
		}
	}

}

/**
 * 
 */
package aufgaben;


public class Würfel {


	public static void main(String[] args) {
		
		int[] a = new int[6]; //Größe natürlich beliebig
		int oberGrenze = ?; //kannst du wählen wie du willst

		for(int i = 0; i<a.length; i++) {
		     a[i] = (int)(Math.random()*oberGrenze); //casten nicht vergessen!
		}
	}

}


package aufgaben;

import java.util.Scanner;

public class AbschreibeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainText = "Dieser Text tut eig gar nicht not abzuschreiben!";
		System.out.println("Bitte Tippen Sie folgenden Texte 1 zu 1 ab: \n" + mainText);
		Scanner meinScanner = new Scanner(System.in);
		String Text = meinScanner.nextLine();
		if(mainText.equals(Text)){
			System.out.println("Ist richtig");
			
			}
		
	}

}

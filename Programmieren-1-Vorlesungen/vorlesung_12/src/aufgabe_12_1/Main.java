/**
 * 
 */
package aufgabe_12_1;

import aufgabe_12_1.Motorrad.MotorColor;
import aufgabe_12_1.Motorrad.MotorType;

public class Main {

	public static void main(String[] args) {

		Motorrad m1 = new Motorrad(MotorType.CHOPPER, MotorColor.SCHWARZ, 1200);
		m1.schreibeinfos();
		m1.berechneSteuer();
		
		Motorrad m2 = new Motorrad(MotorType.ENDURO, MotorColor.ROT, 575);
		m2.schreibeinfos();
		m2.berechneSteuer();
	}

}

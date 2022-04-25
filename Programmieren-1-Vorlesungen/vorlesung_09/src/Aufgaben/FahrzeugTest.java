/**
 * 
 */
package Aufgaben;

/**
 * @author afsmi
 *
 */
public class FahrzeugTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//aufgabe 8.4
//		Fahrzeug pkw = new Fahrzeug("kleinen wagen");
//		Auto audi = new Auto();
//		Fahrrad bike = new Fahrrad();
//		
//		System.out.println(audi.toString() + "\n" +  bike.toString());
//		
//		//aufgabe 8.5
//		Audi r8 = new Audi(60);
//		
//		System.out.println(r8.toString());
		
		//aufgabe 8.6
		Audi a7 = new Audi(45);
		a7.fahren();
		//System.out.println(a7);
		Matchbox woodenCar = new Matchbox();
		woodenCar.fahren();
		//System.out.print("\n" + woodenCar.fahren());
		
		//aufgabe 8.7
		Tankstelle tank = new Tankstelle();
		tank.autoBetanken(a7);
		
		
		
		
	}

}

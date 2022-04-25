/**
 * 
 */
package aufgabe4;

public class Main {

	public static void main(String[] args) {
		Fahrzeug pkw = new Fahrzeug ("klein Wagen");
		Auto audi = new Auto ();
		Fahrrad bike = new Fahrrad ();	
		System.out.println(pkw);
		System.out.println(audi.toString());
		System.out.println(bike);


	}

}

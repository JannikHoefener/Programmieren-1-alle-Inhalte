
public class DoWhileSchleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 0;
		do {
			System.out.println("y");
		} while (y++ < 3);
		//-------------------------------
		int z = 0;
		do {
			System.out.println("z");
		} while (++z < 3);
		
		//--------------------------------

		
		//Kopfgesteuert
		int number1 = 1;
		while (number1 <= 5) {
			System.out.println(number1);
			number1 ++;
		}
		
		//Fußgesteuert
		int number2 = 1;
		do {
			System.out.println(number2);
			number2 ++;
		} while (number2 <= 5);
	}

}

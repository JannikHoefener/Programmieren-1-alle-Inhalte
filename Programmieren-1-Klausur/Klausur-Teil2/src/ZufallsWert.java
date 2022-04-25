import java.util.Random;
// Jannik Hoefener
// 257497
public class ZufallsWert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		boolean zuf = r.nextBoolean();
		
		if (zuf == true) {
			System.out.println("Wahr");
		} else {
			System.out.println("nicht Wahr");
		}

	}

}

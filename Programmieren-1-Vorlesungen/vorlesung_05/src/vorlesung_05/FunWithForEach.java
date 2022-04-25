/**
 * 
 */
package vorlesung_05;

public class FunWithForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 5, 2, 5, 7};
		int summe = 0;
		int countEven = 0;
		int doppelt;
		
		for(int i : arr) {
			summe += 1;
			if (i%2==0) {
				countEven++;
			}
			for (int k : arr) {
				if (k==i) {
					doppelt = k;
				}
			}
		}
	}

}

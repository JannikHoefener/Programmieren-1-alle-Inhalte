
public class ArraysAllerArt {
	public static void main(String[] args) {
		
		  //Zeile|Spalte               Gr��e der Zeile|Spalte
		String [] [] firstAndLastName = new String [5] [2];
		
		             //Zeile Spalte
		firstAndLastName [0] [0] = "Franz";
		firstAndLastName [0] [1] = "Bauer";
		
		firstAndLastName [1] [0] = "Felix";
		firstAndLastName [1] [1] = "Huber";
		
		firstAndLastName [2] [0] = "Fritz";
		firstAndLastName [2] [1] = "Meier";
		
		//�u�ere For-Schleife: Zeilenindex => i
		//Innere For-Schleife: Spaltenindex => j
		for (int i = 0; i < firstAndLastName.length; i++) {
			for (int j = 0; j < firstAndLastName[i].length; j++) {
				System.out.print(firstAndLastName[i][j] + " ");
			}
			System.out.println();
		}
	}

}

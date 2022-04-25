// Jannik Hoefener
// 257497

package aufgabe2;

public class Student {

		private String vorName;
		private String nachName;
		private int matNr;
		
		public Student (String vorName, String nachName, int matNr) {
			this.vorName = vorName;
			this.nachName = nachName;
			this.vorName = vorName;
		}

		public String getVorName() {
			return vorName;
		}

		public String getNachName() {
			return nachName;
		}

		public int getMatNr() {
			return matNr;
		}

		public String toString() {
			return "Student= Vorname: " + vorName + ", Nachname: " + nachName + ", MatNr: " + matNr;
		}


}

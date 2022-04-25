
package aufgaben;


public class Studierender {
	private String name;
	private int matrikelNummer;
	
	public void vorlesungBes(Vorlesung v) {}
	
	public String getName() {
		return this.name;
	}
	
	public int getMatrikelNummer() {
		return this.matrikelNummer;
	}
	public void setName(String s) {
		this.name = s;
	}
	public void setMatrikelNummer(int i) {
		this.matrikelNummer = i;
	}
	public String toString() {
		return ("Name: " + name+ " Matrikelnummer: "+matrikelNummer+",");
	}
	public boolean validateMAtrNum(int i) {
		return i%2==1 && i>10000 && i<100000;
	}
}

package aufgabe4;

public class Audi extends Auto {
	private String autotyp;
	private int größeTank;

	public String toString() {
		return super.toString() + "/nAutotyp: " + autotyp + " /nTankgröße: " + größeTank;
	}

}

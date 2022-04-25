package GenerischeProgrammierung;

public class IntSpeicherklasse {
	
	private int speicherplatz;
	
	public IntSpeicherklasse(int zuSpeicherndes) {
		this.speicherplatz = zuSpeicherndes;
	}
	
	public void setInhalt(int zuSpeicherndes) {
		this.speicherplatz = zuSpeicherndes;
	}
	
	public int getInhalt() {
		return speicherplatz;
	}

}

package GenerischeProgrammierung;

public class GenericsSpeicherklasse<T> {
	private T speicherplatz;

	public GenericsSpeicherklasse(T zuSpeicherndes) {
		this.speicherplatz = zuSpeicherndes;
	}

	public void setInhalt(T zuSpeicherndes) {
		this.speicherplatz = zuSpeicherndes;
	}

	public T getInhalt() {
		return speicherplatz;
	}

}

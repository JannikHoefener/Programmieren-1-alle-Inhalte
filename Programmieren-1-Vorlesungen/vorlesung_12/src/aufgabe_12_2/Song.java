
package aufgabe_12_2;

public class Song {
	
	//Attribute
	private String composer; //Künstler / Komponist
	private String titel;
	private double duration; //dauer
	
	//Kontruktor 
	public Song() {
		
	}
	
	public Song (String composer, String titel, double duration){
		this.composer = composer;
		this.titel = titel;
		this.duration = duration;
	}

	//Methoden 
	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return String.format("Titel %s, Künstler: %s, Dauer: %s ", this.titel, this.composer, this.duration);
		
	}

	

}

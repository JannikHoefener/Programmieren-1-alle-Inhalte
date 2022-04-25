
package vorlesung_11;

public class Tier {
	String name;
	int alter;
	String geräusch;
	
	public Tier(String name, int alter, String geräusch) {
		super();
		this.name = name;
		this.alter = alter;
		this.geräusch = geräusch;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void zeigen() {
		System.out.println("Tier zeigt sich.");
	}
	
	public void geräuscheMachen () {
		System.out.println("Das Tier macht " + geräusch);
	}

}


package aufgabe_12_2;

public class MainSongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JukeBox newJukeBox = new JukeBox();
		newJukeBox.addSong();
		newJukeBox.playAll();
		newJukeBox.getTotalDuration();
		newJukeBox.toString();
		newJukeBox.findSong("titel");

	}

}

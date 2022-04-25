
package aufgabe_12_2;

import java.util.Scanner;

public class JukeBox{
	int nextSongIndex;
	Song[] songs = new Song[100];

	Scanner eingabeUser = new Scanner(System.in);

	public JukeBox() {
	}

	public void addSong() {
		Song newSong = new Song();
		System.out.println("Geben Sie den Namen des Titels an:");
		newSong.setTitel(eingabeUser.nextLine());
		System.out.println("Geben Sie den Namen des Künstlers an:");
		newSong.setComposer(eingabeUser.nextLine());
		System.out.println("Geben Sie Dauer des Liedes an:");
		newSong.setDuration(eingabeUser.nextDouble());

		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null) {
				songs[i] = newSong;
				System.out.println(songs[i]);
				break;
			}
		}

	}

	public int getTotalDuration() {
		int totalDuration = 0;
		for (Song lied : songs) {
			if (lied != null) {
				totalDuration += (int) lied.getDuration();
			}

		}
		System.out.println("Dauer " + totalDuration);
		return totalDuration;
	}

	public void playAll() {
		for (Song i : songs) {
			System.out.println(i);
		}
	}

	public void run() {
	}

	public String toString() {
		for (Song lied: songs) {
			return lied.toString();
		}
		return null;
	}

	public int findSong(String titel) {
		for (int i = 0; i < songs.length; i++ ) {
			if (songs[i].getTitel().equals(titel)) {
				System.out.println(i);
			}
			System.out.println(-1);
		}
		return -1;
	}
}

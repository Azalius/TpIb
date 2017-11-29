package unilim.fr.trivia;

import java.util.Random;

public class GameRunner {

	public static void main(String[] args) {

		play(new Random());

	}

	public static void play(Random rand) {
		boolean notAWinner;

		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}

		} while (notAWinner);
	}
}
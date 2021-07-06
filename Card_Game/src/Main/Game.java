package Main;

import java.util.Scanner;

public class Game {
	private static int score;
	private static Card currentCard;
	private static Card nextCard;
	private static Deck deck = new Deck();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("kaarten: " + deck.getCards().size());
		gameTurn();
	}

	public static void gameTurn() {
		System.out.println("higher or lower");
		// 1.1 en 1.2
		System.out.println(currentCard = deck.getNextCard());
		nextCard = deck.getNextCard();
		String awnser = sc.nextLine().toLowerCase();
		System.out.println("");
		System.out.println("Cards: " + deck.getCards().size());
		if (awnser.contentEquals("higher") && nextCard.IsHigherOrEquel(currentCard)) {
			correct();
		} else if (awnser.contentEquals("lower") && currentCard.IsHigherOrEquel(nextCard)) {
			correct();
		} else {
			gameOver();
		}
	}

	public static void correct() {
		score++;
		System.out.println("de kaart was: " + deck.getNextCard());
		System.out.println("jou score is: " + score);

		gameTurn();
	}

	public static void gameOver() {
		System.out.println("gameover de vorige kaart was " + deck.getNextCard());
	}
}

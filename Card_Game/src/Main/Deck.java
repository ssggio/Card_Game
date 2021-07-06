package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck() {
		String suit = "";
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				suit = "hearts";
				break;
			case 2:
				suit = "diamonds";
				break;
			case 3:
				suit = "spades";
				break;
			case 4:
				suit = "clubs";
				break;
			}
			for (int j = 2; j <= 10; j++) {
				Card c = new Card(suit, j + " of " + suit, j);
				cards.add(c);
			}
			Card Ace = new Card(suit, "Ace" + " of " + suit, 1);
			cards.add(Ace);
			Card Jack = new Card(suit, "Jack" + " of " + suit, 11);
			cards.add(Jack);
			Card Queen = new Card(suit, "Queen" + " of " + suit, 12);
			cards.add(Queen);
			Card King = new Card(suit, "King" + " of " + suit, 13);
			cards.add(King);
		}
		Collections.shuffle(cards);
	}

	public Card getNextCard() {
		Card nextcard = cards.get(0);

		cards.remove(0);
		return nextcard;
	}

	public ArrayList<Card> getCards() {
		return cards;

	}
}

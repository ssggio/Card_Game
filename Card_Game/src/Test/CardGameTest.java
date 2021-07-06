package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.Card;
import Main.Deck;
import Main.Game;

class CardGameTest {

	private Deck deck;

	@BeforeEach
	void setup() {
		deck = new Deck();
	}

	@Test
	void cardCount() {
		assertTrue(deck.getCards().size() == 52);
	}

	// test of de kaart uit het spel wordt gehaald
	@Test
	void getNextCard() {
		int sizeBefore = deck.getCards().size();
		deck.getNextCard();
		int sizeAfter = deck.getCards().size();
		assertTrue(sizeBefore == sizeAfter + 1);
	}

	@Test
	void higherCard() {
		Card lowCard = new Card("Hearts", "2 of Hearts", 2);
		Card highCard = new Card("Hearts", "King of Hearts", 13);
		assertTrue(highCard.IsHigherOrEquel(lowCard));
	}

	@Test
	void lowerCard() {
		Card lowCard = new Card("Hearts", "2 of Hearts", 2);
		Card highCard = new Card("Hearts", "King of Hearts", 13);
		assertFalse(lowCard.IsHigherOrEquel(highCard));
	}

	@Test
	void equalCard() {
		Card lowCard = new Card("Hearts", "2 of Hearts", 2);
		Card highCard = new Card("Diamonds", "2 of Diamonds", 2);
		assertTrue(highCard.IsHigherOrEquel(lowCard));
	}

	// find a card in the deck
	@Test
	void checkIfExists() {
		Card found = null;
		for (Card c : deck.getCards()) {
			if (c.getValue() == 13 && c.getSuit().toLowerCase().equals("clubs")) {
				found = c;
			}
		}
		assertNotNull(found);
	}
}

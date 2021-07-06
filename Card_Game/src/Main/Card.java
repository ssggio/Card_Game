package Main;

public class Card {
	private String suit;
	private String name;
	private int value;

	public Card(String suit, String name, int value) {
		this.value = value;
		this.suit = suit;
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public boolean IsHigherOrEquel(Card c) {
		if (this.value >= c.value) {
			return true;
		} else {
			return false;
		}
	}

	public static void add(String string) {

	}
}

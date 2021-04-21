package com.example.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Deck {

	private List<Card> cards = new ArrayList<>();

	/**
	 * Generates a Deck.
	 * @return Deck
	 */
	public static Deck generate() {
		Deck deck = new Deck();

		deck.addCard(new Card("♥", "A"));
		deck.addCard(new Card("♥", "2"));
		deck.addCard(new Card("♥", "3"));
		deck.addCard(new Card("♥", "4"));
		deck.addCard(new Card("♥", "5"));
		deck.addCard(new Card("♥", "6"));
		deck.addCard(new Card("♥", "7"));
		deck.addCard(new Card("♥", "8"));
		deck.addCard(new Card("♥", "9"));
		deck.addCard(new Card("♥", "10"));
		deck.addCard(new Card("♥", "J"));
		deck.addCard(new Card("♥", "Q"));
		deck.addCard(new Card("♥", "K"));

		deck.addCard(new Card("♦", "A"));
		deck.addCard(new Card("♦", "2"));
		deck.addCard(new Card("♦", "3"));
		deck.addCard(new Card("♦", "4"));
		deck.addCard(new Card("♦", "5"));
		deck.addCard(new Card("♦", "6"));
		deck.addCard(new Card("♦", "7"));
		deck.addCard(new Card("♦", "8"));
		deck.addCard(new Card("♦", "9"));
		deck.addCard(new Card("♦", "10"));
		deck.addCard(new Card("♦", "J"));
		deck.addCard(new Card("♦", "Q"));
		deck.addCard(new Card("♦", "K"));

		deck.addCard(new Card("♣", "A"));
		deck.addCard(new Card("♣", "2"));
		deck.addCard(new Card("♣", "3"));
		deck.addCard(new Card("♣", "4"));
		deck.addCard(new Card("♣", "5"));
		deck.addCard(new Card("♣", "6"));
		deck.addCard(new Card("♣", "7"));
		deck.addCard(new Card("♣", "8"));
		deck.addCard(new Card("♣", "9"));
		deck.addCard(new Card("♣", "10"));
		deck.addCard(new Card("♣", "J"));
		deck.addCard(new Card("♣", "Q"));
		deck.addCard(new Card("♣", "K"));

		deck.addCard(new Card("♠", "A"));
		deck.addCard(new Card("♠", "2"));
		deck.addCard(new Card("♠", "3"));
		deck.addCard(new Card("♠", "4"));
		deck.addCard(new Card("♠", "5"));
		deck.addCard(new Card("♠", "6"));
		deck.addCard(new Card("♠", "7"));
		deck.addCard(new Card("♠", "8"));
		deck.addCard(new Card("♠", "9"));
		deck.addCard(new Card("♠", "10"));
		deck.addCard(new Card("♠", "J"));
		deck.addCard(new Card("♠", "Q"));
		deck.addCard(new Card("♠", "K"));

		return deck;
	}

	/**
	 * Adds the given card to the deck.
	 * @return void
	 */
	public void addCard(Card card) {
		cards.add(card);
	}

	/**
	 * Retrieves the next card from the Deck, removing it from the deck.
	 * @return
	 */
	public Card getNext() {
		return cards.get(0);
	}

	/**
	 * Returns the number of cards in the deck.
	 * @return int
	 */
	public int size() {
		return cards.size();
	}

	/**
	 * "Peeks" the top card in the deck without removing the card from the deck.
	 * @return Card
	 */
	public Card peekCard() {
		return cards.get(0);
	}

	/**
	 * Returns the cards in the deck.
	 * @return Stack<Card>
	 */
	public Stack<Card> getCards() {
		Stack<Card> cards_as_stack = new Stack<>();
		for (Card card : cards)
		{
			cards_as_stack.push(card);
		}
		return cards_as_stack;
	}
}

package com.example.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dealer {

	private Deck deck;

	public Dealer(Deck deck) {
		this.deck = deck;
	}

	/**
	 * Shuffles the dealer's deck.
	 */
	public void shuffleDeck() throws Exception {
		Stack<Card> cards = deck.getCards();

		if (cards.isEmpty())
		{
			throw new Exception("Uh Oh, SpaghettiOs!");
		}

		for (int i = 0; i < cards.size(); i++)
		{
			// Get the card on one end of the deck.
			Card firstCard = cards.get(i);

			for (int j = cards.size() - 1; j > 0; j--)
			{
				// Get the card on the other end of the deck.
				Card lastCard = cards.get(j);

				// Swap!
				Card temp = firstCard;
				firstCard = lastCard;
				lastCard = temp;
			}
		}

		// To make sure it's shuffled, run the algorithm again.
		for (int i = 0; i < cards.size(); i++)
		{
			// Get the card on one end of the deck.
			Card firstCard = cards.get(i);

			for (int j = cards.size() - 1; j > 0; j--)
			{
				// Get the card on the other end of the deck.
				Card lastCard = cards.get(j);

				// Swap!
				Card temp = firstCard;
				firstCard = lastCard;
				lastCard = temp;
			}
		}
	}

	/**
	 * Retrieves the deck.
	 *
	 * @return Deck
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * Returns a list of cards from the dealer's deck.
	 *
	 * @param numberOfCards the number of cards to include in the dealt cards list.
	 * @return List<Card>
	 */
	public List<Card> dealCards(int numberOfCards) {
		List<Card> cards = new ArrayList<>();

		for (int i = 0; i <= numberOfCards; ++i) {
			Card card = deck.getNext();
			cards.add(card);
		}

		return cards;
	}
}

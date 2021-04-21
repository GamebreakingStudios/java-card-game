package com.example.main.model;

import java.util.List;

public class Player {

	private String name;
	private List<Card> hand;

	/**
	 * Create a player given a name.
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}

	/**
	 * Adds a card to the player's hand.
	 * @param card
	 */
	public void addCardToHand(Card card) {
		hand.add(card);
	}

	/**
	 * Returns the list of cards in the player's hand.
	 * @return
	 */
	public List<Card> getHand() {
		return hand;
	}

	/**
	 * Replaces the player's hand with a new list of cards.
	 * @param newHand
	 */
	public void replaceHand(List<Card> newHand) {
		this.hand = newHand;
	}

	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getName() {
		return name;
	}
}

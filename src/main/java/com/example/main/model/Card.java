package com.example.main.model;

public class Card {

	public String suit;
	public String faceValue;

	public Card(String suit, String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	/**
	 * Returns the suit of the card
	 *
	 * Ex: Hearts
	 *
	 * @return String
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * Returns the face value of the card
	 *
	 * Ex: King
	 * @return String
	 */
	public String getFaceValue() {
		return faceValue;
	}

	/**
	 * Returns the human readable string representation of the card.
	 *
	 * Ex: King of Hearts
	 *
	 * @return String
	 */
	public String getDisplayText() {
		return faceValue + suit;
	}
}

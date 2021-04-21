package com.example.main.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DealerTest {

	@Test
	void test_can_retrieve_the_deck() {
		Deck deck = Deck.generate();
		Dealer dealer = new Dealer(deck);

		assertThat(dealer.getDeck())
				.withFailMessage("Expected the dealers deck to not be null")
				.isNotNull();
	}

	@Test
	void test_can_shuffle_deck_without_throwing_exception() {
		Deck deck = Deck.generate();
		Dealer dealer = new Dealer(deck);
		dealer.shuffleDeck();

		assertThat(dealer.getDeck()).isNotNull();
		assertThat(dealer.getDeck().getCards()).isNotNull();
	}

	@Test
	void test_can_deal_cards() {
		Deck deck = Deck.generate();
		Dealer dealer = new Dealer(deck);
		dealer.shuffleDeck();

		List<Card> cards = dealer.dealCards(5);
		assertThat(cards.size()).isEqualTo(5);
	}
}
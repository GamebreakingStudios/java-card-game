package com.example.main.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

	@Test
	void test_can_retrieve_suit() {
		Card card = new Card("♥", "K");

		assertThat(card.getSuit()).isEqualTo("Hearts");
	}

	@Test
	void test_can_retrieve_face_value() {
		Card card = new Card("♠", "A");

		assertThat(card.getFaceValue()).isEqualTo("A");
	}

	@Test
	void test_can_retrieve_display_text() {
		Card card = new Card("♦", "Q");

		assertThat(card.getDisplayText()).isEqualTo("Q♦");
	}
}

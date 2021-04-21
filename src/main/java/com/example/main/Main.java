package com.example.main;

import com.example.main.model.Card;
import com.example.main.model.Dealer;
import com.example.main.model.Deck;
import com.example.main.model.Player;

public class Main {

    /**
     * Should produce the below output:
     *
     * Nick has the following cards in their hand:
     *   Ten of Diamonds
     *   Four of Clubs
     *   Queen of Hearts
     *   Three of Diamonds
     *   Nine of Diamonds
     *
     * Tommy has the following cards in their hand:
     *   King of Hearts
     *   Six of Diamonds
     *   Ace of Clubs
     *   Queen of Spades
     *   Two of Hearts
     */
    public static void main(String[] args) {
        Deck deck = Deck.generate();
        Dealer dealer = new Dealer(deck);

        dealer.shuffleDeck();

        Player playerOne = new Player("Nick");
        playerOne.replaceHand(dealer.dealCards(5));

        System.out.println(playerOne.getName() +  " has the following cards in their hand:");
        for (Card card : playerOne.getHand()) {
            System.out.println("  " + card.getDisplayText());
        }
        System.out.print("\n");

        Player playerTwo = new Player("Tommy");
        playerTwo.replaceHand(dealer.dealCards(5));

        System.out.println(playerTwo.getName() +  " has the following cards in their hand:");
        for (Card card : playerTwo.getHand()) {
            System.out.println("  " + card.getDisplayText());
        }
        System.out.print("\n");
    }
}

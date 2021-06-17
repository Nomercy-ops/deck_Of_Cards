package com.bridgelabz.objectorientedprograms;

/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 17.06.21
 *
 * purpose: is to shuffle card and distribute 9 cards each to 4 player.
 *
 */

import java.util.Random;

public class DeckOfCards {

    // array for storing cards value.
    int [][] cards = new int[4][13];
	int numberOfCards = 52;
	
    /**
	 * UC1: Method for getting 52 cards. 
     * here player will get a card 9 cards through a loop.when a loop start and
     * loop condition is true allot one card method gets call() until player
     *  get 9 cards.
     
     * @param playerNumber
     * @param numberOfCards
     */
    
    public void allotCard() {

        for (int i = 0; i < numberOfCards; i++) {
            allotOneCard(i);
        }

    }

    /**
	 * UC1: method for alloting unique cards.
     * Allots only one card randomly and also suit and rank will be given to
     * that card.
     *
     * @param 
     */
    
    private void allotOneCard(int cardNumber) {
       
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            allotOneCard(cardNumber);
        } else {
            cards[suit][rank] = cardNumber;
        }
		
		System.out.println(cardNumber);

    }
	
}

   

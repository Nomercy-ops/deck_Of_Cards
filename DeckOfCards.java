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
     *  This method is used for getting player and allotting card from here to each player.calling print card method for printing cards.
     * @param player - getting number of players.
     * @param maxCard - getting numbers of cards to be distributed.
     */
    
    public void getPlayer(int player) 
    {
        for (int i = 1; i <= player; i++) {
            
            allotCard(i,maxCard);
            System.out.println("Player " + i + "' cards:" + "\t");

            //prints cards of respective player
            printCard(i);
        }
    }
	
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

   

package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

public class Runner {
	
	/**
     * This is the main method for running Deck Of Cards program.
	 * Here Numbers of players are added bu taking user input.
     * 
     */

    public static void main(String[] args) {

        DeckOfCards deckofcards = new DeckOfCards();
		 // scanner for getting numbers of player
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of players : ");
        int userInput = scanner.nextInt();
	  
	    //validating if user input 0 or > 4
        while (userInput > 4 || userInput < 1) {
            System.out.println("Enter Number Between 1 or 4  : ");
            userInput = scanner.nextInt();
        }
        
		deckofcards.getPlayer(userInput);
        deckofcards.allotCard();
    }

}

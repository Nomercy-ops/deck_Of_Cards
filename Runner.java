package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

/**
 * This is the main method for running Deck Of Cards program.
 *  Here Numbers of players are added bu taking user input.
 *  User also have an option for either play 9 cards or 13 cards game.
 */

public class Runner {

    public static void main(String[] args) {

        DeckOfCards deckofcards = new DeckOfCards();
        // scanner for getting numbers of player
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of players : ");
        int userInput = scanner.nextInt();
        System.out.println("Enter number of cards You want to Play : ");
        int maximumCard = scanner.nextInt();

        while (userInput > 4 || userInput < 1) {
            System.out.println("Enter Number Between 1 or 4  : ");
            userInput = scanner.nextInt();
        }
        while (maximumCard < 9 || maximumCard > 13) {
            System.out.println("Enter Cards between 7 or 13 ");
            maximumCard = scanner.nextInt();
        }
        deckofcards.getPlayer(userInput, maximumCard);
    }

}

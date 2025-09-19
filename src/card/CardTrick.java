/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        System.out.println("ICE1 by Hicret Sefa - running in NetBeans"); 
        Card[] magicHand = new Card[7];
        Random rnd = new Random();

        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(1 + rnd.nextInt(13));           
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);    
            magicHand[i] = c;                          

        }
        System.out.println("Generated Magic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
}

        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a card value (1-13): ");
        int userVal = in.nextInt();
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIdx = in.nextInt();
        String userSuit = Card.SUITS[suitIdx];

        // and search magicHand here
        //Then report the result here
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userVal && c.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
}

        if (found) {
            System.out.println("Great! Your card is in the magic hand.");
} 
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
}

        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        System.out.println("\nLucky Card is: " + luckyCard.getSuit() + " " + luckyCard.getValue());

    }
    
}

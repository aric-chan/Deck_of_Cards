//********************************************************************
//  DeckOfCards.java
//  Chan Aric Edbert T00706196
//  COMP 1131 Assignment 5 Question 2
//  Deal Card from a Deck of Card
//********************************************************************
import java.util.Random;

public class DeckOfCards {
        private Card[] c = new Card[52];
//        private Card[] deal = new Card[52];
        private int cardindeck = 52 ;
        private int i=0;

        //default constructor to fill 52 cards from Card class
        public DeckOfCards() {
            for (int i = 1; i <= 13; i++) {
                for (int j = 1; j <= 4; j++) {
                    c[13 * (j - 1) + i - 1] = new Card(i, j);
                }
            }
        }

        //shuffle cards using Fisher–Yates shuffle
        public void shuffle() {
            //create a temp Card object to temporarily hold randomly deal card
            Card[] temp = new Card[1];
            Random ran = new Random();
            //Randomly swap the card & protect the swapped card from being swap again in the next swap
            for (int k = 0; k < 51; k++) {
                //pick a random number ranging the (1+array index's of the to be swapped) and (array length -1)
                //to ensure no duplicate array index will be picked in each loop
                int index = (k + 1) + ran.nextInt(51 - k);
                //place the randomly picked element into a temp array
                temp[0] = c[index];
                //copy the element to the randomly picked Card[] element
                c[index] = c[k];
                //copt the randomly picked element back to swap counter-party
                c[k] = temp[0];
            }
        }
        //deal a card from deck & return the Card object
        public Card deal() {
            if (cardindeck > 0) {
                Card deal = c[52 - cardindeck];
                c[52 - cardindeck] = null;
                cardindeck--;
                return deal;
            } else {
                return null;
            }
        }
        //getter of # of card in deck
        public int getCardindeck(){
            return cardindeck;
        }

        //print card
        public String toString() {
            int k = i;
            String result = "";
            for (; k <= 51; k++) {
                result += c[k];
                result += "\n";
            }
            return result;
        }
    }


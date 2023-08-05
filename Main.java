//********************************************************************
//  Main.java
//  Chan Aric Edbert T00706196
//  COMP 1131 Assignment 5 Question 2
//  Deal Card from a Deck of Card
//********************************************************************
public class Main {
    public static void main(String[] args) {
        //instantiate DeckOfCard object and store 52 objects from Card class
        DeckOfCards obj = new DeckOfCards();
        //populate the whole deck
        System.out.println(obj);

        //shuffle the deck and display the card for checking
        obj.shuffle();
        System.out.println("After shuffle, the whole deck");
        System.out.println("");
        System.out.println(obj);

        //deal card one by one and report the # of card in deck
        for (int i = 52; i > 0; i--) {
            System.out.println(obj.deal());
            System.out.println("# of card in deck : " + obj.getCardindeck());
        }

        //display the deck after dealing all cards
        System.out.println("");
        System.out.println("All cards has been dealed : ");
        System.out.println(obj);
    }
}
//********************************************************************
//  Card.java
//  Chan Aric Edbert T00706196
//  COMP 1131 Assignment 5 Question 2
//  Deal Card from a Deck of Card
//********************************************************************
public class Card {
        private int face, suit;


        //constructor overloading to accept face and suit value
        public Card(int face, int suit) {
            this.face = face;
            this.suit = suit;
        }

        //return face in integer
        public int getFaceValue() {
            return face;
        }

        //return face in Text
        public String getFaceText() {
            if (face == 1) {
                return "Ace";
            } else if (face == 2) {
                return "Two";
            } else if (face == 3) {
                return "Three";
            } else if (face == 4) {
                return "Four";
            } else if (face == 5) {
                return "Five";
            } else if (face == 6) {
                return "Six";
            } else if (face == 7) {
                return "Seven";
            } else if (face == 8) {
                return "Eight";
            } else if (face == 9) {
                return "Nine";
            } else if (face == 10) {
                return "Ten";
            } else if (face == 11) {
                return "Jack";
            } else if (face == 12) {
                return "Queen";
            } else if (face == 13) {
                return "King";
            } else {
                return "Invalid";
            }
        }

        //To set face of card's object reference
        public void setFace(int f) {
            if (f >= 1 && f <= 13)
                face = f;
        }

        //return suit in integer
        public int getSuitValue() {
            return suit;
        }

        //return suit in String
        public String getSuitText() {
            if (suit == 1) {
                return "Clubs";
            } else if (suit == 2) {
                return "Diamonds";
            } else if (suit == 3) {
                return "Hearts";
            } else if (suit == 4) {
                return "Spades";
            } else {
                return "Invalid";
            }
        }

        //To set suit of card's object reference
        public void setSuit(int s) {
            if (s >= 1 && s <= 4)
                suit = s;
        }

        //output valid card's face and suit in text
        public String toString() {
            if (face >= 1 && face <= 13 && suit >= 1 && suit <= 4)
                return getFaceText() + " " + "of" + " " + getSuitText();
            else
                return "Invalid";
        }
    }

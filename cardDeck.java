//Lab03: CardDeck.java
//10603056
//Lynda Lam
import java.util.Scanner;

public class CardDeck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Ask user to input a card number
            System.out.print("Enter Card Number (1-52): ");
            int cardNumber = scanner.nextInt();

            if (cardNumber < 1 || cardNumber > 52) { // Check if card number is within the valid range (1-52)
                System.out.println("Invalid card number. Please enter a number between 1 and 52.");
                continue;
            }

            String suit; // Determine the suit based on the card number
            if (cardNumber <= 13) {
                suit = "Clubs";
            } else if (cardNumber <= 26) {
                suit = "Diamonds";
            } else if (cardNumber <= 39) {
                suit = "Hearts";
            } else {
                suit = "Spades";
            }

            int rankNumber = (cardNumber - 1) % 13 + 1; // Determine the rank based on the card number w/ ternary 
            String rank = (rankNumber == 1) ? "Ace" : 
                          (rankNumber == 11) ? "Jack" : 
                          (rankNumber == 12) ? "Queen" :  
                          (rankNumber == 13) ? "King" : 
                          String.valueOf(rankNumber);
          
            System.out.println("The card you picked is " + rank + " of " + suit);   // Display the picked card to the user
        }
    }
}

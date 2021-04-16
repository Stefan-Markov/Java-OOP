package CardsWithPower;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        CardRank cardRank = CardRank.valueOf(rank);
        CardSuit cardSuit = CardSuit.valueOf(suit);
        int power = cardRank.getPower() + cardSuit.getOrdinal();
        System.out.printf("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(), power);

    }
}

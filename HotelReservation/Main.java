package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        double price = Double.parseDouble(input[0]);
        int numDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        Discount discount = Discount.valueOf(input[3]);

        Double finalPrice = PriceCalculator.CalculatePrice(price, numDays, season, discount);
        System.out.printf("%.2f", finalPrice);
    }
}

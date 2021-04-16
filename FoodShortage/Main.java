package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        int foodConsumed = 0;
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] tokens = input.split(" ");
            if (tokens.length == 4) {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                citizens.add(citizen);

            } else if (tokens.length == 3) {
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                rebels.add(rebel);
            }
        }
        String name = scan.nextLine();
        while (!name.equals("End")) {
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(name)) {
                    foodConsumed += 10;
                    break;
                }
            }
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(name)) {
                    foodConsumed += 5;
                    break;
                }
            }
            name = scan.nextLine();
        }
        System.out.println(foodConsumed);
    }
}

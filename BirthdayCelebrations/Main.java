package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        List<Birthable> birthables = new ArrayList<>();

        while (!(line = scan.nextLine()).equals("End")) {
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Citizen":
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));
                    break;
            }
        }
        String target = scan.nextLine();
        for (Birthable birth : birthables) {
            if (birth.getBirthDate().endsWith(target)) {
                System.out.println(birth.getBirthDate());
            }
        }
    }
}

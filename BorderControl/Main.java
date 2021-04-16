package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Identifiable> identifiable = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            Identifiable current;

            if (tokens.length == 3) {
                current = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                current = new Robot(tokens[0], tokens[1]);
            }
            identifiable.add(current);
            input = scan.nextLine();
        }

        String fakeId = scan.nextLine();
        for (Identifiable ident : identifiable) {
            if (ident.getId().endsWith(fakeId)) {
                System.out.println(ident.getId());
            }
        }
    }
}

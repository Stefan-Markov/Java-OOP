package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Field[] declaredFields = RichSoilLand.class.getDeclaredFields();
        String line = scan.nextLine();
        while (!line.equals("HARVEST")) {

            for (Field declaredField : declaredFields) {
                String s = Modifier.toString(declaredField.getModifiers());
                if (s.equals(line)) {
                    System.out.printf("%s %s %s%n", s, declaredField.getType().getSimpleName(),
                            declaredField.getName());
                } else if (line.equals("all")) {
                    System.out.printf("%s %s %s%n", s, declaredField.getType().getSimpleName(),
                            declaredField.getName());
                }
            }
            line = scan.nextLine();
        }
    }
}

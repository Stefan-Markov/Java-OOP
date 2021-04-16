package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] pizzaInput = scan.nextLine().split(" ");
        Pizza pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));

        String[] doughInput = scan.nextLine().split(" ");
        Dough dough = new Dough(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));

        pizza.setDough(dough);
        String line;

        while (!(line = scan.nextLine()).equals("END")) {
            String[] tokens = line.split("\\s+");

            Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
            pizza.addTopping(topping);
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}

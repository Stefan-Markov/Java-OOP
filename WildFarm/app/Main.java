package WildFarm.app;

import WildFarm.app.animal.Animal;
import WildFarm.app.animal.felime.Cat;
import WildFarm.app.animal.felime.Tiger;
import WildFarm.app.animal.mouse.Mouse;
import WildFarm.app.animal.zebra.Zebra;
import WildFarm.app.food.Food;
import WildFarm.app.food.Meat;
import WildFarm.app.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<Animal> animals = new ArrayList<>();

        while (!(line = reader.readLine()).equals("End")) {
            String[] animalInfo = line.split(" ");
            Animal animal = createAnimal(animalInfo);

            line = reader.readLine();
            String[] foodInfo = line.split(" ");
            Food food;
            switch (foodInfo[0]) {
                case "Meat":
                    food = new Meat(Integer.parseInt(foodInfo[1]));
                    break;
                default:
                    food = new Vegetable(Integer.parseInt(foodInfo[1]));
                    break;
            }
            animal.makeSound();
            animal.eat(food);
            animals.add(animal);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static Animal createAnimal(String[] animalInfo) {
        Animal animal;
        switch (animalInfo[0]) {
            case "Cat":
                return new Cat(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
            case "Tiger":
                return new Tiger(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);
            case "Mouse":
                return new Mouse(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);
            case "Zebra":
                return new Zebra(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);
        }
        return null;
    }
}

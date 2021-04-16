package HierarchicalInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        animals.add(new Cat());

        animals.add(new Dog());

        animals.add(new Puppy());

        for (Animal animal : animals) {
            animal.eat();
        }
    }
}

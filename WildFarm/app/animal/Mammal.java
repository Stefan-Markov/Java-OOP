package WildFarm.app.animal;

import WildFarm.app.food.Food;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalName, String animalType,
                     Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        String animal = this.getClass().getSimpleName();

        boolean isValid = true;
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            if (animal.equals("Tiger")) {
                isValid = false;
            }
        } else {
            if (animal.equals("Zebra") ||
                    animal.equals("Mouse")) {
                isValid = false;
            }
        }
        if (isValid) {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            if (animal.equals("Mouse")) {
                System.out.println("Mice are not eating that type of food!");
            } else {
                System.out.printf("%ss are not eating that type of food!%n", this.getClass().getSimpleName());
            }
        }
    }

    @Override
    public String toString() {
        String result = super.toString();
        return result.replaceFirst("\\?", this.getLivingRegion());
    }
}

package WildFarm.app.animal;

import WildFarm.app.food.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;


    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;


    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }


    public abstract void makeSound();

    public abstract void eat(Food food);

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("###.##");
        return String.format("%s[%s, %s, ?, %d]",this.getClass().getSimpleName(),
                this.getAnimalName(),format.format(this.getAnimalWeight()),
                this.getFoodEaten());
    }
}


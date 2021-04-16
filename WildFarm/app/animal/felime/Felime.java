package WildFarm.app.animal.felime;

import WildFarm.app.animal.Mammal;

public abstract class Felime extends Mammal {
    protected Felime(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }
}

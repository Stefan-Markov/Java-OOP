package PizzaCalories;

public class Dough {
    private FlourType flourType;
    private BackingTechnique bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public FlourType getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) {
        try {
            this.flourType = FlourType.valueOf(flourType.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    public BackingTechnique getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        try {
            this.bakingTechnique = BackingTechnique.valueOf(bakingTechnique.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid type of dough.");

        }
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1...200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.getWeight() * this.bakingTechnique.getModifier()
                * this.getFlourType().getModifier();
    }
}

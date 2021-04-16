package ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double getCost() {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative.");
        }
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

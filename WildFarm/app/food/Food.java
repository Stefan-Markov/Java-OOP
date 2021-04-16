package WildFarm.app.food;

public abstract class Food {
    private Integer quantity;

    protected Food(int quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

package CarShopExtended;

public class Seat extends CarImpl implements Sellable {

    private Double getPrice;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double getPrice) {
        super(model, color, horsePower, countryProduced);
        this.getPrice = getPrice;
    }

    @Override
    public Double getPrice() {
        return this.getPrice;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%n%s sells for %.6f", this.getModel(), this.getPrice);
    }
}

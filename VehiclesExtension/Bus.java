package VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, int tank) {

        super(fuelQuantity, fuelConsumption, tank);
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = false;
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", super.getFuelQuantity());
    }

    @Override
    public void drive(double distance) {

        double fuelCost = 0;

        if (isEmpty) {
            fuelCost = super.getFuelConsumption() * distance;
        } else {
            fuelCost = (super.getFuelConsumption() + 1.4) * distance;
        }
        if (fuelCost <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("Bus travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");
        }
    }

    @Override
    public void refuel(double quantity) {
        if (quantity > getTank()) {
            System.out.println("Cannot fit fuel in tank");
        } else if (quantity < 1) {
            System.out.println("Fuel must be a positive number");
        } else {
            super.setFuelQuantity(super.getFuelQuantity() + (quantity * 0.95));
        }
    }
}

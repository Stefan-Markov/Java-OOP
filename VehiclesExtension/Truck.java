package VehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, int tank) {
        super(fuelQuantity, fuelConsumption, tank);
    }

    @Override
    public void drive(double distance) {
        double fuelCost = (super.getFuelConsumption() + 1.6) * distance;

        if (fuelCost <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("First.Truck travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
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

package VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption, int tank) {
        super(fuelQuantity, fuelConsumption, tank);
    }

    @Override
    public void drive(double distance) {

        double fuelCost = (super.getFuelConsumption() + 0.9) * distance;
        if (fuelCost <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("Car travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }

    @Override
    public void refuel(double quantity) {
        if (quantity > getTank()) {
            System.out.println("Cannot fit fuel in tank");
        } else if (quantity < 1) {
            System.out.println("Fuel must be a positive number");
        } else {
            super.setFuelQuantity(super.getFuelQuantity() + quantity);
        }
    }
}

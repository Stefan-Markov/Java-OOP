package VehiclesExtension;

public abstract class Vehicle implements VehicleInterface {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tank;

    public Vehicle(double fuelQuantity, double fuelConsumption, int tank) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tank = tank;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        if (tank < 0) {
            System.out.println("Fuel must be a positive number");

        } else {
            this.tank = tank;
        }
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

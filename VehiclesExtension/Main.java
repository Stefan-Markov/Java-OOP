package VehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = reader.readLine().split(" ");

        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3]));
        String[] truckInfo = reader.readLine().split(" ");

        Truck truck = new Truck(Double.parseDouble(truckInfo[1]),
                Double.parseDouble(truckInfo[2]), Integer.parseInt(truckInfo[3]));

        String[] busInfo = reader.readLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Integer.parseInt(busInfo[3]));

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            switch (tokens[0]) {
                case "Drive":
                    if (tokens[1].equals("Car")) {
                        car.drive(Double.parseDouble(tokens[2]));
                    } else if (tokens[1].equals("Truck")) {
                        truck.drive(Double.parseDouble(tokens[2]));
                    } else {
                        bus.drive(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "Refuel":
                    if (tokens[1].equals("Car")) {
                        car.refuel(Double.parseDouble(tokens[2]));
                    } else if (tokens[1].equals("Truck")) {
                        truck.refuel(Double.parseDouble(tokens[2]));
                    } else {
                        bus.refuel(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "DriveEmpty":
                    if (tokens[1].equals("Bus")) {
                        bus.setEmpty(true);
                        double dist = Double.parseDouble(tokens[2]);
                        bus.drive(dist);
                    }
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}

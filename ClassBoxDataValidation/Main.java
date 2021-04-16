package ClassBoxDataValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        Box box = new Box(length, width, height);

        System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
        System.out.printf("Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
        System.out.printf("Surface Area - %.2f%n", box.calculateVolume());
    }
}

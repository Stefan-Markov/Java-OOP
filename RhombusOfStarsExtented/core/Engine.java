package RhombusOfStarsExtented.core;

import java.util.Scanner;

public class Engine {
    public static void run() {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        drawnUp(n);

        drawDown(n);
    }

    private static void drawnUp(int n) {
        DrawnUp.drawnUp(n);
    }

    private static void drawDown(int n) {
        DrawnDown.drawnDown(n);
    }
}

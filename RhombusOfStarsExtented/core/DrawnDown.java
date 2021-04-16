package RhombusOfStarsExtented.core;

public class DrawnDown {

   protected static void drawnDown(int n) {
        for (int row = 0; row <= n - 1; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < n - row; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

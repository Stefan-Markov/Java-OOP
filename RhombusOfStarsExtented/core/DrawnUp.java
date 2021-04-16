package RhombusOfStarsExtented.core;

public class DrawnUp {

    protected static void drawnUp(int n) {
        for (int row = 1; row < n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row < n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }

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

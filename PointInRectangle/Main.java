package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] cordinates = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Point leftBottom = new Point(cordinates[0], cordinates[1]);
        Point topRight = new Point(cordinates[2], cordinates[3]);

        Rectangle rectangle = new Rectangle(leftBottom, topRight);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            cordinates = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Point point2d = new Point(cordinates[0], cordinates[1]);

            boolean isContained = rectangle.contains(point2d);
            System.out.println(isContained);
        }
    }
}

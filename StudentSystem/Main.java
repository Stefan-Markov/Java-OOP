package StudentSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        boolean hasToExit = false;
        while (!hasToExit) {
            String[] input = scanner.nextLine().split(" ");

            String result = studentSystem.parseCommand(input);
            hasToExit = result != null && result.equals("Exit");
            if (!hasToExit && result != null) {
                System.out.println(result);
            }
        }
    }
}

package Тelephony;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split(" ");
        String[] urls = scan.nextLine().split(" ");

        Smartphone smartphone = new Smartphone(List.of(numbers), List.of(urls));

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());
    }
}

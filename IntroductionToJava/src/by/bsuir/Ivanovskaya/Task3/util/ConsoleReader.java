package by.bsuir.Ivanovskaya.Task3.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final String NDOUBLE = "not double";

    private static final Scanner scanner = new Scanner(System.in);

    public static double readDoubNumber(String message) {
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            System.out.println(NDOUBLE);
            scanner.next();
        }
        return scanner.nextDouble();
    }

}

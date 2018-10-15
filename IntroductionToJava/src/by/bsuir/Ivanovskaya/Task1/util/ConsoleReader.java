package by.bsuir.Ivanovskaya.Task1.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final String NDOUBLE = "not double";

    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumber(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println(NDOUBLE);
            scanner.next();
        }
        return scanner.nextDouble();
    }

}

package by.bsuir.Ivanovskaya.Task6.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final String NDOUBLE = "not double";
    private static final String NINT = "not int";

    private static final Scanner scanner = new Scanner(System.in);

    public static double readDoubleNumber(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print(NDOUBLE);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int readIntNumber(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print(NINT);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
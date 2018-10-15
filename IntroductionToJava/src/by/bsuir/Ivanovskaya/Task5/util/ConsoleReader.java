package by.bsuir.Ivanovskaya.Task5.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final String NINT = "not int";

    private static final Scanner scanner = new Scanner(System.in);

    public static int readIntNumber(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print(NINT);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
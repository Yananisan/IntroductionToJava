package by.bsuir.Ivanovskaya.Task3.runner;

import by.bsuir.Ivanovskaya.Task3.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task3.util.ConsoleReader;

public class FuncDistInTable {

    private static final String ENTER_X = "Enter x";
    private static final String ENTER_Y = "Enter y";
    private static final String ENTER_H = "Enter h";

    public static void main(String [] args){

        double x = ConsoleReader.readDoubNumber(ENTER_X);
        double y = ConsoleReader.readDoubNumber(ENTER_Y);
        double h = ConsoleReader.readDoubNumber(ENTER_H);

        Calculate.Calculate(x, y, h);
    }
}

package by.bsuir.Ivanovskaya.Task1.runner;

import by.bsuir.Ivanovskaya.Task1.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task1.util.ConsoleReader;

public class MathEx {

    private static final String ENTER_X = "Enter x: ";
    private static final String ENTER_Y = "Enter y: ";

    public static void main(String [] args){

        double x = ConsoleReader.readNumber(ENTER_X);
        double y = ConsoleReader.readNumber(ENTER_Y);

        System.out.print(Calculate.calculate(x, y));
    }
}

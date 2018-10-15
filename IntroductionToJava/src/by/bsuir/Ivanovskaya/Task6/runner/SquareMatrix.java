package by.bsuir.Ivanovskaya.Task6.runner;

import by.bsuir.Ivanovskaya.Task6.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task6.util.ConsoleReader;

public class SquareMatrix {

    private static final String ENTER_N = "Enter n: ";

    public static void main(String [] args){

        int n = ConsoleReader.readIntNumber(ENTER_N);
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = ConsoleReader.readDoubleNumber(" ");
        }

        Calculate.calculate(n, arr);
    }
}

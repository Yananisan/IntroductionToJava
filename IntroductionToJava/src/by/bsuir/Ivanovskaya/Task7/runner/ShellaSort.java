package by.bsuir.Ivanovskaya.Task7.runner;

import by.bsuir.Ivanovskaya.Task7.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task7.util.ConsoleReader;

public class ShellaSort {

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

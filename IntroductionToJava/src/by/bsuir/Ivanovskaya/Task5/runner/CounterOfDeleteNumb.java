package by.bsuir.Ivanovskaya.Task5.runner;

import by.bsuir.Ivanovskaya.Task5.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task5.util.ConsoleReader;

public class CounterOfDeleteNumb {

    private static final String ENTER_N = "Enter n: ";

    public static void main(String [] args){

        int n = ConsoleReader.readIntNumber(ENTER_N);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = ConsoleReader.readIntNumber(" ");
        }

        Calculate.calculate(arr);
    }
}

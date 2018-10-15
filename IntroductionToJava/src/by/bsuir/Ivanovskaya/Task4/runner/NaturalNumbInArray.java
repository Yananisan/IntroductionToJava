package by.bsuir.Ivanovskaya.Task4.runner;

import by.bsuir.Ivanovskaya.Task4.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task4.util.ConsoleReader;

public class NaturalNumbInArray {

    private static final String ENTER_N = "Enter n: ";

    public static void main(String [] args){

        int n = ConsoleReader.readIntNumber(ENTER_N);
        int[] arr = new int[n];

        System.out.print("Array: ");

        for(int i = 0; i < n; i++){
            arr[i] = ConsoleReader.readIntNumber(" ");
        }

       Calculate.calculate(n, arr);
    }
}

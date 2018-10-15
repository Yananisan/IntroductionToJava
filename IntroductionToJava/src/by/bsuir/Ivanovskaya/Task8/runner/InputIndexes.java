package by.bsuir.Ivanovskaya.Task8.runner;

import by.bsuir.Ivanovskaya.Task8.calculate.Calculate;
import by.bsuir.Ivanovskaya.Task8.util.ConsoleReader;

public class InputIndexes {

    private static final String FIRST_LENGTH_HINT = "first n: ";
    private static final String SECOND_LENGTH_HINT = "second n: ";
    private static final String ARRAY_ELEM_HINT = "Enter %d array element";

    public static void main(String[] args) {
        System.out.print("first array length: ");
        int firstLength = ConsoleReader.readIntNumber("");
        System.out.print("first array elements: ");
        double[] firstArray = readArray(firstLength);

        System.out.print("second array length: ");
        int secondLength = ConsoleReader.readIntNumber("");
        System.out.print("second array elements: ");
        double[] secondArray = readArray(secondLength);

        double[] indexes = Calculate.calculate(firstArray, secondArray);
    }

    private static double[] readArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = ConsoleReader.readDoubleNumber(String.format("",i + 1));
        }

        return array;
    }
}

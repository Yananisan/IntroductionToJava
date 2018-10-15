package by.bsuir.Ivanovskaya.Task4.calculate;

import java.util.LinkedList;
import java.util.List;

public class Calculate {


    public static List<Integer> calculate(int n, int[] arr){
        System.out.print("\n");
        return naturalNumbers(n, arr);
    }

    private static List<Integer> naturalNumbers(int n, int[] arr) {
        List<Integer> index = new LinkedList<>();
        System.out.print("Index of simple numbers: ");
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            if (isSimple(arr[i])) {
                arr2[i] = arr[i];
                System.out.print(i + " ");
                index.add(i);
            }else index.add(0);
        }
        return index;
    }

    private static boolean isSimple(int number) {
        if (number == 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if ((number > 3) && (number % 3 == 0)) {
                return false;
            }
            if ((number > 2) && (number % 2 == 0)) {
                return false;
            }
            return number % i != 0;
        }

        return true;
    }
}

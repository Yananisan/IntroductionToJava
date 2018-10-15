package by.bsuir.Ivanovskaya.Task8.calculate;

public class Calculate {

    public static double[] calculate(double[] arr, double[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        double[] indexes = new double[arr2.length];
        while ((i < arr.length) && (j < arr2.length)) {
            if (arr[i] > arr2[j]) {
                indexes[k++] = i + j++;
            } else {
                i++;
            }
        }
        for (; k < arr2.length; k++) {
            indexes[k] = i++ + j;
        }

        return indexes;
    }

}

package by.bsuir.Ivanovskaya.Task3.calculate;

public class Calculate {

    public static double[] Calculate(double x, double y, double h){
        System.out.print("x value | " + "func value\n" );
        double[] func = new double[(int)y * 2];
        for(; x <= y; x = x + h){
            System.out.printf(x + "     | ");
            func[(int)x] = Math.tan(x);
            System.out.print(func[(int)x] + "\n");
        }
        return func;
    }
}

package by.bsuir.Ivanovskaya.Task1.calculate;

public class Calculate {

    private static final int CONST_1 = 1;
    private static final int CONST_2 = 2;

    public static double calculate(double x, double y){
        return numerator(x,y) / denominator(x,y) + x;
    }

    private static double numerator(double x, double y){
        return 1 + Math.pow(Math.sin(x + y), CONST_2);
    }

    private static double denominator(double x, double y){
        double absres = x - (CONST_2 * x)/(CONST_1 + Math.pow(x, CONST_2) * Math.pow(y, CONST_2));
        return CONST_2 + Math.abs(absres);
    }
}

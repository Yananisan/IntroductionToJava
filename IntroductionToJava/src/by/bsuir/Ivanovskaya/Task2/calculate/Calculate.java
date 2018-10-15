package by.bsuir.Ivanovskaya.Task2.calculate;

public class Calculate {

    public static boolean Calculate(double x, double y){
        if (((x>=-4)&&(x<=4)&&(y>=0)&&(y<=5))||((x>=-6)&&(x<=6)&&(y>=-3)&&(y<=0))) {
            return true;
        }else return false;
    }
}

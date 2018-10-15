import by.bsuir.Ivanovskaya.Task8.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task8 {

    @Test
    public void calculate() {
        double[] first = {1, 1, 2, 2, 2, 2, 5, 7};
        double[] second = {1, 2, 3, 3, 3, 4, 6, 9};

        double[] expected = {2, 7, 8, 9, 10, 11, 13, 15};
        Assert.assertArrayEquals(expected, Calculate.calculate(first, second), 0.000001);
    }
}
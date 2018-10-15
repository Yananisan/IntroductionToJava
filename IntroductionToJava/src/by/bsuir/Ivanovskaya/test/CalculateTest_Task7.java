import by.bsuir.Ivanovskaya.Task7.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task7 {

    @Test
    public void calculate() {
        int n = 3;
        double[] arr = {9.0, 1.0, 7.0};
        double[] expected = {1.0, 7.0, 9.0};
        Assert.assertArrayEquals(expected, Calculate.calculate(n, arr), 0.000000000001);
    }
}

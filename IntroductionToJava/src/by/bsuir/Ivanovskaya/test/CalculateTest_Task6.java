import by.bsuir.Ivanovskaya.Task6.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task6 {

    @Test
    public void calculate() {
        int n = 4;
        double[] numbers = {1, 2, 3, 4};

        double[][] expected = {{1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2},
                {4, 1, 2, 3}};

        Assert.assertArrayEquals(expected, Calculate.calculate(n, numbers));
    }
}

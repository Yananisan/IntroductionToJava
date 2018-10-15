import by.bsuir.Ivanovskaya.Task4.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest_Task4 {

    @Test
    public void calculate() {
        int n = 4;
        int[] numbers = {2, 3, 5, 7};
        List<Integer> expected = new ArrayList<>(4);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);

        List<Integer> actual = Calculate.calculate(n, numbers);

        Assert.assertEquals(expected, actual);
    }
}

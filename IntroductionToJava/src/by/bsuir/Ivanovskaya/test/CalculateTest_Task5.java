import by.bsuir.Ivanovskaya.Task4.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest_Task5 {

    @Test
    public void calculate() {
        int n = 5;
        int[] arr = {8, 1, 2, 9, 3};
        List<Integer> expected = new ArrayList<>(3);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(0);
        expected.add(4);

        List<Integer> actual = Calculate.calculate(n, arr);

        Assert.assertEquals(expected, actual);
    }
}

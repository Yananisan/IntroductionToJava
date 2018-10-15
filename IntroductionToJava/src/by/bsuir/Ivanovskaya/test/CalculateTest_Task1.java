import by.bsuir.Ivanovskaya.Task1.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task1 {

    @Test
    public void calculate() {
        double actual = Calculate.calculate(12,12);
        double expected = 12.13;
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }
}
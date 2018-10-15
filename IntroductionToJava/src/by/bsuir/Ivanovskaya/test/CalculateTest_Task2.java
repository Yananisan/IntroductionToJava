import by.bsuir.Ivanovskaya.Task2.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;


public class CalculateTest_Task2 {

    @Test
    public void calculate() {
        boolean actual = Calculate.Calculate(0,6);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}

import by.bsuir.Ivanovskaya.Task3.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task3 {

    @Test
    public void calculate() {
        double a = 1;
        double b = 2;
        double h = 1;
        double[] expected = {1.5574077246549023,-2.185039863261519};
        for(int i = (int)a + 1; i < (int)b; i = i + (int)h){
            Assert.assertEquals(expected[i], Calculate.Calculate(a, i, h));
        }
    }
}

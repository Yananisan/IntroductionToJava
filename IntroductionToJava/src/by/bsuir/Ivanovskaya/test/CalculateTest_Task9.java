import by.bsuir.Ivanovskaya.Task9.bean.Ball;
import by.bsuir.Ivanovskaya.Task9.bean.Basket;
import by.bsuir.Ivanovskaya.Task9.bean.Color;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest_Task9 {

    @Test
    public void getBallsWeight_Equals_0() {
        Basket basket = new Basket();
        Assert.assertEquals(0, basket.getBallsWeight());
    }

    @Test
    public void getBallsWeight_Equals_10() {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.BLUE));
        basket.putBall(new Ball(4, Color.YELLOW));
        basket.putBall(new Ball(3, Color.RED));
        basket.putBall(new Ball(2, Color.BLUE));

        Assert.assertEquals(10, basket.getBallsWeight());
    }

    @Test
    public void getBallsWeight_Equals_15() {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.BLUE));
        basket.putBall(new Ball(4, Color.YELLOW));
        basket.putBall(new Ball(3, Color.RED));
        basket.putBall(new Ball(2, Color.BLUE));
        basket.putBall(new Ball(5, Color.RED));

        Assert.assertEquals(15, basket.getBallsWeight());
    }

    @Test
    public void getAmountOfBlueBalls_Equals_0() {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.YELLOW));
        basket.putBall(new Ball(4, Color.RED));
        basket.putBall(new Ball(3, Color.RED));
        basket.putBall(new Ball(2, Color.YELLOW));
        basket.putBall(new Ball(5, Color.RED));

        Assert.assertEquals(0, basket.getAmountOfBlueBalls());
    }

    @Test
    public void getAmountOfBlueBalls_Equals_3() {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.BLUE));
        basket.putBall(new Ball(4, Color.RED));
        basket.putBall(new Ball(3, Color.BLUE));
        basket.putBall(new Ball(2, Color.YELLOW));
        basket.putBall(new Ball(5, Color.BLUE));

        Assert.assertEquals(3, basket.getAmountOfBlueBalls());
    }

    @Test
    public void getAmountOfBlueBalls_Equals_5() {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.BLUE));
        basket.putBall(new Ball(4, Color.BLUE));
        basket.putBall(new Ball(3, Color.BLUE));
        basket.putBall(new Ball(2, Color.BLUE));
        basket.putBall(new Ball(5, Color.BLUE));

        Assert.assertEquals(5, basket.getAmountOfBlueBalls());
    }
}
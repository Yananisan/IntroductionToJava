package by.bsuir.Ivanovskaya.Task9.runner;

import by.bsuir.Ivanovskaya.Task9.bean.Ball;
import by.bsuir.Ivanovskaya.Task9.bean.Basket;
import by.bsuir.Ivanovskaya.Task9.bean.Color;

public class Balls{

    private static final String BLUE_BALLS_AMOUNT_HINT = "There are %d blue balls";
    private static final String WEIGHT_HINT = "Weight of all balls %d";

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.putBall(new Ball(1, Color.BLUE));
        basket.putBall(new Ball(2, Color.YELLOW));
        basket.putBall(new Ball(3, Color.RED));
        basket.putBall(new Ball(4, Color.BLUE));
        basket.putBall(new Ball(5, Color.RED));

        System.out.println(String.format(BLUE_BALLS_AMOUNT_HINT, basket.getAmountOfBlueBalls()));
        System.out.println(String.format(WEIGHT_HINT, basket.getBallsWeight()));
    }

}

package by.bsuir.Ivanovskaya.Task9.bean;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void putBall(Ball ball) {
        balls.add(ball);
    }

    public int getBallsWeight() {
        int weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getAmountOfBlueBalls() {
        int amount = 0;
        for (Ball ball : balls) {
            amount += ball.getColor() == Color.BLUE ? 1 : 0;
        }
        return amount;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }
}

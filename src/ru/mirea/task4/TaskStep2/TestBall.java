package ru.mirea.task4.TaskStep2;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball=new Ball();
        ball.move(2,-1);
        System.out.println(ball);
        ball.setXY(1,1);
        System.out.println(ball);
        ball.setX(0);
        ball.setY(0);
        System.out.println(ball);
    }
}

package ru.mirea.task2.TaskStep2;

import ru.mirea.task2.TaskStep2.BallClass;

public class BallTest {
    public static void main(String [] args)
    {
        BallClass ball=new BallClass("Бейсбольный","Белый","Маленький");
        System.out.println(ball);
        ball.setType("Волейбольный");
        ball.setColor("Серый");
        ball.setSize("Стандартный");
        System.out.println(ball);
    }
}

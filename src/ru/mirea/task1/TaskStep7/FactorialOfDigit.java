package ru.mirea.task1.TaskStep7;

import java.util.Scanner;

public class FactorialOfDigit {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число, факториал которого хотите посчитать ");
        a = input.nextInt();
        if(a > 0)
            System.out.println(fact(a));
        else
            System.out.println("Ошибка, число должно быть больше 0");
    }
    public static int fact(int a)
    {
        if(a==0)
            return 1;
        else return a*fact(a-1);
    }
}

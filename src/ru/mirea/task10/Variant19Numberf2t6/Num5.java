package ru.mirea.task10.Variant19Numberf2t6;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(sumDigits(number));
    }
    public static int sumDigits(int i) {
        return i == 0 ? 0 : i + sumDigits(i - 1);
    }
}

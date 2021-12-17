package ru.mirea.task10.Variant19Numberf2t6;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}

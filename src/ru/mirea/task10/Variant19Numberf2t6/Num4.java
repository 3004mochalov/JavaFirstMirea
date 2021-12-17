package ru.mirea.task10.Variant19Numberf2t6;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        int d = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);
        Scanner secinput = new Scanner(System.in);
        System.out.print("Введите знаменатель и размер массива: ");
        System.out.print("k = ");
        int k = input.nextInt();
        System.out.print("s = ");
        int s = secinput.nextInt();
        for (int i = 1; i<=s; i++){
            if ((i % k) == 0){
                d = d + i;
                c = c + 1;
            }
        }
        System.out.print("Сумма " + k + "-значных чисел равна:" + d);
        System.out.print("\nКоличество " + k + "-значных чисел равна:" + c);
    }
}

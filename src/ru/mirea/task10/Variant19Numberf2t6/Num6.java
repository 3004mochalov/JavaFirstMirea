package ru.mirea.task10.Variant19Numberf2t6;

import java.util.Scanner;

public class Num6 {
    public static void main(String args[]) {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите число для проверки:");

        int num = scan.nextInt();

        // проверяем число на простоту
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
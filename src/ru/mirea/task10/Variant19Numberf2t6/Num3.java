package ru.mirea.task10.Variant19Numberf2t6;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner secinput = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = input.nextInt();
        int b = secinput.nextInt();
        if (a<b) {
            for (int i = a; i<=b; i++){
                System.out.print(i + " ");
            }
        } else{
            for (int i = a; i>=b; i--){
                System.out.print(i + " ");
            }
        }
    }
}

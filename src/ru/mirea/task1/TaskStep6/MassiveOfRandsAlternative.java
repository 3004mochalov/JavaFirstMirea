package ru.mirea.task1.TaskStep6;

import java.util.Random;

public class MassiveOfRandsAlternative {
    public static void main(String[] args){
        System.out.println("сгенерированный массив: ");
        Random random=new Random(); //Способ генерации чисел через класс Random
        int[] a=new int [random.nextInt(10)];
        for (int i=0;i<a.length;i++)
        {
            a[i]= random.nextInt(100);
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a.length-1;j++)
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        System.out.println();
        System.out.println("отсортированный массив: ");
        for (int j : a) System.out.print(j + " ");
    }
}

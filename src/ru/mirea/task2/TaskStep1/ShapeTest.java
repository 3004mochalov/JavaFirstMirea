package ru.mirea.task2.TaskStep1;

import ru.mirea.task2.TaskStep1.ShapeClass;

public class ShapeTest {
    public static void main(String []args)
    {
        ShapeClass sh1=new ShapeClass("Тессаракт");
        System.out.println(sh1.toString());
        sh1.setShapeName("Конус");
        System.out.println(sh1.toString());
        sh1.setShapeName("Тор");
        System.out.println(sh1.toString());
    }
}

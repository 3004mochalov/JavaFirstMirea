package ru.mirea.task2.TaskSteps4And5;

import ru.mirea.task2.TaskSteps4And5.DogClass;

public class DogTest {
    public static void main(String [] args)
    {
        DogClass dog=new DogClass("Майло",6);
        System.out.println(dog);
        dog.setAge(5);
        dog.setName("Сосиска");
        System.out.println(dog);
    }
}

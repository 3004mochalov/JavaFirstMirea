package ru.mirea.task4.TaskStep1;

public class TestAuthor {
    public static void main(String [] args)
    {
        Author author=new Author("Андрей","andrey@mail.ru",'М');
        System.out.println(author);
        author.setEmail("jana@mail.ru");
        author.setName("Жанна");
        author.setGender('Ж');
        System.out.println(author);
    }
}
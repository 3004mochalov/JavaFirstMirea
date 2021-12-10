package ru.mirea.task2.TaskStep3;

import ru.mirea.task2.TaskStep3.BookClass;

public class BookTest {
    public static void main(String [] args)
    {
        BookClass bk=new BookClass("Муму","Тургенев",8);
        System.out.println(bk);
        bk.setAuthor("Пушкин");
        bk.setName("Борис Годунов");
        bk.setRate(9);
        System.out.println(bk);
    }
}

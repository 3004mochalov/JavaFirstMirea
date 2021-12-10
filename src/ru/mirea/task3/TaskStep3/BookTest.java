package ru.mirea.task3.TaskStep3;

public class BookTest {
    public static void main(String []args) {
        BookClass book = new BookClass("Война и мир", "Л.Н. Толстой", 99999999, 1869);
        System.out.println(book.toString());
        book.setName("Сказка о царе Салтане");
        book.setAuthor("А.С. Пушкин");
        book.setYear(1831);
        book.setPage(12);
        System.out.println(book.toString());
    }
}

package ru.mirea.task2.TaskStep3;

public class BookClass {
    String name,author;
    int rate;

    public BookClass(String name, String author,int rate) {
        this.name = name;
        this.author = author;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getRate() {
        return rate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public String toString()
    {
        return "Книга: "+getName()+" автора "+getAuthor()+", с рейтингом "+getRate();
    }
}

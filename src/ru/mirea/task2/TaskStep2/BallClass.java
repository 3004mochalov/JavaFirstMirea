package ru.mirea.task2.TaskStep2;

public class BallClass {
    String type,color,size;
    public BallClass(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String toString()
    {
        return "Тип мяча: "+getType()+", размер: "+getSize()+", цвет: "+getColor();
    }
}

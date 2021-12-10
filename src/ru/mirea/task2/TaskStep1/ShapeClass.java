package ru.mirea.task2.TaskStep1;

public class ShapeClass {
    private String shapeName;

    public ShapeClass(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Фигура: " + getShapeName();
    }
}

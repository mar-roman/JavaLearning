package ru.mirea.inbo0220.markaryants.pr3;
import java.lang.*;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 10;
        this.length = 20;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length;
    }
}

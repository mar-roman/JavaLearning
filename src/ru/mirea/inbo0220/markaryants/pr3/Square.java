package ru.mirea.inbo0220.markaryants.pr3;
import java.lang.*;

public class Square extends Rectangle{
    protected double side;

    public Square() {
        this.side = 10;
    }
    public Square(double side) {
        this.side = side;
        this.filled = false;
        this.color = "blue";
    }
    public Square(String color, boolean filled, double side) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.side;
    }
}

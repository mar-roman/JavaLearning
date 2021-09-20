package ru.mirea.inbo0220.markaryants.pr3;
import java.lang.*;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp() {
        this.center.y+=1;
    }
    public void moveDown() {
        this.center.y-=1;
    }
    public void moveLeft() {
        this.center.x-=1;
    }
    public void moveRight() {
        this.center.x+=1;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

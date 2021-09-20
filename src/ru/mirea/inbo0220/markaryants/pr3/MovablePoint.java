package ru.mirea.inbo0220.markaryants.pr3;
import java.lang.*;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp() {
        this.y+=1;
    }
    public void moveDown() {
        this.y-=1;
    }
    public void moveLeft() {
        this.x-=1;
    }
    public void moveRight() {
        this.x+=1;
    }
}

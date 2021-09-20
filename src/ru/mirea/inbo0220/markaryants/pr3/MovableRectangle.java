package ru.mirea.inbo0220.markaryants.pr3;
import java.lang.*;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
    }
    public void moveUp() {
        this.topLeft.y+=1;
        this.bottomRight.y+=1;
    }
    public void moveDown() {
        this.topLeft.y-=1;
        this.bottomRight.y-=1;
    }
    public void moveLeft() {
        this.topLeft.x-=1;
        this.bottomRight.x-=1;
    }
    public void moveRight() {
        this.topLeft.x+=1;
        this.bottomRight.x+=1;
    }
}

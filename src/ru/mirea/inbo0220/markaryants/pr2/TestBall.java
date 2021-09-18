package ru.mirea.inbo0220.markaryants.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(100, 100);
        System.out.println(b);
        b.move(10, 25);
        System.out.println(b);
    }
}

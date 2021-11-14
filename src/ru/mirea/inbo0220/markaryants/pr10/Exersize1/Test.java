package ru.mirea.inbo0220.markaryants.pr10.Exersize1;

public class Test {
    public static void main(String[] args) {
        ConcreteFactory n = new ConcreteFactory();
        Complex com = n.createComplex();
        Complex com2 = n.createComplex(5,6);
        System.out.println(com.toString());
        System.out.println(com2.toString());
    }
}
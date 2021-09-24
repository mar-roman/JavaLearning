package ru.mirea.inbo0220.markaryants.pr5;

public class Task5 {
    public static int recursion(int n) {
        if (n >= 10){
            return recursion(n/10) + n%10;
        } else {
            return n;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(12345));
    }
}

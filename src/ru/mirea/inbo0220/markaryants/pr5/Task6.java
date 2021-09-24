package ru.mirea.inbo0220.markaryants.pr5;

public class Task6 {
    public static String isSimple(int n, int del) {
        if (n%del == 0){
            return "NO";
        } else if (del+1 >= n/2){
            return "YES";
        } else {
            return isSimple(n, del+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(isSimple(99, 2)); //Второй параметр всегда 2
    }
}

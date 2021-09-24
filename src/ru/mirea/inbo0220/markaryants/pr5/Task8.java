package ru.mirea.inbo0220.markaryants.pr5;

public class Task8 {
    public static String recursion(String a) {
        char l = a.charAt(0);
        char r = a.charAt(a.length() - 1);
        if (l == r){
            if(a.length() / 2 <= 1){
                return "YES";
            } else {
                return recursion(a.substring(1, a.length()-1));
            }
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion("abcdedcba"));
    }
}

package ru.mirea.inbo0220.markaryants.pr17;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    static void CheckString(String s) {
        Pattern p = Pattern.compile("qwertyuiop");
        Matcher m =p.matcher(s);
        boolean b = m.matches();
        if (b){
            System.out.println("Данная сторка является строкой qwertyuiop");
        } else {
            System.out.println("Данная сторка не является строкой qwertyuiop");
        }
    }

    public static void main(String[] args) {
        String s1 = "qwertyuiop";
        String s2 = "qwertyuiop";

        CheckString(s1);
        CheckString(s2);

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        CheckString(s3);
    }
}
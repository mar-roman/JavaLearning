package ru.mirea.inbo0220.markaryants.pr9;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("a", 34, 2, 18));
        s.add(new Student("b", 65, 2, 20));
        s.add(new Student("c", 45, 1, 18));
        s.add(new Student("d", 16, 3, 17));
        new LabClassUi(s);
    }
}

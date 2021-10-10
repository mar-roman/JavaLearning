package ru.mirea.inbo0220.markaryants.pr7;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Drinker {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();
        for (int i = 0; i < 5; i++)
            first.addLast(sc.nextInt());
        for (int i = 0; i < 5; i++)
            second.addLast(sc.nextInt());
        int count = 0;
        while (!first.isEmpty() && !second.isEmpty()) {
            if (first.getFirst() > second.getFirst() && first.getFirst() != 9 && second.getFirst() != 0 || first.getFirst() == 0 && second.getFirst() == 9) {
                second.addLast(first.getFirst());
                second.addLast(second.getFirst());
            } else {
                first.addLast(first.getFirst());
                first.addLast(second.getFirst());
            }
            first.remove();
            second.remove();
            count++;
            if (count == 105) {
                System.out.println("botva");
            }
        }
        System.out.println((first.isEmpty() ? "first" : "second") + " " + count);
    }
}

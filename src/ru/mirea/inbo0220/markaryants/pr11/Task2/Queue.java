package ru.mirea.inbo0220.markaryants.pr11.Task2;

public interface Queue {
    Object dequeue();
    Object element();
    void enqueue(Object o);
    boolean isEmpty();
    boolean clear();
}
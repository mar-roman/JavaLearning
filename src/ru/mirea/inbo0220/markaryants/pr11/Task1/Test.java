package ru.mirea.inbo0220.markaryants.pr11.Task1;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.dequeue());

        ArrayQueueAdt adt = new ArrayQueueAdt(aqm);
        System.out.println(adt.dequeue());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());    }
}

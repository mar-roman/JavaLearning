package ru.mirea.inbo0220.markaryants.pr10.Exersize2;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Sitting");
    }

    public Client() {
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
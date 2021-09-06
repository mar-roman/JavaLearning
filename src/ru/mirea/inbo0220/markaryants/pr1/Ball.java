package ru.mirea.inbo0220.markaryants.pr1;
import java.lang.*;

public class Ball {
    private String type;
    private String color;

    public Ball(String type, String color) {
        this.type = type;
        this.color = color;
    }
    public Ball(String type) {
        this.type = type;
        this.color = "red";
    }
    public Ball() {
        this.type = "football";
        this.color = "red";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ball{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

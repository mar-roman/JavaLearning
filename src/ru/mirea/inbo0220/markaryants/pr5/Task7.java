package ru.mirea.inbo0220.markaryants.pr5;

public class Task7 {
    public static boolean isSimple(int n, int del) { //Используется рекурсивная функция из 6 задачи
        if (n%del == 0){
            return false;
        } else if (del+1 >= n/2){
            return true;
        } else {
            return isSimple(n, del+1);
        }
    }
    public static void Task(int n) {
        if(n==2){
            System.out.println(2 + " ");
        } else {
            for(int i = 3; i <= n/2; i+=2){
                if(isSimple(i, 2)){ //Вызов рекурсии
                    System.out.println(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Task(99);
    }
}

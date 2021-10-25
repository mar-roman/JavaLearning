package ru.mirea.inbo0220.markaryants.pr11.Task4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}
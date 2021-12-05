package ru.mirea.inbo0220.markaryants.pr21;

public class MusicDocument implements IDocument {
    public void New() {
        System.out.println("Музыка создана");
    }
    public void Open() {
        System.out.println("Музыка открыта");
    }
    public void Save() {
        System.out.println("Музыка сохранена");
    }
    public void Exit() {
        System.out.println("Музыка закрыта");
    }
}
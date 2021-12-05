package ru.mirea.inbo0220.markaryants.pr21;

public class CreateMusic implements ICreateDocument {
    private MusicDocument music;
    public IDocument CreateNew() {
        music = new MusicDocument();
        return music;
    }
    public IDocument CreateOpen() {
        return music;
    }
}

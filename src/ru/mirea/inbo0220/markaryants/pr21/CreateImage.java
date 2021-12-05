package ru.mirea.inbo0220.markaryants.pr21;

public class CreateImage implements ICreateDocument {
    private ImageDocument image;
    public IDocument CreateNew() {
        image = new ImageDocument();
        return image;
    }
    public IDocument CreateOpen() {
        return image;
    }
}

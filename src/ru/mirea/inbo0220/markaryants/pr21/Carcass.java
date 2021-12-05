package ru.mirea.inbo0220.markaryants.pr21;
import java.util.Scanner;

public class Carcass implements IDocument{
    private IDocument Document;
    private ICreateDocument CreateDocument;

    public void New() {
        Scanner in = new Scanner(System.in);
        System.out.println("Что создать: 1)Text 2)Image 3)Music ?");
        String choice = in.nextLine();
        switch (choice) {
            case "1":
                CreateDocument = new CreateText();
                Document = CreateDocument.CreateNew();
                Document.New();
                break;
            case "2":
                CreateDocument = new CreateImage();
                Document = CreateDocument.CreateNew();
                Document.New();
                break;
            case "3":
                CreateDocument = new CreateMusic();
                Document = CreateDocument.CreateNew();
                Document.New();
                break;
        }
    }
    public void Open() {
        Document.Open();
    }
    public void Save() {
        Document.Save();
    }
    public void Exit() {
        Document.Exit();
    }
}
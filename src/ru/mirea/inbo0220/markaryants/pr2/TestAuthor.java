package ru.mirea.inbo0220.markaryants.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Robert", "author@mail.ru", 'm');
        a.setEmail("author2@mail.ru");
        System.out.println(a);
    }
}

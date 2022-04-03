package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author stephenKing  = new Author ("Stephen", "King");
        Book firstBook = new Book ("Desperation", stephenKing, 1997);

        Author levTolstoi  = new Author("Лев", "Толстой");
        Book secondBook = new Book("Война и мир", levTolstoi, 1869);

        System.out.println (firstBook.getName() + " " + firstBook.getAuthor().getAuthorName() + " " + firstBook.getAuthor().getSurname()
                + " " + firstBook.getYear());

        System.out.println (secondBook.getName() + " " + secondBook.getAuthor().getAuthorName() + " " + secondBook.getAuthor().getSurname()
                + " " + secondBook.getYear());

        secondBook.setYear (1846);
        System.out.println("secondBook.getYear() = " + secondBook.getYear());
    }
}

package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author stephenKing  = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);

        Author levTolstoi  = new Author("Толстой", "Лев");
        Book secondBook = new Book("Война и мир", levTolstoi, 1869);

        System.out.println(firstBook.getName() + " " + firstBook.getYear()+ " " + firstBook.getAuthor());

        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook);
        secondBook.setYear(1846);
        System.out.println("secondBook.getYear() = " + secondBook.getYear());
    }
    }

package ru.skypro;

import java.util.Objects;

public class Book {
        private final String name;
        private final Author author;
        private int year;

        public Book(String name, Author author, int year) {
            this.name = name;
            this.author = author;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && Objects.equals(getName(), book.getName())
                && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getYear());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}

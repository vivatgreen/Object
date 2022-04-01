package ru.skypro;

    public class Book {
        String name;
        Author author;
        int year;

        public Book (String name, Author author, int year) {

            this.name = name;
            this.author = author;
            this.year = year;
        }
        public String getName () {
            return name;
        }
        public Author getAuthor () {
            return author;
        }

        public void setYear (int year) {
            this.year = year;
        }
        public int getYear() {
            return year;
        }
    }
